package Practise;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practise29 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajay\\OneDrive\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.name("q")).sendKeys("i phone 14");
		Thread.sleep(1000);
		
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println(images.size());
		
		System.out.println("=================For Each");
		for(WebElement i:images)
		{
			System.out.println(i.getText());
		}
		System.out.println("==============iterator===============");
		
		Iterator<WebElement> it = images.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next().getText());
		}
				
		
			

	}

}
