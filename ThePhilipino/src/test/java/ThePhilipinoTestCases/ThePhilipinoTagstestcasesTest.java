package ThePhilipinoTestCases;
//package ThePhilipinoTestCases;
//
//import java.util.Properties;
//import org.testng.annotations.Test;
//
//import PagesOnThePhilipino.ThePhilipinoHomePage;
//import PagesOnThePhilipino.ThePhilipinoTagsPage;
//import UtilsOnFeed.ReadPropertiesFileThePhilipino;
//
//
//public class ThePhilipinoTagstestcasesTest extends ReportGenerateThePhilipino {
//
//	static Properties properties = null;
//
//	ThePhilipinoHomePage DashboardItem = new ThePhilipinoHomePage();
//
//	ThePhilipinoTagsPage obj = new ThePhilipinoTagsPage();
//
//	@Test(priority = 130)
//	public void CheckSearchOption() throws Exception {
//		ReadPropertiesFileThePhilipino readConfigFile = new ReadPropertiesFileThePhilipino();
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
