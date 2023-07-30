package Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create1
{
	@FindBy(xpath="//input[@name='firstname']")private WebElement fname;
	
	@FindBy(xpath="//input[@name='lastname']")private WebElement lname;
	
	@FindBy(xpath="//input[@name='reg_email__']")private WebElement email;
	
	@FindBy(xpath="//input[@name='reg_passwd__']")private WebElement password;
	
	
	Create1(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void Firstname(String A)
	{
		fname.sendKeys(A);
	}
	
	public void Lastname(String B)
	{
		lname.sendKeys(B);
	}
	
	public void Email(String C)
	{
		email.sendKeys(C);
	}
	
	public void Password(String D)
	{
		password.sendKeys(D);
	}

}
