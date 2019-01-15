package DuniadigestTestCases;

import java.util.Properties;
import org.testng.annotations.Test;

import PagesOnDuniadigest.DuniadigestHomePage;
import PagesOnDuniadigest.DuniadigestTagsPage;
import UtilsOnFeed.ReadPropertiesFileDuniadigest;


public class DuniadigestTagstestcasesTest extends ReportGenerateDuniadigest {

	static Properties properties = null;

	DuniadigestHomePage DashboardItem = new DuniadigestHomePage();

	DuniadigestTagsPage obj = new DuniadigestTagsPage();

	@Test(priority = 130)
	public void CheckSearchOption() throws Exception {
		ReadPropertiesFileDuniadigest readConfigFile = new ReadPropertiesFileDuniadigest();

		properties = readConfigFile.LoadPropertiess();

		driver.get("https://www.duniadigest.com/tags");
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
