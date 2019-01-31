package formos.skilltests;

public class FlowManager {

  public static FlowManager startSell() {
    return new FlowManager();
  }

  private FlowManager() {

  }

  public String welcome() {
    return "Welcome client";
  }
}
