package FlyusUs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FlyUsUsingTestNG {
	public static WebDriver driver;

	@BeforeClass
	public void launchChrome() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathishPC\\Desktop\\selenium\\Programs\\Selenium10AM\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@AfterClass
	public void quitBrowser() {
		driver.quit();
	}

	@Test(dataProvider="login")
	public void tc1(String s1,String s2) {
		driver.get("https://www.facebook.com/");
		WebElement u = driver.findElement(By.id("email"));

		u.sendKeys(s1);
		WebElement p = driver.findElement(By.id("pass"));

		p.sendKeys(s2);
		WebElement b = driver.findElement(By.id("loginbutton"));
		b.click();
	}

	
	
	
	@DataProvider(name="login")
	private Object[][] data() {
	//	return new Object[][] {{"farith","1234543"},{"suresh","qwertrew"},{"Karthik","Kavin"},{"123456789","jhgfdsdfghj"}};

		return new Object[][] {{"iphone"},{"samsung"},{"OPPO"},{"Sony"}};
   
		
		
	//int a[][]= {{12,2},{2,4}};
	
	
	
	
}
	
}
