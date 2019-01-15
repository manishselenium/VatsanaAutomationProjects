package PagesOnThePhilipino;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import UtilsOnFeed.WrapperGenericMethod;

public class ThePhilipinoCatagoriesPage {

	By HomePageLogo = By.cssSelector(".brand-logo > svg:nth-child(1)");
	By HamburgerMenu = By.cssSelector(".sidenav-trigger > svg:nth-child(1)");
	By Health = By.cssSelector("li.web_listMenu__section:nth-child(1) > a:nth-child(1)");
	By Humor= By.cssSelector("li.web_listMenu__section:nth-child(2) > a:nth-child(1)");
	By Celebrity = By.cssSelector("li.web_listMenu__section:nth-child(3) > a:nth-child(1)");
	By Technology = By.cssSelector("li.web_listMenu__section:nth-child(4) > a:nth-child(1)");
	By Misc = By.cssSelector("li.web_listMenu__section:nth-child(5) > a:nth-child(1)");
	By Facts = By.cssSelector("li.web_listMenu__section:nth-child(6) > a:nth-child(1)");
	

	WrapperGenericMethod Action = new WrapperGenericMethod();

	public void ClickHamburgerMenu(WebDriver driver) {

		Action.Click(driver, HamburgerMenu);
	}

	public void HealthCata(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(Health);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(Health).size();
		Assert.assertEquals(Element, 1);
	}

	public void HumorCata(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(Humor);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(Humor).size();
		Assert.assertEquals(Element, 1);
	}

	public void CelebrityCata(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(Celebrity);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(Celebrity).size();
		Assert.assertEquals(Element, 1);
	}

	public void TechnologyCata(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(Technology);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(Technology).size();
		Assert.assertEquals(Element, 1);
	}

	public void MiscCata(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(Misc);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(Misc).size();
		Assert.assertEquals(Element, 1);
	}

	public void FactsCata(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(Facts);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(Facts).size();
		Assert.assertEquals(Element, 1);
	}

	

	public void ClickHealth(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(Health);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Health);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.thephilipino.com/health");

		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void ClickHumor(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(Humor);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Humor);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.thephilipino.com/humor");

		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void ClickCelebrity(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(Celebrity);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Celebrity);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.thephilipino.com/celebrity");

		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void ClickTechnology(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(Technology);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Technology);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.thephilipino.com/technology");

		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void ClickMisc(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(Misc);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Misc);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.thephilipino.com/misc");

		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void ClickFacts(WebDriver driver) throws InterruptedException {

		WebElement element1 = driver.findElement(Facts);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Facts);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.thephilipino.com/facts");

		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);

	}




}
