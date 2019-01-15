package FoodMateTestCases;

import java.util.Properties;
import org.testng.annotations.Test;

import PagesOnFoodMate.FoodMateCatagoriesPage;
import UtilsOnFeed.ReadPropertiesFilefoodmate;

public class FoodMateCatagoiesTestCasesTest extends ReportGenerateFoodMate {

	static Properties properties = null;

	FoodMateCatagoriesPage CatagoryItem = new FoodMateCatagoriesPage();

	@Test(priority = 33)
    public void ClickHamburgerMenu() throws Exception {

		ReadPropertiesFilefoodmate readConfigFile = new ReadPropertiesFilefoodmate();

		properties = readConfigFile.LoadPropertiess();

		driver.get(properties.getProperty("URL"));
		driver.manage().window().maximize();

		test = extent.createTest("Test 33 - Click hamburger menu");
		CatagoryItem.ClickHamburgerMenu(driver);

	}
    
	@Test(priority = 34)
	public void CheckRecipes() throws Exception {

		test = extent.createTest("Test 34 - Check Recipes");
		CatagoryItem.RecipesCata(driver);

	}

	@Test(priority = 35)
	public void CheckRecipesSubCata() throws Exception {
		test = extent.createTest("Test 35 - Check Recipes SubCata");
		CatagoryItem.RecipesSubCata(driver);
	}

	@Test(priority = 36)
	public void CheckCultureCata() throws Exception {
		test = extent.createTest("Test 36 - Check Culture Cata");
		CatagoryItem.CultureCata(driver);

	}

	@Test(priority = 37)
	public void CheckCultureSubCata() throws Exception {
		test = extent.createTest("Test 37 - Check Culture SubCata");
		CatagoryItem.CultureSubCata(driver);

	}

	@Test(priority = 38)
	public void CheckTipsAndTricksCata() throws Exception {
		test = extent.createTest("Test 38 - Check Tips And Tricks Cata");
		CatagoryItem.TipsAndTricksCata(driver);

	}

	@Test(priority = 39)
	public void CheckTipsAndTricksSubCata() throws Exception {
		test = extent.createTest("Test 39 - Check Tips And Tricks SubCata");

		CatagoryItem.TipsAndTricksSubCata(driver);
	}
	
	@Test(priority = 38)
	public void CheckFoodFunCata() throws Exception {
		test = extent.createTest("Test 38 - Check Food Fun Cata");
		CatagoryItem.FoodFunCata(driver);

	}

	@Test(priority = 39)
	public void CheckFoodFunSubCata() throws Exception {
		test = extent.createTest("Test 39 - Check Food Fun SubCata");

		CatagoryItem.FoodFunSubCata(driver);
	}

	@Test(priority = 40)
	public void CheckVideosCata() throws Exception {
		test = extent.createTest("Test 40 - Check Videos Cata");
		CatagoryItem.VideosCata(driver);

	}

	

	@Test(priority = 46)
	public void CheckRecipesPage() throws Exception {
		test = extent.createTest("Test 46 - Check Recipes Page");
		CatagoryItem.ClickRecipes(driver);

	}

	@Test(priority = 47)
	public void CheckMainCoursePage() throws Exception {
		test = extent.createTest("Test 47 - Check Main Course Page");
		CatagoryItem.ClickMainCourse(driver);
	}

	@Test(priority = 48)
	public void CheckDessertsPage() throws Exception {
		test = extent.createTest("Test 48 - Check Desserts Page");
		CatagoryItem.ClickDesserts(driver);
	}

	@Test(priority = 49)
	public void CheckQuickBitesPage() throws Exception {
		test = extent.createTest("Test 49 - Check Quick Bites Page");
		CatagoryItem.ClickQuickBites(driver);
	}

	@Test(priority = 50)
	public void CheckSoupsAndSaladsPage() throws Exception {
		test = extent.createTest("Test 50 - Check Soups And Salads Page");
		CatagoryItem.ClickSoupsAndSalads(driver);
	}

	@Test(priority = 51)
	public void CheckCuisinesPage() throws Exception {
		test = extent.createTest("Test 51 - Check Cuisines Page");
		CatagoryItem.ClickCuisines(driver);

	}

	@Test(priority = 52)
	public void CheckDrinksAndBeveragesPage() throws Exception {
		test = extent.createTest("Test 52 - Check Drinks And Beverages Page");
		CatagoryItem.ClickDrinksAndBeverages(driver);
	}

	@Test(priority = 53)
	public void CheckCulturePage() throws Exception {
		test = extent.createTest("Test 53 - Check Culture Page");
		CatagoryItem.ClickCulture(driver);
	}

	@Test(priority = 54)
	public void CheckWeirdFactsPage() throws Exception {
		test = extent.createTest("Test 54 - Check Weird Facts Page");
		CatagoryItem.ClickWeirdFacts(driver);
	}

	@Test(priority = 55)
	public void CheckFamousDishesPage() throws Exception {
		test = extent.createTest("Test 55 - Check Famous Dishes Page");
		CatagoryItem.ClickFamousDishes(driver);
	}

	@Test(priority = 56)
	public void CheckWhatToHavePage() throws Exception {
		test = extent.createTest("Test 56 - Check What To Have Page");
		CatagoryItem.ClickWhatToHave(driver);
	}

	@Test(priority = 57)
	public void CheckTipsAndTricksPage() throws Exception {
		test = extent.createTest("Test 57 - Check Tips And Tricks Page");
		CatagoryItem.ClickTipsAndTricks(driver);
	}

	@Test(priority = 58)
	public void CheckKitchenHacksPage() throws Exception {
		test = extent.createTest("Test 58 - Check Kitchen Hacks Page");
		CatagoryItem.ClickKitchenHacks(driver);
	}

	@Test(priority = 59)
	public void CheckFoodTipsPage() throws Exception {
		test = extent.createTest("Test 59 - Check FoodTips Page");
		CatagoryItem.ClickFoodTips(driver);
	}

	@Test(priority = 60)
	public void CheckHealthTipsPage() throws Exception {
		test = extent.createTest("Test 60 - Check HealthTips Page");
		CatagoryItem.ClickHealthTips(driver);

	}

	@Test(priority = 61)
	public void CheckFoodFunPage() throws Exception {
		test = extent.createTest("Test 61 - Check FoodFun Page");
		CatagoryItem.ClickFoodFun(driver);

	}

	@Test(priority = 62)
	public void CheckQuizPage() throws Exception {
		test = extent.createTest("Test 62 - Check Quiz Page");
		CatagoryItem.ClickQuiz(driver);

	}

	@Test(priority = 63)
	public void CheckFoodMemesPage() throws Exception {
		test = extent.createTest("Test 63 - Check FoodMemes Page");
		CatagoryItem.ClickFoodMemes(driver);

	}

	@Test(priority = 64)
	public void CheckVideosPage() throws Exception {
		test = extent.createTest("Test 64 - Check Videos Page");
		CatagoryItem.ClickVideos(driver);

	}}

