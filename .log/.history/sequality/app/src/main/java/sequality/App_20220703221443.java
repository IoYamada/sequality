/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sequality;

public class App {
  public String getGreeting() {
    return "Hello World!";
  }

  public static void main(String[] args) {
    Calculate tmp = new Calculate();
    System.out.println(new App().getGreeting());
    System.out
        .println("Sum of " + 2 + " and " + 3 + " is " + tmp.sum(2, 3) + ". " + "Average is "
            + tmp.average(tmp.sum(2, 3), 2) + ".");
    System.out
        .println("Sum of " + 1 + " to " + 10 + " is " + tmp.sumXToY(1, 10) + ". " + "Average is "
            + tmp.average(tmp.sumXToY(1, 10), 10)
            + ".");
    System.out
        .println(
            "Sum of odd of " + 1 + " to " + 10 + " is " + tmp.sumOdd(1, 10) + ". " + "Sum of even of " + 1 + " to " + 10
                + " is " + tmp.sumEven(1, 10) + ".");
  }
}
