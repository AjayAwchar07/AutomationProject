package AssertUsingTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertStudy3 
{
	SoftAssert soft=new SoftAssert();
  @Test
  public void SoftAssertuse() throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajay\\OneDrive\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/");
	  Thread.sleep(1000);
	  
	  WebElement actualresult = driver.findElement(By.xpath("//a[contains(@id,\"u_0_0_\")]"));
	  System.out.println("Text on Facebook is "+actualresult);
	  
	  String expectedresult = "create new account";
	  soft.assertEquals(actualresult, expectedresult,"actual and expected result not equal Tc is Failed");
	  soft.assertAll();
	  
  }
}
