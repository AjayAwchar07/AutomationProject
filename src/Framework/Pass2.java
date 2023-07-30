package Framework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pass2
{
public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Ajay\\\\OneDrive\\\\Desktop\\\\chrome\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/reg/");
		
		driver.manage().window().maximize();
		
		Pass1 A = new Pass1(driver);
		
		A.Firstname(Pass3.M1(4, 0));
		
		A.Lastname(Pass3.M1(4, 1));
		
		A.email(Pass3.M1(4, 2));
		
		A.mob(Pass3.M1(4, 3));
		
		A.enterday(Pass3.M1(4, 4));
		
		A.entermonth(Pass3.M1(4, 5));
		
		A.enteryear(Pass3.M1(4, 6));
		
	

}
}
