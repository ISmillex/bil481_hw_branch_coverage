import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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
    assertTrue(util.compute(1, 2, 3));
  }

}