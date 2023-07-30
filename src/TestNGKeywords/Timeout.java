package TestNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Timeout {

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
	  @Test(timeOut=1000)
	  public void B() throws InterruptedException
	  {
		  Thread.sleep(5000);
		  Reporter.log("Tc B is done", true);
	  }
	  @Test
	  public void D()
	  {
		  Reporter.log("Tc D is done", true);
	  }
}
