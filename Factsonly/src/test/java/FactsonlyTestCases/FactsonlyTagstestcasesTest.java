//package FactsonlyTestCases;
//package FactsonlyTestCases;
//import java.util.Properties;
//import org.testng.annotations.Test;
//import PagesOnFactsonly.FactsonlyHomePage;
//import PagesOnFactsonly.ThePhilipinoTagsPage;
//import UtilsOnFeed.ReadPropertiesFileFactsonly;
//
//
//public class ThePhilipinoTagstestcasesTest extends ReportGenerateFactsonly {
//
//	static Properties properties = null;
//
//	FactsonlyHomePage DashboardItem = new FactsonlyHomePage();
//
//	ThePhilipinoTagsPage obj = new ThePhilipinoTagsPage();
//
//	@Test(priority = 130)
//	public void CheckSearchOption() throws Exception {
//		ReadPropertiesFileFactsonly readConfigFile = new ReadPropertiesFileFactsonly();
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
