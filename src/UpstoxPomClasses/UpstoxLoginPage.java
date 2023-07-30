package UpstoxPomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxLoginPage

{//variable declaration
	@FindBy(name = "userId") private WebElement userID;
	
	@FindBy(name = "password") private WebElement password;
	
	@FindBy(xpath = "//div[text()='Sign into Upstox']") private WebElement signInButton;
	
	
	//variable initialization 
	public UpstoxLoginPage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	
	//variable usage
	public void sendUserName(String un)
	{
	userID.sendKeys(un);
	}
	public void sendPassword(String pwd)
	{
	password.sendKeys(pwd);
	}
	public void clickOnSignInButton()
	{
	signInButton.click();
	
	}

	}


