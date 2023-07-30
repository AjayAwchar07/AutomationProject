package SileniumStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 
{

	public static void main(String[] args) throws InterruptedException
	{

	System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajay\\OneDrive\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver(); // Created Object Of Chromedriver
	
	driver.navigate().to("https://paytm.com/");
	
	Thread.sleep(1000);
	
	driver.navigate().to("https://www.phonepe.com/");
	
	Thread.sleep(1000);
	
	driver.navigate().back();
	
	Thread.sleep(1000);
	
	driver.navigate().forward();
	
	Thread.sleep(1000);
	
	driver.navigate().refresh();
	
		

	}

}
