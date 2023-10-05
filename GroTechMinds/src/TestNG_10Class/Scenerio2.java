package TestNG_10Class;
import java.util.Iterator;
import java.util.Set;

//Credit or Debit card
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Scenerio2 extends LaunchandQuit 
{
@Test
public void testcase2() throws InterruptedException
{
	WebElement searchbox=driver.findElement(By.id("twotabsearchtextbox"));
	searchbox.sendKeys("Shoe");
	searchbox.sendKeys(Keys.ENTER);
	WebElement firstshoe=driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
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
	WebElement addressbtn=driver.findElement(By.xpath("((//div[@class='a-box-inner']/fieldset)[1]/div)[2]/span/div/label/input"));
	addressbtn.click();
	WebElement usethisaddress=driver.findElement(By.xpath("(//span[@class='a-button-inner'])[3]/input"));
	usethisaddress.click();
	Thread.sleep(5000);
	WebElement creditordebitcard=driver.findElement(By.xpath("//input[@value='SelectableAddCreditCard']"));
	creditordebitcard.click();
}
}
