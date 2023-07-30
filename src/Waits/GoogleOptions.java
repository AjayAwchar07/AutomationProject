package Waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GoogleOptions 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajay\\OneDrive\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
		
		//create object of Chromeoption for avoiding notifications of browser
		ChromeOptions opt=new ChromeOptions();
		//opt.addArguments("disable-notifications");
		//opt.addArguments("incognito");
		//opt.addArguments("start-optimized");
		//opt.addArguments("disable-extensions");
		//opt.addArguments("disable-popup-blocking");
		opt.addArguments("make-default-browse");
		
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.justdial.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.findElement(By.xpath("//span[text()='B2B']")).click();
		
	}

}
