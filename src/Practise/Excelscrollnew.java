package Practise;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import ExcelTableReadingApache.ExcelScrollingFunction;

public class Excelscrollnew {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		ExcelScrollingFunction excel = new ExcelScrollingFunction();
		excel.excelsheet(0, 1);
		

	}

}
