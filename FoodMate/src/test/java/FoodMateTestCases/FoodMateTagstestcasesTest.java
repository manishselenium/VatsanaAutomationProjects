package FoodMateTestCases;

import java.util.Properties;
import org.testng.annotations.Test;

import PagesOnFoodMate.FoodMateHomePage;
import PagesOnFoodMate.FoodMateTagsPage;
import UtilsOnFeed.ReadPropertiesFilefoodmate;


public class FoodMateTagstestcasesTest extends ReportGenerateFoodMate {

	static Properties properties = null;

	FoodMateHomePage DashboardItem = new FoodMateHomePage();

	FoodMateTagsPage obj = new FoodMateTagsPage();

	@Test(priority = 130)
	public void CheckSearchOption() throws Exception {
		ReadPropertiesFilefoodmate readConfigFile = new ReadPropertiesFilefoodmate();

		properties = readConfigFile.LoadPropertiess();

		driver.get("https://www.foodmate.me/tags");
		driver.manage().window().maximize();
		test = extent.createTest("Test 130 - Check Search Option");
		DashboardItem.SearchOption(driver);
	}

	@Test(priority = 131)
	public void CheckSearchTags() throws Exception {
		test = extent.createTest("Test 131 - Check Search Tags");
		obj.tags(driver);

	}

}
