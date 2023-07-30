package ExcelTableReadingApache;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
File myFile =new File("C:\\Users\\Ajay\\OneDrive\\Desktop\\9th July C Batch.xlsx");
		
		Workbook myworkbook = WorkbookFactory.create(myFile);
		
		Sheet mysheet = myworkbook.getSheet("Sheet1");
		
		Row myrow = mysheet.getRow(3);
		
		Cell mycell = myrow.getCell(1);
		
		CellType mydata = mycell.getCellType(); 
		System.out.println("Data Type of Element is "+mydata);
		System.out.println("===================================");
		
	   boolean value3 = mycell.getBooleanCellValue();
	   System.out.println("Boolean Data Are "+value3);

	}

}
