package UpstoxPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxLoginPage

{
	// variable decleration
	@FindBy(name="userId")private WebElement userID;
	
	@FindBy(name="password")private WebElement Password;
	
	@FindBy(xpath="//div[text()='Sign into Upstox']")private WebElement signinbutton;

	public Object userid;
	
	
	// variable initialization
	public UpstoxLoginPage(WebDriver driver) // create constructor for initialise variable
	{ // create local variable of driver for operating element
		PageFactory.initElements(driver, this);
	}
	
	// variable usage
	public void userid() //create method for userid
	{
		userID.sendKeys("CZ7399");
	}
	
	public void enterpassword() // create method for password
	{
		Password.sendKeys("Shivaji@11");
	}
	
	public void signinbutton() //create method for signin
	{
		signinbutton.click();
	}

}
