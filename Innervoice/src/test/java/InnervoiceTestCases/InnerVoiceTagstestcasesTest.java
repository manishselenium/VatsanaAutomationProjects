package InnervoiceTestCases;

import java.util.Properties;
import org.testng.annotations.Test;

import PagesOnInnervoice.InnervoiceHomePage;
import PagesOnInnervoice.InnerVoiceTagsPage;
import UtilsOnFeed.ReadPropertiesFileInnerVoice;


public class InnerVoiceTagstestcasesTest extends ReportGenerateInnnerVoice {

	static Properties properties = null;

	InnervoiceHomePage DashboardItem = new InnervoiceHomePage();

	InnerVoiceTagsPage obj = new InnerVoiceTagsPage();

	@Test(priority = 130)
	public void CheckSearchOption() throws Exception {
		ReadPropertiesFileInnerVoice readConfigFile = new ReadPropertiesFileInnerVoice();

		properties = readConfigFile.LoadPropertiess();

		driver.get("https://www.innervoice.ai/tags");
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
