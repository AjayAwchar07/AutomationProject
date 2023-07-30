package Practise;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myFile = new File("C:\\Users\\Ajay\\OneDrive\\Desktop\\9th July C Batch.xlsx");
		
		Sheet abc = WorkbookFactory.create(myFile).getSheet("sheet1");
		String result = abc.getRow(0).getCell(0).getStringCellValue();		
		System.out.println(result);
		System.out.println("=================================");
		
		// using for loop for cell
		for(int i=0;i<=3;i++)
		{
			String row = abc.getRow(0).getCell(i).getStringCellValue();
			System.out.println(row+" ");
		}
		System.out.println("==============");
		// using for loop for row
		for (int i=0;i<=2;i++)
		{
			String cell = abc.getRow(i).getCell(0).getStringCellValue();
			System.out.println(cell+" ");
		}
		System.out.println("================================");
		for(int i=0;i<=1;i++)
		{
		// inner for loop-->for reading cells/columns-->varying 0 to 3
			for(int j=0;j<=3;j++)
			{
				String value3 = abc.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value3+" ");
				
				
			}
			System.out.println();
		}
	

	}

}
