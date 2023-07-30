package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajay\\OneDrive\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		
		// How many rows in table
		// tr=table row
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='product']//tr"));
		Thread.sleep(1000);
		System.out.println("Total Rows in Table are "+rows.size());
		System.out.println("=================Rows==============");
		
		// How many Columns in table
		// th= table columns
		
		List<WebElement> columns = driver.findElements(By.xpath("//table[@id='product']//tr//th"));
		Thread.sleep(1000);
		System.out.println("Table Columns in Table are "+columns.size());
		System.out.println("==================Columns================");
		
		// which data present in table
		// for each
		for(WebElement r:rows)
		{
			System.out.println(r .getText());
			
		}
		System.out.println("==================Data===================");
		
		
		
		

	}

}
