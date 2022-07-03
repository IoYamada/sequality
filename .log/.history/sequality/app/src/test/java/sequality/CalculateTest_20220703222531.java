package sequality;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));
    assertEquals(30, calculate.sumOdd(1, 10));
    assertEquals(20, calculate.sumEven(1, 10));
  }
}
