package AssertUsingTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertNotEquals 
{
  @Test
  public void assertnotequalsuse() 
  {
	  // my Tc is passed when two things are not equals
	  
	  String a="Ajay";
	  String b="Ajay2";
	  
	  Assert.assertNotEquals(a, b,"a and b are equals Tc is failed");
	  Reporter.log("Tc is passed when a and b are not matching", true); 
	  
  }
  @Test
  public void assertnotequalsuse2()
  {
	  String x="Awchar";
	  String y="Awchar";
	  
	  Assert.assertNotEquals(x, y,"x and y are not equals Tc is Passed");
	  Reporter.log("Tc is Faiked when x and y are matching", true);
  }
}
