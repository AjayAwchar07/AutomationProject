package FindElements;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfLinks 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajay\\OneDrive\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		Thread.sleep(1000);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println(links.size()); // to find hoe many links or text are present on google
		System.out.println("===========Tranversing============");
		System.out.println("========For Each===============");
		
		for(WebElement l:links)
		{
			System.out.println(l.getText());
		}
	
		System.out.println("============Iterator================");
		
		Iterator<WebElement> it = links.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next().getText());
		}
		
		
	
		
	
	
	
		

	}

}
