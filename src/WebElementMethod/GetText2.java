package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText2 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajay\\OneDrive\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		 driver.get("https://vctcpune.com/selenium/practice.html");
		 
		// String text = driver.findElement(By.xpath("//a[text()='HOME ']")).getText();
		 // text is refrance variable
		 
		// System.out.println("text is "+text);
		 
		 //driver.findElement(By.xpath("//a[text()='HOME ']")).click();
		 
		 
		  WebElement myElement = driver.findElement(By.xpath("//a[text()='HOME ']"));
				  
		// myelement is refrence variable
		  
		  myElement.click();

	}

}
