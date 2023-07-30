package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practise16
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
		
		//Select Day
		WebElement Day = driver.findElement(By.id("day"));
		Select sDay=new Select(Day);
		//sDay.selectByValue("26");
		
		//daylist using for Loop
		for(int i=0;i<=30;i++)
		{
			Thread.sleep(1000);
			sDay.selectByIndex(i);
		}
		
		 //Select Month
		WebElement Month = driver.findElement(By.id("month"));
		Select sMonth=new Select(Month);
		
		//Monthlist
		for(int j=0;j<=11;j++)
		{
			Thread.sleep(1000);
			sMonth.selectByIndex(j);
		}
		
		// select year from dropdown
		WebElement Year = driver.findElement(By.id("year"));
		Select sYear =new Select(Year);
		
		//yearlist
		for(int k=0;k<=99;k++)
		{
			sYear.selectByIndex(k);
		}
		

	}

}
