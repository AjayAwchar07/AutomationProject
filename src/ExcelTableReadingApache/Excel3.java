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

public class Excel3 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
File myFile =new File("C:\\Users\\Ajay\\OneDrive\\Desktop\\9th July C Batch.xlsx");
		
		Workbook myworkbook = WorkbookFactory.create(myFile);
		
		Sheet mysheet = myworkbook.getSheet("Sheet3");
		
		Row myrow = mysheet.getRow(0);
		
		Cell mycell = myrow.getCell(1);
		
		CellType mydata = mycell.getCellType(); 
		System.out.println("Data Type of Element is "+mydata);
		System.out.println("==============================");
		
		double value1 = mycell.getNumericCellValue();
		System.out.println("Numeric Data are "+value1);
		

	}

}
