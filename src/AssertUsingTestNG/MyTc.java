package AssertUsingTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTc 
{
  @Test
  public void verifyCheckBox() 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajay\\OneDrive\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
	  

		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
	  
	  WebDriver driver=new ChromeDriver(opt);
	  driver.manage().window().maximize();
	  driver.get("https://vctcpune.com/selenium/practice.html");
	  
	  WebElement checkbox = driver.findElement(By.id("checkBoxOption1"));
	  
	  //if(checkbox.isSelected())
	  //{
		//  Reporter.log("CheckBix is seleted TC is passed", true);
		  
	  //}
	  //else
	  //{
		//  Reporter.log("CheckBox is not selected TC is Failed", true);
	  //}
	  checkbox.click();
	  
	  Assert.assertTrue(checkbox.isSelected(), "checkbox is not selected Tc is Failed");
  }
 
}