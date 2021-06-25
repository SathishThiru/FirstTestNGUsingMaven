package AutomaticScreenshotInTestNG;

import org.junit.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(TestListenerClass.class)
public class ClassContatiningTestCases  extends BasseClassContainingScreenshotMethod
{
	@Test
	public void testCase1()
	{
		openUrl();
		Assert.assertTrue(false);//this is deliberately failed
		//so as to check whther it is automatically re running
	}

	
	@Test
	public void testCase2()
	{
		openUrl();
		Assert.assertTrue(false);//this is deliberately failed
		//so as to check whther it is automatically re running
	}

}
