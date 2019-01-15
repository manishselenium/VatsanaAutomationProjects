package InnervoiceTestCases;

import java.util.Properties;
import org.testng.annotations.Test;

import PagesOnInnervoice.InnerVoiceCatagoriesPage;
import UtilsOnFeed.ReadPropertiesFileInnerVoice;

public class InnerVoiceCatagoiesTestCasesTest extends ReportGenerateInnnerVoice {

	static Properties properties = null;

	InnerVoiceCatagoriesPage CatagoryItem = new InnerVoiceCatagoriesPage();

	@Test(priority = 33)
	public void ClickHamburgerMenu() throws Exception {

		ReadPropertiesFileInnerVoice readConfigFile = new ReadPropertiesFileInnerVoice();

		properties = readConfigFile.LoadPropertiess();

		driver.get(properties.getProperty("URL"));
		driver.manage().window().maximize();

		test = extent.createTest("Test 33 - Click hamburger menu");
		CatagoryItem.ClickHamburgerMenu(driver);

	}

	@Test(priority = 34)
	public void CheckExploreCata() throws Exception {

		test = extent.createTest("Test 34 - Check Explore Cata");
		CatagoryItem.ExploreCata(driver);

	}

	@Test(priority = 35)
	public void CheckExploreSubCata() throws Exception {
		test = extent.createTest("Test 35 - Check Explore SubCata");
		CatagoryItem.ExploreSubCata(driver);
	}

	@Test(priority = 36)
	public void CheckTalesCata() throws Exception {
		test = extent.createTest("Test 36 - Check Tales Cata");
		CatagoryItem.TalesCata(driver);

	}

	@Test(priority = 37)
	public void CheckTalesSubCata() throws Exception {
		test = extent.createTest("Test 37 - Check Tales SubCata");
		CatagoryItem.TalesSubCata(driver);

	}

	@Test(priority = 38)
	public void CheckVideosCata() throws Exception {
		test = extent.createTest("Test 38 - Check Videos Cata");
		CatagoryItem.VideosCata(driver);

	}

	@Test(priority = 39)
	public void CheckVideosSubCata() throws Exception {
		test = extent.createTest("Test 39 - Check Videos SubCata");

		CatagoryItem.VideosSubCata(driver);
	}

	@Test(priority = 38)
	public void CheckExpressCata() throws Exception {
		test = extent.createTest("Test 38 - Check Express Cata");
		CatagoryItem.ExpressCata(driver);

	}

	@Test(priority = 39)
	public void CheckExpressSubCata() throws Exception {
		test = extent.createTest("Test 39 - Check Express SubCata");

		CatagoryItem.ExpressSubCata(driver);
	}

	@Test(priority = 41)
	public void CheckIVPicksLink() throws Exception {
		test = extent.createTest("Test 41 - Check IVPicks Link");
		CatagoryItem.IVPicks(driver);

	}

	@Test(priority = 47)
	public void CheckExplorePage() throws Exception {
		test = extent.createTest("Test 47 - Check Explore Page");
		CatagoryItem.ClickExplore(driver);
	}

	@Test(priority = 48)
	public void CheckRelationshipPage() throws Exception {
		test = extent.createTest("Test 48 - Check Relationship Page");
		CatagoryItem.ClickRelationship(driver);
	}

	@Test(priority = 49)
	public void CheckMotivationPage() throws Exception {
		test = extent.createTest("Test 49 - Check Motivation Page");
		CatagoryItem.ClickMotivation(driver);
	}

	@Test(priority = 50)
	public void CheckSocialIssuesPage() throws Exception {
		test = extent.createTest("Test 50 - Check SocialIssues Page");
		CatagoryItem.ClickSocialIssues(driver);
	}

	@Test(priority = 51)
	public void CheckOpenLetter0Page() throws Exception {
		test = extent.createTest("Test 51 - Check OpenLetter0 Page");
		CatagoryItem.ClickOpenLetter0(driver);

	}

	@Test(priority = 52)
	public void CheckPsychologyPage() throws Exception {
		test = extent.createTest("Test 52 - Check Psychology Page");
		CatagoryItem.ClickPsychology(driver);
	}

	@Test(priority = 53)
	public void CheckQuotesAndThoughtsPage() throws Exception {
		test = extent.createTest("Test 53 - Check Quotes And Thoughts Page");
		CatagoryItem.ClickQuotesAndThoughts(driver);
	}

	@Test(priority = 54)
	public void CheckPeoplePage() throws Exception {
		test = extent.createTest("Test 54 - Check People Page");
		CatagoryItem.ClickPeople(driver);
	}

	@Test(priority = 55)
	public void CheckTalesPage() throws Exception {
		test = extent.createTest("Test 55 - Check Tales Page");
		CatagoryItem.ClickTales(driver);
	}

	@Test(priority = 56)
	public void CheckShortTalesPage() throws Exception {
		test = extent.createTest("Test 56 - Check Tales Page");
		CatagoryItem.ClickShortStories(driver);
	}

//	@Test(priority = 57)
//	public void CheckLongTalesPage() throws Exception {
//		test = extent.createTest("Test 57 - Check SocialCelebrities Page");
//		CatagoryItem.ClickLongTales(driver);
//	}
//
//	@Test(priority = 58)
//	public void CheckOpenLetter1Page() throws Exception {
//		test = extent.createTest("Test 58 - Check Sports Page");
//		CatagoryItem.ClickOpenLetter1(driver);
//	}

	@Test(priority = 59)
	public void CheckOpinionPage() throws Exception {
		test = extent.createTest("Test 59 - Check Opinion Page");
		CatagoryItem.ClickOpinion(driver);
	}

	@Test(priority = 60)
	public void CheckPoemPage() throws Exception {
		test = extent.createTest("Test 60 - Check Poem Page");
		CatagoryItem.ClickPoem(driver);

	}

	@Test(priority = 61)
	public void CheckVideosPage() throws Exception {
		test = extent.createTest("Test 61 - Check Videos Page");
		CatagoryItem.ClickVideos(driver);

	}

	@Test(priority = 62)
	public void CheckUnheardPage() throws Exception {
		test = extent.createTest("Test 62 - Check Unheard Page");
		CatagoryItem.ClickUnheard(driver);

	}

	@Test(priority = 63)
	public void CheckShortStoriesPage() throws Exception {
		test = extent.createTest("Test 63 - Check ShortStories Page");
		CatagoryItem.ClickShortStories(driver);

	}

	@Test(priority = 64)
	public void CheckExpressPage() throws Exception {
		test = extent.createTest("Test 64 - Check Express Page");
		CatagoryItem.ClickExpress(driver);
	}

	@Test(priority = 65)
	public void CheckAskupPage() throws Exception {
		test = extent.createTest("Test 65 - Check Askup Page");
		CatagoryItem.ClickAskup(driver);

	}

	@Test(priority = 64)
	public void CheckAdvicePage() throws Exception {
		test = extent.createTest("Test 64 - Check Advice Page");
		CatagoryItem.ClickAdvice(driver);

	}

	@Test(priority = 65)
	public void CheckIVPicksPage() throws Exception {
		test = extent.createTest("Test 65 - Check IVPicks Page");
		CatagoryItem.ClickIVPicks(driver);

	}

}
