package Data_Provider;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GroTechMinds 
{
	@Test(dataProvider="Inputs")
	public void test(String username,String password,String firstname,String lastname,String pre_add,String permanent_add,String pincode) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		driver.findElement(By.name("your-name")).sendKeys(username);
		
		driver.findElement(By.name("Password")).sendKeys(password);
		
		driver.findElement(By.name("text-397")).sendKeys(firstname);
		
		driver.findElement(By.name("text-398")).sendKeys(lastname);	
		
		//driver.findElement(By.name("radio-45")).click();
		
//		WebElement skillsdropdown=driver.findElement(By.id("select2-menu-600-7i-container"));
//		skillsdropdown.click();
//		WebElement skiltxt=driver.findElement(By.xpath("//input[@class='select2-search__field']"));
//		skiltxt.sendKeys("Technical Skills");
//		skiltxt.sendKeys(Keys.ARROW_DOWN);
//		skiltxt.sendKeys(Keys.ENTER);
		
//		Select skills=new Select(skillsdropdown);
//		
//		
//		skills.selectByVisibleText("Technical Skills");
//		
//		WebElement countrydropdown=driver.findElement(By.id("select2-menu-600-7i-container"));
//		Select country=new Select(countrydropdown);
//		country.selectByVisibleText("India");
		
		WebElement paddress=driver.findElement(By.name("paddress"));
		paddress.sendKeys(pre_add);
		
		WebElement permanentaddress=driver.findElement(By.name("paddress"));
		permanentaddress.sendKeys(permanent_add);
		
		Thread.sleep(1000);
		
		WebElement pin=driver.findElement(By.name("pincode"));
		pin.sendKeys(pincode);
//		
//		WebElement relegion=driver.findElement(By.id("select2-menu-431-1t-container"));
//		Select r=new Select(relegion);
//		r.selectByVisibleText("Hindu");
		
		
		//driver.findElement(By.name("checkbox-833[]")).click();
		
		//driver.findElement(By.xpath("//input[@type='submit'")).click();
		driver.close();
	}
	@DataProvider(name="Inputs")
	public Object[][] applicationform()
	{
		Object data[][]=new Object[10][7];
		data[0][0]="Tanu";
		data[0][1]="tanu@123";
		data[0][2]="Tanush";
		data[0][3]="Acharya";
		data[0][4]="Mumbai , Maharashtra";
		data[0][5]="Udupi, Karnataka";
		data[0][6]="574118";
		
		data[1][0]="Vinu";
		data[1][1]="Vinu@123";
		data[1][2]="Vinutha";
		data[1][3]="Acharya";
		data[1][4]="Mumbai , Maharashtra";
		data[1][5]="Udupi, Karnataka";
		data[1][6]="576101";
		
		data[2][0]="Druv";
		data[2][1]="dru@123";
		data[2][2]="Druvi";
		data[2][3]="Acharya";
		data[2][4]="Udupi , Karnataka";
		data[2][5]="Karnataka";
		data[2][6]="574102";
				
		data[3][0]="Mit";
		data[3][1]="mit@123";
		data[3][2]="Mitansh";
		data[3][3]="Acharya";
		data[3][4]="Goregaon , Maharashtra";
		data[3][5]="Karnataka";
		data[3][6]="578965";
		
		data[4][0]="swat";
		data[4][1]="swat@123";
		data[4][2]="Swathi";
		data[4][3]="Shetty";
		data[4][4]="Andheri , Maharashtra";
		data[4][5]="Karnataka";
		data[4][6]="574113";
		
		data[5][0]="Anu";
		data[5][1]="anu@123";
		data[5][2]="Anuj";
		data[5][3]="Sharma";
		data[5][4]="Miraroad , Maharashtra";
		data[5][5]="Karnataka";
		data[5][6]="401107";
		
		data[6][0]="Tanvi";
		data[6][1]="tanvi@123";
		data[6][2]="Tanvi";
		data[6][3]="Poojari";
		data[6][4]="Dahisar , Maharashtra";
		data[6][5]="Karnataka";
		data[6][6]="500113";
		
		data[7][0]="rish";
		data[7][1]="rish@123";
		data[7][2]="Risha";
		data[7][3]="Poojary";
		data[7][4]="Bhayandar , Maharashtra";
		data[7][5]="Bihar";
		data[7][6]="401110";
		
		data[8][0]="hrid";
		data[8][1]="hrid@123";
		data[8][2]="Hridhan";
		data[8][3]="Pandit";
		data[8][4]="Daman , Gujarath";
		data[8][5]="Gujarath";
		data[8][6]="489563";
		
		data[9][0]="lax";
		data[9][1]="lax@123";
		data[9][2]="Laxmi";
		data[9][3]="Pawar";
		data[9][4]="Vapi , Gujarath";
		data[9][5]="Kerala";
		data[9][6]="658932";

		return data;
		
	}

}
