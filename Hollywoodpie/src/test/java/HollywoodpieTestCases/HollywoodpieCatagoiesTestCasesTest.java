package HollywoodpieTestCases;

import java.util.Properties;
import org.testng.annotations.Test;

import PagesOnHollywoodpie.HollywoodpieCatagoriesPage;
import UtilsOnFeed.ReadPropertiesFileHealthiastic;

public class HollywoodpieCatagoiesTestCasesTest extends ReportGenerateHollywoodpie {

	static Properties properties = null;

	HollywoodpieCatagoriesPage CatagoryItem = new HollywoodpieCatagoriesPage();

	@Test(priority = 33)
	public void ClickHamburgerMenu() throws Exception {

		ReadPropertiesFileHealthiastic readConfigFile = new ReadPropertiesFileHealthiastic();

		properties = readConfigFile.LoadPropertiess();

		driver.get(properties.getProperty("URL"));
		driver.manage().window().maximize();

		test = extent.createTest("Test 33 - Click hamburger menu");
		CatagoryItem.ClickHamburgerMenu(driver);

	}

	@Test(priority = 35)
	public void CheckCelebrityCata() throws Exception {
		test = extent.createTest("Test 36 - Check Celebrity Cata");
		CatagoryItem.CelebrityCata(driver);
	}

	@Test(priority = 36)
	public void CheckMusicCata() throws Exception {
		test = extent.createTest("Test 37 - Check Music Cata");
		CatagoryItem.MusicCata(driver);

	}

	@Test(priority = 37)
	public void CheckFilmCata() throws Exception {
		test = extent.createTest("Test 38 - Check Film Cata");
		CatagoryItem.FilmCata(driver);

	}

	@Test(priority = 39)
	public void CheckCelebrityPage() throws Exception {
		test = extent.createTest("Test 47 - Check Celebrity Page");
		CatagoryItem.ClickCelebrity(driver);
	}

	@Test(priority = 40)
	public void CheckMusicPage() throws Exception {
		test = extent.createTest("Test 48 - Check Music Page");
		CatagoryItem.ClickMusic(driver);
	}

	@Test(priority = 41)
	public void CheckFilmPage() throws Exception {
		test = extent.createTest("Test 49 - Check Film Page");
		CatagoryItem.ClickFilm(driver);
	}

}
