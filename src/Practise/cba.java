package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cba {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajay\\OneDrive\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Ajayawchar07@gmail.com");
		//Thread.sleep(1000);
		
		//driver.findElement(By.xpath("//input[@id='email']")).clear();
		//Thread.sleep(1000);
		
		//driver.findElement(By.xpath("//a[contains(@id,'u_0_0')]")).click();
		//Thread.sleep(500);
		
		//String acc = driver.findElement(By.xpath("//a[contains(@id,'u_0_0')]")).getText();
		//System.out.println(" text is "+acc);
		
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		boolean result = password.isEnabled();
		System.out.println("result is "+result);
		
		


	}

}
