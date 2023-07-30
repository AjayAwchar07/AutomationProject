package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class practise26 
{
  public static void main(String[] args) throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajay\\OneDrive\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demo.guru99.com/test/drag_drop.html");
	  Thread.sleep(1000);
	  
	  Actions act=new Actions(driver);
	  
	  WebElement source = driver.findElement(By.xpath("//a[text()=' 5000']"));
	  
	  WebElement destination = driver.findElement(By.id("amt8"));
	  
	  act.dragAndDrop(source, destination).perform();
	  
	  
  }

}
