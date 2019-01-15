package PagesOnFoodMate;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import UtilsOnFeed.WrapperGenericMethod;


public class FoodMateCatagoriesPage {

	By HomePageLogo = By.cssSelector(".brand-logo > svg:nth-child(1)");
	By HamburgerMenu = By.cssSelector(".navSide-logo > a:nth-child(1) > svg:nth-child(1)");
    
	By Recipes = By.cssSelector("li.vtpl_listMenu__section:nth-child(1) > a:nth-child(1)");
    By MainCourse = By.cssSelector("li.vtpl_listMenu__section:nth-child(1) > ul:nth-child(2) > li:nth-child(1) > a:nth-child(1)");
    By Desserts = By.cssSelector("li.vtpl_listMenu__section:nth-child(1) > ul:nth-child(2) > li:nth-child(2) > a:nth-child(1)");
    By QuickBites = By.cssSelector("li.vtpl_listMenu__section:nth-child(1) > ul:nth-child(2) > li:nth-child(3) > a:nth-child(1)");
    By SoupsAndSalads = By.cssSelector("li.vtpl_listMenu__section:nth-child(1) > ul:nth-child(2) > li:nth-child(4) > a:nth-child(1)");
   By Cuisines= By.cssSelector("li.vtpl_listMenu__section:nth-child(1) > ul:nth-child(2) > li:nth-child(5) > a:nth-child(1)");
   By DrinksAndBeverages = By.cssSelector("li.vtpl_listMenu__section:nth-child(1) > ul:nth-child(2) > li:nth-child(6) > a:nth-child(1)");
    
    By Culture = By.cssSelector("li.vtpl_listMenu__section:nth-child(2) > a:nth-child(1)");
    By WeirdFacts = By.cssSelector("li.vtpl_listMenu__section:nth-child(2) > ul:nth-child(2) > li:nth-child(1) > a:nth-child(1)");
    By FamousDishes= By.cssSelector("li.vtpl_listMenu__section:nth-child(2) > ul:nth-child(2) > li:nth-child(2) > a:nth-child(1)");
    By WhatToHave = By.cssSelector("li.vtpl_listMenu__section:nth-child(2) > ul:nth-child(2) > li:nth-child(3) > a:nth-child(1)");
    
   By TipsAndTricks = By.cssSelector("li.vtpl_listMenu__section:nth-child(3) > a:nth-child(1)");
    By KitchenHacks = By.cssSelector("li.vtpl_listMenu__section:nth-child(3) > ul:nth-child(2) > li:nth-child(1) > a:nth-child(1)");
    By FoodTips = By.cssSelector("li.vtpl_listMenu__section:nth-child(3) > ul:nth-child(2) > li:nth-child(2) > a:nth-child(1)");
     By HealthTips = By.cssSelector("li.vtpl_listMenu__section:nth-child(3) > ul:nth-child(2) > li:nth-child(3) > a:nth-child(1)");

     By FoodFun = By.cssSelector("li.vtpl_listMenu__section:nth-child(4) > a:nth-child(1)");
   By Quiz = By.cssSelector("li.vtpl_listMenu__section:nth-child(4) > ul:nth-child(2) > li:nth-child(1) > a:nth-child(1)");
    By FoodMemes = By.cssSelector("li.vtpl_listMenu__section:nth-child(4) > ul:nth-child(2) > li:nth-child(2) > a:nth-child(1)");
   By Videos = By.cssSelector("li.vtpl_listMenu__section:nth-child(5) > a:nth-child(1)");

	WrapperGenericMethod Action = new WrapperGenericMethod();


	public void ClickHamburgerMenu(WebDriver driver) {

		Action.Click(driver, HamburgerMenu);
	}

	public void RecipesCata(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(Recipes);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(Recipes).size();
		Assert.assertEquals(Element, 1);
	}

	public void RecipesSubCata(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(MainCourse);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(MainCourse).size();
		Assert.assertEquals(Element, 1);
	}

	public void CultureCata(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(Culture);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(Culture).size();
		Assert.assertEquals(Element, 1);
	}

	public void CultureSubCata(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(WeirdFacts);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(WeirdFacts).size();
		Assert.assertEquals(Element, 1);
	}

	public void TipsAndTricksCata(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(TipsAndTricks);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(TipsAndTricks).size();
		Assert.assertEquals(Element, 1);
	}

	
	public void TipsAndTricksSubCata(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(KitchenHacks);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(KitchenHacks).size();
		Assert.assertEquals(Element, 1);
	}

