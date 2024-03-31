import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestUtil {
  Util util;

  @Before
  public void setUp() {
    util = new Util();
  }

  @Test
  public void testComputeWithSingleElement() {
    assertFalse(util.compute(1));
  }

  @Test
  public void testComputeWithEvenNumberOfElements() {
    assertFalse(util.compute(1, 2));
  }

  @Test
  public void testComputeWithOddNumberOfElementsNoDivisor() {
    assertTrue(util.compute(1, 2, 4));
  }

  @Test
  public void testComputeWithNonDivisor() {
    assertFalse(util.compute(5,4,8));
  }

  @Test
  public void testComputeWithZeroArgument() {
    try {
      util.compute(0, 1, 2);
      fail();
    } catch (RuntimeException e) {
      assertTrue(true);
    }
  }
}