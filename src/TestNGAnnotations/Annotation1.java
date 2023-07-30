package TestNGAnnotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation1 {
  @Test
  public void ValidateUserid() 
  {
	  Reporter.log("User Id Validated", true);
  }
  @BeforeMethod
  public void logintoupstox()
  {
	  Reporter.log("Upstox login done-->before method", true);
  }
  @AfterMethod
  public void logoutfromupstox()
  {
	  Reporter.log("Logout From Upstox Done-->After method", true);
  }
  @BeforeClass
  public void LaunchBrowser()
  {
	  Reporter.log("Browser Launched", true);
  }
  @AfterClass
  public void CloseBrowser()
  {
	  Reporter.log("Closed Browser", true);
  }
}
