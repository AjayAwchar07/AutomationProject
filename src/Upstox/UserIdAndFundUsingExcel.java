package Upstox;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserIdAndFundUsingExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajay\\OneDrive\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://login-v2.upstox.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		
		//Read data from excel
		File myFile=new File("C:\\Users\\Ajay\\OneDrive\\Desktop\\9th July C Batch.xlsx");
		Sheet mysheet = WorkbookFactory.create(myFile).getSheet("Sheet2");
				
		String un = mysheet.getRow(0).getCell(0).getStringCellValue();
		String password = mysheet.getRow(0).getCell(1).getStringCellValue();
		String year = mysheet.getRow(0).getCell(2).getStringCellValue();
		
		
		// sending username
		driver.findElement(By.name("userId")).sendKeys(mysheet.getRow(0).getCell(0).getStringCellValue());
		
		// sending password
		driver.findElement(By.name("password")).sendKeys( mysheet.getRow(0).getCell(1).getStringCellValue());
		
		//click on sign in button
		driver.findElement(By.id("submit-btn")).click();
		
		// Navigate to next page
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		
		// Enter the year in passcode
		driver.findElement(By.id("yob")).sendKeys(mysheet.getRow(0).getCell(2).getStringCellValue());
		
		// Navigate to next page
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(6000));
		
		// click on No i am good
		driver.findElement(By.xpath("(//button[@type='button'])[9]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		
		// validate username
		String Actualun = driver.findElement(By.xpath("(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]")).getText();
		String expectedun = "Pranav C.";
		
		if(Actualun.equals(expectedun))
{
	System.out.println("Actual and Expected usernames are matching,Tc is passed");
}
else
{
	System.out.println("Actual and Expected username are not matching,Tc is failed");
}
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		// validate funds
		// click on funds button
		driver.findElement(By.id("funds")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		String funds = driver.findElement(By.xpath("((//div[@class='_2Bthrplw1VYHfLzzQv0asZ'])[1]//div)[3]")).getText();
		System.out.println("Funds available to trade are "+funds);
		
		

	}

}
