package Practise;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class practise21 {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajay\\OneDrive\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.name("q")).sendKeys("i phone 14 pro max");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//img[@alt='APPLE iPhone 14 Pro Max (Space Black, 512 GB)']")).click();
		Thread.sleep(2000);
		
		WebElement apple = driver.findElement(By.xpath("//div[text()='APPLE iPhone 14 Pro Max (Space Black, 512 GB)']"));
		System.out.println("Name of Phone is "+apple.getText());
		
		
		WebElement price = driver.findElement(By.xpath("//div[text()='₹1,69,900']"));
		System.out.println("Price of iphone 14 pro max is "+price.getText());
		Thread.sleep(2000);
		
		 File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 
		 File destination = new File("C:\\Users\\Ajay\\OneDrive\\Desktop\\Screensho Of Silenium.png");
		  
		 FileHandler.copy(source, destination);
		 
		
		
		

	}

}
