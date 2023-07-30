package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajay\\OneDrive\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		 driver.get("https://vctcpune.com/selenium/practice.html");
		
		 String result = driver.findElement(By.xpath("//h1[contains(text(),'Welcome To Practice Page')]")).getText();
		// result is refrance variable
		
		System.out.println("text present on webpage is "+result);
		
		//WebElement myElement = driver.findElement(By.xpath("//h1[contains(text(),'Welcome To Practice Page')]"));
		// myElement is refrance variable
		
		//myElement.click();
		//myElement.getText();
		
		// silenium exception problem

	}

}
