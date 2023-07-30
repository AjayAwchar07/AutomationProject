package Neostox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class NeostoxLoginPage 
{
	
		@FindBy (id = "MainContent_signinsignup_txt_mobilenumber")private WebElement userid;
		
		@FindBy (xpath = "(//a[text()='Sign Up'])[2]")private WebElement signup;
		
		@FindBy (id = "txt_accesspin")private WebElement password; 
		
		@FindBy (id = "lnk_submitaccesspin")private WebElement submit; 
		
		
		public NeostoxLoginPage(WebDriver driver) 
		{ 
		PageFactory.initElements(driver, this); 
		} 
		
		public void enteruserID(String id) 
		{ 
		userid.sendKeys(id); 
		Reporter.log("Ajayawchar07@gmail.com", true); 
		} 
		
		public void clickonsingup() 
		{ 
		signup.click(); 
		Reporter.log("Clickon SingUP Button", true); 
		} 
		
		public void enterpassword(String pass) throws InterruptedException 
		{ 
		password.sendKeys(pass); 
		Reporter.log("Ajay@123",true);
		Thread.sleep(5000); 
		submit.click(); 
		Reporter.log("Clickon Submit Button",true); 
		Thread.sleep(5000);
		}

}
