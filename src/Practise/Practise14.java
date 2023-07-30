package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practise14 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajay\\OneDrive\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		
		//WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		
		Select sdropdown=new Select(dropdown);
		
		sdropdown.selectByVisibleText("Option2");
		Thread.sleep(1000);
		
		sdropdown.selectByIndex(1);
		Thread.sleep(1000);
		
		
		

	}

}
