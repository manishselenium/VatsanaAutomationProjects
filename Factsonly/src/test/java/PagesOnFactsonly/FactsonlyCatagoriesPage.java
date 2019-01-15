package PagesOnFactsonly;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import UtilsOnFeed.WrapperGenericMethod;

public class FactsonlyCatagoriesPage {

	By HomePageLogo = By.cssSelector(".brand-logo > svg:nth-child(1)");
	By HamburgerMenu = By.cssSelector(".sidenav-trigger > svg:nth-child(1)");
	By Creepy = By.cssSelector("li.web_listMenu__section:nth-child(1) > a:nth-child(1)");
	By History= By.cssSelector("li.web_listMenu__section:nth-child(2) > a:nth-child(1)");
	By Entertainment = By.cssSelector("li.web_listMenu__section:nth-child(3) > a:nth-child(1)");
	By Science = By.cssSelector("li.web_listMenu__section:nth-child(4) > a:nth-child(1)");
	By Culture = By.cssSelector("li.web_listMenu__section:nth-child(5) > a:nth-child(1)");
	
	

	WrapperGenericMethod Action = new WrapperGenericMethod();

	public void ClickHamburgerMenu(WebDriver driver) {
		
		Action.Click(driver, HamburgerMenu);
	}

	public void CreepyCata(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(Creepy);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(Creepy).size();
		Assert.assertEquals(Element, 1);
	}

	public void HistoryCata(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(History);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(History).size();
		Assert.assertEquals(Element, 1);
	}

	public void EntertainmentCata(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(Entertainment);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(Entertainment).size();
		Assert.assertEquals(Element, 1);
	}

	public void ScienceCata(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(Science);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(Science).size();
		Assert.assertEquals(Element, 1);
	}

	public void CultureCata(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(Culture);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(Culture).size();
		Assert.assertEquals(Element, 1);
	}


	

	public void ClickCreepy(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(Creepy);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Creepy);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.factsonly.me/creepy");

		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void ClickHistory(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(History);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, History);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.factsonly.me/history");

		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void ClickEntertainment(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(Entertainment);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Entertainment);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.factsonly.me/entertainment");

		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void ClickScience(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(Science);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Science);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.factsonly.me/science");

		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void ClickCulture(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(Culture);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Culture);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.factsonly.me/culture");

		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}
	

}
