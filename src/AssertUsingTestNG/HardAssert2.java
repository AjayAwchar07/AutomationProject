package AssertUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert2 {
  @Test
  public void Tc() 
  {
	  String a="maharashtra";
	  String b="maharashtra";
	  
	  Assert.assertEquals(a, b,"a and b are matching Tc is passed");
  }
}
