package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise11
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajay\\OneDrive\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.discoveryplus.in/");
		Thread.sleep(5000);
		
	driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
	
		
		WebElement getotpbutton = driver.findElement(By.xpath("//button[text()='Get OTP']"));
		
		boolean result = getotpbutton.isEnabled();
		System.out.println("Get Otp Enamble Result is "+result);


	}

}
