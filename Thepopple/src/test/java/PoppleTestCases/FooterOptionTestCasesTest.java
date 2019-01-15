package PoppleTestCases;

import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import PopplePages.FooterOptionsPages;
import PopplePages.PoppleHomePage;
import PoppleUtils.ReadPropertiesFilesPopple;

public class FooterOptionTestCasesTest extends ReportGenerateThePoopleTest {
static Properties properties = null;


	PoppleHomePage DashboardItem = new PoppleHomePage();
	FooterOptionsPages obj = new FooterOptionsPages();

//	@BeforeTest
//	public void OpenBrowser() throws IOException {
//
//		
//		ReadPropertiesFilesPopple readConfigFile = new ReadPropertiesFilesPopple();
//
//		properties = readConfigFile.LoadPropertiess();
//     	driver.get(properties.getProperty("URL"));
//		driver.manage().window().maximize();
//
//	}

	@Test(priority = 59)
	public void ClickHamburgerMenu() throws IOException {
		
		ReadPropertiesFilesPopple readConfigFile = new ReadPropertiesFilesPopple();

		properties = readConfigFile.LoadPropertiess();
     	driver.get(properties.getProperty("URL"));
		driver.manage().window().maximize();
		test = extent.createTest("Test 59 - Click hamburger menu");
		obj.ClickHamburgerMenu(driver);

	}

	@Test(priority = 60)
	public void CheckAbutUsLink() {
		test = extent.createTest("Test 60 - Check AbutUs Link");
        obj.AboutUs(driver);

	}

	@Test(priority = 61)
	public void CheckTermsOfUseLink() {
		test = extent.createTest("Test 61 - Check Terms Of UseLink");
		obj.TermsOfUse(driver);

	}

	@Test(priority = 62)
	public void CheckPrivacyPolicyLink() throws InterruptedException {
		test = extent.createTest("Test 62 - Check Privacy Policy Link");
        obj.PrivacyPolicy(driver);

	}

	@Test(priority = 63)
	public void CheckCantactUsLink() {
		test = extent.createTest("Test 63 - Check Cantact Us Link");
        obj.ContactUs(driver);
	}

	@Test(priority = 64)
	public void CheckAbutUsPage() throws InterruptedException {
		test = extent.createTest("Test 64 - Check AbutUs Page");
        obj.AboutUsPage(driver);

	}

	@Test(priority = 65)
	public void CheckTermsOfUsePage() throws InterruptedException {
		test = extent.createTest("Test 65 - Check Terms Of Use Page");
		obj.TermsOfUsePage(driver);

	}
	@Test(priority =66)
	public void CheckPrivacyPolicyPage() throws InterruptedException {
		test = extent.createTest("Test 66 - Check Privacy Policy Page");
        obj.ContactUsPage(driver);

	}
	@Test(priority = 67)
	public void CheckCantactUsPage() {
		test = extent.createTest("Test 67 - Check CantactUs Page");
        obj.ContactUs(driver);
	}

}
