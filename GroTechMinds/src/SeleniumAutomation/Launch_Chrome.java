package SeleniumAutomation;
//Use Close Method for closing browser
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Chrome {

	public static void main(String[] args) {
		ChromeDriver d1=new ChromeDriver();//empty browser
		d1.get("https://www.google.co.in/");
		d1.close();
	}

}
