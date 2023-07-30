package UpstoxUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class Utility 
{
	
	//excel
	//screenshot
	//scrolling
	//wait
	public static String readDataFromExcel(int row, int cell) throws EncryptedDocumentException, IOException 
	{
	File myFile= new File("C:\\Users\\Ajay\\OneDrive\\Desktop\\9th July C Batch.xlsx");
	 Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet4");
	String value = mySheet.getRow(row).getCell(cell).getStringCellValue();
	return value;
	}
	public static void screenshot(WebDriver driver, String TCID) throws IOException 
	{
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest= new File("C:\\Users\\Ajay\\OneDrive\\Desktop\\Screenshot"+TCID+".jpg");
	FileHandler.copy(src, dest);
	}
	public static void wait(WebDriver driver, int waitTime)
	{
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}
	public static void scrollIntoView(WebDriver driver,WebElement element)
	{
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView()", element);
	}
	

}
