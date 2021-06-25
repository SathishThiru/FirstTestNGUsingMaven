package org.firsttestNGUsingMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTestNGUsingMaven {

	public static WebDriver driver ;

	@BeforeTest
	public void beforeTest() 
	{

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}


	@Test
	private void openUrl() {
		driver.get("https://www.facebook.com/");

	}

}
