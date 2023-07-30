package SerialAndParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testing3 
{
	@Test
	  public void KiteLogin() throws InterruptedException 
	  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajay\\OneDrive\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://kite.zerodha.com/");
		Reporter.log("KiteLaunched",true);
		Thread.sleep(2000);
		driver.close();

		
		
	  }
	
	

}
