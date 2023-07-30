package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajay\\OneDrive\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/nestedframes");
		Thread.sleep(1000);
		
		driver.switchTo().frame("frame1");
		
		 String parenttext = driver.findElement(By.xpath("//body[text()='Parent frame']")).getText();
		// parenttext is ref variable & string is return value
		
		System.out.println("parent text is " +parenttext);
		Thread.sleep(500);
		
		driver.switchTo().frame(0); // switching to child frame
		
		String childtext = driver.findElement(By.tagName("p")).getText();
		// childtext is ref variable & string is return value
		
		System.out.println("childtext is "+childtext);
		

	}

}
