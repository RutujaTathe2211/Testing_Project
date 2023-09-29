package org.example.Listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

/*ITestListener is interface so we needs to install it
-Methods(onStart(),OnFinish(),onTestFailure(),OnTestSucess(),onTestSkipped(),OnTestStart()
 */
public class CustomListener implements ITestListener {
    //defination of onstart method
//This is ITestLIstener method and will execute before starting of test batch/set
    public void onStart(ITestContext context) {
        System.out.println("Start test execution......."+context.getName());
    }
//This is ITestLIstener method and will execute After Execution of test batch/set
    public void onFinish(ITestContext context) {
        System.out.println("Finish test execution........"+context.getName());
    }

 //This is ITestLIstener method that can execute before the main test start @Test
    public void onTestStart(ITestResult result) {
        System.out.println("Test Start........."+result.getName());
    }
    //This is ITestLIstener method that can execute when @Test skipped
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test Skipped......."+result.getName());
    }
//Executed when test is sucess
    public void onTestSuccess(ITestResult result) {
        System.out.println(" Test pass......"+result.getName());    }

//executed when test fail
    public void onTestFailure(ITestResult result) {
        System.out.println("Fail Test......"+result.getName());    }

   //As of now not important
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    }
}
