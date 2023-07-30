package AssertUsingTestNG;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HardAssert 
{
  @Test
  public void Tc() 
  {
	  String a="Ajay";
	  String b="Ajay1";
	  // i need to verify a and b are equal OR not
	  
	  //if(a.equals(b))
	  //{
		//  Reporter.log("a and b are matching TC is passed", true);
	  //}
	  //else
	  //{
		//  Reporter.log("a and b are not matching TC is Failed", true);
	  //}
	  
	  // Using Hard Assert using static methods of Assert class
	  
	  Assert.assertEquals(a, b,"a and b are not matching Tc is failed");
	  // using Assert Tc is passsed or failed shown in only one line code
  }
}
