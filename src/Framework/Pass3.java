package Framework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Pass3
{
public static String M1(int row , int coll) throws EncryptedDocumentException, IOException 
{
		
		
		FileInputStream file = new FileInputStream("C:\\Users\\Ajay\\OneDrive\\Desktop\\9th July C Batch.xlsx");
		
		  Sheet sht = WorkbookFactory.create(file).getSheet("sheet1");
		
		String data = sht.getRow(row).getCell(coll).getStringCellValue();
		
		return data;
}

}
