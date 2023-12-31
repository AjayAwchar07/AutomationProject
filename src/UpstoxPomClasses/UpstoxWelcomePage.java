package UpstoxPomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxWelcomePage 
{
	//variable declaration
	@FindBy(xpath = "//div[text()='No, I’m good']") private WebElement 	noIamGood;
	
	
	public UpstoxWelcomePage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	
	
	public void clickOnNoIamGoodButton()
	{
	noIamGood.click();
	}

}
