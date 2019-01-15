package FactsonlyTestCases;

import java.util.Properties;
import org.testng.annotations.Test;

import PagesOnFactsonly.FactsonlyHomePage;
import UtilsOnFeed.ReadPropertiesFileFactsonly;

public class FactsonlyHomePageTestcasesTest extends ReportGenerateFactsonly {

	static Properties properties = null;

	FactsonlyHomePage obj = new FactsonlyHomePage();

	@Test(priority = 75)
	public void CheckSearchOption() throws Exception {
		ReadPropertiesFileFactsonly readConfigFile = new ReadPropertiesFileFactsonly();

		properties = readConfigFile.LoadPropertiess();
		driver.get(properties.getProperty("URL"));
		driver.manage().window().maximize();
		test = extent.createTest("Test 75 - Check Search Option");
		obj.SearchOption(driver);
	}

	@Test(priority = 76)
	public void CheckSiteLogo() {
		
		test = extent.createTest("Test 76 - Check Site Logo");
		obj.SiteLogo(driver);

	}

	@Test(priority = 77)
	public void CheckCreepyCategories() {
		test = extent.createTest("Test 77 - Check Creepy Categories");

		obj.CreepyCategories(driver);
	}

	@Test(priority = 78)
	public void CheckHistoryCategories() throws InterruptedException {
		test = extent.createTest("Test 78 - Check History Categories");

		obj.HistoryCategories(driver);
	}

	@Test(priority = 79)
	public void CheckEntertainmentCategories() {
		test = extent.createTest("Test 79 - Check Entertainment Categories");

		obj.EntertainmentCategories(driver);
	}

	@Test(priority = 80)
	public void CheckScienceCategories() {
		test = extent.createTest("Test 80 - Check Science Categories");

		obj.ScienceCategories(driver);
	}

	@Test(priority = 81)
	public void CheckCultureCategories() {
		test = extent.createTest("Test 81 - Check Culture Categories");

		obj.CultureCategories(driver);
	}

	

	@Test(priority = 82)
	public void CheckInstaLink() {
		test = extent.createTest("Test 85 - Check Insta Link");

		obj.InstaLink(driver);
	}

	@Test(priority = 83)
	public void CheckTwitterLink() {
		test = extent.createTest("Test 86 - Check Twitter Link");

		obj.TwitterLink(driver);
	}

	@Test(priority = 84)
	public void CheckFacebookLink() {
		test = extent.createTest("Test 87 - Check Facebook Link");
		obj.FacebookLink(driver);
	}

	@Test(priority = 85)
	public void CheckYouTubeLink() {
		test = extent.createTest("Test 88 - Check YouTube Link");
		obj.YouTubeLink(driver);
	}

	@Test(priority = 86)
	public void CheckFeaturedPostImage() {
		test = extent.createTest("Test 89 - Check FeaturedPost Image");
		obj.FeaturedPostImage(driver);
	}

	@Test(priority = 87)
	public void CheckFeaturedPostTitle() {
		test = extent.createTest("Test 90 - Check FeaturedPost Title");
		obj.FeaturedPostTitle(driver);

	}

	@Test(priority = 88)
	public void CheckFeaturedPostAuthor() {
		test = extent.createTest("Test 91 - Check FeaturedPost Author");
		obj.FeaturedPostAuthor(driver);
	}

	@Test(priority = 89)
	public void CheckSecondPostImage() {
		test = extent.createTest("Test 92 - Check Second PostImage");
		obj.SecondPostImage(driver);
	}

	@Test(priority = 90)
	public void CheckSecondPostTitle() {
		test = extent.createTest("Test 93 - Check Second PostTitle");
		obj.SecondPostTitle(driver);

	}

	@Test(priority = 91)
	public void CheckSecondPostAuthor() {
		test = extent.createTest("Test 94 - Check Second PostAuthor");
		obj.SecondPostAuthor(driver);

	}

	@Test(priority = 92)
	public void CheckThirdPostImage() {
		test = extent.createTest("Test 95 - Check Third PostImage");
		obj.ThirdPostImage(driver);
	}

	@Test(priority = 93)
	public void CheckThirdPostTitle() {
		test = extent.createTest("Test 96 - Check Third PostTitle");
		obj.ThirdPostTitle(driver);
	}

	@Test(priority = 94)
	public void CheckThirdPostAuthor() throws InterruptedException {
		test = extent.createTest("Test 97 - Check Third PostAuthor");

		obj.ThirdPostAuthor(driver);
	}

	@Test(priority = 95)
	public void CheckLatestStoryImage() throws InterruptedException {
		test = extent.createTest("Test 98 - Check Latest StoryImage");

		obj.LatestStoryImage(driver);
	}

	@Test(priority = 96)
	public void CheckLatestStoryTitle() throws InterruptedException {
		test = extent.createTest("Test 99 - Check Latest StoryTitle");

		obj.LatestStoryTitle(driver);

	}

	@Test(priority = 97)
	public void CheckLatestStoryAuthor() throws InterruptedException {
		test = extent.createTest("Test 100 - Check Latest Story Author");

		obj.LatestStoryAuthor(driver);
	}


	@Test(priority = 103)
	public void CheckEatSleepReadReaptImage() throws InterruptedException {
		test = extent.createTest("Test 106 - Check Eat Sleep Read Reapt Image");
		obj.EatSleepReadReaptImage(driver);
	}

	@Test(priority = 104)
	public void CheckEatSleepReadReaptTitle() throws InterruptedException {
		test = extent.createTest("Test 107 - Check Eat Sleep Read Reapt Title");

		obj.EatSleepReadReaptTitle(driver);
	}

	@Test(priority = 105)
	public void CheckEatSleepReadReaptAuthor() throws InterruptedException {
		test = extent.createTest("Test 108 - Check Eat Sleep Read Reapt Author");

		obj.EatSleepReadReaptAuthor(driver);

	}
}