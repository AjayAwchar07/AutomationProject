package CrossBrowserTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class GeckoTest {
  @Test
  public void FirefoxTest() 
  {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Ajay\\OneDrive\\Desktop\\chrome\\geckodriver-v0.32.0-win64\\geckodriver.exe");
	  
	  WebDriver driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  
	  System.out.println("Hii Upstox is Launched");
	  Reporter.log("Hii Upstox Launched Fine", true);
	  
	  Reporter.log("Hii Upstox", true);
	  driver.get("https://login-v2.upstox.com/");
  }
}
