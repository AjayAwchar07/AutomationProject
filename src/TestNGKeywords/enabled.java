package TestNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class enabled {
  @Test
  public void A() 
  {
	  Reporter.log("Tc A is done", true);
  }
  @Test
  public void C()
  {
	  Reporter.log("Tc C is done", true);
  }
  @Test(enabled=false)// output of method is disabled
  public void B()
  {
	  Reporter.log("Tc B is done", true);
  }
  @Test
  public void D()
  {
	  Reporter.log("Tc D is done", true);
  }
}
