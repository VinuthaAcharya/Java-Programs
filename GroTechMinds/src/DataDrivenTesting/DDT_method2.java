package DataDrivenTesting;
//Program for NumberToTextConverter Class
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class DDT_method2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fs=new FileInputStream("C:\\Users\\user\\eclipse-workspace\\GroTechMinds\\ExcelSheets\\VinuthaExcel.xlsx");
		Workbook wb=WorkbookFactory.create(fs);
		String password = NumberToTextConverter.toText(wb.getSheet("login").getRow(1).getCell(3).getNumericCellValue());
		System.out.println(password);
		String password1=wb.getSheet("login").getRow(1).getCell(1).getStringCellValue();
		System.out.println(password1);
		
		
		
	}

}
