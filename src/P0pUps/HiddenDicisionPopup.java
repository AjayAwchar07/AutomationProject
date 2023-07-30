package P0pUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDicisionPopup 
{

	public static void main(String[] args) throws InterruptedException 
	
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajay\\OneDrive\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("q")).sendKeys("i phone 14 pro max");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//img[@alt='APPLE iPhone 14 Pro Max (Silver, 1 TB)']")).click();
		Thread.sleep(2000);
		
		WebElement apple = driver.findElement(By.xpath("//div[text()='APPLE iPhone 14 Pro Max (Silver, 1 TB)']"));
		System.out.println("mobile name is "+apple.getText());
		
		WebElement price = driver.findElement(By.xpath("(//div[text()='₹1,89,900'])[1]"));
		System.out.println("mobile price is "+price.getText());
		

	}

}
