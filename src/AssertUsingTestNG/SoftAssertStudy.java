package AssertUsingTestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertStudy 
{
  @Test
  public void SoftAssertUse() 
  {
	  String a="ABC";
	  String b="xyz";
	  
	  SoftAssert soft=new SoftAssert();
	  
	  soft.assertEquals(a, b,"a and b are not equals Tc is Failed");
	  soft.assertNull(b,"b is not null Tc is Failed");
	  soft.assertAll();
	  
  }
}
