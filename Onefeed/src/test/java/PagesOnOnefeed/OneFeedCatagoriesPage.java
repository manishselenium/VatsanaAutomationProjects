package PagesOnOnefeed;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import UtilsOnFeed.WrapperGenericMethod;

public class OneFeedCatagoriesPage {

	By HomePageLogo = By.cssSelector(".brand-logo > img:nth-child(1)");
	By HamburgerMenu = By.xpath("//a[@id='slidelink']");
	                                   
	By ClickArrow = By.cssSelector("li.vtpl_listMenu__section:nth-child(1) > div:nth-child(1) > img:nth-child(2)");
	By News = By.cssSelector("li.vtpl_listMenu__section:nth-child(1) > div:nth-child(1) > a:nth-child(1)");
	By Politics = By.cssSelector(".subcattext");
	By ArtsAndEntertainment = By.cssSelector("li.vtpl_listMenu__section:nth-child(2) > div:nth-child(1) > a:nth-child(1)");
	By Movies = By.cssSelector("#subCatdiv > li:nth-child(1) > a:nth-child(1)");
	By TvAndVideo = By.cssSelector("#subCatdiv > li:nth-child(2) > a:nth-child(1)");
	By Humor = By.cssSelector("#subCatdiv > li:nth-child(3) > a:nth-child(1)");
	By PeopleAndSociety = By.cssSelector("li.vtpl_listMenu__section:nth-child(3) > div:nth-child(1) > a:nth-child(1)");
	By FamilyAndRelationships = By.cssSelector("#subCatdiv > li:nth-child(1) > a:nth-child(1)");
	By ReligionAndBelife = By.cssSelector("#subCatdiv > li:nth-child(2) > a:nth-child(1)");
	By SociaIssuesAndAdvocacy = By.cssSelector("#subCatdiv > li:nth-child(3) > a:nth-child(1)");
	By Sports = By.cssSelector("li.vtpl_listMenu__section:nth-child(4) > div:nth-child(1) > a:nth-child(1)");
	By TeamSports = By.xpath(".subcattext");
	By ComputerAndElectronics = By.cssSelector("li.vtpl_listMenu__section:nth-child(5) > div:nth-child(1) > a:nth-child(1)");
	By ConsumerElectronics = By.cssSelector("#subCatdiv > li:nth-child(1) > a:nth-child(1)");
	By computerHardware = By.cssSelector("#subCatdiv > li:nth-child(2) > a:nth-child(1)");
	By Software = By.cssSelector("#subCatdiv > li:nth-child(3) > a:nth-child(1)");
	By LawAndGovernment = By.cssSelector("li.vtpl_listMenu__section:nth-child(6) > div:nth-child(1) > a:nth-child(1)");
	By Government = By.cssSelector("#subCatdiv > li:nth-child(1) > a:nth-child(1)");
	By Legal = By.cssSelector("#subCatdiv > li:nth-child(2) > a:nth-child(1)");
	By PublicSafety = By.cssSelector("#subCatdiv > li:nth-child(3) > a:nth-child(1)");
	By FoodAndDrink = By.cssSelector("li.vtpl_listMenu__section:nth-child(7) > div:nth-child(1) > a:nth-child(1)");
	By CookingAndRecipes = By.cssSelector("#subCatdiv > li:nth-child(1) > a:nth-child(1)");
	By Food = By.cssSelector("#subCatdiv > li:nth-child(2) > a:nth-child(1)");
	By Beverages = By.cssSelector("#subCatdiv > li:nth-child(3) > a:nth-child(1)");
	By Health = By.cssSelector("li.vtpl_listMenu__section:nth-child(8) > div:nth-child(1) > a:nth-child(1)");
	By HealthConditions = By.cssSelector("#subCatdiv > li:nth-child(1) > a:nth-child(1)");
	By Nutrition = By.cssSelector("#subCatdiv > li:nth-child(2) > a:nth-child(1)");
	By ReproductiveHealth = By.cssSelector("#subCatdiv > li:nth-child(3) > a:nth-child(1)");
	By HobbiesAndLeisure = By.cssSelector("li.vtpl_listMenu__section:nth-child(9) > div:nth-child(1) > a:nth-child(1)");
	By SpecialOccasions = By.cssSelector(".subcattext");
	By InternetAndTelecom = By.cssSelector("i.vtpl_listMenu__section:nth-child(10) > div:nth-child(1) > a:nth-child(1)");
	By MobileAndWireless = By.cssSelector("#subCatdiv > li:nth-child(1) > a:nth-child(1)");
	By EmailAndMessaging = By.cssSelector("#subCatdiv > li:nth-child(2) > a:nth-child(1)");
	By ServiceProviders = By.cssSelector("#subCatdiv > li:nth-child(3) > a:nth-child(1)");
	
	
	WrapperGenericMethod Action = new WrapperGenericMethod();

