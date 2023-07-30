package Neostox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage
{
	@FindBy (xpath = "(//a[text()='OK'])[2]")private WebElement okButton; 
	
	@FindBy (xpath = "(//a[text()='Close'])[5]")private WebElement closeButton; 
	
	public WelcomePage(WebDriver driver) 
	{ 
	PageFactory.initElements(driver, this); 
	} 
	
	
	public void clikeonbuttons() throws InterruptedException 
	{ 
	okButton.click(); 
	Thread.sleep(2000); 
	closeButton.click();
	}

}
