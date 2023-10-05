package SeleniumAutomation;
//Try to locate each and every component of that Html page by using Xpath Locator.
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HTML_Learning 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:\\Users\\user\\Downloads/learningHTML1%20(1).html");
		driver.findElement(By.xpath("(/html/body/input)[1]")).sendKeys("Vinu");//Username
		driver.findElement(By.xpath("(/html/body/input)[2]")).sendKeys("Hai");//Hint
		driver.findElement(By.xpath("(/html/body/input)[3]")).sendKeys("Vinu@123");//Password
		driver.findElement(By.xpath("((/html/body/form)[1]/input)[1]")).sendKeys("Vinutha");//Firstname
		//driver.findElement(By.xpath("((/html/body/form)[1]/input)[2]")).sendKeys("Acharya");//Lastname
		//driver.findElement(By.xpath("((/html/body/form)[1]/input)[3]")).click();//First form submit button
		driver.findElement(By.xpath("((/html/body/form)[2]/input)[1]")).click();//I have a Boy
		//driver.findElement(By.xpath("((/html/body/form)[2]/input)[2]")).click();//I have a Girl
		//driver.findElement(By.xpath("((/html/body/form)[2]/input)[3]")).click();//I have a baby
		//driver.findElement(By.xpath("((/html/body/form)[2]/input)[4]")).click();//Second form submit button
		driver.findElement(By.xpath("(//html/body/input)[5]")).click();//Female radio button
		driver.findElement(By.xpath("(//html/body/input)[6]")).click();//checkbox(bangalore)
		driver.findElement(By.tagName("a")).click();//Link
		driver.findElement(By.xpath("(//html/body/input)[7]")).click();//SignUp button
		Thread.sleep(2000);
		driver.close();
	}

}
