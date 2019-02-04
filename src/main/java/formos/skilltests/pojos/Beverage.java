package formos.skilltests.pojos;

import java.util.List;

public abstract class Beverage implements Stack {

  List<Beverage> list;

  public Beverage pop() {
    Beverage beverage = list.get(getLast());
    list.remove(beverage);
    return beverage;
  }

  public int getLast() {
    return list.size();
  }

}
