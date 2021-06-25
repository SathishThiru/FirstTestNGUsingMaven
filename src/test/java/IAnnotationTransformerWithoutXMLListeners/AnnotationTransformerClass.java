package IAnnotationTransformerWithoutXMLListeners;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class AnnotationTransformerClass implements IAnnotationTransformer 
{
	public void transform(ITestAnnotation i, Class c, Constructor co, Method m)
	{
		IRetryAnalyzer r = i.getRetryAnalyzer();
		if(r==null)
		{
			i.setRetryAnalyzer(RetryAnalyzerClass.class);
		}
	}

}
