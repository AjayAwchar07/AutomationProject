package UpstoxPomUsingExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxLoginPage
{
	// variable decleration
		@FindBy(name="userid")private WebElement userID;
		
		@FindBy(name="password")private WebElement Password;
		
		@FindBy(xpath="//div[text()='Sign into Upstox']")private WebElement signinbutton;

		
		
		
		// variable initialization
		public UpstoxLoginPage(WebDriver driver) // create constructor for initialise variable
		{ // create local variable of driver for operating element
			PageFactory.initElements(driver, this);
		}
		
		// variable usage
		public void UserName(String un) //create method for userid
		{
			userID.sendKeys(un);
		}
		
		public void EnterPassword(String ps) // create method for password
		{
			Password.sendKeys(ps);
		}
		
		public void SignInButton() //create method for signin
		{
			signinbutton.click();
		}

}
