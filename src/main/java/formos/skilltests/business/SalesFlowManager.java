package formos.skilltests.business;

import formos.skilltests.model.BananaDrink;
import formos.skilltests.model.BeverageDAO;
import formos.skilltests.model.MangoDrink;
import formos.skilltests.model.StrawberryDrink;

public class SalesFlowManager {

  public static final String HEADER_INVENTORY = "/*******INVENTORY********/ \n";
  public static final String HEADER_OPTIONS = "/********OPTIONS*********/ \n";
  private BeverageDAO<StrawberryDrink> strawberryDrinkInv;
  private BeverageDAO<BananaDrink> bananaDrinkInv;
  private BeverageDAO<MangoDrink> mangoDrinkInv;

  public SalesFlowManager() {
    initHardCodeInventory();
    welcome();
  }

  public void getStrawberryDrink(int howMany) {
    strawberryDrinkInv.pop(howMany);
  }

  public void getBananaDrink(int howMany) {
    bananaDrinkInv.pop(howMany);
  }

  public void getMangoDrink(int howMany) {
    mangoDrinkInv.pop(howMany);
  }

  private void welcome() {
    printToConsole("Welcome client \n");
  }

  public StringBuilder getInventory() {
    StringBuilder initInventory = new StringBuilder();
    initInventory.append(HEADER_INVENTORY);
    initInventory.append("Strawberry flavor " + strawberryDrinkInv.getTotalDrinks() + "\n");
    initInventory.append("Banana flavor " + bananaDrinkInv.getTotalDrinks() + "\n");
    initInventory.append("Mango flavor " + mangoDrinkInv.getTotalDrinks() + "\n");
    printToConsole(initInventory.toString());
    return initInventory;
  }

  private void initHardCodeInventory() {
    initStrawberryDrinkInv();
    initBananaDrinkInv();
    initMangoDrinkInv();
  }

  public void printToConsole(String message) {
    System.out.println(message);
  }

  private void initStrawberryDrinkInv() {
    strawberryDrinkInv = new BeverageDAO<>();
    strawberryDrinkInv.push(new StrawberryDrink());
    strawberryDrinkInv.push(new StrawberryDrink());
    strawberryDrinkInv.push(new StrawberryDrink());
  }

  private void initBananaDrinkInv() {
    bananaDrinkInv = new BeverageDAO<>();
    bananaDrinkInv.push(new BananaDrink());
    bananaDrinkInv.push(new BananaDrink());
    bananaDrinkInv.push(new BananaDrink());
  }

  private void initMangoDrinkInv() {
    mangoDrinkInv = new BeverageDAO<>();
    mangoDrinkInv.push(new MangoDrink());
    mangoDrinkInv.push(new MangoDrink());
    mangoDrinkInv.push(new MangoDrink());
  }

  public StringBuilder getFirstMenu() {
    StringBuilder menu = new StringBuilder();
    menu.append(SalesFlowManager.HEADER_OPTIONS);
    menu.append("1 Get a drink\n");
    menu.append("x Exit\n");
    printToConsole(menu.toString());
    return menu;
  }

  public StringBuilder getSecondMenu() {
    StringBuilder menu = new StringBuilder();
    menu.append(SalesFlowManager.HEADER_OPTIONS);
    menu.append("1 Get a Strawberry drink\n");
    menu.append("2 Get a Banana drink\n");
    menu.append("3 Get a Mango drink\n");
    menu.append("r Return\n");
    printToConsole(menu.toString());
    return menu;
  }

  public StringBuilder getThirdMenu() {
    StringBuilder menu = new StringBuilder();
    menu.append(SalesFlowManager.HEADER_OPTIONS);
    menu.append("How many?\n");
    printToConsole(menu.toString());
    return menu;
  }

  public void printInvalidOption() {
    printToConsole("Invalid Option\n");
  }
}
