package Data_Provider;

import org.testng.annotations.DataProvider;

public class DataProvider_class 
{
	@DataProvider(name="data")
		public Object[][] numbers()
		{
			return new Object[][] {{"80"},{"90"}};
		}
		
}
