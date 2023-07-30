package AssertUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNull
{
  @Test
  public void AssertNulluse()
  {
	  String a=null;
	  //Tc is passed when a is null
	  
	  Assert.assertNull(a,"a is not null Tc is failed");
  }
}
