package IAnnotationTransformer;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


//flow of automatic test cases re running.
//execution starts from pom.xml
//from there it ll go to testNG.xml file
//there we will have declared listeners and listener tags
//in those tags we will be pointing a class which implements IAnnotationTransformer. here we have that class as AnnotationTransformerClass
//whenever a test fails this AnnotationTransformerClass will be called.
//from there the class which implements IRetryAnalyzer will be called.
//that class will re run the test cases n number of times until the test case passses or until the
//maximum number of retries ends
public class ClassContatiningTestCases 
{

	
	@Test(priority =1)
	public void testCase1()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("hello");
		//		Assert.assertTrue(false);//this is deliberately failed
		driver.findElement(By.id("pass")).sendKeys("hello");
		driver.findElement(By.id("loginbutton")).click();
		String s = driver.findElement(By.xpath("//span[text()='Log in to Facebook']")).getText();
		driver.quit();
		Assert.assertTrue(s.contains("kkkkhj"));

		//so as to check whther it is automatically re running
	}

}
