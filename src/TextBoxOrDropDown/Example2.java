package TextBoxOrDropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajay\\OneDrive\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[contains(@id,'u_0_0_')]")).click();
		Thread.sleep(1000);
		
		WebElement day = driver.findElement(By.id("day"));// day is ref variable
		
		// select day from dropdown
		Select sday=new Select(day);
		
		sday.selectByIndex(7);
		
		// select month from dropdown
		WebElement month = driver.findElement(By.id("month"));
		Select smonth=new Select(month);
		smonth.selectByVisibleText("Apr");
		
		// select year from dropdown
		WebElement year = driver.findElement(By.id("year"));
		Select syear =new Select(year);
		syear.selectByVisibleText("1996");

	}

}
