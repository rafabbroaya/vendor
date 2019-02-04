package formos.skilltests;

/**
 * Hello world!
 */
public class App {

  public static void main(String[] args) {
    SalesFlowManager salesFlow = SalesFlowManager.startSell(System.in);
    SalesFlowManager.printToConsole(salesFlow.welcome());
    SalesFlowManager.printToConsole(salesFlow.initHardCodeInventory());
  }
}
