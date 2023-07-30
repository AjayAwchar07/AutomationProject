package AssertUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrue
{
  @Test
  public void AssertTrueuse() 
  {
	  boolean a=true;
	  // when a is true Tc is Passed
	  Assert.assertTrue(a,"a are false Tc is Failed");
  }
}
