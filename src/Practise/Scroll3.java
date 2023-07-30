package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll3 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajay\\OneDrive\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://paytm.com/");
		Thread.sleep(1000);
		
		WebElement cashback = driver.findElement(By.xpath("//h1[text()='Unlimited Cashback']"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeAsyncScript("arguments[0].scrollIntoView()", cashback);
		
		System.out.println("cashbaxk is "+cashback.getText());

	}

}
