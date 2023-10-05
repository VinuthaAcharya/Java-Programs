package DataDrivenTesting;
/*"What will happen if you fetch the value from your excelsheet where value is a number?
Ans- IllegalStateException will come"*/
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Class_DDT 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fs=new FileInputStream("C:\\Users\\user\\eclipse-workspace\\GroTechMinds\\ExcelSheets\\Vinutha.xlsx");
		Workbook wb=WorkbookFactory.create(fs);
		Sheet sh=wb.getSheet("login");
		Row r=sh.getRow(1);
		Cell c=r.getCell(0);
		String username=c.getStringCellValue();
		System.out.println(username);
	}
	
}
