package sequality;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public double average(int x) {
    return x / 2.0;
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

  public static void main(int x, int y) {
    System.out.println(new App().getGreeting());
  }

}
