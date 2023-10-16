package IRetryAnalyser;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_logic implements IRetryAnalyzer
{
	int count=0;
	int retrytimes=5;
	
	@Override
	public boolean retry(ITestResult result) 
	{
		if(count<retrytimes)
		{
			count++;
			return true;
		}
		return false;//stop the retry logic
	}

}
