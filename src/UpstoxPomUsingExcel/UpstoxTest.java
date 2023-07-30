package UpstoxPomUsingExcel;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpstoxTest {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajay\\OneDrive\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe" );
				WebDriver driver= new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://login-v2.upstox.com/");
				driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
				
				//reading data from excel
				File myFile= new File("C:\\Users\\Ajay\\OneDrive\\Desktop\\9th July C Batch.xlsx");
				 Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet3");
				
				//create an object of login page
				UpstoxLoginPage login= new UpstoxLoginPage(driver);
				login.UserName(mySheet.getRow(0).getCell(0).getStringCellValue());
				String pwd1 = mySheet.getRow(0).getCell(1).getStringCellValue();
				login.EnterPassword(pwd1);
				login.SignInButton();
				
				
				//create an object of passcode page
				driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
				UpstoxPasscodePage passcode= new UpstoxPasscodePage(driver);
				passcode.SendPasscode(mySheet.getRow(0).getCell(2).getStringCellValue());
				
				
				//create an object of Welcome page
				driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
				UpstoxWelcomePage welcome= new UpstoxWelcomePage(driver);
				welcome.clickOnnoIAmGoodButton();
				
				
				//create an object of Home page
				driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
				UpstoxHomePage home= new UpstoxHomePage(driver);
				home.validateUserID(driver, mySheet.getRow(2).getCell(3).getStringCellValue());
				home.clickonfunds(driver);
				
				
				//create an object of funds page
				UpstoxFundsPage funds= new UpstoxFundsPage(driver);
				funds.checkfunds();
		        home.LogoutFromApplication(driver);
				driver.close();
		

	}

}
