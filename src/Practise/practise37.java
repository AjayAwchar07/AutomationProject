package Practise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class practise37 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		// create a excel sheet and store in file type object
		File myFile=new File("C:\\Users\\Ajay\\OneDrive\\Desktop\\9th July C Batch.xlsx");
		
		// craete object of fileinputstream and pass file object in that
		FileInputStream myexcel = new FileInputStream(myFile);
		
		String value = WorkbookFactory.create(myFile).getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(value);
		
		String value1 = WorkbookFactory.create(myFile).getSheet("sheet1").getRow(0).getCell(1).getStringCellValue();
		System.out.println(value1);
		
		String value2 = WorkbookFactory.create(myFile).getSheet("sheet1").getRow(1).getCell(0).getStringCellValue();
		System.out.println(value2);
		

	}

}
