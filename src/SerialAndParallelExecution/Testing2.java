package SerialAndParallelExecution;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testing2 
{
	@Test
	public void SetPosition() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajay\\OneDrive\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://en-gb.facebook.com/");
		 Dimension defaultsize = driver.manage().window().getSize();
		System.out.println("Default Size of Browser is "+defaultsize);
		
		Dimension d=new Dimension(300,1000);
		Thread.sleep(4000);
		
		 driver.manage().window().setSize(d);
		 Dimension newsize = driver.manage().window().getSize();
		 System.out.println("New Size of Browser is "+newsize);
	}

}
