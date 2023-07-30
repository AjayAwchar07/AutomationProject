package UpstoxPomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxPasscodePage 
{
	//variable declaration
	
	@FindBy(name = "yob") private WebElement passcode;
	
	//variable initialization (constructor-->PageFactory-->Method-->initElements)
	public UpstoxPasscodePage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	
	
	//usage(variable Methods-->Actions)
	public void enterPasscode(String pass)
	{
	passcode.sendKeys(pass);
	}

	

}
