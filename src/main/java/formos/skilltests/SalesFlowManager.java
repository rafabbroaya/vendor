package formos.skilltests;

import java.io.InputStream;
import java.util.Scanner;

public class SalesFlowManager {

  Scanner scanner;

  public static SalesFlowManager startSell(InputStream in) {
    return new SalesFlowManager(in);
  }

  private SalesFlowManager(InputStream in) {
    scanner = new Scanner(in);
  }

  public String welcome() {
    String welcomeMsj = "Welcome client \n";
    System.out.print(welcomeMsj);
    return welcomeMsj;
  }


  public StringBuffer listInventory() {
    StringBuffer initInventory = new StringBuffer();
    initInventory.append("Strawberry flavor 3 drinks \n");
    initInventory.append("Banana flavor 3 drinks \n");
    initInventory.append("Mango flavor 3 drinks");
    return initInventory;
  }
}
