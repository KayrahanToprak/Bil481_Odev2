import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class TestCompute {
   
    @Test
    public void emptyQueue(){
      MessageQueue mq = mock(MessageQueue.class);
      Compute c = new Compute(mq);
      when(mq.size()).thenReturn(0);
      assertEquals(-1, c.countNumberOfOccurrences("a"));
    }
    
    @Test
    public void elementNotFound() {
      MessageQueue mq = mock(MessageQueue.class);
      Compute c = new Compute(mq);
      when(mq.size()).thenReturn(4);
      when(mq.contains("d")).thenReturn(false);
      assertEquals(0, c.countNumberOfOccurrences("d"));
    }
    
    @Test
    public void elementIsFound() {
      MessageQueue mq = mock(MessageQueue.class);
      Compute c = new Compute(mq);
      when(mq.size()).thenReturn(3);
      when(mq.contains("x")).thenReturn(true);
      
      when(mq.getAt(0)).thenReturn("x");
      when(mq.getAt(1)).thenReturn("x");
      when(mq.getAt(2)).thenReturn("y");
      
      assertEquals(2, c.countNumberOfOccurrences("x"));
    }
    
}
