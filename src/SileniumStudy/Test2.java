package SileniumStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajay\\OneDrive\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
		
		  WebDriver driver=new ChromeDriver();
		  
		  
		  // 1.get-->To enter url in Browser Or To open an application
		  
		  driver.get("https://vctcpune.com/");// multiple application open is not possiable
		  Thread.sleep(1000); // time in minisecond
		  //driver.get("https://www.facebook.com/login/");
		  
		  // 2.close-->To close current tab open in browser by silenium
		  
		  // driver.close();
		  
		  //3.Quit-->quit all tabs are present in browser opened by silenium
		 // driver.quit();
		  
		  // 4.Maximize & Minimise-->used to Maximise and Minimise browser
		 // driver.manage().window().maximize();
		  driver.manage().window().minimize();


	}

}
