package GeeksmateTestCases;

import java.util.Properties;
import org.testng.annotations.Test;

import PagesOnGeeksmate.GeeksmateHomePage;
import PagesOnGeeksmate.GeeksmateTagsPage;
import UtilsOnFeed.ReadPropertiesFileGeeksmate;


public class GeeksmateTagstestcasesTest extends ReportGenerateGeeksmate {

	static Properties properties = null;

	GeeksmateHomePage DashboardItem = new GeeksmateHomePage();

	GeeksmateTagsPage obj = new GeeksmateTagsPage();

	@Test(priority = 130)
	public void CheckSearchOption() throws Exception {
		ReadPropertiesFileGeeksmate readConfigFile = new ReadPropertiesFileGeeksmate();

		properties = readConfigFile.LoadPropertiess();

		driver.get("https://www.geeksmate.io/tags");
		driver.manage().window().maximize();
		test = extent.createTest("Test 121 - Check Search Option");
		DashboardItem.SearchOption(driver);
	}

	@Test(priority = 131)
	public void CheckSearchTags() throws Exception {
		test = extent.createTest("Test 122 - Check Search Tags");
		obj.tags(driver);

	}

}
