package Practise;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practise31 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajay\\OneDrive\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();

		driver.get("https://paytm.com/");
		
		// to identfy default positon of browser
		Point dafaultposition = driver.manage().window().getPosition();
		System.out.println("Position of Browser is "+ dafaultposition );
		Thread.sleep(2000);
		
		
		// To set nwe postion of  browser
		Point p=new Point(180, 170);
		driver.manage().window().setPosition(p);
		
		// to identify current position of browser
		 Point currentposition = driver.manage().window().getPosition();
		 System.out.println("Currenr position of Browser is "+currentposition);
		
		
		

		
	}

}
