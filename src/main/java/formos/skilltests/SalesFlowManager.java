package formos.skilltests;

import formos.skilltests.pojos.Beverage;
import formos.skilltests.pojos.StrawberryDrink;
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
    return welcomeMsj;
  }

  public StringBuffer initHardCodeInventory() {
    StringBuffer initInventory = new StringBuffer();
    initInventory.append("/*******INVENTORY********/ \n");
    initInventory.append("Strawberry flavor 3 drinks \n");
    initInventory.append("Banana flavor 3 drinks \n");
    initInventory.append("Mango flavor 3 drinks");
    return initInventory;
  }

  public static void printToConsole(String message) {
    System.out.print(message);
  }

  public static void printToConsole(StringBuffer message) {
    printToConsole(message.toString());
  }


  public Beverage getStrawberryDrink(int i) {

  }
}
