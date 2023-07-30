package ActionMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajay\\OneDrive\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
		

		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		
        WebDriver driver=new ChromeDriver(opt);
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(500);
		
		//1. Create an object of ACtions Class
		Actions act=new Actions(driver);
		
		//2. Find Element to be worked
		
		WebElement doubleclickbutton = driver.findElement(By.xpath("//button[contains(text(),'Alert')]"));
		//act.doubleClick(doubleclickbutton).perform();
		
		act.moveToElement(doubleclickbutton).doubleClick().build().perform();
		

	}

}
