package Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class abc {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajay\\OneDrive\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.cricbuzz.com/");
		Thread.sleep(1000);
		
		driver.navigate().to("https://majhinaukri.in/");
		Thread.sleep(1000);
		
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.navigate().forward();
		Thread.sleep(1000);
		
		driver.navigate().refresh();
		Thread.sleep(1000);
		
		String title = driver.getTitle();
		System.out.println("title is "+title);
		Thread.sleep(1000);
		
		String url = driver.getCurrentUrl();
		System.out.println("url is "+url);
		Thread.sleep(1000);
		
		driver.close();
		Thread.sleep(1000);
		
		driver.quit();
		Thread.sleep(1000);
		
		
		
		

	}

}
