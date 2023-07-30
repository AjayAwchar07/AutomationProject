package DynamicElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GoogleSearch 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajay\\OneDrive\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
		

		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(opt);
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.name("q")).sendKeys("Honda");
		Thread.sleep(1000);
		
		 List<WebElement> searchresults = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		 
		 // for each
		for (WebElement s:searchresults)
		{
			System.out.println(s.getText());
			
			String reqresult = "honda amaze";
			if(reqresult.equals(s.getText()))
			{
				s.click();
				break;
				
			}
			
			}
		
		driver.findElement(By.xpath("//a[text()='Images']")).click();
	    Thread.sleep(4000);
	    driver.quit();
		
		

	}

}
