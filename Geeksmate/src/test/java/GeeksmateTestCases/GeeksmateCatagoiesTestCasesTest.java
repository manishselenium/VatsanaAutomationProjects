package GeeksmateTestCases;

import java.util.Properties;
import org.testng.annotations.Test;
import PagesOnGeeksmate.GeeksmateCatagoriesPage;
import UtilsOnFeed.ReadPropertiesFileGeeksmate;

public class GeeksmateCatagoiesTestCasesTest extends ReportGenerateGeeksmate {

	static Properties properties = null;

	GeeksmateCatagoriesPage CatagoryItem = new GeeksmateCatagoriesPage();

	@Test(priority = 33)
	public void ClickHamburgerMenu() throws Exception {

		ReadPropertiesFileGeeksmate readConfigFile = new ReadPropertiesFileGeeksmate();

		properties = readConfigFile.LoadPropertiess();

		driver.get(properties.getProperty("URL"));
		driver.manage().window().maximize();

		test = extent.createTest("Test 33 - Click hamburger menu");
		CatagoryItem.ClickHamburgerMenu(driver);

	}

	@Test(priority = 34)
	public void CheckNewsCata() throws Exception {

		test = extent.createTest("Test 34 - Check News Cata");
		CatagoryItem.NewsCata(driver);

	}

	@Test(priority = 35)
	public void CheckGadgetsCata() throws Exception {
		test = extent.createTest("Test 36 - Check Gadgets Cata");
		CatagoryItem.GadgetsCata(driver);
	}

	@Test(priority = 36)
	public void CheckGadgetsSubCata() throws Exception {
		test = extent.createTest("Test 37 - Check Gadgets SubCata");
		CatagoryItem.GadgetsSubCata(driver);

	}

	@Test(priority = 37)
	public void CheckReviewsCata() throws Exception {
		test = extent.createTest("Test 38 - Check Reviews Cata");
		CatagoryItem.ReviewsCata(driver);

	}

	@Test(priority = 39)
	public void BestInternetReadsCata() throws Exception {
		test = extent.createTest("Test 38 - Best InternetReads Cata");
		CatagoryItem.InternetReadsCata(driver);
	}

	@Test(priority = 40)
	public void CheckInternetReadsSubCata() throws Exception {
		test = extent.createTest("Test 37 - Check InternetReads SubCata");
		CatagoryItem.InternetReadsSubCata(driver);

	}

	@Test(priority = 41)
	public void CheckVideosCata() throws Exception {
		test = extent.createTest("Test 38 - Check Videos Cata");
		CatagoryItem.VideosCata(driver);
	}

	@Test(priority = 42)
	public void CheckQUIZCata() throws Exception {
		test = extent.createTest("Test 38 - Check QUIZ Cata");
		CatagoryItem.QUIZCata(driver);
	}

	@Test(priority = 43)
	public void CheckNewsPage() throws Exception {
		test = extent.createTest("Test 47 - Check News Page");
		CatagoryItem.ClickNews(driver);
	}

	@Test(priority = 44)
	public void CheckGadgetsPage() throws Exception {
		test = extent.createTest("Test 48 - Check Gadgets Page");
		CatagoryItem.ClickGadgets(driver);
	}

	@Test(priority = 45)
	public void CheckSmartPhonesPage() throws Exception {
		test = extent.createTest("Test 49 - Check Smart Phones Page");
		CatagoryItem.ClickSmartPhones(driver);
	}

	@Test(priority = 46)
	public void CheckLaptopPage() throws Exception {
		test = extent.createTest("Test 50 - Check Laptop Page");
		CatagoryItem.ClickLaptop(driver);
	}

	@Test(priority = 47)
	public void CheckCamerasPage() throws Exception {
		test = extent.createTest("Test 51 - Check Cameras Page");
		CatagoryItem.ClickCameras(driver);

	}

	@Test(priority = 48)
	public void CheckMorePage() throws Exception {
		test = extent.createTest("Test 52 - Check More Page");
		CatagoryItem.ClickMore(driver);
	}

	@Test(priority = 49)
	public void CheckReviewsPage() throws Exception {
		test = extent.createTest("Test 54 - Check Reviews Page");
		CatagoryItem.ClickReviews(driver);
	}

	@Test(priority = 51)
	public void CheckInternetReadsPage() throws Exception {
		test = extent.createTest("Test 56 - Check InternetReads Page");
		CatagoryItem.ClickInternetReads(driver);
	}

	@Test(priority = 60)
	public void CheckHowToPage() throws Exception {
		test = extent.createTest("Test 60 - Check HowTo Page");
		CatagoryItem.ClickHowTo(driver);

	}

	@Test(priority = 61)
	public void CheckGamingPage() throws Exception {
		test = extent.createTest("Test 61 - Check Gaming Page");
		CatagoryItem.ClickGaming(driver);

	}

	@Test(priority = 63)
	public void CheckSciencePage() throws Exception {
		test = extent.createTest("Test 63 - Check Science Page");
		CatagoryItem.ClickScience(driver);
	}

	@Test(priority = 65)
	public void CheckappsPage() throws Exception {
		test = extent.createTest("Test 65 - Check apps Page");
		CatagoryItem.Clickapps(driver);

	}

	@Test(priority = 64)
	public void CheckMoviesAndTVPage() throws Exception {
		test = extent.createTest("Test 64 - Check Movies And TV Page");
		CatagoryItem.ClickMoviesAndTV(driver);

	}

	@Test(priority = 65)
	public void CheckPCSPage() throws Exception {
		test = extent.createTest("Test 65 - Check PCS Page");
		CatagoryItem.ClickPCS(driver);

	}

	@Test(priority = 65)
	public void CheckVideosPage() throws Exception {
		test = extent.createTest("Test 65 - Check Videos Page");
		CatagoryItem.ClickVideos(driver);

	}

	@Test(priority = 65)
	public void CheckQUIZPage() throws Exception {
		test = extent.createTest("Test 65 - Check QUIZ Page");
		CatagoryItem.ClickQUIZ(driver);

	}

}
