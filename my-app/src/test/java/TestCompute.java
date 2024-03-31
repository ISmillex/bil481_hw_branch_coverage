import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

public class TestCompute {
  Compute c;
  MessageQueue mq;

  @Before
  public void setup() {
    mq = mock(MessageQueue.class);
    c = new Compute(mq);
  }

  @Test
  public void testCountWhenQueueIsEmpty() {
    when(mq.size()).thenReturn(0);
    assertEquals(-1, c.countNumberOfOccurrences("element"));
  }

  @Test
  public void testCountWhenQueueContainsDifferentElement() {
    when(mq.size()).thenReturn(1);
    when(mq.contains(anyString())).thenReturn(true);
    when(mq.getAt(anyInt())).thenReturn("differentElement");
    assertEquals(0, c.countNumberOfOccurrences("element"));
  }

  @Test
  public void testCountWhenQueueDoesNotContainElement() {
    when(mq.size()).thenReturn(1);
    when(mq.contains(anyString())).thenReturn(false);
    assertEquals(0, c.countNumberOfOccurrences("element"));
  }

}