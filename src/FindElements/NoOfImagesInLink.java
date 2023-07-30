package FindElements;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NoOfImagesInLink
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajay\\OneDrive\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
		

	//	ChromeOptions opt=new ChromeOptions();
	//	opt.addArguments("--remote-allow-origins=*");
		
        WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		Thread.sleep(1000);
		
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println(images.size());
		
		System.out.println("===============Transversing=================");
		System.out.println("===============For Each Loop================");
		
	for(WebElement i:images)
	{
		System.out.println(i.getText());
	}
	
	System.out.println("====================Iterator=======================");
	
	Iterator<WebElement> it = images.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next().getText());
	}
		

	}

}
