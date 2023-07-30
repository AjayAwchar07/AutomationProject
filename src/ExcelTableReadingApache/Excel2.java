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

public class Excel2 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myFile =new File("C:\\Users\\Ajay\\OneDrive\\Desktop\\9th July C Batch.xlsx");
		
		Workbook myworkbook = WorkbookFactory.create(myFile);
		//myworkbook is ref variable Workbook is an return type
		
		Sheet mysheet = myworkbook.getSheet("Sheet1");
		//mysheet is ref variable and return type is Sheet
		
		Row myrow = mysheet.getRow(0);
		//myrow is ref variable and return type is a row
		
		Cell mycell = myrow.getCell(0);
		//mycell is ref variable and return type is Cell
		
		CellType mydata = mycell.getCellType(); //identify which type of data in sheet i.e.strinf,boolen,int
		//mydata is ref variable and return type is CellType
		
		System.out.println("Data Type of Element is "+mydata); 
		System.out.println("===================================");
		
		
		String value = mycell.getStringCellValue();
		System.out.println("String Data are "+value);

	}

}







