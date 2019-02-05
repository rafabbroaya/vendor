package formos.skilltests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class SalesFlowManagerTest {

  private SalesFlowManager sell;

  @Before
  public void initDeclarations() {
    sell = SalesFlowManager.startSell(System.in);
  }

  @Test
  public void shouldDisplayAGreeting() {
    assertEquals("Welcome client \n", sell.welcome());
  }

  @Test
  public void shouldShowAInitInventory() {
    StringBuffer initInventory = new StringBuffer();
    initInventory.append(SalesFlowManager.HEADER);
    initInventory.append("Strawberry flavor 3 drinks \n");
    initInventory.append("Banana flavor 3 drinks \n");
    initInventory.append("Mango flavor 3 drinks");
    assertEquals(initInventory.toString(), sell.getInventory().toString());
  }

//  @Test
//  public void shouldRemoveAStrawberryDrinkFromInventory() {
//    sell.getStrawberryDrink(1);
//    StringBuffer inventory = new StringBuffer();
//    inventory.append("Strawberry flavor 2 drinks \n");
//    inventory.append("Banana flavor 3 drinks \n");
//    inventory.append("Mango flavor 3 drinks");
//    assertEquals(inventory.toString(), sell.getInventory().toString());
//  }
}