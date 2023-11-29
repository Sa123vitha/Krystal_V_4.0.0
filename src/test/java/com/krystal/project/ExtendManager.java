package com.krystal.project;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtendManager {
	private static ExtentReports extent;

    public static ExtentReports getInstance() {
        if (extent == null) {
            extent = createInstance();
        }
        return extent;
    }

    private static ExtentReports createInstance() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd-HHmmss");
        String timestamp = dateFormat.format(new Date());
        String uniqueID = UUID.randomUUID().toString();
        String time = "Report_" + timestamp + "_" + uniqueID;

        String path = "D:\\Automation_Scripts\\" + time + "\\index.html";

        ExtentSparkReporter reporter = new ExtentSparkReporter(path);
        reporter.config().setTheme(Theme.STANDARD);
        reporter.config().setDocumentTitle("Krystal Testcase Report");
        reporter.config().setReportName("Savi.an");
        reporter.config().setTimeStampFormat("mm/dd/yyyy hh:mm:ss a");
        reporter.config().setCSS("css-string");
        reporter.config().setEncoding("UTF-8");

        ExtentReports extent = new ExtentReports();
        extent.attachReporter(reporter);
        extent.setSystemInfo("Operating system", "windows 10 pro");
        return extent;
    }

}
