package formos.skilltests.model;

import formos.skilltests.model.exceptions.OutOfStockException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author raasanch
 */
public class BeverageDAO<BEVERAGE> implements Stack<BEVERAGE> {

  private List<BEVERAGE> beverageList = new ArrayList<>();

  public void pop(int howMany) throws OutOfStockException{
    for (int i = 0; i < howMany; i++) {
      validateException();
      BEVERAGE beverage = beverageList.get(getSize() - 1);
      beverageList.remove(beverage);
    }
  }

  private void validateException() {
    if (getSize() == 0) {
      throw new OutOfStockException();
    }
  }

  @Override
  public void push(BEVERAGE drink) {
    beverageList.add(drink);
  }

  public String getTotalDrinks() {
    if (getSize() > 0) {
      return getSize() + " drinks";
    }
    return "Out of Stock";
  }

  private int getSize() {
    return beverageList.size();
  }

}
