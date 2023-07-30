package SetSizeAndPosition;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajay\\OneDrive\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://paytm.com/");
		
		// To identify default position of Browser
		Point defaultposition = driver.manage().window().getPosition();
		System.out.println("Position of Browser is "+defaultposition);
		Thread.sleep(2000);
		
		// To give new position 
		Point p= new Point(180,190);
		driver.manage().window().setPosition(p);
		
		// to identify current position
		Point currentposition = driver.manage().window().getPosition();
		System.out.println("Current position of browser is "+currentposition);
		

	}

}
