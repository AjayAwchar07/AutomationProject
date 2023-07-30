package SerialAndParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testing4 
{
	@Test
	  public void FacebookLaunch() throws InterruptedException 
	  {
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://en-gb.facebook.com/");
		Reporter.log("facebook Launched",true);
		Thread.sleep(2000);
		driver.close();

	  }

}
