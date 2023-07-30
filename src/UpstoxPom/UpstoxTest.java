package UpstoxPom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpstoxTest {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajay\\OneDrive\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://login-v2.upstox.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		// create object of upstoxloginpage
		
		UpstoxLoginPage login=new UpstoxLoginPage(driver);
		login.userid();
		login.enterpassword();
		login.signinbutton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		
		// create an object of UpstoxPasscodePage
		UpstoxPasscodePage passcode=new UpstoxPasscodePage(driver);
		passcode.SendPasscode();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		//create object of UpstoxWelcomePage
		UpstoxWelcomePage welcome=new UpstoxWelcomePage(driver);
		welcome.clickOnnoIAmGoodButton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		//create object of UpstoxHomePage
		UpstoxHomePage home=new UpstoxHomePage(driver);
		home.validateUserID(driver);
		home.clickonfunds(driver);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		//create object of UpstoxFundsPage
		UpstoxFundsPage funds=new UpstoxFundsPage(driver);
		funds.checkfunds();
		
				
			
				
	}
}
