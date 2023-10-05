package SeleniumAutomation;
//Use Quit Method to close Parent and Child Browsers
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Class1 
{

	public static void main(String[] args) 
	{
	//ChromeDriver d1=new ChromeDriver();//empty browser
	//d1.get("https://www.google.co.in/");//navigate to google launch
	FirefoxDriver d2=new FirefoxDriver();
	d2.get("https://www.facebook.com/");
	String title=d2.getTitle();
	System.out.println(title);
	//d1.close();
	d2.quit();
	}

}
