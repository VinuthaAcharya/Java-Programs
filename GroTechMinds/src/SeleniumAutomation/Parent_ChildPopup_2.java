package SeleniumAutomation;
//Launch amazon.in and reach till payment page
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Parent_ChildPopup_2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement signin=driver.findElement(By.xpath("//span[.='Hello, sign in']"));
		signin.click();
		WebElement email=driver.findElement(By.id("ap_email"));
		email.sendKeys("917045170762");
		WebElement continuebtn=driver.findElement(By.id("continue"));
		continuebtn.click();
		WebElement password=driver.findElement(By.id("ap_password"));
		password.sendKeys("Tanu@123");
		WebElement signinbtn=driver.findElement(By.id("signInSubmit"));
		signinbtn.click();
		WebElement searchbox=driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("Shoe");
		searchbox.sendKeys(Keys.ENTER);
		WebElement firstshoe=driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[2]"));
		Thread.sleep(2000);
		firstshoe.click();
		Set<String> parentchild=driver.getWindowHandles();
		Iterator<String> pc=parentchild.iterator()	;
		String pid=pc.next();
		String cid=pc.next();//child id
		driver.switchTo().window(cid);
		Thread.sleep(2000);
		WebElement addcart=driver.findElement(By.id("add-to-cart-button"));
		addcart.click();
		WebElement cartcount=driver.findElement(By.id("nav-cart-count"));
		cartcount.click();
		WebElement buy=driver.findElement(By.name("proceedToRetailCheckout"));
		buy.click();
		Thread.sleep(2000);
		WebElement addressbtn=driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		addressbtn.click();
		Thread.sleep(2000);
		WebElement usethisaddress=driver.findElement(By.xpath("(//input[@type='submit'])[2]"));
		usethisaddress.click();
		Thread.sleep(5000);
		WebElement creditcard=driver.findElement(By.xpath("//input[@value='SelectableAddCreditCard']"));
		creditcard.click();
		
		//WebElement nb=driver.findElement(By.xpath("(//input[@name='ppw-instrumentRowSelection'])[3]"));
//		WebElement creditcard=driver.findElement(By.xpath("(//input[@name='ppw-instrumentRowSelection'])[2]"));
//		creditcard.click(); 		
//		WebElement creditcardlink=driver.findElement(By.xpath("(//a[@class='a-link-emphasis pmts-add-cc-default-trigger-link'])[1]"));
//		creditcardlink.click();
//		Actions a=new Actions(driver);
//		a.doubleClick(nb).perform();
		//nb.click();
		
		//input[@id='pp-s4d1E2-122']
		//driver.close();
	}

}
