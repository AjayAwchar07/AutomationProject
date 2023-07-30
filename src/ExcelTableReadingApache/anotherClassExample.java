package ExcelTableReadingApache;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class anotherClassExample 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		Excel8 excel=new Excel8();
		
		excel.ExcelSheetReading(0,1);
		

	}

}
