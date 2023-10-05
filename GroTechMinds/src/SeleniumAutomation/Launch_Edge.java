package SeleniumAutomation;

import org.openqa.selenium.edge.EdgeDriver;

public class Launch_Edge 
{
	public static void main(String[] args) 
	{
		EdgeDriver d1=new EdgeDriver();//empty browser
		d1.get("https://www.google.co.in/");
		d1.close();
	}

}
