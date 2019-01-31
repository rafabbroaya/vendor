package formos.skilltests;

import static org.junit.Assert.*;

import org.junit.Assert;
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
  public void shouldListAInitInventory() {
    StringBuffer initInventory = new StringBuffer();
    initInventory.append("Strawberry flavor 3 drinks \n");
    initInventory.append("Banana flavor 3 drinks \n");
    initInventory.append("Mango flavor 3 drinks");
    assertEquals(initInventory.toString(), sell.listInventory().toString());
  }
}