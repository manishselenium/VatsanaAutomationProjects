package HollywoodpieTestCases;
//package HollywoodpieTestCases;
//package HollywoodpieTestCases;
//
//import java.util.Properties;
//import org.testng.annotations.Test;
//
//import PagesOnHollywoodpie.HollywoodpieHomePage;
//import PagesOnHollywoodpie.ThePhilipinoTagsPage;
//import UtilsOnFeed.ReadPropertiesFileHealthiastic;
//
//
//public class ThePhilipinoTagstestcasesTest extends ReportGenerateHollywoodpie {
//
//	static Properties properties = null;
//
//	HollywoodpieHomePage DashboardItem = new HollywoodpieHomePage();
//
//	ThePhilipinoTagsPage obj = new ThePhilipinoTagsPage();
//
//	@Test(priority = 130)
//	public void CheckSearchOption() throws Exception {
//		ReadPropertiesFileHealthiastic readConfigFile = new ReadPropertiesFileHealthiastic();
//
//		properties = readConfigFile.LoadPropertiess();
//
//		driver.get("https://www.geeksmate.io/tags");
//		driver.manage().window().maximize();
//		test = extent.createTest("Test 121 - Check Search Option");
//		DashboardItem.SearchOption(driver);
//	}
//
//	@Test(priority = 131)
//	public void CheckSearchTags() throws Exception {
//		test = extent.createTest("Test 122 - Check Search Tags");
//		obj.tags(driver);
//
//	}
//
//}
