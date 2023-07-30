package ActionMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class practise {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajay\\OneDrive\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
		

		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(opt);
		
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//div[text()='Mobiles']")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("(//img[@alt='Shop Now'])[1]")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//img[@alt='realme 9i (Prism Blue, 128 GB)']")).click();
		Thread.sleep(4000);
		
		WebElement mobile = driver.findElement(By.xpath("//div[text()='realme 9i (Prism Blue, 128 GB)']"));
		System.out.println("Mobile name is "+mobile.getText());
		
		WebElement price = driver.findElement(By.xpath("(//div[text()='₹14,999'])[1]"));
		System.out.println("mobile price is "+price.getText());
		
		
	}

}

