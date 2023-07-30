package TestNGXML;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testingtwo {
  @Test(groups="funds")
  public void f() 
  {
	  Reporter.log("F Tc is Running", true);
  }
  @Test(groups="homePage")
  public void G()
  {
	  Reporter.log("G Tc is Running", true);
  }
  
  @Test(groups="funds")
  public void H()
  {
	  Reporter.log("H Tc is Running", true);
  }
  
  @Test(groups="homePage")
  public void I()
  {
	  Reporter.log("I Tc is Running", true);
  }
  
  @Test(groups="homePage")
  public void J()
  {
	  Reporter.log("J Tc is Running", true);
  }
}
