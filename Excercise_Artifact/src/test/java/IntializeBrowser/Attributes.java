package IntializeBrowser;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class Attributes {

	@Test
	public void m1()
	{
		System.out.println("m1");
		Assert.assertEquals("4", "5");
	}

	@Test(dependsOnMethods= "m1")
	public void m2()
	{
		System.out.println("m2");
	}
}
