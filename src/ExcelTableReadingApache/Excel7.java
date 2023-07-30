package ExcelTableReadingApache;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel7 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
File myfile=new File("C:\\Users\\Ajay\\OneDrive\\Desktop\\LastRowNo.xlsx");
		
		Sheet b = WorkbookFactory.create(myfile).getSheet("Sheet1");
		// b is ref variable and return type is Workbook
		
		// How many No.of rows in sheet for data
		int lastrowno = b.getLastRowNum();
		System.out.println("The Last Row Row Number Is "+lastrowno);
		
		int totalnoofrows = lastrowno+1;//total index of rows
		System.out.println("The Total number of Rows are "+totalnoofrows);
		
		// How many No.of cells in sheet for data
		short lastcellnum = b.getRow(1).getLastCellNum();
		System.out.println("Last Cell Number is "+lastcellnum);
		
		short totalnoofcells = lastcellnum;
		System.out.println("Total number of cells are "+totalnoofcells);
		// In a sheet row or cells are constant value i.e cell and last cell are 4
		
		System.out.println("===============================");
		
		// How to read cells Dynamically
		int totalcells = b.getRow(0).getLastCellNum()-1;
		for(int i=0;i<=totalcells;i++)
		{
			System.out.print(b.getRow(0).getCell(i).getStringCellValue()+"  ");
		
		}
		System.out.println();
		System.out.println("================================");
		
		// Hoe to read Row Dynamically
		int lastrownum = b.getLastRowNum();
		for(int i=0;i<=lastrownum;i++)
		{
			System.out.println(b.getRow(i).getCell(0).getStringCellValue()+" ");
		}
		System.out.println();
		System.out.println("==================================");
		
		//How to read whole excel sheet in Dynamic way
		int lastrow = b.getLastRowNum();
		int lastcell = b.getRow(lastrow).getLastCellNum()-1;
		
		// Read complete excel sheet by using Nested for loop
		// outer for loop--> Rows varry from-->0 to lastrow
		
		for(int i=0;i<=lastrow;i++)
		{
			// Inner for loop for-->cells-->varry from 0 to lastcell
		for(int j=0;j<=lastcell;j++)
		{
			System.out.print(b.getRow(i).getCell(j).getStringCellValue()+" ");
		}
		System.out.println();
		
		}
		
		

	}

}
