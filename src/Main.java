import java.util.ResourceBundle;

public class Main {
  public static void main(String[] args) {
    ResourceBundle rb = ResourceBundle.getBundle("BasicText");
    System.out.println(rb.getClass().getName());
    System.out.println(rb.getBaseBundleName());
    System.out.println(rb.getKeys());
  }
}