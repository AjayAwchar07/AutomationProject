package ExcelTableReadingApache;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class ExcelScroolinganotherclass 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		ExcelScrollingFunction excel=new ExcelScrollingFunction();
		excel.excelsheet(0,1);
		

	}

}
