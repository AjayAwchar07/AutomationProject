package Practise;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class practise39 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myFile = new File("C:\\Users\\Ajay\\OneDrive\\Desktop\\9th July C Batch.xlsx");
		
		Workbook myworkbook = WorkbookFactory.create(myFile);
		Sheet mysheet = myworkbook.getSheet("sheet3");
		Row myrow = mysheet.getRow(1);
		Cell mycell = myrow.getCell(0);
		
		CellType datatype = mycell.getCellType();
		System.out.println("celltype of element are "+datatype);
		System.out.println("================================");
		
		double value = mycell.getNumericCellValue();
		System.out.println("numeric data are "+value);
		

	
}
}
