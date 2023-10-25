package datasheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exceldata 
{
	public static  String username;
	public static  String password;
	public static  String searchitem;
	public static void readexcel() throws EncryptedDocumentException, IOException
	{
		FileInputStream fs=new FileInputStream("C:\\Users\\user\\eclipse-workspace\\AmazonLogin_POM\\ExcelSheet\\Amazon_data.xlsx");
		Workbook wb=WorkbookFactory.create(fs);
		username = wb.getSheet("Login").getRow(1).getCell(0).getStringCellValue();
		password=wb.getSheet("Login").getRow(1).getCell(1).getStringCellValue();
		searchitem=wb.getSheet("Login").getRow(1).getCell(2).getStringCellValue();
	}
	
}
