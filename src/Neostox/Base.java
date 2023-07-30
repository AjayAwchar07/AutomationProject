package Neostox;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base 
{
	
	WebDriver driver; 
	public void launchbrowser() throws IOException, InterruptedException 
	{ 
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajay\\OneDrive\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe"); 
	
	driver=new ChromeDriver(); 
	
	driver.get("https://neostox.com/"); 
	
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	
	NeostoxLoginPage neo=new NeostoxLoginPage(driver);
	
	neo.enteruserID("Ajayawchar07@gmail.com");
	neo.enterpassword("Ajay@123");
	neo.clickonsingup();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	
	WelcomePage wel=new WelcomePage(driver);
	
	wel.clikeonbuttons();
	Thread.sleep(2000);
	
	NeostoxHomePage home=new NeostoxHomePage(driver);
	
	home.validateprofile(driver);
	home.validateFundAmount();
	Thread.sleep(2000);
	home.clickonLogout();
	
	}

}
