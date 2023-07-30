package AssertUsingTestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertStudy2
{
	SoftAssert soft=new SoftAssert();
  @Test
  public void SoftAssertuse() 
  {
	  String a="Ajay";
	  String b="Awchar";
	  
	  soft.assertEquals(a,b,"a and b are not equals Tc is Failed");
	  soft.assertNull(b,"B is not null Tc is Failed");
	  soft.assertAll();
	  
  }
  
  @Test
  public void Testing()
  {
	  String s="ABC";
	  String t="xyz";
	  
	  soft.assertEquals(s,t,"s and t are not equals Tc is Failed");
	  soft.assertNull(t,"t are not null Tc is Failed");
	  soft.assertAll();
	  
	  
  }
}
