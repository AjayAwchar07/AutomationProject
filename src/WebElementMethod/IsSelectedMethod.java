package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajay\\OneDrive\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		
		WebElement checkBox1 = driver.findElement(By.name("checkBoxOption1"));
		// checkbox is variable
		
		System.out.println(checkBox1.isSelected());// ans is false beacuse no selscted text
		
		checkBox1.click();
		
		System.out.println(checkBox1.isSelected()); // ans is true beacuse click slected text
		
			}

}
