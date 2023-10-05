package DataDrivenTesting;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Scenerio1 extends Amazon_Launch
{
	@Test
	public void testcase1() throws InterruptedException
	{
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
		Thread.sleep(3000);
		WebElement cc=driver.findElement(By.xpath("//input[@value='SelectableAddCreditCard']"));
		cc.click();
		
	}
}
