package ExcelTableReadingApache;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example5
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myfile=new File("C:\\Users\\Ajay\\OneDrive\\Desktop\\9th July C Batch.xlsx");
		
		Sheet a = WorkbookFactory.create(myfile).getSheet("Sheet1");
		// a is ref variable and return type is Workbook
		
		String value = a.getRow(0).getCell(0).getStringCellValue();
		// value is ref avriable and return type is string
		
		System.out.println(value);
		System.out.println("=================================");
		
		// by using for loop print all rows in sheet
		for(int i=0;i<=3;i++) // 0,1,2,3
		{
			String value1 = a.getRow(0).getCell(i).getStringCellValue();// row is constant
			System.out.print(value1+" ");
			
		}
		System.out.println();
		System.out.println("===================================");
		
		// by using for loop print all cells or columns in sheet
		for(int i=0;i<=2;i++)
		{
			String value2 = a.getRow(i).getCell(0).getStringCellValue();
			System.out.println(value2);
		}
		System.out.println("======================================");
		
		// reading whole data from sheet i.e rows/cells
		// outer for loop--->for reading rows==>varying 0 to 1
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
