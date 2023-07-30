package SileniumStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajay\\OneDrive\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://paytm.com/");
		
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
		
		String currenturl = driver.getCurrentUrl();
		
		System.out.println("current open url is "+currenturl);

	}

}
