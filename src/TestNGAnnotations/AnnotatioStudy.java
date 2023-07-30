package TestNGAnnotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class AnnotatioStudy 
{
  @Test
  public void GoogleTest() 
  {
	  Reporter.log("Google test is done", true);
  }
  @Test
  public void RediffMailTest()
  {
	  Reporter.log("Rediffmail test is done", true);
  }
  @BeforeMethod
  public void LaunchBrowser() 
  {
	  Reporter.log("Browser launched", true);
  }

  @AfterMethod
  public void CloseBrowser() 
  {
	  Reporter.log("Browser Closed", true);
  }

 
}
