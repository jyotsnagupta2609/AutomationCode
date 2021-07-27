package IntializeBrowser;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProviderAnnotation {

	@DataProvider(name="data")
	public Object[][]getData()
	{
	return  new Object[][]{{"Avinash"},{"Jyotsna"}};	 
	 
	}
	
@Test(dataProvider="data")
public void getUser(String user)
{
	System.out.println(user);
}
}
