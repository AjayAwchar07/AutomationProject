package UpstoxPomUsingExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxPasscodePage 
{
	// variable decleration
		@FindBy(name="yob")private WebElement passcode;
		
		// variable initalization
		// using constructor
		public UpstoxPasscodePage(WebDriver driver)
		{
			PageFactory.initElements(driver,this );
		}
		
		// usage
		public void SendPasscode(String year) // create method
		{
			passcode.sendKeys(year);
		}

}
