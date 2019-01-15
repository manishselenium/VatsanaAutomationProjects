package GeeksmateTestCases;

import java.io.IOException;
import java.util.Properties;
import org.testng.annotations.Test;

import PagesOnGeeksmate.GeeksmateSearchPage;
import UtilsOnFeed.ReadPropertiesFileGeeksmate;

public class GeeksmateSearchPageTestCasesTest extends ReportGenerateGeeksmate {

	GeeksmateSearchPage obj = new GeeksmateSearchPage();

	static Properties properties = null;

    @Test(priority = 109)
	public void ClickSearchOption() throws InterruptedException, IOException {

		ReadPropertiesFileGeeksmate readConfigFile = new ReadPropertiesFileGeeksmate();

		properties = readConfigFile.LoadPropertiess();
		
		driver.get(properties.getProperty("URL"));
		driver.manage().window().maximize();

		test = extent.createTest("Test 109 - Click Search Option");
		obj.ClickSearchOption(driver);

	}

	@Test(priority = 110)
	public void CheckSearchHeader() {
		test = extent.createTest("Test 110 - Check Search Header");
		obj.SearchHeader(driver);
	}

	@Test(priority = 111)
	public void CheckSearchedStoryImage() {
		test = extent.createTest("Test 111 - Check Searched Story Image");
		obj.SearchedStoryImage(driver);

	}

	@Test(priority = 112)
	public void CheckSearchedStoryTitle() {
		test = extent.createTest("Test 112 - Check Searched Story Title");
		obj.SearchedStoryTitle(driver);

	}

}
