package FactsonlyTestCases;

import java.util.Properties;


import org.testng.annotations.Test;

import PagesOnFactsonly.FactsonlyCatagoriesPage;
import UtilsOnFeed.ReadPropertiesFileFactsonly;

public class FactsonlyCatagoiesTestCasesTest extends ReportGenerateFactsonly {

	static Properties properties = null;

	FactsonlyCatagoriesPage CatagoryItem = new FactsonlyCatagoriesPage();

	@Test(priority = 33)
	public void ClickHamburgerMenu() throws Exception {
		
		ReadPropertiesFileFactsonly readConfigFile = new ReadPropertiesFileFactsonly();

		properties = readConfigFile.LoadPropertiess();
		
		driver.get(properties.getProperty("URL"));
		driver.manage().window().maximize();

		test = extent.createTest("Test 33 - Click hamburger menu");
		
		CatagoryItem.ClickHamburgerMenu(driver);

	}

	@Test(priority = 34)
	public void CheckCreepy() throws Exception {

		test = extent.createTest("Test 34 - Check Creepy");
		CatagoryItem.CreepyCata(driver);

	}

	@Test(priority = 35)
	public void CheckHistoryCata() throws Exception {
		test = extent.createTest("Test 36 - Check History Cata");
		CatagoryItem.HistoryCata(driver);
	}

	@Test(priority = 36)
	public void CheckEntertainmentCata() throws Exception {
		test = extent.createTest("Test 37 - Check Entertainment Cata");
		CatagoryItem.EntertainmentCata(driver);

	}

	@Test(priority = 37)
	public void CheckScienceCata() throws Exception {
		test = extent.createTest("Test 38 - Check Science Cata");
		CatagoryItem.ScienceCata(driver);
	}

	@Test(priority = 38)
	public void CheckCultureCata() throws Exception {
		test = extent.createTest("Test 37 - Check Culture Cata");
		CatagoryItem.CultureCata(driver);

	}

	@Test(priority = 39)
	public void CheckCreepyPage() throws Exception {
		test = extent.createTest("Test 47 - Check Creepy Page");
		CatagoryItem.ClickCreepy(driver);
	}

	@Test(priority = 40)
	public void CheckHistoryPage() throws Exception {
		test = extent.createTest("Test 48 - CheckHi story Page");
		CatagoryItem.ClickHistory(driver);
	}

	@Test(priority = 41)
	public void CheckEntertainmentPage() throws Exception {
		test = extent.createTest("TBeautyest 49 - Check Entertainment Page");
		CatagoryItem.ClickEntertainment(driver);
	}

	@Test(priority = 42)
	public void CheckSciencePage() throws Exception {
		test = extent.createTest("Test 50 - Check Science Page");
		CatagoryItem.ClickScience(driver);
	}

	@Test(priority = 43)
	public void CheckCulturePage() throws Exception {
		test = extent.createTest("Test 51 - Check Culture Page");
		CatagoryItem.ClickCulture(driver);

	}

}
