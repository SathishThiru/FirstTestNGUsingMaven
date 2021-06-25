package FlyusUs;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;




class SimpleTest 
{
	
public static void main(String[] args) {
	ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(10);
	
	System.out.println(executor.getActiveCount());
}

}
 

