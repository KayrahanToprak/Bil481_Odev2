import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class TestUtil {
  Util c;

  @Before
  public void setUp() { c = new Util(); }

  @Test
  public void example() { assertTrue(true); }
  
  @Test
  public void lengthOne(){ assertFalse(c.compute(1214)); }
  
  @Test
  public void lengthEven(){ assertFalse(c.compute(12, 33, 52, 122)); }
  
  @Test(expected = RuntimeException.class)
  public void runtimeException(){ assertFalse(c.compute(12, 66, 0)); }
  
  @Test
  public void sumModArgument(){ assertTrue(c.compute(1, 2, 3)); }
  // Returns true because 1+2+3 = 6 and 6 % 2 == 0
  
  @Test
  public void normalTest(){ assertFalse(c.compute(3, 7, 12)); }
}
