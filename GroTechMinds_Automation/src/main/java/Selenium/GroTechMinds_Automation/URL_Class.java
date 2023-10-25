package Selenium.GroTechMinds_Automation;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

public class URL_Class 
{
	@Test
	public void method1() throws MalformedURLException
	{
		URL ul=new URL("https://www.google.co.in/gmail");
		System.out.println(ul.getPort());
		System.out.println(ul.getProtocol());
		System.out.println(ul.getPath());
	}
}
