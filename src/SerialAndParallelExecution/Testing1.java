package SerialAndParallelExecution;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testing1 
{
	@Test
	public void SetPosition()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajay\\OneDrive\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		
		
		Point defaultposition = driver.manage().window().getPosition();
		System.out.println("Position of Default Browser is "+defaultposition);
		
		Point p=new Point(180,90);
		
		driver.manage().window().setPosition(p);
		Point newposition = driver.manage().window().getPosition();
		
		System.out.println("new Position of Browser is "+newposition);
	}

}
