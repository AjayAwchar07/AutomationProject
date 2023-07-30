package UpstoxPomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
	public void validateUserID(WebDriver driver) throws InterruptedException
	{
		
		
		String actualuserID = userID.getText();
		String expecteduserID = "Pranav C.";
		
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
	    	
	    	
	    	fundsbutton.click();
	    	Thread.sleep(1000);
	    }
	    public void logoutbutton(WebDriver driver)
	    {
	    	logout.click();
	    }
	    
	    public String getActualUserID()
	    {
	    	String actualUID = userID.getText();
	    	return actualUID;
	    }
	    
	
	}


