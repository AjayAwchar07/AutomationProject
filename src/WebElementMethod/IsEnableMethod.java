package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnableMethod {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajay\\OneDrive\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.discoveryplus.in/");
		// Thread.sleep(1000); // not possiable using 1000 times
		Thread.sleep(5000); // possiable using 5000 time
		
		driver.findElement(By.xpath(" (//h6[text()='Sign In'])[2]")).click();
		
		WebElement GetOtpButton = driver.findElement(By.xpath("//button[text()='Get OTP']"));
		// GetOtpButton is refrence variable
		
		boolean result = GetOtpButton.isEnabled();
		// isEnabled method stored in boolean value
		
		System.out.println("get otp enabled result is "+result);
		
		//WebElement mobileNumberField = driver.findElement(By.id("mobileNumber"));
		// mobilenumberfield is refrence variable and store in webelement
		
		//mobileNumberField.sendKeys("9860590407");
		
		// boolean result1 = GetOtpButton.isEnabled();
		 // result1 is refrence variable and stored in boolean value
		 
		// System.out.println("get otp enabled status is "+result1);
		 
		 
		
		

		
		
	}

}
