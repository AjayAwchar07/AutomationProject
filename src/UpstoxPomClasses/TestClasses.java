package UpstoxPomClasses;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



import Framework.Utility;

public class TestClasses 
{
	public class UpstoxUserNameValidation extends Base
	{
		 
		UpstoxLoginPage login;
		UpstoxPasscodePage passcode;
		UpstoxWelcomePage welcome;
		UpstoxHomePage home;
		UpstoxFundsPage funds;
		String TCID="1234";
		
		@BeforeClass
		public void openBrowser()
		{
		launchBrowser();
		Reporter.log("Launching browser",true);
		login= new UpstoxLoginPage(driver);
		passcode= new UpstoxPasscodePage(driver);
		welcome= new UpstoxWelcomePage(driver);
		home= new UpstoxHomePage(driver);
		funds= new UpstoxFundsPage(driver);
		
		}
		@BeforeMethod
		public void loginToUpstox() throws EncryptedDocumentException, IOException 
		{
		login.sendUserName(TCID);;
		login.sendPassword(Utility.readDataFromExcel(1, 1));
		login.signinbutton();
		Reporter.log("sending userName and Password", true);
		Utility.wait(driver, 1000);
		passcode.enterPasscode(Utility.readDataFromExcel(1, 2));
		Reporter.log("sending passcode", true);
		Utility.wait(driver, 5000);
		welcome.clickOnnoIAmGoodButton();
		Utility.wait(driver, 1000);
		}
		@Test
		 public void validateUserID() throws EncryptedDocumentException, IOException 
		 {
		Assert.assertEquals(home.getActualUserID(driver), 
		Utility.readDataFromExcel(1, 3));
		Reporter.log("validating userName and Taking screenshot", true);
		Utility.screenshot(driver, TCID);
		 }
		@AfterMethod
		public void logoutFromUpstox() throws InterruptedException
		{
		home.logoutFromApplication(driver);
		Reporter.log("logging out....", true);
		}
		@AfterClass
		public void closeBrowser()
		{
		Utility.wait(driver, 1000);
		Reporter.log("closing browser....", true)
		driver.close();
		
		}


	}
}
