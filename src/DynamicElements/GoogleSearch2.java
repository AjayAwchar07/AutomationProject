package DynamicElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GoogleSearch2 
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
	    
	    driver.findElement(By.name("q")).sendKeys("reebok");
		Thread.sleep(1000);
	    
List<WebElement> search = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		
	    //for each
	    for( WebElement s:search)
	    {
	    	System.out.println(s.getText());
	    	
	    	String result = "reebok shoes india";
	    	if(result.equals(s.getText()))
	    	{
	    		s.click();
	    		break;
	    	}
	    }
	    
	    driver.findElement(By.xpath("//a[text()='Images']")).click();
	    

	}

}
