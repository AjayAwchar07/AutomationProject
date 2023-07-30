package ExcelTableReadingApache;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelScrollingFunction 
{

	public static void excelsheet(int rowvalue,int cellvalue) throws EncryptedDocumentException, IOException 
	{
		File MyFile = new File("C:\\Users\\Ajay\\OneDrive\\Desktop\\LastRowNo.xlsx");
		
		Sheet mysheet = WorkbookFactory.create(MyFile).getSheet("Sheet1");
		
		String value = mysheet.getRow(rowvalue).getCell(cellvalue).getStringCellValue();
		
		System.out.println(value);

	}

}
