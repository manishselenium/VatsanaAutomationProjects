package PagesOnHollywoodpie;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import UtilsOnFeed.WrapperGenericMethod;

public class HollywoodpieCatagoriesPage {

	By HomePageLogo = By.cssSelector(".brand-logo > svg:nth-child(1)");
	By HamburgerMenu = By.cssSelector(".sidenav-trigger > svg:nth-child(1)");
	By Celebrity = By.cssSelector("li.web_listMenu__section:nth-child(1) > a:nth-child(1)");
	By Music= By.cssSelector("li.web_listMenu__section:nth-child(2) > a:nth-child(1)");
	By Film = By.cssSelector("li.web_listMenu__section:nth-child(3) > a:nth-child(1)");
	
	
	

	WrapperGenericMethod Action = new WrapperGenericMethod();

	public void ClickHamburgerMenu(WebDriver driver) {

		Action.Click(driver, HamburgerMenu);
	}

	public void CelebrityCata(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(Celebrity);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(Celebrity).size();
		Assert.assertEquals(Element, 1);
	}

	public void MusicCata(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(Music);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(Music).size();
		Assert.assertEquals(Element, 1);
	}

	public void FilmCata(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(Film);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(Film).size();
		Assert.assertEquals(Element, 1);
	}

	

	public void ClickCelebrity(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(Celebrity);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Celebrity);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.hollywoodpie.com/celebrity");

		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void ClickMusic(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(Music);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Music);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.hollywoodpie.com/music");

		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void ClickFilm(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(Film);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Film);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.hollywoodpie.com/film");

		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}


}
