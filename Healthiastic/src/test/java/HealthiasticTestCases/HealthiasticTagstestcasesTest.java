package HealthiasticTestCases;
//package HealthiasticTestCases;
//
//import java.util.Properties;
//import org.testng.annotations.Test;
//
//import PagesOnHealthiastic.HealthiasticHomePage;
//import PagesOnHealthiastic.ThePhilipinoTagsPage;
//import UtilsOnFeed.ReadPropertiesFileHealthiastic;
//
//
//public class ThePhilipinoTagstestcasesTest extends ReportGenerateHealthiastic {
//
//	static Properties properties = null;
//
//	HealthiasticHomePage DashboardItem = new HealthiasticHomePage();
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
