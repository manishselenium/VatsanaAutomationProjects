package ThePhilipinoTestCases;

import java.io.IOException;
import java.util.Properties;
import org.testng.annotations.Test;

import PagesOnThePhilipino.ThePhilipinoFooterOptionsPages;
import UtilsOnFeed.ReadPropertiesFileThePhilipino;

public class ThePhilipinoFooterOptionTestCasesTest extends ReportGenerateThePhilipino {
	static Properties properties = null;

	ThePhilipinoFooterOptionsPages obj = new ThePhilipinoFooterOptionsPages();

	@Test(priority = 66)
	public void ClickHamburgerMenu() throws IOException {

		ReadPropertiesFileThePhilipino readConfigFile = new ReadPropertiesFileThePhilipino();

		properties = readConfigFile.LoadPropertiess();
		driver.get(properties.getProperty("URL"));
		driver.manage().window().maximize();
		test = extent.createTest("Test 66 - Click hamburger menu");
		obj.ClickHamburgerMenu(driver);
	}

	@Test(priority = 67)
	public void CheckTermsOfUseLink() {
		test = extent.createTest("Test 68 - Check Terms Of UseLink");
		obj.TermsOfUse(driver);

	}

	@Test(priority = 68)
	public void CheckPrivacyPolicyLink() throws InterruptedException {
		test = extent.createTest("Test 69 - Check Privacy Policy Link");
		obj.PrivacyPolicy(driver);
	}

	@Test(priority = 69)
	public void CheckTermsOfUsePage() throws InterruptedException {
		test = extent.createTest("Test 72 - Check Terms Of Use Page");
		obj.TermsOfUsePage(driver);

	}
	
	@Test(priority = 70)
	public void CheckPrivacyPolicyPage() throws InterruptedException {
		test = extent.createTest("Test 72 - Check Terms Of Use Page");
		obj.PrivacyPolicyPage(driver);

	}

}
