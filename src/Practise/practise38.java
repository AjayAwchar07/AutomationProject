package Practise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class practise38 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		// create excel sheet and store in file type object
		File myFile=new File("C:\\Users\\Ajay\\OneDrive\\Desktop\\9th July C Batch.xlsx");
		
		// create object of FileInputStream and pass file
		FileInputStream myexcel=new FileInputStream(myFile);
		
		CellType datatype = WorkbookFactory.create(myFile).getSheet("sheet1").getRow(1).getCell(1).getCellType();
		System.out.println("Dtaa type of element are "+datatype);
		
		 String value = WorkbookFactory.create(myFile).getSheet("sheet1").getRow(1).getCell(1).getStringCellValue();
		System.out.println(value);
		
	}

}
