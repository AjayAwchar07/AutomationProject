package TestNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
  @Test(priority=3)
  public void A() 
  {
	  Reporter.log("Tc A is done", true);
  }
  @Test(priority=1)
  public void C() 
  {
	  Reporter.log("Tc C is done", true);
  }
  @Test(priority=4)
  public void B() 
  {
	  Reporter.log("Tc B is done", true);
  }
  @Test(priority=2)
  public void D() 
  {
	  Reporter.log("Tc D is done", true);
  }
}
