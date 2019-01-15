package HealthiasticTestCases;

import java.util.Properties;
import org.testng.annotations.Test;

import PagesOnHealthiastic.HealthiasticCatagoriesPage;
import UtilsOnFeed.ReadPropertiesFileHealthiastic;

public class HealthiasticCatagoiesTestCasesTest extends ReportGenerateHealthiastic {

	static Properties properties = null;

	HealthiasticCatagoriesPage CatagoryItem = new HealthiasticCatagoriesPage();

	@Test(priority = 33)
	public void ClickHamburgerMenu() throws Exception {

		ReadPropertiesFileHealthiastic readConfigFile = new ReadPropertiesFileHealthiastic();

		properties = readConfigFile.LoadPropertiess();

		driver.get(properties.getProperty("URL"));
		driver.manage().window().maximize();

		test = extent.createTest("Test 33 - Click hamburger menu");
		CatagoryItem.ClickHamburgerMenu(driver);

	}

	@Test(priority = 34)
	public void CheckTipsAndTricks() throws Exception {

		test = extent.createTest("Test 34 - Check Tips And Tricks");
		CatagoryItem.TipsAndTricksCata(driver);

	}

	@Test(priority = 35)
	public void CheckWomensHealthCata() throws Exception {
		test = extent.createTest("Test 36 - Check Womens Health Cata");
		CatagoryItem.WomensHealthCata(driver);
	}

	@Test(priority = 36)
	public void CheckHealthAlertCata() throws Exception {
		test = extent.createTest("Test 37 - Check Health Alert Cata");
		CatagoryItem.HealthAlertCata(driver);

	}

	@Test(priority = 37)
	public void CheckLifestyleCata() throws Exception {
		test = extent.createTest("Test 38 - Check Lifestyle Cata");
		CatagoryItem.LifestyleCata(driver);
	}

	@Test(priority = 38)
	public void CheckBeautyCata() throws Exception {
		test = extent.createTest("Test 37 - Check Beauty Cata");
		CatagoryItem.BeautyCata(driver);

	}

	@Test(priority = 39)
	public void CheckTipsAndTricksPage() throws Exception {
		test = extent.createTest("Test 47 - Check TipsAndTricks Page");
		CatagoryItem.ClickTipsAndTricks(driver);
	}

	@Test(priority = 40)
	public void CheckWomensHealthPage() throws Exception {
		test = extent.createTest("Test 48 - Check Womens Health Page");
		CatagoryItem.ClickWomensHealth(driver);
	}

	@Test(priority = 41)
	public void CheckHealthAlertPage() throws Exception {
		test = extent.createTest("Test 49 - Check Health Alert Page");
		CatagoryItem.ClickHealthAlert(driver);
	}

	@Test(priority = 42)
	public void CheckLifestylePage() throws Exception {
		test = extent.createTest("Test 50 - Check Lifestyle Page");
		CatagoryItem.ClickLifestyle(driver);
	}

	@Test(priority = 43)
	public void CheckBeautyPage() throws Exception {
		test = extent.createTest("Test 51 - Check Beauty Page");
		CatagoryItem.ClickBeauty(driver);

	}

}
