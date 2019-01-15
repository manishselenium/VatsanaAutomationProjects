package PagesOnGeeksmate;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import UtilsOnFeed.WrapperGenericMethod;

public class GeeksmateCatagoriesPage {

	By HomePageLogo = By.cssSelector(".brand-logo > svg:nth-child(1)");
	By HamburgerMenu = By.cssSelector(".sidenav-trigger > svg:nth-child(1)");
	By News = By.cssSelector("li.vtpl_listMenu__section:nth-child(1) > a:nth-child(1)");
	By Gadgets = By.cssSelector("li.vtpl_listMenu__section:nth-child(2) > a:nth-child(1)");
	By SmartPhones = By.xpath("/html/body/ul/div[2]/div/ul/li[2]/ul/li[1]/a");
	By SocialIssues = By.xpath("/html/body/ul/div[2]/div/ul/li[1]/ul/li[3]/a");
	By Laptop = By.xpath("/html/body/ul/div[2]/div/ul/li[2]/ul/li[2]/a");
	By Cameras = By.xpath("/html/body/ul/div[2]/div/ul/li[2]/ul/li[3]/a");
	By More = By.xpath("/html/body/ul/div[2]/div/ul/li[2]/ul/li[4]/a");
	By People = By.xpath("/html/body/ul/div[2]/div/ul/li[1]/ul/li[7]/a");
	By Reviews = By.xpath("/html/body/ul/div[2]/div/ul/li[3]/a");
	By BestProducts = By.xpath("/html/body/ul/div[2]/div/ul/li[4]/a");
	By InternetReads = By.cssSelector("li.vtpl_listMenu__section:nth-child(5) > a:nth-child(1)");
	By HowTo = By.cssSelector("li.vtpl_listMenu__section:nth-child(5) > ul:nth-child(2) > li:nth-child(1) > a:nth-child(1)");
	By Gaming = By.cssSelector("li.vtpl_listMenu__section:nth-child(5) > ul:nth-child(2) > li:nth-child(2) > a:nth-child(1)");
	By Science = By.cssSelector("li.vtpl_listMenu__section:nth-child(5) > ul:nth-child(2) > li:nth-child(3) > a:nth-child(1)");
	By apps = By.cssSelector("li.vtpl_listMenu__section:nth-child(5) > ul:nth-child(2) > li:nth-child(4) > a:nth-child(1)");
	By Unheard = By.xpath("/html/body/ul/div[2]/div/ul/li[3]/ul/li[1]/a");
	By MoviesAndTV = By.cssSelector("li.vtpl_listMenu__section:nth-child(5) > ul:nth-child(2) > li:nth-child(5) > a:nth-child(1)");
	By PCS = By.cssSelector("li.vtpl_listMenu__section:nth-child(5) > ul:nth-child(2) > li:nth-child(6) > a:nth-child(1)");
	By Videos = By.cssSelector("li.vtpl_listMenu__section:nth-child(6) > a:nth-child(1)");
	By QUIZ = By.cssSelector("li.vtpl_listMenu__section:nth-child(7) > a:nth-child(1)");

	WrapperGenericMethod Action = new WrapperGenericMethod();

	public void ClickHamburgerMenu(WebDriver driver) {

		Action.Click(driver, HamburgerMenu);
	}

	public void NewsCata(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(News);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(News).size();
		Assert.assertEquals(Element, 1);
	}

	public void GadgetsCata(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(Gadgets);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(Gadgets).size();
		Assert.assertEquals(Element, 1);
	}

	public void GadgetsSubCata(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(SmartPhones);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(SmartPhones).size();
		Assert.assertEquals(Element, 1);
	}

	public void ReviewsCata(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(Reviews);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(Reviews).size();
		Assert.assertEquals(Element, 1);
	}



	public void InternetReadsCata(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(InternetReads);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(InternetReads).size();
		Assert.assertEquals(Element, 1);
	}

	public void InternetReadsSubCata(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(HowTo);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(HowTo).size();
		Assert.assertEquals(Element, 1);
	}

	public void VideosCata(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(Videos);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(Videos).size();
		Assert.assertEquals(Element, 1);
	}
	
	public void QUIZCata(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(QUIZ);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(QUIZ).size();
		Assert.assertEquals(Element, 1);
	}

	public void ClickNews(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(News);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, News);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.geeksmate.io/news");

		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void ClickGadgets(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(Gadgets);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Gadgets);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.geeksmate.io/gadgets");

		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void ClickSmartPhones(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(SmartPhones);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, SmartPhones);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.geeksmate.io/gadgets/smartphones");

		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void ClickLaptop(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(Laptop);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Laptop);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.geeksmate.io/gadgets/laptops");

		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void ClickCameras(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(Cameras);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Cameras);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.geeksmate.io/gadgets/cameras");

		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void ClickMore(WebDriver driver) throws InterruptedException {

		WebElement element1 = driver.findElement(More);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, More);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.geeksmate.io/gadgets/more");

		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);

	}



	public void ClickReviews(WebDriver driver) throws InterruptedException {

		WebElement element1 = driver.findElement(Reviews);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Reviews);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.geeksmate.io/reviews");

		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void ClickBestProducts(WebDriver driver) throws InterruptedException {

		WebElement element1 = driver.findElement(BestProducts);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, BestProducts);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.geeksmate.io/best-products");

		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void ClickInternetReads(WebDriver driver) throws InterruptedException {

		WebElement element1 = driver.findElement(InternetReads);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, InternetReads);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.geeksmate.io/internet-reads");

		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void ClickHowTo(WebDriver driver) throws InterruptedException {

		WebElement element1 = driver.findElement(HowTo);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, HowTo);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.geeksmate.io/internet-reads/how-to");

		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void ClickGaming(WebDriver driver) throws InterruptedException {

		WebElement element1 = driver.findElement(Gaming);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Gaming);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.geeksmate.io/internet-reads/gaming");

		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void ClickScience(WebDriver driver) throws InterruptedException {

		WebElement element1 = driver.findElement(Science);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Science);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.geeksmate.io/internet-reads/science");

		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void Clickapps(WebDriver driver) throws InterruptedException {

		WebElement element1 = driver.findElement(apps);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, apps);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.geeksmate.io/internet-reads/apps");

		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void ClickMoviesAndTV(WebDriver driver) throws InterruptedException {

		WebElement element1 = driver.findElement(MoviesAndTV);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, MoviesAndTV);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.geeksmate.io/internet-reads/movies-tv");

		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void ClickPCS(WebDriver driver) throws InterruptedException {

		WebElement element1 = driver.findElement(PCS);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, PCS);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.geeksmate.io/internet-reads/pcs");

		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void ClickVideos(WebDriver driver) throws InterruptedException {

		WebElement element1 = driver.findElement(Videos);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Videos);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.geeksmate.io/videos");

		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void ClickQUIZ(WebDriver driver) throws InterruptedException {

		WebElement element1 = driver.findElement(QUIZ);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, QUIZ);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.geeksmate.io/quiz");

		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}
}
