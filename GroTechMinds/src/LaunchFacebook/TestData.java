package LaunchFacebook;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class TestData 
{
	public String username;
	public String password;
	
	public void exceldata() throws EncryptedDocumentException, IOException
	{
		FileInputStream fs=new FileInputStream("C:\\Users\\user\\eclipse-workspace\\GroTechMinds\\ExcelSheets\\Vinutha.xlsx");
		Workbook wb=WorkbookFactory.create(fs);
		username = NumberToTextConverter.toText(wb.getSheet("login").getRow(1).getCell(0).getNumericCellValue());
		password =wb.getSheet("login").getRow(1).getCell(1).getStringCellValue();
	}
}
