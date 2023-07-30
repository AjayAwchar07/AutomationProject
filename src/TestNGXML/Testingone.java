package TestNGXML;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testingone {
  @Test(groups= {"homePage","funds"})
  public void A()
  {
	  Reporter.log("A TC is Running", true);
  }
  
  @Test(groups="funds")
  public void B()
  {
	  Reporter.log("B Tc is Running", true);
  }
  
  @Test(groups="homePage")
  public void C()
  {
	  Reporter.log("C Tc is Running", true);
  }
  
  @Test(groups="funds")
  public void D()
  {
	  Reporter.log("D Tc is Running", true);
  }
  
  @Test(groups="homepage")
  public void E()
  {
	  Reporter.log("E Tc is Running", true);
  }
}
