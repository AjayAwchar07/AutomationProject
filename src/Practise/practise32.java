package Practise;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practise32 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajay\\OneDrive\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://paytm.com/");
		
		// to set size of browser
		Dimension defaultsize = driver.manage().window().getSize();
		System.out.println("Default size of Browser is "+defaultsize);
		
		// set new size of browser
		Dimension d=new Dimension(1500, 1000);
		driver.manage().window().setSize(d);
		
		// to get current size of browser
		Dimension currentsize = driver.manage().window().getSize();
		System.out.println("Current size of Browser is "+currentsize);
		

	}

}
