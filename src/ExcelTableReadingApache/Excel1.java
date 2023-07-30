package ExcelTableReadingApache;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel1
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		//create a excel sheet and store in a file type object
				File myFile = new File("C:\\Users\\Ajay\\OneDrive\\Desktop\\9th July C Batch.xlsx");
				
				//create an object of FileInputStream and pass File object in that
				FileInputStream myexcel=new FileInputStream(myFile);
				
				  String value = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
				 System.out.println(value);
				 
				double value1 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(3).getCell(0).getNumericCellValue();
				System.out.println(value1);
				
				//boolean value2 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(3).getCell(1).getBooleanCellValue();
				//System.out.println(value2);
				
				//String value3 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(3).getCell(2).getStringCellValue();
				//System.out.println(value3);

	}

}
