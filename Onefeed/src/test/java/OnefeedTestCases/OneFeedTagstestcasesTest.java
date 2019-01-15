//package OnefeedTestCases;
//
//import java.util.Properties;
//import org.testng.annotations.Test;
//
//import PagesOnOnefeed.OneFeedTagsPage;
//import PagesOnOnefeed.OnefeedHomePage;
//import UtilsOnFeed.ReadPropertiesFileOneFeed;
//
//
//public class OneFeedTagstestcasesTest extends ReportGenerateOnefeed {
//
//	static Properties properties = null;
//
//	OnefeedHomePage DashboardItem = new OnefeedHomePage();
//
//	OneFeedTagsPage obj = new OneFeedTagsPage();
//
//	@Test(priority = 130)
//	public void CheckSearchOption() throws Exception {
//		ReadPropertiesFileOneFeed readConfigFile = new ReadPropertiesFileOneFeed();
//
//		properties = readConfigFile.LoadPropertiess();
//
//		driver.get("https://www.duniadigest.com/tags");
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
