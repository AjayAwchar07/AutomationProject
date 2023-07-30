package Practise;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class practise24 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajay\\OneDrive\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		
		// create object of Action class and pass webdriver as argument
		Actions act=new Actions(driver);
		
		// i want to click on radio button
		WebElement radio = driver.findElement(By.xpath("//input[@value='Radio1']"));
		
		act.moveToElement(radio).perform();
		act.click().perform();
		

	}

}
