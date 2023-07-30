package P0pUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajay\\OneDrive\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("timerAlertButton")).click();
		Thread.sleep(10000);
		
		
		Alert alt = driver.switchTo().alert();
		
		System.out.println(alt.getText());
		alt.accept();// clicking on ok button
		
		//driver.findElement(By.id("alertButton")).click();
		//alt.accept();
		
		

		
		

	}

}
