package SileniumStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajay\\OneDrive\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(); // Created Object Of Chromedriver
		
		driver.get("https://www.facebook.com/login/");
		
		driver.findElement(By.xpath("//html[@id='facebook']")).click();
		
		
		

	}

}
