package SileniumStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajay\\OneDrive\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
		
		  WebDriver driver=new ChromeDriver();
		  
		  
		  driver.get("https://vctcpune.com/");
		  
		  System.out.println(driver.getTitle());  // first way
		  
		  String  myTitle=driver.getTitle();  // second way
		  
		  System.out.println("Title of Webpage Is "+myTitle);

	}

}
