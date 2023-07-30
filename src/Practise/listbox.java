package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajay\\OneDrive\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//a[contains(@id,'u_0_0_')]")).click();
		Thread.sleep(1000);
		
		WebElement day = driver.findElement(By.id("day"));
		Select sday=new Select(day);
		
		sday.selectByValue("16");
		Thread.sleep(1000);
		
		WebElement month = driver.findElement(By.id("month"));
		Select smonth=new Select(month);
		smonth.selectByIndex(3);
		Thread.sleep(1000);
		
		WebElement year = driver.findElement(By.id("year"));
		Select syear=new Select(year);
		syear.selectByVisibleText("1996");
	
		

	}

}
