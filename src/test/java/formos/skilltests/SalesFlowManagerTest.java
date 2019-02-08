package formos.skilltests;

import static org.junit.Assert.assertEquals;

import formos.skilltests.business.SalesFlowManager;
import formos.skilltests.model.exceptions.OutOfStockException;
import org.junit.Before;
import org.junit.Test;

public class SalesFlowManagerTest {

  private SalesFlowManager sell;

  @Before
  public void initDeclarations() {
    sell = new SalesFlowManager();
  }

  @Test
  public void shouldShowAInitInventory() {
    String initInventory = SalesFlowManager.HEADER_INVENTORY +
        "Strawberry flavor 3 drinks\n" +
        "Banana flavor 3 drinks\n" +
        "Mango flavor 3 drinks\n";
    assertEquals(initInventory, sell.getInventory().toString());
  }

  @Test
  public void shouldRemoveOneStrawberryDrinkFromInventory() {
    sell.getStrawberryDrink(1);
    String inventory = SalesFlowManager.HEADER_INVENTORY +
        "Strawberry flavor 2 drinks\n" +
        "Banana flavor 3 drinks\n" +
        "Mango flavor 3 drinks\n";
    assertEquals(inventory, sell.getInventory().toString());
  }

  @Test
  public void shouldRemoveAllBananaDrinkStock() {
    sell.getBananaDrink(3);
    String inventory = SalesFlowManager.HEADER_INVENTORY +
        "Strawberry flavor 3 drinks\n" +
        "Banana flavor Out of Stock\n" +
        "Mango flavor 3 drinks\n";
    assertEquals(inventory, sell.getInventory().toString());
  }

  @Test(expected = OutOfStockException.class)
  public void shouldThrownAnOutOfStockException() {
    sell.getMangoDrink(4);
  }

  @Test
  public void shouldDisplayFirstMenu() {
    String menu = SalesFlowManager.HEADER_OPTIONS +
        "1 Get a drink\n" +
        "x Exit\n";
    assertEquals(menu, sell.getFirstMenu().toString());
  }

  @Test
  public void shouldDisplaySecondMenu() {
    String menu = SalesFlowManager.HEADER_OPTIONS +
        "1 Get a Strawberry drink\n" +
        "2 Get a Banana drink\n" +
        "3 Get a Mango drink\n" +
        "r Return\n";
    assertEquals(menu, sell.getSecondMenu().toString());
  }

  @Test
  public void shouldDisplayThirdMenu() {
    String menu = SalesFlowManager.HEADER_OPTIONS +
        "How many?\n";
    assertEquals(menu, sell.getThirdMenu().toString());
  }


}