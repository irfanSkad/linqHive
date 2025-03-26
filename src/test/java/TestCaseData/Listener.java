package TestCaseData;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import BaseDetail.BaseDetail;
import ExtentReport.Extent_Report;

public class Listener extends BaseDetail implements ITestListener{
	ExtentReports extent = Extent_Report.getReporterObject();
	ExtentTest test;
	ThreadLocal<ExtentTest> extentTest = new ThreadLocal<ExtentTest>();
	
	@Override
	public void onTestStart(ITestResult result){  
		System.out.println("Execution started"); 
		String timestamp = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(new Date());
		System.out.println(timestamp);
		test = extent.createTest(result.getMethod().getMethodName());
		extentTest.set(test);
		} 
	
	@Override
		public void onTestSuccess(ITestResult result) {  
		System.out.println("Success of test cases");
		extentTest.get().log(Status.PASS, "Test Passed");
		String timestamp = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(new Date());
		System.out.println(timestamp);
		//test.log(Status.PASS, "Test Passed");
		} 
	@Override
	public void onTestFailure(ITestResult result) {
		// ScreenShots
		System.out.println("Failure of test cases");
		String timestamp = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(new Date());
		System.out.println(timestamp);
		extentTest.get().fail(result.getThrowable());
		//test.fail(result.getThrowable());
		String filePath = null;
		try {
			filePath = getScreenshot(result.getMethod().getMethodName(), driver);
			extentTest.get().addScreenCaptureFromPath(filePath, result.getMethod().getMethodName());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//test.addScreenCaptureFromPath(filePath, result.getMethod().getMethodName());
	}
	@Override
		public void onTestSkipped(ITestResult result) {    
		System.out.println("Skip of test cases and its details are : "+result.getName());  
		}  
	
		public void onFinish(ITestContext context) {  
		System.out.println("Execution Closed"); 
		extent.flush();
		} 
}
