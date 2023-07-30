package Practise;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practise23 {

	public static void main(String[] args) throws InterruptedException 
	{
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajay\\OneDrive\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
		
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://skpatro.github.io/demo/links/");
	   Thread.sleep(1000);
	   
	   // switch silenium focus from main page to child browser popup
	   String mainpageid = driver.getWindowHandle();
	   
	   System.out.println(mainpageid);
	   
	   driver.findElement(By.name("NewWindow")).click();
	   
	   Set<String> AllPageId = driver.getWindowHandles();
	   //using for each loop
	   System.out.println("================For Each=============");
	  for (String a:AllPageId)
	  {
		  System.out.println(a);
	  }
	}

}
