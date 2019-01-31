package formos.skilltests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReadInputTest {

  private FlowManager sell;

  @Before
  public void initDeclarations() {
    sell = FlowManager.startSell();
  }

  @Test
  public void shouldDisplayAGreeting() {
    Assert.assertEquals("Welcome client", sell.welcome());
  }
}