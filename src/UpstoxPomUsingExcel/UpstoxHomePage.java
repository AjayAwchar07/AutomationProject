package UpstoxPomUsingExcel;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Screenshot.ScreenShotGeneralMethod;
import Scrooling.ScroolingFunction;

public class UpstoxHomePage
{
	@FindBy(xpath="(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]")private WebElement userID;
	@FindBy(id="funds")private WebElement fundsbutton;
	@FindBy(xpath="//div[text()='Logout']")private WebElement logout;
	
	public UpstoxHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void validateUserID(WebDriver driver,String expID) throws InterruptedException, IOException
	{
		Thread.sleep(1000);
		ScroolingFunction.scrollIntoView(driver,userID);
		String actualuserID = userID.getText();
		String expecteduserID = expID;
		
		ScreenShotGeneralMethod.ScreenShot(driver,actualuserID);
		
		if(actualuserID.equals(expecteduserID))
		{
			System.out.println("Actual and Expected userid are same,TC is passed");
		}
		else
		{
			System.out.println("Actual and expected userid are not same,Tc is failed");
		}
		
		}
	    public void clickonfunds(WebDriver driver) throws InterruptedException
	    {
	    	Thread.sleep(1000);
	    	ScroolingFunction.scrollIntoView(driver,fundsbutton);
	    	
	    	fundsbutton.click();
	    	Thread.sleep(1000);
	    }
	    
	    public void LogoutFromApplication(WebDriver driver) throws InterruptedException
	    {
	    	Thread.sleep(1000);
	    	ScroolingFunction.scrollIntoView(driver,userID);
	    	userID.click();
	    	Thread.sleep(1000);
	    	logout.click();
	    }
}

