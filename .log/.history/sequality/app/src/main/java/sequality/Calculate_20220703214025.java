package sequality;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public double average(int x) {
    return x / 2.0;
  }

  public int sumXToY(int x, int y) {
    int num = 0;
    for (int i = x; i <= y; x++) {
      num += i;
    }
    return num;
  }

  public int odd(int x, int y) {
    int num = 0;
    for (int i = x; i <= y; x++) {
      if (i % 2 == 1) {
        num += i;
      }
    }
    return num;
  }

  public int even(int x, int y) {
    int num = 0;
    for (int i = x; i <= y; x++) {
      if (i % 2 == 0) {
        num += i;
      }
    }
    return num;
  }

  public static void main() {
    Calculate tmp = new Calculate();

    System.out.println("Sum of" + 2 + "and" + 3 + "is" + tmp.sum(2, 3) + "Average is" + tmp.average(tmp.sum(2, 3)));
    System.out.println("Sum of" + 1 + "to" + 10 + "is" + tmp.sumXToY(1, 10) + "Average is" + tmp.average(tmp.sum(x, y)));
    System.out.println(new Calculate().sum(x, y));
  }

}
