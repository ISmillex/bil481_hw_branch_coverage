import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;

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

}