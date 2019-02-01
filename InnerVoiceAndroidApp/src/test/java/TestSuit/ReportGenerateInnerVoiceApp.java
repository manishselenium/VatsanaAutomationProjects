package TestSuit;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;

import Utils.ReadPropertieFile;
import io.appium.java_client.android.AndroidDriver;

public class ReportGenerateInnerVoiceApp {

	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest test;
	
	
	AndroidDriver driver;

	static Properties properties = null;

	// public static ChromeDriver webdriver;

	@BeforeSuite
  public void Setup() throws IOException {
	  
	  
	  		//For Ubuntu
	        htmlReporter = new ExtentHtmlReporter("OneFeedSDKAndroidTestResult-Automation.html");
	  
	  		// For windows
		    //htmlReporter = new ExtentHtmlReporter(("/home/wittyfeed/extentReports")+"/WebsiteTestResult-Automati.html");
		    extent = new ExtentReports();
		    extent.attachReporter(htmlReporter);
		    
		    extent.setSystemInfo("OS", "Linux");
		    extent.setSystemInfo("Host Name", "Test");
		    extent.setSystemInfo("Environment", "QA");
		    extent.setSystemInfo("User Name", "Manish Dangas");

		    htmlReporter.config().setChartVisibilityOnOpen(true);
		    htmlReporter.config().setDocumentTitle("Extent report");
		    htmlReporter.config().setReportName("Test Report");
		    htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);	  
		    
        //----------------------Chrome for headless and jenkins----------------
//		    System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
//			ChromeOptions chromeOptions = new ChromeOptions();
//            chromeOptions.addArguments("--headless");
//            chromeOptions.addArguments("--no-sandbox");
//            chromeOptions.addArguments("--disable-dev-shm-usage");
//            driver = new ChromeDriver(chromeOptions);	
//            driver.manage().window().maximize();
         
                       
            ReadPropertieFile readConfigFile = new ReadPropertieFile();

    		properties = readConfigFile.LoadPropertiess();

    		File appDir = new File(properties.getProperty("FilePath"));
    		File app = new File(appDir, properties.getProperty("AppDir"));
    		DesiredCapabilities capabilities = new DesiredCapabilities();
    		capabilities.setCapability("deviceName", properties.getProperty("deviceName"));
    		capabilities.setCapability("platformVersion", properties.getProperty("platformVersion"));
    		capabilities.setCapability("app-package", properties.getProperty("app-package"));
    		capabilities.setCapability("app-activity", properties.getProperty("app-activity"));
    		capabilities.setCapability("BROWSER_NAME", "Chrome");
    		capabilities.setCapability("unicodeKeyboard", "true");                                     
    		capabilities.setCapability("resetKeyboard", "true");
    		capabilities.setCapability("app", app.getAbsolutePath());
    		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		    //----------------Chrome for local without headless-----------------------
//			System.setProperty("webdriver.chrome.driver","chromedriver");
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		    //----------------Friefox for local without headless-----------------------
//			System.setProperty("webdriver.gecko.driver", "geckodriver");
//			driver = new FirefoxDriver();
//			driver.manage().window().maximize();

  }

	@AfterMethod
	public void getResults(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " Test case FAILED due to below issues:",
					ExtentColor.RED));
			test.fail(result.getThrowable());
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			test.log(Status.PASS, MarkupHelper.createLabel(result.getName() + " Test Case PASSED", ExtentColor.GREEN));
		} else {
			test.log(Status.SKIP,
					MarkupHelper.createLabel(result.getName() + " Test Case SKIPPED", ExtentColor.ORANGE));
			test.skip(result.getThrowable());
		}
	}

	@AfterSuite
	public void tearDown() {
		// webdriver.quit();
		extent.flush();
	}

}
