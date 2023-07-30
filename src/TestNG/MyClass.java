package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyClass {
  @Test
  public void UpstoxLoginTest()
  {
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajay\\OneDrive\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
	  
	  WebDriver driver=new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  System.out.println("Upstox Login page is Launched");
	  Reporter.log("Hii Upstox Working is Fine"); // only in html show msg
	  Reporter.log("Hii Upstox", true); // msg show in console and html
	  // reoprter is class and log is static method
	  driver.get("https://login-v2.upstox.com/");
  }
  @Test
  public void GoogleTest()
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajay\\OneDrive\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
	  
	  WebDriver driver=new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  System.out.println("Google page is Launched");
	  Reporter.log("Hii google is working Fine");// msg show only html
	  Reporter.log("Hii Google", true); // msg show in console and html
	  
	  driver.get("https://www.google.com/");
  }
  
  }
   

