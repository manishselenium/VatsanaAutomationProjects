package GeeksmateTestCases;

import java.util.Properties;
import org.testng.annotations.Test;

import PagesOnGeeksmate.GeeksmateHomePage;
import UtilsOnFeed.ReadPropertiesFileGeeksmate;

public class GeeksmateHomePageTestcasesTest extends ReportGenerateGeeksmate {

	static Properties properties = null;

	GeeksmateHomePage obj = new GeeksmateHomePage();

	@Test(priority = 75)
	public void CheckSearchOption() throws Exception {
		ReadPropertiesFileGeeksmate readConfigFile = new ReadPropertiesFileGeeksmate();

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
	public void CheckNewsCategories() {
		test = extent.createTest("Test 77 - Check News Categories");

		obj.NewsCategories(driver);
	}

	@Test(priority = 78)
	public void CheckGadgetsCategories() throws InterruptedException {
		test = extent.createTest("Test 78 - Check Gadgets Categories");

		obj.GadgetsCategories(driver);
	}

	@Test(priority = 79)
	public void CheckReviewsCategories() {
		test = extent.createTest("Test 79 - Check Reviews Categories");

		obj.ReviewsCategories(driver);
	}

	@Test(priority = 80)
	public void CheckBestProductsCategories() {
		test = extent.createTest("Test 80 - Check BestProducts Categories");

		obj.BestProductsCategories(driver);
	}

	@Test(priority = 81)
	public void CheckInternetReadsCategories() {
		test = extent.createTest("Test 81 - Check InternetReads Categories");

		obj.InternetReadsCategories(driver);
	}

	@Test(priority = 82)
	public void CheckVideosCategories() {
		test = extent.createTest("Test 81 - Check Videos Categories");

		obj.VideosCategories(driver);
	}

	@Test(priority = 83)
	public void CheckQuizCategories() {
		test = extent.createTest("Test 81 - Check Quiz Categories");

		obj.QuizCategories(driver);
	}

	@Test(priority = 84)
	public void CheckInstaLink() {
		test = extent.createTest("Test 85 - Check Insta Link");

		obj.InstaLink(driver);
	}

	@Test(priority = 85)
	public void CheckTwitterLink() {
		test = extent.createTest("Test 86 - Check Twitter Link");

		obj.TwitterLink(driver);
	}

	@Test(priority = 86)
	public void CheckFacebookLink() {
		test = extent.createTest("Test 87 - Check Facebook Link");
		obj.FacebookLink(driver);
	}

	@Test(priority = 87)
	public void CheckYouTubeLink() {
		test = extent.createTest("Test 88 - Check YouTube Link");
		obj.YouTubeLink(driver);
	}

	@Test(priority = 88)
	public void CheckFeaturedPostImage() {
		test = extent.createTest("Test 89 - Check FeaturedPost Image");
		obj.FeaturedPostImage(driver);
	}

	@Test(priority = 89)
	public void CheckFeaturedPostTitle() {
		test = extent.createTest("Test 90 - Check FeaturedPost Title");
		obj.FeaturedPostTitle(driver);

	}

	@Test(priority = 90)
	public void CheckFeaturedPostAuthor() {
		test = extent.createTest("Test 91 - Check FeaturedPost Author");
		obj.FeaturedPostAuthor(driver);
	}

	@Test(priority = 91)
	public void CheckSecondPostImage() {
		test = extent.createTest("Test 92 - Check Second PostImage");
		obj.SecondPostImage(driver);
	}

	@Test(priority = 92)
	public void CheckSecondPostTitle() {
		test = extent.createTest("Test 93 - Check Second PostTitle");
		obj.SecondPostTitle(driver);

	}

	@Test(priority = 93)
	public void CheckSecondPostAuthor() {
		test = extent.createTest("Test 94 - Check Second PostAuthor");
		obj.SecondPostAuthor(driver);

	}

	@Test(priority = 94)
	public void CheckThirdPostImage() {
		test = extent.createTest("Test 95 - Check Third PostImage");
		obj.ThirdPostImage(driver);
	}

	@Test(priority = 95)
	public void CheckThirdPostTitle() {
		test = extent.createTest("Test 96 - Check Third PostTitle");
		obj.ThirdPostTitle(driver);
	}

	@Test(priority = 96)
	public void CheckThirdPostAuthor() throws InterruptedException {
		test = extent.createTest("Test 97 - Check Third PostAuthor");

		obj.ThirdPostAuthor(driver);
	}

	@Test(priority = 97)
	public void CheckLatestStoryImage() throws InterruptedException {
		test = extent.createTest("Test 98 - Check Latest StoryImage");

		obj.LatestStoryImage(driver);
	}

	@Test(priority = 98)
	public void CheckLatestStoryTitle() throws InterruptedException {
		test = extent.createTest("Test 99 - Check Latest StoryTitle");

		obj.LatestStoryTitle(driver);

	}

	@Test(priority = 99)
	public void CheckLatestStoryAuthor() throws InterruptedException {
		test = extent.createTest("Test 100 - Check Latest Story Author");

		obj.LatestStoryAuthor(driver);
	}

	@Test(priority = 100)
	public void CheckGMVideo1() throws InterruptedException {
		test = extent.createTest("Test 101 - Check IV Video1");
		obj.GMVideo1(driver);

	}

	@Test(priority = 101)
	public void CheckGMVideo2() throws InterruptedException {
		test = extent.createTest("Test 102 - Check IV Video2");
		obj.GMVideo2(driver);

	}

	@Test(priority = 102)
	public void CheckQuizeFeedImage() throws InterruptedException {
		test = extent.createTest("Test 103 - Check Quize FeedImage");
		obj.QuizeFeedImage(driver);

	}

	@Test(priority = 103)
	public void CheckQuizefeedTitle() throws InterruptedException {
		test = extent.createTest("Test 104 - Check Quize feedTitle");
		obj.QuizefeedTitle(driver);

	}

	@Test(priority = 104)
	public void CheckQuizeFeedAuthor() throws InterruptedException {
		test = extent.createTest("Test 105 - Check Quize FeedAuthor");
		obj.QuizeFeedAuthor(driver);

	}

	@Test(priority = 105)
	public void CheckEatSleepReadReaptImage() throws InterruptedException {
		test = extent.createTest("Test 106 - Check Eat Sleep Read Reapt Image");
		obj.EatSleepReadReaptImage(driver);
	}

	@Test(priority = 106)
	public void CheckEatSleepReadReaptTitle() throws InterruptedException {
		test = extent.createTest("Test 107 - Check Eat Sleep Read Reapt Title");

		obj.EatSleepReadReaptTitle(driver);
	}

	@Test(priority = 107)
	public void CheckEatSleepReadReaptAuthor() throws InterruptedException {
		test = extent.createTest("Test 108 - Check Eat Sleep Read Reapt Author");

		obj.EatSleepReadReaptAuthor(driver);

	}
}
