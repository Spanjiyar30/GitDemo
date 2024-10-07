package Selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Project {
	
	ExtentReports er;

	@Test
	public void demo() {
		System.out.println("Hrlo");
	}
	 @BeforeTest
	public void extentReport() {
		String path = System.getProperty("user.dir")+"//reports//index.html";
		ExtentSparkReporter xs =new ExtentSparkReporter(path);
		xs.config().setReportName("Test Report");
		xs.config().setDocumentTitle("DEMO TEST");
	    er = new ExtentReports();
		er.attachReporter(xs);
		er.setSystemInfo("Tester", "Santosh");
		
	}
	@Test
	public void mainPage() {
		er.createTest("tESTnAME");
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");
        er.flush();
	}

}
