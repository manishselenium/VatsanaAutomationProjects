package PoppleTestCases;

import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PopplePages.SearchPage;
import PoppleUtils.ReadPropertiesFilesPopple;

public class SearchPageTestCasesTest extends ReportGenerateThePoopleTest {

	SearchPage obj = new SearchPage();
	static Properties properties = null;

	@Test(priority = 99)
	public void ClickSearchOption() throws InterruptedException, IOException {

		ReadPropertiesFilesPopple readConfigFile = new ReadPropertiesFilesPopple();

		properties = readConfigFile.LoadPropertiess();
		// webdriver.get("https://www.wittyfeed.tv");
		driver.get(properties.getProperty("URL"));
		driver.manage().window().maximize();

		test = extent.createTest("Test 99 - Click Search Option");
		obj.ClickSearchOption(driver);

	}

	@Test(priority = 100)
	public void CheckSearchHeader() {
		test = extent.createTest("Test 100 - Check Search Header");
		obj.SearchHeader(driver);
	}

	@Test(priority = 101)
	public void CheckSearchedStoryImage() {
		test = extent.createTest("Test 101 - Check Searched Story Image");
		obj.SearchedStoryImage(driver);

	}

	@Test(priority = 102)
	public void CheckSearchedStoryTitle() {
		test = extent.createTest("Test 102 - Check Searched Story Title");
		obj.SearchedStoryTitle(driver);

	}

}
