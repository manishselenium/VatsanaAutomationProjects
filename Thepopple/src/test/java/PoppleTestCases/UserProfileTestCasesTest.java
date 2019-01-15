package PoppleTestCases;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PopplePages.UserProfilePage;
import PoppleUtils.ReadPropertiesFilesPopple;

public class UserProfileTestCasesTest extends ReportGenerateThePoopleTest {

	static Properties properties = null;

//	WebDriver driver = new ChromeDriver();
//	String st = System.setProperty("webdriver.chrome.driver", "chromedriver");

	UserProfilePage obj = new UserProfilePage();

//	@BeforeTest
//	public void OpenBrowser() throws IOException {
//
//		ReadPropertiesFilesPopple readConfigFile = new ReadPropertiesFilesPopple();
//
//		properties = readConfigFile.LoadPropertiess();
//		driver.get(properties.getProperty("URL"));
//		driver.manage().window().maximize();
//
//	}

	@Test(priority = 123)
	public void ClickAuthorName() throws IOException {

		ReadPropertiesFilesPopple readConfigFile = new ReadPropertiesFilesPopple();

		properties = readConfigFile.LoadPropertiess();
		driver.get(properties.getProperty("URL"));
		driver.manage().window().maximize();
		test = extent.createTest("Test 123 - Click Author Name");
		obj.ClickAuthorName(driver);

	}

	@Test(priority = 124)
	public void CheckBackgroundImage() {

		test = extent.createTest("Test 124 - Check Background Image");
		obj.BackgroundImage(driver);

	}

	@Test(priority = 125)
	public void CheckAuthorName() {

		test = extent.createTest("Test 125 - Check Author Name");
		obj.AuthorName(driver);

	}

	@Test(priority = 126)
	public void CheckAuthorImage() {
		test = extent.createTest("Test 126 - Check Author Image");
		obj.AuthorImage(driver);

	}

	@Test(priority = 127)
	public void CheckWriterName() {

		test = extent.createTest("Test 127 - Check Writer Name");
		obj.WriterName(driver);
	}

	@Test(priority = 128)
	public void CheckEditor() {
		test = extent.createTest("Test 128 - Check Editor");
		obj.Editor(driver);

	}

//	@Test(priority = 7)
//	public void CheckFacebookLink() {
//		test = extent.createTest("Test 1 - Check Facebook Link");
//		
//		
//		obj.FacebookLink(driver);
//
//	}
//
//	@Test(priority = 8)
//	public void CheckTwitterLink() {
//		test = extent.createTest("Test 1 - Check Twitter Link");
//		obj.TwitterLink(driver);
//
//	}
//
//	@Test(priority = 9)
//	public void CheckLinkedinLink() {
//		test = extent.createTest("Test 1 - Check Linkedin Link");
//		obj.LinkedinLink(driver);
//
//	}

//	@Test(priority = 129)
//	public void CheckProfileDesc() {
//		test = extent.createTest("Test 129 - Check Profile Desc");
//		obj.ProfileDesc(driver);
//	}
//
//	@Test(priority = 130)
//	public void CheckDontMissThisStory() {
//
//		test = extent.createTest("Test 130 - Check Dont Miss This Story");
//		obj.DontMissThisStory(driver);
//
//	}
//
//	@Test(priority = 131)
//	public void LatestStories() {
//
//		test = extent.createTest("Test 131 - Latest Stories");
//		obj.LatestStories(driver);
//
//	}

}
