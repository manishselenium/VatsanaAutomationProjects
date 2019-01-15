package MostlymoneyTestCases;

import java.util.Properties;
import org.testng.annotations.Test;

import PagesOnMostlymoney.MostlymoneyCatagoriesPage;
import UtilsOnFeed.ReadPropertiesFileHealthiastic;

public class MostlymoneyCatagoiesTestCasesTest extends ReportGenerateMostlymoney {

	static Properties properties = null;

	MostlymoneyCatagoriesPage CatagoryItem = new MostlymoneyCatagoriesPage();

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
	public void CheckMoney() throws Exception {

		test = extent.createTest("Test 34 - Check Money");
		CatagoryItem.MoneyCata(driver);

	}

	@Test(priority = 35)
	public void CheckLifeCata() throws Exception {
		test = extent.createTest("Test 36 - Check Life Cata");
		CatagoryItem.LifeCata(driver);
	}

	@Test(priority = 36)
	public void CheckSuccessCata() throws Exception {
		test = extent.createTest("Test 37 - Check Success Cata");
		CatagoryItem.SuccessCata(driver);

	}

	@Test(priority = 37)
	public void CheckSecurityCata() throws Exception {
		test = extent.createTest("Test 38 - Check Security Cata");
		CatagoryItem.SecurityCata(driver);
	}



	@Test(priority = 39)
	public void CheckMoneyPage() throws Exception {
		test = extent.createTest("Test 47 - Check Money Page");
		CatagoryItem.ClickMoney(driver);
	}

	@Test(priority = 40)
	public void CheckLifePage() throws Exception {
		test = extent.createTest("Test 48 - Check Life Page");
		CatagoryItem.ClickLife(driver);
	}

	@Test(priority = 41)
	public void CheckSuccessPage() throws Exception {
		test = extent.createTest("Test 49 - Check Success Page");
		CatagoryItem.ClickSuccess(driver);
	}

	@Test(priority = 42)
	public void CheckSecurityPage() throws Exception {
		test = extent.createTest("Test 50 - Check Security Page");
		CatagoryItem.ClickSecurity(driver);
	

	}

}
