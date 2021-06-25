package IAnnotationTransformerWithoutXMLListeners;

import org.junit.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(TestListenerClass.class)
//the above statement is not working as expected.

public class ClassContatiningTestCases 
{
	@Test
	public void testCase1()
	{
		System.out.println("hello");
		Assert.assertTrue(false);//this is deliberately failed
		//so as to check whther it is automatically re running
	}

}
