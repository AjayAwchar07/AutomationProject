package ActionMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardAction 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajay\\OneDrive\\Desktop\\chrome\\chromedriver_win32\\chromedriver(1).exe");
		

		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		
        WebDriver driver=new ChromeDriver(opt);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
		WebElement NewAccountCreate = driver.findElement(By.xpath("//a[contains(@id,'u_0_0_')]"));
		
		Actions act=new Actions(driver);
		
		act.click(NewAccountCreate).perform();
		Thread.sleep(1000);
		
		WebElement day = driver.findElement(By.id("day"));
		act.click(day).perform(); //click on day-->show dropdown menu
		//act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		//OR
		
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		
		// select of month by using Action class
		
		WebElement month = driver.findElement(By.id("month"));
		act.click(month).perform();
		
		for(int i=0;i<=6;i++)
		{
			act.sendKeys(Keys.ARROW_UP).perform();
			Thread.sleep(500);
		}
		    act.sendKeys(Keys.ENTER).perform();
		    
		 // select of year by using Action class
		    WebElement year = driver.findElement(By.id("year"));
		    act.click(year).perform();
		    
		    for(int j=4;j>=0;j--)
		    {
		    	act.sendKeys(Keys.ARROW_DOWN).perform();
		    	Thread.sleep(500);
		    }
		    act.sendKeys(Keys.ENTER).perform();
		

	}

}
