package IAnnotationTransformer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzerClass implements IRetryAnalyzer
{
	int minCount=0,  maxCount=5;
	
public boolean retry(ITestResult r)
{
if(!r.isSuccess)
{
	if(minCount<maxCount)
	{
		minCount++;
		return true;//Tells  TESTNG to rerun the test case
	}
	else
	{
		minCount=0;
		r.setStatus(ITestResult.FAILURE);
	}
}
else
{
minCount=0;
		r.setStatus(ITestResult.SUCCESS);
}
	return false;
}
}