	public void ClickHamburgerMenu(WebDriver driver) {
		
		//WebElement HomePageLogo1 = driver.findElement(By.cssSelector(".brand-logo > img:nth-child(1)"));
		
//		Actions builder = new Actions(driver);   
//		builder.moveToElement(HomePageLogo1, 29, 36).click().build().perform();
		//Action.Click(driver, HamburgerMenu);
		
		int element = driver.findElements(By.xpath("//*[@id='slidelink']")).size();
		
		System.out.println(element);
	}

	
	public void ClickNews(WebDriver driver) throws InterruptedException {
		
		Action.Clear(driver, ClickArrow);
		
		WebElement element1 = driver.findElement(News);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, News);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://staging-m.onefeed.ai/category/news");

		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}
	
}

//	public void ClickKisee(WebDriver driver) throws InterruptedException {
//		WebElement element1 = driver.findElement(Kisee);
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
//		Thread.sleep(1000);
//
//		Action.Click(driver, Kisee);
//
//		String URL = driver.getCurrentUrl();
//
//		Assert.assertEquals(URL, "https://www.duniadigest.com/news-digest/kisse");
//
//		Action.Click(driver, HomePageLogo);
//		Action.Click(driver, HamburgerMenu);
//	}
//
//	public void ClickApnaHindustan(WebDriver driver) throws InterruptedException {
//		WebElement element1 = driver.findElement(ApnaHindustan);
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
//		Thread.sleep(1000);
//
//		Action.Click(driver, ApnaHindustan);
//
//		String URL = driver.getCurrentUrl();
//
//		Assert.assertEquals(URL, "https://www.duniadigest.com/news-digest/apna-hindustan");
//
//		Action.Click(driver, HomePageLogo);
//		Action.Click(driver, HamburgerMenu);
//	}
//
//	public void ClickFirangi(WebDriver driver) throws InterruptedException {
//		WebElement element1 = driver.findElement(Firangi);
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
//		Thread.sleep(1000);
//
//		Action.Click(driver, Firangi);
//
//		String URL = driver.getCurrentUrl();
//
//		Assert.assertEquals(URL, "https://www.duniadigest.com/news-digest/firangi");
//
//		Action.Click(driver, HomePageLogo);
//		Action.Click(driver, HamburgerMenu);
//	}
//
//	public void ClickSocialCharcha(WebDriver driver) throws InterruptedException {
//
//		WebElement element1 = driver.findElement(SocialCharcha);
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
//		Thread.sleep(1000);
//
//		Action.Click(driver, SocialCharcha);
//
//		String URL = driver.getCurrentUrl();
//
//		Assert.assertEquals(URL, "https://www.duniadigest.com/news-digest/social-charcha");
//
//		Action.Click(driver, HomePageLogo);
//		Action.Click(driver, HamburgerMenu);
//
//	}
//
//
//
//	public void ClickLife(WebDriver driver) throws InterruptedException {
//
//		WebElement element1 = driver.findElement(Life);
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
//		Thread.sleep(1000);
//
//		Action.Click(driver, Life);
//
//		String URL = driver.getCurrentUrl();
//
//		Assert.assertEquals(URL, "https://www.duniadigest.com/life");
//
//		Action.Click(driver, HomePageLogo);
//		Action.Click(driver, HamburgerMenu);
//	}
//
//	public void ClickBestRahanSahan(WebDriver driver) throws InterruptedException {
//
//		WebElement element1 = driver.findElement(RahanSahan);
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
//		Thread.sleep(1000);
//
//		Action.Click(driver, RahanSahan);
//
//		String URL = driver.getCurrentUrl();
//
//		Assert.assertEquals(URL, "https://www.duniadigest.com/life/rahan-sahan");
//
//		Action.Click(driver, HomePageLogo);
//		Action.Click(driver, HamburgerMenu);
//	}
//
//	public void ClickRelationship(WebDriver driver) throws InterruptedException {
//
//		WebElement element1 = driver.findElement(Relationship);
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
//		Thread.sleep(1000);
//
//		Action.Click(driver, Relationship);
//
//		String URL = driver.getCurrentUrl();
//
//		Assert.assertEquals(URL, "https://www.duniadigest.com/life/relationship");
//
//		Action.Click(driver, HomePageLogo);
//		Action.Click(driver, HamburgerMenu);
//	}
//
//	public void ClickHealth(WebDriver driver) throws InterruptedException {
//
//		WebElement element1 = driver.findElement(Health);
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
//		Thread.sleep(1000);
//
//		Action.Click(driver, Health);
//
//		String URL = driver.getCurrentUrl();
//
//		Assert.assertEquals(URL, "https://www.duniadigest.com/life/health");
//
//		Action.Click(driver, HomePageLogo);
//		Action.Click(driver, HamburgerMenu);
//	}
//
//	public void ClickTaknik(WebDriver driver) throws InterruptedException {
//
//		WebElement element1 = driver.findElement(Taknik);
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
//		Thread.sleep(1000);
//
//		Action.Click(driver, Taknik);
//
//		String URL = driver.getCurrentUrl();
//
//		Assert.assertEquals(URL, "https://www.duniadigest.com/life/technology");
//
//		Action.Click(driver, HomePageLogo);
//		Action.Click(driver, HamburgerMenu);
//	}
//
//	public void ClickHasithitoli(WebDriver driver) throws InterruptedException {
//
//		WebElement element1 = driver.findElement(Hasithitoli);
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
//		Thread.sleep(1000);
//
//		Action.Click(driver, Hasithitoli);
//
//		String URL = driver.getCurrentUrl();
//
//		Assert.assertEquals(URL, "https://www.duniadigest.com/life/hansi-thitholi");
//
//		Action.Click(driver, HomePageLogo);
//		Action.Click(driver, HamburgerMenu);
//	}
//
//
//
//	public void ClickFilmyDunia(WebDriver driver) throws InterruptedException {
//
//		WebElement element1 = driver.findElement(FilmyDunia);
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
//		Thread.sleep(1000);
//
//		Action.Click(driver, FilmyDunia);
//
//		String URL = driver.getCurrentUrl();
//
//		Assert.assertEquals(URL, "https://www.duniadigest.com/filmy-dunia");
//
//		Action.Click(driver, HomePageLogo);
//		Action.Click(driver, HamburgerMenu);
//	}
//
//	public void ClickSitareZaminPe(WebDriver driver) throws InterruptedException {
//
//		WebElement element1 = driver.findElement(SitareZaminPe);
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
//		Thread.sleep(1000);
//
//		Action.Click(driver, SitareZaminPe);
//
//		String URL = driver.getCurrentUrl();
//
//		Assert.assertEquals(URL, "https://www.duniadigest.com/filmy-dunia/sitare-jamin-par");
//
//		Action.Click(driver, HomePageLogo);
//		Action.Click(driver, HamburgerMenu);
//	}
//
//	public void ClickChugalKhorCachi(WebDriver driver) throws InterruptedException {
//
//		WebElement element1 = driver.findElement(ChugalKhorCachi);
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
//		Thread.sleep(1000);
//
//		Action.Click(driver, ChugalKhorCachi);
//
//		String URL = driver.getCurrentUrl();
//
//		Assert.assertEquals(URL, "https://www.duniadigest.com/filmy-dunia/chugalkhor-chachi");
//
//		Action.Click(driver, HomePageLogo);
//		Action.Click(driver, HamburgerMenu);
//	}
//
//	public void ClickDharamParCharcha(WebDriver driver) throws InterruptedException {
//
//		WebElement element1 = driver.findElement(DharamParCharcha);
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
//		Thread.sleep(1000);
//
//		Action.Click(driver, DharamParCharcha);
//
//		String URL = driver.getCurrentUrl();
//
//		Assert.assertEquals(URL, "https://www.duniadigest.com/religion");
//
//		Action.Click(driver, HomePageLogo);
//		Action.Click(driver, HamburgerMenu);
//	}
//	
//	public void ClickGrahNakshtra(WebDriver driver) throws InterruptedException {
//
//		WebElement element1 = driver.findElement(GrahNakshtra);
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
//		Thread.sleep(1000);
//
//		Action.Click(driver, GrahNakshtra);
//
//		String URL = driver.getCurrentUrl();
//
//		Assert.assertEquals(URL, "https://www.duniadigest.com/religion/astrology");
//
//		Action.Click(driver, HomePageLogo);
//		Action.Click(driver, HamburgerMenu);
//	}
//	public void ClickDharmikItihas(WebDriver driver) throws InterruptedException {
//
//		WebElement element1 = driver.findElement(DharmikItihas);
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
//		Thread.sleep(1000);
//
//		Action.Click(driver, DharmikItihas);
//
//		String URL = driver.getCurrentUrl();
//
//		Assert.assertEquals(URL, "https://www.duniadigest.com/religion/history-religion");
//
//		Action.Click(driver, HomePageLogo);
//		Action.Click(driver, HamburgerMenu);
//	}
//	public void ClickMultiMedia(WebDriver driver) throws InterruptedException {
//
//		WebElement element1 = driver.findElement(MultiMedia);
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
//		Thread.sleep(1000);
//
//		Action.Click(driver, MultiMedia);
//
//		String URL = driver.getCurrentUrl();
//
//		Assert.assertEquals(URL, "https://www.duniadigest.com/multimedia");
//
//		Action.Click(driver, HomePageLogo);
//		Action.Click(driver, HamburgerMenu);
//	}
//	public void ClickVideo(WebDriver driver) throws InterruptedException {
//
//		WebElement element1 = driver.findElement(Video);
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
//		Thread.sleep(1000);
//
//		Action.Click(driver, Video);
//
//		String URL = driver.getCurrentUrl();
//
//		Assert.assertEquals(URL, "https://www.duniadigest.com/multimedia/video");
//
//		Action.Click(driver, HomePageLogo);
//		Action.Click(driver, HamburgerMenu);
//	}
//	public void ClickInfoGraphics(WebDriver driver) throws InterruptedException {
//
//		WebElement element1 = driver.findElement(InfoGraphics);
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
//		Thread.sleep(1000);
//
//		Action.Click(driver, InfoGraphics);
//
//		String URL = driver.getCurrentUrl();
//
//		Assert.assertEquals(URL, "https://www.duniadigest.com/multimedia/infographics");
//
//		Action.Click(driver, HomePageLogo);
//		Action.Click(driver, HamburgerMenu);
//	}
//	public void ClickKhelKhiladi(WebDriver driver) throws InterruptedException {
//
//		WebElement element1 = driver.findElement(KhelKhiladi);
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
//		Thread.sleep(1000);
//
//		Action.Click(driver, KhelKhiladi);
//
//		String URL = driver.getCurrentUrl();
//
//		Assert.assertEquals(URL, "https://www.duniadigest.com/khel-khiladi");
//
//		Action.Click(driver, HomePageLogo);
//		Action.Click(driver, HamburgerMenu);
//	}
//	public void ClickMathPachi(WebDriver driver) throws InterruptedException {
//
//		WebElement element1 = driver.findElement(MathPachi);
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
//		Thread.sleep(1000);
//
//		Action.Click(driver, MathPachi);
//
//		String URL = driver.getCurrentUrl();
//
//		Assert.assertEquals(URL, "https://www.duniadigest.com/quiz");
//
//		Action.Click(driver, HomePageLogo);
//		Action.Click(driver, HamburgerMenu);
//	}
//}
