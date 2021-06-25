package AutomaticScreenshotInTestNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasseClassContainingScreenshotMethod {

	public static WebDriver driver;
	static int count =1;
	public void openUrl() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}
	
	public void screenshot() throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\sathishPC\\Desktop\\selenium\\Programs\\FirstTestNGUsingMaven\\Screenshots\\"+count+".jpeg"));
		count++;
	}
	
	
}
