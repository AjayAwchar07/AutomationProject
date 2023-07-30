package Practise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File Myfile = new File("C:\\Users\\Ajay\\OneDrive\\Desktop\\9th July C Batch.xlsx");
		
		FileInputStream mysheet = new FileInputStream(Myfile);
		
		Cell result = WorkbookFactory.create(mysheet).getSheet("sheet1").getRow(0).getCell(0);
		CellType mydata = result.getCellType();
		System.out.println("data type of element is "+mydata);
		System.out.println(result);
		
		

	}

}
