package PagesOnGeeksmate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import GeeksmateTestCases.ReportGenerateGeeksmate;
import UtilsOnFeed.WrapperGenericMethod;

public class GeeksmateSearchPage extends ReportGenerateGeeksmate{

	By SearchOption = By.cssSelector(".searchselect > svg:nth-child(1)");
	By SearchBox = By.cssSelector("#search");
	By SearchLinkClick = By.xpath("//*[@id='searchbar']");
	By SearchHeader = By.cssSelector("p.search-heading");
	By SearchedStoryImage = By.cssSelector("div.row:nth-child(1) > article:nth-child(2) > a:nth-child(1) > div:nth-child(1)");
	By SearchedStoryTitle = By.cssSelector("div.row:nth-child(1) > article:nth-child(2) > a:nth-child(1) > div:nth-child(2) > h5:nth-child(1)");

	WrapperGenericMethod Action = new WrapperGenericMethod();

	public void ClickSearchOption(WebDriver driver) throws InterruptedException {

		Action.Click(driver, SearchOption);
		Action.Sendkeys(driver, SearchBox, "Marvel Movies");
		Thread.sleep(2000);

		driver.get("https://www.geeksmate.io/search?q=+Marvel+Movies");

	}

	public void SearchHeader(WebDriver driver) {

		int Element = driver.findElements(SearchHeader).size();
		Assert.assertEquals(Element, 1);

	}

	public void SearchedStoryImage(WebDriver driver) {

		int Element = driver.findElements(SearchedStoryImage).size();
		Assert.assertEquals(Element, 1);

	}

	public void SearchedStoryTitle(WebDriver driver) {

		int Element = driver.findElements(SearchedStoryTitle).size();
		Assert.assertEquals(Element, 1);

	}
}
