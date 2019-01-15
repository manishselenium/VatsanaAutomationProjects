package DuniadigestTestCases;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import PagesOnDuniadigest.DuniadigestCatagoriesPage;
import UtilsOnFeed.ReadPropertiesFileDuniadigest;

public class DuniadigestCatagoiesTestCasesTest extends ReportGenerateDuniadigest {

	static Properties properties = null;

	DuniadigestCatagoriesPage CatagoryItem = new DuniadigestCatagoriesPage();

	@Test(priority = 33)
	public void ClickHamburgerMenu() throws Exception {

		ReadPropertiesFileDuniadigest readConfigFile = new ReadPropertiesFileDuniadigest();

		properties = readConfigFile.LoadPropertiess();

		driver.get(properties.getProperty("URL"));
		driver.manage().window().maximize();

		test = extent.createTest("Test 33 - Click hamburger menu");
		
		CatagoryItem.ClickHamburgerMenu(driver);

	}

	@Test(priority = 34)
	public void CheckNewsDigest() throws Exception {

		test = extent.createTest("Test 34 - Check News Digest");
	
		CatagoryItem.NewsDigestCata(driver);

	}

	@Test(priority = 35)
	public void CheckNewsDigestSubCata() throws Exception {
		test = extent.createTest("Test 36 - Check News Digest SubCata");
		CatagoryItem.NewsDigestSubCata(driver);
	}

	@Test(priority = 36)
	public void CheckLifeCata() throws Exception {
		test = extent.createTest("Test 37 - Check Life Cata");
		CatagoryItem.LifeCata(driver);

	}

	@Test(priority = 37)
	public void CheckLifeSubCata() throws Exception {
		test = extent.createTest("Test 38 - Check Life SubCata");
		CatagoryItem.LifeCataSub(driver);

	}

	@Test(priority = 38)
	public void CheckFilmyDuniaCata() throws Exception {
		test = extent.createTest("Test 38 - Check FilmyDunia Cata");
		CatagoryItem.FilmyDuniaCata(driver);
	}
	
	@Test(priority = 38)
	public void CheckFilmyDuniaSubCata() throws Exception {
		test = extent.createTest("Test 38 - Check FilmyDunia SubCata");
		CatagoryItem.FilmyDuniaSubCata(driver);
	}

	@Test(priority = 39)
	public void DharamParCharchaCata() throws Exception {
		test = extent.createTest("Test 38 - Dharam Par Charcha Cata");
		CatagoryItem.DharamParCharchaCata(driver);
	}

	@Test(priority = 40)
	public void CheckDharamParCharchaSubCata() throws Exception {
		test = extent.createTest("Test 37 - Check Dharam Par Charcha SubCata");
		CatagoryItem.DharamParCharchaSubCata(driver);

	}

	@Test(priority = 41)
	public void CheckMultiMediaCata() throws Exception {
		test = extent.createTest("Test 38 - Check MultiMedia Cata");
		CatagoryItem.MultiMediaCata(driver);
	}
	
	@Test(priority = 42)
	public void CheckMultiMediaSubCata() throws Exception {
		test = extent.createTest("Test 38 - Check MultiMedia SubCata");
		CatagoryItem.MultiMediaSubCata(driver);
	}

	@Test(priority = 43)
	public void CheckKhelKhiladiCata() throws Exception {
		test = extent.createTest("Test 38 - Check KhelKhiladi Cata");
		CatagoryItem.KhelKhiladiCata(driver);
	}
	
	@Test(priority = 44)
	public void CheckMathPachiCata() throws Exception {
		test = extent.createTest("Test 38 - Check MathPachi Cata");
		CatagoryItem.MathPachiCata(driver);
	}

	@Test(priority = 45)
	public void CheckNewsDigestPage() throws Exception {
		test = extent.createTest("Test 47 - Check News Digest Page");
		CatagoryItem.ClickNewsDigest(driver);
	}

	@Test(priority = 46)
	public void CheckKiseePage() throws Exception {
		test = extent.createTest("Test 48 - Check Kisee Page");
		CatagoryItem.ClickKisee(driver);
	}

