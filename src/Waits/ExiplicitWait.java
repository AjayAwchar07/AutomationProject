package Waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExiplicitWait {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajay\\OneDrive\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.discoveryplus.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		WebElement signin = driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]"));
		
		WebDriverWait w=new WebDriverWait(driver,Duration.ofMillis(5000));
		
		w.until(ExpectedConditions.visibilityOf(signin));
		
		signin.click();

	}

}
