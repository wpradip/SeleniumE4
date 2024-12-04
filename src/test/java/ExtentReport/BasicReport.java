package ExtentReport;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class BasicReport {
	@Test
	public void main() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		//create Extent spark report
		File path = new File("./src/main/resources/Sample.html");
		ExtentSparkReporter spark = new ExtentSparkReporter(path);
		//configure spark
		spark.config().setDocumentTitle("CRM Vtiger");
		spark.config().setReportName("Pradip");
		spark.config().setTheme(Theme.DARK);
		//create Extent report
		ExtentReports report = new ExtentReports();
		//configure Extent Report
		report.setSystemInfo("Os", "window_11");
		report.setSystemInfo("Browser", "Chrome_101");
		//attach the spark to the extent report
		report.attachReporter(spark);
		//create Extent test
		ExtentTest test = report.createTest("main");
		
		test.log(Status.INFO, "demo web shop launching");
		driver.close();
		test.log(Status.FAIL, "inten");
		report.flush();
		
	}
}
