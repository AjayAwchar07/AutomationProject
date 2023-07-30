package ActionMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ClickActionMethod 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajay\\OneDrive\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
		

		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		
        WebDriver driver=new ChromeDriver(opt);
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(500);
		
		//1.to take mouse actions, need to create object of Actions class and pass webDriver object as parameter
		Actions act=new Actions(driver);
		
		//2.find Element to be act
		WebElement Aboutus = driver.findElement(By.xpath("//a[text()='About Us']"));
		
		//3.now take action ad perform
		act.moveToElement(Aboutus).perform();
		
		//4.click method using action class
		act.click().perform();
		
		//5.I want click to click on radio button
		WebElement Radio1 = driver.findElement(By.xpath("//input[@value='Radio1']"));
		
		act.moveToElement(Radio1).perform();
		act.click().perform();
		
		act.moveToElement(Radio1).click().build().perform();
		act.click(Radio1).perform();
	

	}

}
