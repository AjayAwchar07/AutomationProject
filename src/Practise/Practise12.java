package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise12 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajay\\OneDrive\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		
		WebElement checkbox = driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
		
		System.out.println(checkbox.isSelected());
		//ans is false because no selected text
		
		checkbox.click();
		System.out.println(checkbox.isSelected());
		// ans is true beacause checkbox is click and selected

		
		

	}

}
