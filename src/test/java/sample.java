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
}
