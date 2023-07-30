package Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise5 
{

	public static void main(String[] args) throws InterruptedException
	{ 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajay\\OneDrive\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
	
	   WebDriver driver=new ChromeDriver();
	   
	   driver.manage().window().maximize();
	   
	   driver.get("https://wynk.in/music");
	   Thread.sleep(2000);
	   
	   driver.close();
		

	}

}