	@Test(priority = 47)
	public void CheckApnaHindustanPage() throws Exception {
		test = extent.createTest("Test 49 - Check ApnaHindustan Page");
		CatagoryItem.ClickApnaHindustan(driver);
	}

	@Test(priority = 48)
	public void CheckFirangiPage() throws Exception {
		test = extent.createTest("Test 50 - Check Firangi Page");
		CatagoryItem.ClickFirangi(driver);
	}

	@Test(priority = 49)
	public void CheckSocialCharchaPage() throws Exception {
		test = extent.createTest("Test 51 - Check SocialCharcha Page");
		CatagoryItem.ClickSocialCharcha(driver);

	}

	@Test(priority = 50)
	public void CheckLifePage() throws Exception {
		test = extent.createTest("Test 52 - Check Life Page");
		CatagoryItem.ClickLife(driver);
	}

	@Test(priority = 51)
	public void CheckRahanSahanPage() throws Exception {
		test = extent.createTest("Test 54 - Check RahanSahan Page");
		CatagoryItem.ClickBestRahanSahan(driver);
	}

	@Test(priority = 52)
	public void CheckRelationshipPage() throws Exception {
		test = extent.createTest("Test 55 - Check Relationship Page");
		CatagoryItem.ClickRelationship(driver);
	}

	@Test(priority = 53)
	public void CheckHealthPage() throws Exception {
		test = extent.createTest("Test 56 - Check Health Page");
		CatagoryItem.ClickHealth(driver);
	}



	@Test(priority = 54)
	public void CheckTaknikPage() throws Exception {
		test = extent.createTest("Test 60 - Check Taknik Page");
		CatagoryItem.ClickTaknik(driver);

	}

	@Test(priority = 55)
	public void CheckHasithitoliPage() throws Exception {
		test = extent.createTest("Test 61 - Check Hasithitoli Page");
		CatagoryItem.ClickHasithitoli(driver);

	}


	@Test(priority = 56)
	public void CheckFilmyDuniaPage() throws Exception {
		test = extent.createTest("Test 65 - Check Filmy Dunia Page");
		CatagoryItem.ClickFilmyDunia(driver);

	}

	@Test(priority = 57)
	public void CheckSitareZaminPePage() throws Exception {
		test = extent.createTest("Test 64 - Check Sitare Zamin Pe Page");
		CatagoryItem.ClickSitareZaminPe(driver);

	}

	@Test(priority = 58)
	public void CheckChugalKhorCachiPage() throws Exception {
		test = extent.createTest("Test 65 - Check Chugal Khor Cachi Page");
		CatagoryItem.ClickChugalKhorCachi(driver);

	}

	@Test(priority = 59)
	public void CheckDharamParCharchaPage() throws Exception {
		test = extent.createTest("Test 65 - Check Dharam Par Charcha Page");
		CatagoryItem.ClickDharamParCharcha(driver);

	}

	@Test(priority = 60)
	public void CheckDharmikItihasPage() throws Exception {
		test = extent.createTest("Test 65 - Check Dharmik Itihas Page");
		CatagoryItem.ClickDharmikItihas(driver);

	}
	
	@Test(priority = 61)
	public void CheckMultiMediaPage() throws Exception {
		test = extent.createTest("Test 65 - Check MultiMedia Page");
		CatagoryItem.ClickMultiMedia(driver);

	}
	@Test(priority = 62)
	public void CheckVideoPage() throws Exception {
		test = extent.createTest("Test 65 - Check Video Page");
		CatagoryItem.ClickVideo(driver);

	}
	@Test(priority = 63)
	public void CheckInfoGraphicsPage() throws Exception {
		test = extent.createTest("Test 65 - Check InfoGraphics Page");
		CatagoryItem.ClickInfoGraphics(driver);

	}
	@Test(priority = 64)
	public void CheckKhelKhiladiPage() throws Exception {
		test = extent.createTest("Test 65 - Check KhelKhiladi Page");
		CatagoryItem.ClickKhelKhiladi(driver);

	}
	@Test(priority = 65)
	public void CheckMathPachiPage() throws Exception {
		test = extent.createTest("Test 65 - Check MathPachi Page");
		CatagoryItem.ClickMathPachi(driver);

	}

	

}
