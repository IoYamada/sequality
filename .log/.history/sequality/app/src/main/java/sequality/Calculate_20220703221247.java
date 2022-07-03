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
    for (int i = x; i <= y; i++) {
      num += i;
    }
    return num;
  }

  public int sumOdd(int x, int y) {
    int num = 0;
    for (int i = x; i <= y; i++) {
      if (i % 2 == 1) {
        num += i;
      }
    }
    return num;
  }

  public int sumEven(int x, int y) {
    int num = 0;
    for (int i = x; i <= y; i++) {
      if (i % 2 == 0) {
        num += i;
      }
    }
    return num;
  }
}
