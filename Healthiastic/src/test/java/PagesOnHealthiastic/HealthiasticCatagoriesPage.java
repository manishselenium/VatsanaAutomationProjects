package PagesOnHealthiastic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import UtilsOnFeed.WrapperGenericMethod;

public class HealthiasticCatagoriesPage {

	By HomePageLogo = By.cssSelector(".brand-logo > svg:nth-child(1)");
	By HamburgerMenu = By.cssSelector(".sidenav-trigger > svg:nth-child(1)");
	By TipsAndTricks = By.cssSelector("li.web_listMenu__section:nth-child(1) > a:nth-child(1)");
	By WomensHealth= By.cssSelector("li.web_listMenu__section:nth-child(2) > a:nth-child(1)");
	By HealthAlert = By.cssSelector("li.web_listMenu__section:nth-child(3) > a:nth-child(1)");
	By Lifestyle = By.cssSelector("li.web_listMenu__section:nth-child(4) > a:nth-child(1)");
	By Beauty = By.cssSelector("li.web_listMenu__section:nth-child(5) > a:nth-child(1)");
	
	

	WrapperGenericMethod Action = new WrapperGenericMethod();

	public void ClickHamburgerMenu(WebDriver driver) {

		Action.Click(driver, HamburgerMenu);
	}

	public void TipsAndTricksCata(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(TipsAndTricks);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(TipsAndTricks).size();
		Assert.assertEquals(Element, 1);
	}

	public void WomensHealthCata(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(WomensHealth);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(WomensHealth).size();
		Assert.assertEquals(Element, 1);
	}

	public void HealthAlertCata(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(HealthAlert);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(HealthAlert).size();
		Assert.assertEquals(Element, 1);
	}

	public void LifestyleCata(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(Lifestyle);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(Lifestyle).size();
		Assert.assertEquals(Element, 1);
	}

	public void BeautyCata(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(Beauty);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(Beauty).size();
		Assert.assertEquals(Element, 1);
	}


	

	public void ClickTipsAndTricks(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(TipsAndTricks);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, TipsAndTricks);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.healthiastic.com/tips-tricks");

		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void ClickWomensHealth(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(WomensHealth);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, WomensHealth);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.healthiastic.com/womens-health");

		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void ClickHealthAlert(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(HealthAlert);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, HealthAlert);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.healthiastic.com/health-alert");

		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void ClickLifestyle(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(Lifestyle);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Lifestyle);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.healthiastic.com/lifestyle");

		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void ClickBeauty(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(Beauty);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Beauty);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.healthiastic.com/beauty");

		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}
	

}
