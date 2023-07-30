package P0pUps;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajay\\OneDrive\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(1000);
		
		String mainpageid = driver.getWindowHandle();
		// mainpageid is ref variable and string is return type
		
		// to get id of main page use getwindowhandle---->
		System.out.println(mainpageid);
		
		// to open new window click on main page---->new window button
		driver.findElement(By.name("NewWindow")).click();
		
		//now main page window along with child/new window will be available
		// to get all page id's use getwindowhandles() method which will return you set of string
		Set<String> AllPageId = driver.getWindowHandles();
		System.out.println("==========For Each Loop===========");
  	for(String a:AllPageId)
  	{
  		System.out.println(a);
  	}
  	
  	System.out.println("================iterator===============");
  	// to get desired page id to use iterator and use next method to move ahead
  	Iterator<String> it = AllPageId.iterator();
  String mainpageidnew = it.next(); // store id in ref variable
  String childpageid = it.next(); // store id in ref variable
  
  System.out.println(mainpageid);
  System.out.println(childpageid);
  
  driver.switchTo().window(childpageid);// switching silenium focus from main page to child page
  Thread.sleep(2000);
  driver.manage().window().maximize();
  
  driver.findElement(By.id("the7-search")).sendKeys("Selenium");
  Thread.sleep(5000);
  driver.close();//will close current tab-->childtab
  
  //to get text from main page we need to switch selenium focus from child page to main page
  driver.switchTo().window(mainpageidnew); // switching from child to main page
  
  
  String mainpagetext = driver.findElement(By.xpath("//b[text()='[Dummy Controls]']")).getText();
  System.out.println("Text on mainpage is "+mainpagetext);
  
  
  
  
		
		
	}

}
