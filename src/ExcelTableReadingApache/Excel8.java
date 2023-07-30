package ExcelTableReadingApache;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel8 {

	public void ExcelSheetReading(int num1,int num2) throws EncryptedDocumentException, IOException 
	{
		File myFile=new File("C:\\Users\\Ajay\\OneDrive\\Desktop\\LastRowNo.xlsx");
		
		 Sheet mysheet = WorkbookFactory.create(myFile).getSheet("Sheet2");
		 
		 for(int i=0;i<=1;i++)
		 {
		 for(int j=0;j<=2;j++)	
		 {	 
		 
		 Cell mycell = mysheet.getRow(i).getCell(j);
		
		CellType datatype = mycell.getCellType();
		
		if(datatype==CellType.STRING)
		{
			System.out.print(mycell.getStringCellValue()+" ");
		}
		
		else if(datatype==CellType.NUMERIC)
		{
			System.out.print(mycell.getNumericCellValue()+" ");
		}
		
		else if(datatype==CellType.BOOLEAN)
		{
			System.out.print(mycell.getBooleanCellValue()+" ");
		}
		
		else if(datatype==CellType.BLANK)
		{
			System.out.print(" ");
		}
		 
		 }	System.out.println();
		 

	}

}
}
