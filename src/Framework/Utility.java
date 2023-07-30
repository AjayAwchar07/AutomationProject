package Framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility 
{
	public static String M1(int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Ajay\\OneDrive\\Desktop\\Book1.xlsx");
		
		Sheet mysheet = WorkbookFactory.create(file).getSheet("Sheet1");
		
		String data = mysheet.getRow(row).getCell(cell).getStringCellValue();
		
		
		
		
		return data;
		
	}
	
	public static void   screenshot(WebDriver driver) throws IOException
	{
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest= new File("C:\\Users\\Ajay\\OneDrive\\Desktop\\Screenshot.jpg"); 
	
	FileHandler.copy(src, dest);
	}

}
