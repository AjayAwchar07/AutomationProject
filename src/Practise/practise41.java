package Practise;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class practise41 
{
	public static void excelsheet(int rowvalue,int cellvalue) throws EncryptedDocumentException, IOException
	{
		File myfile = new File("C:\\Users\\Ajay\\OneDrive\\Desktop\\LastRowNo.xlsx");
		
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("sheet1");
		
		String value = mysheet.getRow(rowvalue).getCell(cellvalue).getStringCellValue();
		System.out.println(value);
		
		
	}

}
