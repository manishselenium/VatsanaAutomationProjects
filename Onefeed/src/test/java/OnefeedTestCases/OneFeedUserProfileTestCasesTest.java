package OnefeedTestCases;

import java.io.IOException;
import java.util.Properties;
import org.testng.annotations.Test;

import PagesOnOnefeed.OneFeedUserProfilePage;
import UtilsOnFeed.ReadPropertiesFileOneFeed;


public class OneFeedUserProfileTestCasesTest extends ReportGenerateOnefeed {

	static Properties properties = null;
   
	OneFeedUserProfilePage obj = new OneFeedUserProfilePage();

	@Test(priority = 121)
	public void ClickAuthorName() throws IOException {

		ReadPropertiesFileOneFeed readConfigFile = new ReadPropertiesFileOneFeed();

		properties = readConfigFile.LoadPropertiess();
		driver.get(properties.getProperty("URL"));
		driver.manage().window().maximize();
		test = extent.createTest("Test 122 - Click Author Name");
		obj.ClickAuthorName(driver);

	}

	@Test(priority = 122)
	public void CheckBackgroundImage() {

		test = extent.createTest("Test 122 - Check Background Image");
		obj.BackgroundImage(driver);

	}

	@Test(priority = 123)
	public void CheckAuthorName() {

		test = extent.createTest("Test 123 - Check Author Name");
		obj.AuthorName(driver);

	}

	@Test(priority = 124)
	public void CheckAuthorImage() {
		test = extent.createTest("Test 124 - Check Author Image");
		obj.AuthorImage(driver);

	}

	@Test(priority = 125)
	public void CheckWriterName() {

		test = extent.createTest("Test 125 - Check Writer Name");
		obj.WriterName(driver);
	}

	@Test(priority = 126)
	public void CheckEditor() {
		test = extent.createTest("Test 126 - Check Editor");
		obj.Editor(driver);

	}

//	@Test(priority = 7)
//	public void CheckFacebookLink() {
//		OnefeedTestCases = extent.createTest("Test 1 - Check Facebook Link");
//		
//		
//		obj.FacebookLink(driver);
//
//	}
//
//	@Test(priority = 8)
//	public void CheckTwitterLink() {
//		OnefeedTestCases = extent.createTest("Test 1 - Check Twitter Link");
//		obj.TwitterLink(driver);
//
//	}
//
//	@Test(priority = 9)
//	public void CheckLinkedinLink() {
//		OnefeedTestCases = extent.createTest("Test 1 - Check Linkedin Link");
//		obj.LinkedinLink(driver);
//
//	}

//	@Test(priority = 127)
//	public void CheckProfileDesc() {
//		test = extent.createTest("Test 127 - Check Profile Desc");
//		obj.ProfileDesc(driver);
//	}

//	@Test(priority = 128)
//	public void CheckDontMissThisStory() {
//
//		test = extent.createTest("Test 128 - Check Dont Miss This Story");
//		obj.DontMissThisStory(driver);
//
//	}
//
//	@Test(priority = 129)
//	public void LatestStories() {
//
//		test = extent.createTest("Test 129 - Latest Stories");
//		obj.LatestStories(driver);
//
//	}

}
