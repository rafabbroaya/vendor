package formos.skilltests;

/**
 * Hello world!
 */
public class App {

  public static void main(String[] args) {
    SalesFlowManager salesFlow = SalesFlowManager.startSell(System.in);
    salesFlow.welcome();
  }
}
