package AutomaticScreenshotInTestNG;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzerClass implements IRetryAnalyzer
{
	int minCount=0,  maxCount=2;
	
public boolean retry(ITestResult r)
{
	if(minCount<maxCount)
	{
		minCount++;
		return true;
	}

	return false;
}
}
