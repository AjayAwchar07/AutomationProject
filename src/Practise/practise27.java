package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class practise27 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajay\\OneDrive\\Desktop\\chrome\\chromedriver_win32\\chromedriver(1).exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
		Actions act=new Actions(driver);
		
		WebElement newaccountcreate = driver.findElement(By.xpath("//a[contains(@id,'u_0_0')]"));
		
		act.click(newaccountcreate).perform();
		Thread.sleep(1000);
		
		//select day of dropdown
		WebElement day = driver.findElement(By.id("day"));
		act.click(day).perform();
		
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(1000);
		
		// select month from dropdown
		WebElement month = driver.findElement(By.id("month"));
		act.click(month).perform();
		for(int i=0;i<=5;i++)
		{
			act.sendKeys(Keys.ARROW_UP).perform();
			Thread.sleep(500);
		}
		act.sendKeys(Keys.ENTER).perform();
		
		// select year from dropdown
		WebElement year = driver.findElement(By.id("year"));
		act.click(year).perform();
		
		for(int j=4;j>=0;j--)
		{
			act.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(500);
		}
		act.sendKeys(Keys.ENTER).perform();
		
		
		
		

	}

}
