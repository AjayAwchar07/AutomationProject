package Neostox;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class NeostoxUtility 
{
	public static String readPropertyFile(String key) throws IOException 
	{ 
	Properties pro =new Properties(); 
	
	FileInputStream myfile=new FileInputStream("C:\\Users\\Ajay\\OneDrive\\Desktop\\9th July C Batch.xlsx"); 
	pro.load(myfile); 
	String value = pro.getProperty(key); 
	return value; 
	} 
	public static void waitTime(WebDriver driver,long waitTime) 
	{ 
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(waitTime)); 
	} 
	public static void scroolingView(WebDriver driver,WebElement element) 
	{ 
	JavascriptExecutor js = (JavascriptExecutor)driver; 
	js.executeScript("arguments[0].scrollIntoView()",element); 
	} 
	public static void screenShotMethod(WebDriver driver,String str) throws IOException 
	{ 
	File Src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
	File dest = new File("C:\\Users\\Ajay\\OneDrive\\Desktop\\Screenshot"+str+".jpg"); 
	FileHandler.copy(Src, dest); 
	} 
	public static String ExcelGenralM1(String str,int r,int c) throws 
	EncryptedDocumentException, IOException 
	{ 
	File myfile = new File("C:\\Users\\Ajay\\OneDrive\\Desktop\\9th July C Batch.xlsx"); 
	Sheet mysheet = WorkbookFactory.create(myfile).getSheet("sheet4"); 
	String value = mysheet.getRow(r).getCell(c).getStringCellValue(); 
	return value ;
	}

}
