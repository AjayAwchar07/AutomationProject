package AssertUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNotnull 
{
  @Test
  public void assertnotnull() 
  {
  String a="Ajay";
  // Tc is Passed when a is Not null
  
  Assert.assertNotNull(a,"a is null Tc is Failed");
  }
}
