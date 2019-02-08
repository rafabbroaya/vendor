package formos.skilltests;

import formos.skilltests.business.SalesFlowManager;
import formos.skilltests.model.exceptions.OutOfStockException;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {

  private static Scanner scanner;
  private static SalesFlowManager salesFlowManager;

  public static void main(String[] args) {
    scanner = new Scanner(System.in);
    salesFlowManager = new SalesFlowManager();
    initFlow();
  }

  private static void initFlow() {
    salesFlowManager.getInventory();
    salesFlowManager.getFirstMenu();
    String option = scanner.nextLine();
    if (("1").equals(option)) {
      chooseDrink();
    }
    invalidOption();
  }

  private static void chooseDrink() {
    salesFlowManager.getSecondMenu();
    String option = scanner.nextLine();
    if (("1").equals(option) || ("2").equals(option) || ("3").equals(option)) {
      chooseHowMany(option);
    } else if ("r".equals(option)) {
      initFlow();
    }
    invalidOption();
  }

  private static void chooseHowMany(String drinkFlavor) {
    try {
      salesFlowManager.getThirdMenu();
      String howMany = scanner.nextLine();
      removeDrinkFromInventory(drinkFlavor, Integer.parseInt(howMany));

    } catch (NumberFormatException e) {
      salesFlowManager.printToConsole("Invalid Input\n");
      chooseHowMany(drinkFlavor);
    }
  }

  private static void removeDrinkFromInventory(String drinkFlavor, int howMany) {
    try {
      if ("1".equals(drinkFlavor)) {
        salesFlowManager.getStrawberryDrink(howMany);
      } else if ("2".equals(drinkFlavor)) {
        salesFlowManager.getBananaDrink(howMany);
      } else if ("3".equals(drinkFlavor)) {
        salesFlowManager.getMangoDrink(howMany);
      }
      salesFlowManager.printToConsole("Successful Sale\n");
      initFlow();
    } catch (OutOfStockException e) {
      salesFlowManager.printToConsole("Insufficient drinks");
      chooseHowMany(drinkFlavor);
    }
  }

  private static void invalidOption() {
    salesFlowManager.printInvalidOption();
    initFlow();
  }

}
