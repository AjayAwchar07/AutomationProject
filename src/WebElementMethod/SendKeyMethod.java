package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SendKeyMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajay\\OneDrive\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		// chromedriver=new chromedriver();
		
		driver.get("https://www.facebook.com/login/");
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Ajay");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		 
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Awchar");
	}

}
