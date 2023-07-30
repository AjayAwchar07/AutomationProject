package Practise;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Inocationcount {
  @Test(invocationCount=5)
  public void LogInInApplication() 
  {
	  Reporter.log("Log in into Application is done", true);
  }
}
