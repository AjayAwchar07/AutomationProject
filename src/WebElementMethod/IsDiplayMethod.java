package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDiplayMethod {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajay\\OneDrive\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		
		WebElement TextBox = driver.findElement(By.id("displayed-text"));
		// Textox is refrence variable
		
		//WebElement hideBox = driver.findElement(By.id("hide-textbox"));
		// hideBox is refrence variable
		
		System.out.println(TextBox.isDisplayed()); // is true texbox show in browser
		//System.out.println(hideBox.isDisplayed());
		
		TextBox.sendKeys("Good Morning");

	}

}
