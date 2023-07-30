package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise8
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajay\\OneDrive\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Ajayawchar07@gmail.com");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Ajay@123");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		Thread.sleep(4000);
		
		
		

	}

}
