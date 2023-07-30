package ActionMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardAction2 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajay\\OneDrive\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
		

		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		
        WebDriver driver=new ChromeDriver(opt);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
		WebElement UserName = driver.findElement(By.id("email"));
		//UserName.sendKeys("Ajay");
		
		Actions act=new Actions(driver);
		act.keyDown(Keys.SHIFT).sendKeys("A").keyUp(Keys.SHIFT).sendKeys("jay").build().perform();
		
		

	}

}
