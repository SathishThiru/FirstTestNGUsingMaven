import org.testng.annotations.Test;

public class sample {

	
	
	@Test(dependsOnMethods = "methodOne")
	public void methodOne()
	{
		
		System.out.println("a");
	}
	 

	@Test
	public static void methodOne(String h)
	{
		System.out.println("b");
	}
	
	@AfterTest
	public static void setUpResults(ITestResult result)
	{
		//we can set parameters to the test result. These parameters can later be used in Reporting(like extent reports)
		Object[] parameters = new Object[1];
		paramters[0]="Test case id number";
		result.setParameters(parameters);
		
		
	}
}
