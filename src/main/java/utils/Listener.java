package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import static utils.Constants.CURRENT_DIR;
import static utils.Constants.DRIVER;

public class Listener implements ITestListener {

    public void onTestStart(ITestResult iTestResult) {

        System.out.println("Test case started ============================ " + iTestResult.getName());
    }

    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("TEST PASSED ========================= " + iTestResult.getName());
    }

    public void onTestFailure(ITestResult iTestResult) {

        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
        String methodName = iTestResult.getName();
        if (!iTestResult.isSuccess()) {
            File scrFile = ((TakesScreenshot) DRIVER).getScreenshotAs(OutputType.FILE);
            try {
                String reportDirectory = CURRENT_DIR + File.separator + "target" + File.separator + "surefire-reports";
                File destFile = new File((String) reportDirectory + File.separator + "failure_screenshots" +
                        File.separator + methodName + "_" + formater.format(calendar.getTime()) + ".png");
                FileUtils.copyFile(scrFile, destFile);
                Reporter.log("<a href='" + destFile.getAbsolutePath() + "'> <img src='" + destFile.getAbsolutePath() + "' height='100' width='100'/> </a>");
                System.out.println("FAILED====================== " + iTestResult.getName());
                System.out.println("Find failed screenshot into " + reportDirectory);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public void onTestSkipped(ITestResult iTestResult) {
        System.out.println("---------TEST SKIPPED-----------------------");

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    public void onStart(ITestContext iTestContext) {
        System.out.println("Automation started=============================== " + iTestContext.getName());

    }

    public void onFinish(ITestContext iTestContext) {
        System.out.println("Automation stopped =========================== " + iTestContext.getName());

    }
}
