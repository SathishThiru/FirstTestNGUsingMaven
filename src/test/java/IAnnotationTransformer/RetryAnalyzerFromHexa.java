public RetryAnalyzerFromHexa implements IRetryAnalyzer
{
static int counter=0;
static int maxCount=5;
public boolean retry(ITestResult result)
{
if(!result.isSuccess())
{
if(counter<maxCount)
{
counter++;
Object[] parameters = result.getParamteres();
//lets say that the index 0 of the parameters contains test case id
logger.info("retry " +(counter+1)+" for the test case id"+parameters[0]);
return true; //Enables testng to rerun test case
}
else
{
counter=0;//reset counter
result.setStatus(ITestResult.FAILURE);

}
}
else
{
counter=0;//reset counter
result.setStatus(ITestResult.SUCCESS);
}
return false;
}


}
