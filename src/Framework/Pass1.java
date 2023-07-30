package Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Pass1
{
@FindBy(xpath = "//input[@name='firstname'] ")private WebElement name;
	
    @FindBy(xpath = "//input[@name='lastname'] ") private WebElement lname ;
	
	@FindBy(xpath = "//input[@name='reg_email__'] ")private WebElement email;
	
	@FindBy(xpath = "//input[@name='reg_passwd__'] ")private WebElement mob;
	
	@FindBy(xpath = "//select[@id='day']")private WebElement day;
	
	@FindBy(xpath = "//select[@id='month']")private WebElement month;
	
	@FindBy(xpath = "//select[@id='year']")private WebElement year;
	


        Pass1(WebDriver driver) 
        {
    	   
    	   PageFactory.initElements(driver, this);
       }
       
       public void Firstname(String A) {
    	   
    	   name.sendKeys(A);
       }

       public void Lastname(String B) {
    	   
    	   lname.sendKeys(B);
       }

       public void email(String C) {
    	   
    	   email.sendKeys(C);
       }
        public void mob(String D) {
	   
	   mob.sendKeys(D);
       }
        public void enterday(String E) {
	   
        	Select s = new Select(day);
	      s.selectByVisibleText(E);
       }
        public void entermonth(String F) {
	   
        	Select s = new Select(month);
  	         s.selectByVisibleText(F);
       }

        public void enteryear(String G) {
     	   
     	   Select s = new Select(year);
     	   
     	   s.selectByVisibleText(G);

}
}
