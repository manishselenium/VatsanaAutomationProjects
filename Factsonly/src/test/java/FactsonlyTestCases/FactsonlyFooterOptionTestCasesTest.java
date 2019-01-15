package FactsonlyTestCases;

import java.io.IOException;
import java.util.Properties;
import org.testng.annotations.Test;

import PagesOnFactsonly.FactsonlyFooterOptionsPages;
import UtilsOnFeed.ReadPropertiesFileFactsonly;

public class FactsonlyFooterOptionTestCasesTest extends ReportGenerateFactsonly {
	static Properties properties = null;

	FactsonlyFooterOptionsPages obj = new FactsonlyFooterOptionsPages();

	@Test(priority = 66)
	public void ClickHamburgerMenu() throws IOException {

		ReadPropertiesFileFactsonly readConfigFile = new ReadPropertiesFileFactsonly();

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