	public void FoodFunCata(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(FoodFun);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(FoodFun).size();
		Assert.assertEquals(Element, 1);
	}

	public void FoodFunSubCata(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(Quiz);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(Quiz).size();
		Assert.assertEquals(Element, 1);
	}

	public void VideosCata(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(Videos);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(Videos).size();
		Assert.assertEquals(Element, 1);
	}
	
	
	public void ClickRecipes(WebDriver driver) throws InterruptedException {
		
		WebElement element1 = driver.findElement(Recipes);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Recipes);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.foodmate.me/recipes");
		
		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
		

	}

	public void ClickMainCourse(WebDriver driver) throws InterruptedException {
		
		WebElement element1 = driver.findElement(MainCourse);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, MainCourse);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.foodmate.me/recipes/main-course");
		
		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void ClickDesserts(WebDriver driver) throws InterruptedException {
		
		WebElement element1 = driver.findElement(Desserts);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Desserts);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.foodmate.me/recipes/desserts");
		
		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void ClickQuickBites(WebDriver driver) throws InterruptedException {
		
		WebElement element1 = driver.findElement(QuickBites);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, QuickBites);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.foodmate.me/recipes/quick-bites");
		
		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void ClickSoupsAndSalads(WebDriver driver) throws InterruptedException {
		
		WebElement element1 = driver.findElement(SoupsAndSalads);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, SoupsAndSalads);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.foodmate.me/recipes/soups-salads");
		
		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void ClickCuisines(WebDriver driver) throws InterruptedException {
		
		WebElement element1 = driver.findElement(Cuisines);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Cuisines);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.foodmate.me/recipes/cuisines");
		
		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void ClickDrinksAndBeverages(WebDriver driver) throws InterruptedException {
		
		WebElement element1 = driver.findElement(DrinksAndBeverages);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, DrinksAndBeverages);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.foodmate.me/recipes/drinks-beverages");
		
		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void ClickCulture(WebDriver driver) throws InterruptedException {
		
		WebElement element1 = driver.findElement(Culture);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Culture);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.foodmate.me/culture");
		
		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void ClickWeirdFacts(WebDriver driver) throws InterruptedException {
		
		WebElement element1 = driver.findElement(WeirdFacts);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, WeirdFacts);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.foodmate.me/culture/weird-facts");
		
		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void ClickFamousDishes(WebDriver driver) throws InterruptedException {
		
		WebElement element1 = driver.findElement(FamousDishes);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, FamousDishes);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.foodmate.me/culture/famous-dishes");
		
		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}
	
	public void ClickWhatToHave(WebDriver driver) throws InterruptedException {
		
		WebElement element1 = driver.findElement(WhatToHave);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, WhatToHave);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.foodmate.me/culture/what-to-have");
		
		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void ClickTipsAndTricks(WebDriver driver) throws InterruptedException {
		
		WebElement element1 = driver.findElement(TipsAndTricks);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, TipsAndTricks);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.foodmate.me/tips-tricks");
		
		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void ClickKitchenHacks(WebDriver driver) throws InterruptedException {
		
		WebElement element1 = driver.findElement(KitchenHacks);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, KitchenHacks);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.foodmate.me/tips-tricks/kitchen-hacks");
		
		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void ClickFoodTips(WebDriver driver) throws InterruptedException {
		
		WebElement element1 = driver.findElement(FoodTips);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, FoodTips);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.foodmate.me/tips-tricks/food-tips");
		
		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void ClickHealthTips(WebDriver driver) throws InterruptedException {
		
		WebElement element1 = driver.findElement(HealthTips);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, HealthTips);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.foodmate.me/tips-tricks/health-tips");
		
		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void ClickFoodFun(WebDriver driver) throws InterruptedException {
		
		WebElement element1 = driver.findElement(FoodFun);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, FoodFun);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.foodmate.me/food-fun");
		
		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void ClickQuiz(WebDriver driver) throws InterruptedException {
		
		WebElement element1 = driver.findElement(Quiz);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Quiz);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.foodmate.me/food-fun/quiz");
		
		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}



	public void ClickFoodMemes(WebDriver driver) throws InterruptedException {
		
		WebElement element1 = driver.findElement(FoodMemes);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, FoodMemes);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.foodmate.me/food-fun/food-memes");
		
		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
		
	}
	
public void ClickVideos(WebDriver driver) throws InterruptedException {
		
		WebElement element1 = driver.findElement(Videos);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Videos);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.foodmate.me/videos");
		
		Action.Click(driver, HomePageLogo);
		
	}

}
