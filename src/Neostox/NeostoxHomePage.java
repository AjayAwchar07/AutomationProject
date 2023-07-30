package Neostox;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class NeostoxHomePage
{
	@FindBy (id = "lbl_username")private WebElement profilename; 
	
	@FindBy (id = "lbl_curbalancetop")private WebElement fundbalance;
	
	@FindBy (xpath = "//span[text()='Logout']")private WebElement logout;
	
	public NeostoxHomePage(WebDriver driver) 
	{ 
	PageFactory.initElements(driver, this); 
	} 
	
	public String validateprofile(WebDriver driver) throws IOException 
	{ 
	String pname = profilename.getText(); 
	NeostoxUtility.screenShotMethod(driver, pname); 
	Reporter.log("Taking Screenshot Of HOME PAGE", true); 
	return pname; 
	}
	
	public void validateFundAmount() 
	{ 
	String fund = fundbalance.getText(); 
	System.out.println("My Total A/C Balance "+fund); 
	Reporter.log("Fund Validation Done", true); 
	} 
	
	public void clickonLogout() throws InterruptedException 
	{ 
	profilename.click(); 
	Thread.sleep(500); 
	Reporter.log("Click ON ProfileName",true); 
	Reporter.log("Sucussfully Logout...",true); 
	logout.click();
	}

}
