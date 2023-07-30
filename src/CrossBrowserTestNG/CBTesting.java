package CrossBrowserTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CBTesting 
{
  @Parameters("browserName")
  @Test
  public void browserTest(String bName) 
  {
	  WebDriver driver=null;
	  if(bName.equals("chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajay\\OneDrive\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
		  

			ChromeOptions opt=new ChromeOptions();
			opt.addArguments("--remote-allow-origins=*");
		  
		  driver=new ChromeDriver(opt);
	  }
	  else if(bName.equals("firefox"))
	  {
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Ajay\\OneDrive\\Desktop\\chrome\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		  
		  driver=new FirefoxDriver();
	  }
	  
	  driver.manage().window().maximize();
	  driver.get("https://login-v2.upstox.com/");
  }
}
