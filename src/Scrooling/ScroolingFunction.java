package Scrooling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScroolingFunction 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajay\\OneDrive\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://paytm.com/");
		Thread.sleep(1000);
		
		
		WebElement postpaid = driver.findElement(By.xpath("//div[text()='Want it? ']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", postpaid);
		Thread.sleep(2000);
		
		WebElement cashback = driver.findElement(By.xpath("//h1[text()='Unlimited Cashback']"));
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("arguments[0].scrollIntoView()", cashback);
		System.out.println("Cashback of Paytm "+cashback.getText());
		Thread.sleep(2000);
		
		WebElement easy= driver.findElement(By.xpath("//p[text()='Managing Khata made easy']"));
		JavascriptExecutor js2 = (JavascriptExecutor)driver;
		js2.executeScript("arguments[0].scrollIntoView()",easy);
		System.out.println("Text on Paytm Easy "+easy.getText());
		
		
		
       
		
	}

	public static void scrollIntoView(WebDriver driver, WebElement userID) {
		// TODO Auto-generated method stub
		
	}

}
