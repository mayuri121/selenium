package listeners;

import java.sql.ResultSet;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class itestlistenerimplementatin implements ITestListener {

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(result.getName()+"method started");
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(result.getName()+"method sucess");
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(result.getName()+"test faliure");
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(result.getName()+"test skipped");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(result.getName()+"test failure but with sucess");
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
