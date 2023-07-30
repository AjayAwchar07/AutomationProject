package Scrooling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeyUsingJavaScript {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajay\\OneDrive\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		
		// sendkeys using javascript
		WebElement emailid = driver.findElement(By.xpath("//input[@id='email']"));
		js.executeScript("arguments[0].value='Ajayawchar07@gmail.com'", emailid);
		Thread.sleep(2000);
		
		// clickmethod using javascript
		WebElement newaccount = driver.findElement(By.xpath("//a[contains(@id,'u_0_0_')]"));
		js.executeScript("arguments[0].click()",newaccount);
	
		

	}

}
