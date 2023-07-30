package Practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practise33 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajay\\OneDrive\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		
		// How many roes in table
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='product']//tr"));
		Thread.sleep(100);
		System.out.println("Total rows in table are "+rows.size());
		System.out.println("====================================");
		
		// how many cells or columns in table
		List<WebElement> columns = driver.findElements(By.xpath("//table[@id='product']//tr//th"));
		Thread.sleep(1000);
		System.out.println("Total cells in a table are "+columns.size());
		System.out.println("=====================================");
		
		// Total data in table
		for( WebElement r:rows)
		{
			System.out.println(r.getText());
		}
		System.out.println("=================Data========================");

	}

}
