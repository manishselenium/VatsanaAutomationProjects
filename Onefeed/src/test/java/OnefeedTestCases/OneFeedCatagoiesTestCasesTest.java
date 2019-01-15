package OnefeedTestCases;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import PagesOnOnefeed.OneFeedCatagoriesPage;
import UtilsOnFeed.ReadPropertiesFileOneFeed;

public class OneFeedCatagoiesTestCasesTest extends ReportGenerateOnefeed {

	static Properties properties = null;

	OneFeedCatagoriesPage CatagoryItem = new OneFeedCatagoriesPage();

	@Test(priority = 1)
	public void ClickHamburgerMenu() throws Exception {

		ReadPropertiesFileOneFeed readConfigFile = new ReadPropertiesFileOneFeed();

		properties = readConfigFile.LoadPropertiess();

		driver.get(properties.getProperty("URL"));
		driver.manage().window().maximize();
		
		Thread.sleep(5000);

		test = extent.createTest("Test 33 - Click hamburger menu");
		CatagoryItem.ClickHamburgerMenu(driver);

	}

	@Test(priority = 2)
	public void CheckNewsPage() throws Exception {
		test = extent.createTest("Test 47 - Check News Page");
		CatagoryItem.ClickNews(driver);
	}

//	@Test(priority = 46)
//	public void CheckKiseePage() throws Exception {
//		test = extent.createTest("Test 48 - Check Kisee Page");
//		CatagoryItem.ClickKisee(driver);
//	}
//
//	@Test(priority = 47)
//	public void CheckApnaHindustanPage() throws Exception {
//		test = extent.createTest("Test 49 - Check ApnaHindustan Page");
//		CatagoryItem.ClickApnaHindustan(driver);
//	}
//
//	@Test(priority = 48)
//	public void CheckFirangiPage() throws Exception {
//		test = extent.createTest("Test 50 - Check Firangi Page");
//		CatagoryItem.ClickFirangi(driver);
//	}
//
//	@Test(priority = 49)
//	public void CheckSocialCharchaPage() throws Exception {
//		test = extent.createTest("Test 51 - Check SocialCharcha Page");
//		CatagoryItem.ClickSocialCharcha(driver);
//
//	}
//
//	@Test(priority = 50)
//	public void CheckLifePage() throws Exception {
//		test = extent.createTest("Test 52 - Check Life Page");
//		CatagoryItem.ClickLife(driver);
//	}
//
//	@Test(priority = 51)
//	public void CheckRahanSahanPage() throws Exception {
//		test = extent.createTest("Test 54 - Check RahanSahan Page");
//		CatagoryItem.ClickBestRahanSahan(driver);
//	}
//
//	@Test(priority = 52)
//	public void CheckRelationshipPage() throws Exception {
//		test = extent.createTest("Test 55 - Check Relationship Page");
//		CatagoryItem.ClickRelationship(driver);
//	}
//
//	@Test(priority = 53)
//	public void CheckHealthPage() throws Exception {
//		test = extent.createTest("Test 56 - Check Health Page");
//		CatagoryItem.ClickHealth(driver);
//	}
//
//
//
//	@Test(priority = 54)
//	public void CheckTaknikPage() throws Exception {
//		test = extent.createTest("Test 60 - Check Taknik Page");
//		CatagoryItem.ClickTaknik(driver);
//
//	}
//
//	@Test(priority = 55)
//	public void CheckHasithitoliPage() throws Exception {
//		test = extent.createTest("Test 61 - Check Hasithitoli Page");
//		CatagoryItem.ClickHasithitoli(driver);
//
//	}
//
//
//	@Test(priority = 56)
//	public void CheckFilmyDuniaPage() throws Exception {
//		test = extent.createTest("Test 65 - Check Filmy Dunia Page");
//		CatagoryItem.ClickFilmyDunia(driver);
//
//	}
//
//	@Test(priority = 57)
//	public void CheckSitareZaminPePage() throws Exception {
//		test = extent.createTest("Test 64 - Check Sitare Zamin Pe Page");
//		CatagoryItem.ClickSitareZaminPe(driver);
//
//	}
//
//	@Test(priority = 58)
//	public void CheckChugalKhorCachiPage() throws Exception {
//		test = extent.createTest("Test 65 - Check Chugal Khor Cachi Page");
//		CatagoryItem.ClickChugalKhorCachi(driver);
//
//	}
//
//	@Test(priority = 59)
//	public void CheckDharamParCharchaPage() throws Exception {
//		test = extent.createTest("Test 65 - Check Dharam Par Charcha Page");
//		CatagoryItem.ClickDharamParCharcha(driver);
//
//	}
//
//	@Test(priority = 60)
//	public void CheckDharmikItihasPage() throws Exception {
//		test = extent.createTest("Test 65 - Check Dharmik Itihas Page");
//		CatagoryItem.ClickDharmikItihas(driver);
//
//	}
//	
//	@Test(priority = 61)
//	public void CheckMultiMediaPage() throws Exception {
//		test = extent.createTest("Test 65 - Check MultiMedia Page");
//		CatagoryItem.ClickMultiMedia(driver);
//
//	}
//	@Test(priority = 62)
//	public void CheckVideoPage() throws Exception {
//		test = extent.createTest("Test 65 - Check Video Page");
//		CatagoryItem.ClickVideo(driver);
//
//	}
//	@Test(priority = 63)
//	public void CheckInfoGraphicsPage() throws Exception {
//		test = extent.createTest("Test 65 - Check InfoGraphics Page");
//		CatagoryItem.ClickInfoGraphics(driver);
//
//	}
//	@Test(priority = 64)
//	public void CheckKhelKhiladiPage() throws Exception {
//		test = extent.createTest("Test 65 - Check KhelKhiladi Page");
//		CatagoryItem.ClickKhelKhiladi(driver);
//
//	}
//	@Test(priority = 65)
//	public void CheckMathPachiPage() throws Exception {
//		test = extent.createTest("Test 65 - Check MathPachi Page");
//		CatagoryItem.ClickMathPachi(driver);
//
//	}

	

}
