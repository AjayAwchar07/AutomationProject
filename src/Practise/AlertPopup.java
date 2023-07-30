package Practise;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajay\\OneDrive\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@name='alertbox']")).click();
		Thread.sleep(3000);
		
		Alert alt = driver.switchTo().alert();
		
		System.out.println(alt.getText());
		Thread.sleep(1000);
		
		alt.accept();
	}

}
