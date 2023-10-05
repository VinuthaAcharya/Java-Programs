package SeleniumAutomation;
/*"Moving control from parent to child:
Consider naukri registration page , move control from parent to child ,close child.
 Then move control back to parent and close parent."*/
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentChild_Popup 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad=1&gclid=EAIaIQobChMIxKWj87CRgQMVYQ17Bx23LgcvEAAYASAAEgLZHPD_BwE&gclsrc=aw.dshttps://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement google=driver.findElement(By.xpath("//span[.='Google']"));
		google.click();
		String parent=driver.getWindowHandle();
		Set<String> ParentChild=driver.getWindowHandles();
		System.out.println("Parent ID : " +parent);
		System.out.println("Parent and Child ID : "+ParentChild);
		Iterator<String> a=ParentChild.iterator();
		String parentid=a.next();//this will give parent id seperate
		String childid=a.next();//this is give 1st child
		System.out.println("Parent ID : " +parentid);
		System.out.println("Parent and Child ID : "+childid);
		driver.switchTo().window(childid);//move the control from parent to child
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(parentid);//move the control from child to parent
		Thread.sleep(2000);
		driver.close();
		
	}

}
