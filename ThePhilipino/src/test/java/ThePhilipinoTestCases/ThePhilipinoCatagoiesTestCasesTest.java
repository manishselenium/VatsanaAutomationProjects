package ThePhilipinoTestCases;

import java.util.Properties;
import org.testng.annotations.Test;

import PagesOnThePhilipino.ThePhilipinoCatagoriesPage;
import UtilsOnFeed.ReadPropertiesFileThePhilipino;

public class ThePhilipinoCatagoiesTestCasesTest extends ReportGenerateThePhilipino {

	static Properties properties = null;

	ThePhilipinoCatagoriesPage CatagoryItem = new ThePhilipinoCatagoriesPage();

	@Test(priority = 33)
	public void ClickHamburgerMenu() throws Exception {

		ReadPropertiesFileThePhilipino readConfigFile = new ReadPropertiesFileThePhilipino();

		properties = readConfigFile.LoadPropertiess();

		driver.get(properties.getProperty("URL"));
		driver.manage().window().maximize();

		test = extent.createTest("Test 33 - Click hamburger menu");
		CatagoryItem.ClickHamburgerMenu(driver);

	}

	@Test(priority = 34)
	public void CheckHealthCata() throws Exception {

		test = extent.createTest("Test 34 - Check Health Cata");
		CatagoryItem.HealthCata(driver); 

	}

	@Test(priority = 35)
	public void CheckHumorCata() throws Exception {
		test = extent.createTest("Test 36 - Check Humor Cata");
		CatagoryItem.HumorCata(driver);
	}

	@Test(priority = 36)
	public void CheckCelebrityCata() throws Exception {
		test = extent.createTest("Test 37 - Check Celebrity Cata");
		CatagoryItem.CelebrityCata(driver);

	}


	@Test(priority = 37)
	public void TechnologyCata() throws Exception {
		test = extent.createTest("Test 38 - Technology Cata");
		CatagoryItem.TechnologyCata(driver);
	}



	@Test(priority = 38)
	public void CheckMiscCata() throws Exception {
		test = extent.createTest("Test 37 - Check Misc Cata");
		CatagoryItem.MiscCata(driver);

	}

	@Test(priority = 39)
	public void CheckFactsCata() throws Exception {
		test = extent.createTest("Test 38 - Check Facts Cata");
		CatagoryItem.FactsCata(driver);
	}


	@Test(priority = 40)
	public void CheckHealthPage() throws Exception {
		test = extent.createTest("Test 47 - Check Health Page");
		CatagoryItem.ClickHealth(driver);
	}

	@Test(priority = 41)
	public void CheckHumorPage() throws Exception {
		test = extent.createTest("Test 48 - Check Humor Page");
		CatagoryItem.ClickHumor(driver);
	}

	@Test(priority = 42)
	public void CheckCelebrityPage() throws Exception {
		test = extent.createTest("Test 49 - Check Celebrity Page");
		CatagoryItem.ClickCelebrity(driver);
	}

	@Test(priority = 43)
	public void CheckTechnologyPage() throws Exception {
		test = extent.createTest("Test 50 - Check Technology Page");
		CatagoryItem.ClickTechnology(driver);
	}

	@Test(priority = 44)
	public void CheckMiscPage() throws Exception {
		test = extent.createTest("Test 51 - Check Misc Page");
		CatagoryItem.ClickMisc(driver);

	}

	@Test(priority = 45)
	public void CheckFactsPage() throws Exception {
		test = extent.createTest("Test 52 - Check Facts Page");
		CatagoryItem.ClickFacts(driver);
	}

	
}
