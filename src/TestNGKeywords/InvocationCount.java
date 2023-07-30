package TestNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount {
  @Test(invocationCount=5)
  public void LoginToApplication() 
  {
	  Reporter.log("Login to Application is done", true);
  }
}
