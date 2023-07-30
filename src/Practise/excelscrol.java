package Practise;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelscrol 
{
	public static void excelsheet(int rowvalue,int cellvalue) throws EncryptedDocumentException, IOException
	{
	File myfile = new File("C:\\Users\\Ajay\\OneDrive\\Desktop\\9th July C Batch.xlsx");
	
	Sheet mysheet = WorkbookFactory.create(myfile).getSheet("sheet1");
	
	String result = mysheet.getRow(rowvalue).getCell(cellvalue).getStringCellValue();
	
	System.out.println(result);
	}

}
