package Framework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajay\\OneDrive\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/reg/");
		driver.manage().window().maximize();
		
		Create1 c=new Create1(driver);
		
		c.Firstname(Utility.M1(5, 0));
	    c.Lastname(Utility.M1(5, 1));
		c.Email(Utility.M1(5, 2));
		c.Password(Utility.M1(5, 3));
		
			
				
		
	}
	}


