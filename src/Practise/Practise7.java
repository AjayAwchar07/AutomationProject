package Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise7
{

	public static void main(String[] args) throws InterruptedException 
	{
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajay\\OneDrive\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://majhinaukri.in/");
		Thread.sleep(1000);
		
		String title = driver.getTitle();
		System.out.println("Title is "+title);
		
		String url = driver.getCurrentUrl();
		System.out.println("URL is "+url);

	}

}
