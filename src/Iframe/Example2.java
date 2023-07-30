package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Example2
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Ajay\\\\OneDrive\\\\Desktop\\\\chrome\\\\chromedriver_win32\\\\chromedriver.exe");
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(opt);
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/frames");
		Thread.sleep(1000);
		
		// switching silenium focus from main page to frame1
		//driver.switchTo().frame("frame1");
		driver.switchTo().frame(3);
		
		String frame1text = driver.findElement(By.id("sampleHeading")).getText();
		// frame1text is ref variable & string is return value
		
		System.out.println("frame1 text is "+frame1text);
		
		// switching silenium focus from frame1 to main page
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(4);
		String frame2text = driver.findElement(By.id("sampleHeading")).getText();
		// frame2text is ref variable & string is return value
		
		System.out.println("frame2 text is "+frame2text);
		

	}

}
