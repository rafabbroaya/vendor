package formos.skilltests;

import formos.skilltests.pojos.Beverage;
import formos.skilltests.pojos.StrawberryDrink;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class SalesFlowManager {

  public static final String HEADER = "/*******INVENTORY********/ \n";
  Scanner scanner;
  List<Beverage> inventoryList;

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

  public StringBuffer getInventory() {
    return initHardCodeInventory();
  }

  public StringBuffer initHardCodeInventory() {
    inventoryList = new ArrayList<>();
    inventoryList.addAll(getInitStrawberryDrinkList());
    StringBuffer initInventory = new StringBuffer();
    initInventory.append(HEADER);
    initInventory.append("Strawberry flavor 3 drinks \n");
    initInventory.append("Banana flavor 3 drinks \n");
    initInventory.append("Mango flavor 3 drinks");
    return initInventory;
  }

  private Collection<? extends Beverage> getInitStrawberryDrinkList() {
    List<StrawberryDrink> strawberryDrinkList = new ArrayList<>();
    strawberryDrinkList.add(new StrawberryDrink());
    strawberryDrinkList.add(new StrawberryDrink());
    strawberryDrinkList.add(new StrawberryDrink());
    return strawberryDrinkList;
  }

  public static void printToConsole(String message) {
    System.out.print(message);
  }

  public static void printToConsole(StringBuffer message) {
    printToConsole(message.toString());
  }


}
