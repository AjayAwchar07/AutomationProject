package AssertUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertFalse {
  @Test
  public void AssertFalse() 
  {
	  boolean a=true;
	  // when Tc is passed when a is false
	  Assert.assertFalse(a,"a is true Tc is Failed");
  }
  @Test
  public void AssertFalse2()
  {
	  boolean b=false;
	  // when Tc is failed when b is true
	  Assert.assertFalse(b,"b is false Tc is Passed");
  }
}
