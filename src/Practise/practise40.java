package Practise;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class practise40 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myFile = new File("C:\\Users\\Ajay\\OneDrive\\Desktop\\9th July C Batch.xlsx");
		
		Sheet a = WorkbookFactory.create(myFile).getSheet("sheet1");
		
		String value = a.getRow(0).getCell(0).getStringCellValue();	
		
		System.out.println("value of string data are "+value);
		System.out.println("============================");
		
		//read whole rows in table using for loop
		for(int i=0;i<=3;i++) // 0,1,2,3
		{
			String value1 = a.getRow(0).getCell(i).getStringCellValue();// row is constant
			System.out.print(value1+" ");
			
		}
		System.out.println();
		System.out.println("========================");
		
		//read who;e cells using for loop
		for(int i=0;i<=3;i++)
		{
			 String value2 = a.getRow(i).getCell(0).getStringCellValue();
			 System.out.println(value2);
		}
		System.out.println();
		System.out.println("============================");
		
		//read whole data using for loop
		//outer for loop--->for rows
		for(int i=0;i<=1;i++)
		{
		// inner for loop-->for reading cells/columns-->varying 0 to 3
			for(int j=0;j<=3;j++)
			{
				String value3 = a.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value3+" ");
				
				
			}
			System.out.println();
		}
		
		

	}

}
