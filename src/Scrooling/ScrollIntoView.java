package Scrooling;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoView
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajay\\OneDrive\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://paytm.com/");
		Thread.sleep(2000);
		
		WebElement postpaid = driver.findElement(By.xpath("//div[text()='Want it? ']"));
		
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//js.executeScript("arguments[0].scrollIntoView()", postpaid);
		
		// Using screenshot From another class
		ScreenShotGeneralMethod.ScreenShot(driver,"postpaid");

	

	}

}
