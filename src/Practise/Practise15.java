package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practise15
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajay\\OneDrive\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[contains(@id,'u_0_0')]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ajay");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Awchar");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9860590407");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Ajay@123");
		Thread.sleep(1000);
		
		//Select Day 
		WebElement Day = driver.findElement(By.id("day"));
		Select sDay=new Select(Day);
		sDay.selectByValue("25");
		Thread.sleep(1000);
		
		//Select Month
		WebElement Month = driver.findElement(By.id("month"));
		Select sMonth=new Select(Month);
		sMonth.selectByIndex(3);
		Thread.sleep(1000);
		
		//Select Year
		WebElement Year = driver.findElement(By.id("year"));
		Select sYear=new Select(Year);
		sYear.selectByVisibleText("1996");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
		
		
		
		

	}

}
