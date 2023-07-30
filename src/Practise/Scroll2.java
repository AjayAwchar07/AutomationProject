package Practise;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Scroll2 {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajay\\OneDrive\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://paytm.com/");
		Thread.sleep(1000);
		
		//WebElement wantit = driver.findElement(By.xpath("//div[text()='Want it? ']"));
		
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("arguments[0].scrollIntoView()",wantit);
		//Thread.sleep(2000);
		
		WebElement cashback = driver.findElement(By.xpath("//h1[text()='Unlimited Cashback']"));
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("arguments[0].scrollIntoView()",cashback);
		System.out.println("Unlimited cashback is "+cashback.getText());
		Thread.sleep(2000);
		
		//WebElement insurance = driver.findElement(By.xpath("//div[text()='Insurance made easy.']"));
		//JavascriptExecutor js2 = (JavascriptExecutor)driver;
		//js2.executeScript("arguments[0].scrollIntoView()",insurance);
		//System.out.println("Text on insurance is "+insurance.getText());
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("D:\\Screenshot.png");
		FileHandler.copy(source, destination);

	}

}
