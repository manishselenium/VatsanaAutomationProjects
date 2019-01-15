package PagesOnHollywoodpie;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import UtilsOnFeed.WrapperGenericMethod;

public class HollywoodpieHomePage {

	By SiteLogo = By.cssSelector(".brand-logo > svg:nth-child(1)");
	By Celebrity= By.cssSelector("li.subMenu:nth-child(1) > a:nth-child(1)");
	By Music = By.cssSelector("li.subMenu:nth-child(2) > a:nth-child(1)");
	By Film = By.cssSelector("li.subMenu:nth-child(3) > a:nth-child(1)");
	By SearchOption = By.cssSelector(".searchselect > svg:nth-child(1)");
	By InstaLink = By.cssSelector(".right > li:nth-child(2) > a:nth-child(1) > svg:nth-child(1)");
	By TwitterLink = By.cssSelector(
			".right > li:nth-child(3) > a:nth-child(1) > svg:nth-child(1) > g:nth-child(1) > g:nth-child(1) > path:nth-child(1)");
	By FacebookLink = By.cssSelector(
			".right > li:nth-child(4) > a:nth-child(1) > svg:nth-child(1) > g:nth-child(1) > path:nth-child(1)");
	By YouTubeLink = By.cssSelector(
			".right > li:nth-child(5) > a:nth-child(1) > svg:nth-child(1) > g:nth-child(1) > path:nth-child(1)");
	By FeaturedPostImage = By.xpath("//*[@id='promoted_stories_img_0']");
	 
	By FeaturedPostTitle = By.xpath("//*[@id='promoted_title_0']");
	By FeaturedPostAuthor = By.cssSelector("div.col:nth-child(1) > p:nth-child(3) > a:nth-child(2)");
	By SecondPostImage = By.xpath("//*[@id='promoted_stories_img_1']");
	By SecondPostTitle = By.xpath("//*[@id='promoted_title_1']");
	By SecondPostAuthor = By.cssSelector("div.col:nth-child(2) > p:nth-child(3) > a:nth-child(2)");
	By ThirdPostImage = By.xpath("//*[@id='promoted_stories_img_2']");
	By ThirdPostTitle = By.xpath("//*[@id='promoted_title_2']");
	By ThirdPostAuthor = By.cssSelector("div.s6:nth-child(3) > p:nth-child(3) > a:nth-child(2)");
	By LatestStoryImage = By.xpath("//*[@id='hm_ls_1']");
	By LatestStoryTitle = By.cssSelector("div.page_card:nth-child(1) > div:nth-child(1) > h3:nth-child(2)");
	By LatestStoryAuthor = By.xpath("//*[@id='hm_ls_un_1']");

	By EatSleepReadReaptImage = By.xpath("//*[@id='hm_lm_1']");
	By EatSleepReadReaptTitle = By.xpath("//*[@id='hm_lm_t_1']");
	By EatSleepReadReaptAuthor = By.cssSelector(".row > article:nth-child(7) > address:nth-child(2) > p:nth-child(1) > a:nth-child(2)");

	WrapperGenericMethod Action = new WrapperGenericMethod();

	public void SiteLogo(WebDriver driver) {

		int Element = driver.findElements(SiteLogo).size();
		Assert.assertEquals(Element, 1);
	}

	public void CelebrityCategories(WebDriver driver) {

		int Element = driver.findElements(Celebrity).size();
		Assert.assertEquals(Element, 1);
	}

	public void MusicCategories(WebDriver driver) throws InterruptedException {

		Thread.sleep(5000);

		int Element = driver.findElements(Music).size();
		Assert.assertEquals(Element, 1);
	}

	public void FilmCategories(WebDriver driver) {

		int Element = driver.findElements(Film).size();
		Assert.assertEquals(Element, 1);
	}

	public void SearchOption(WebDriver driver) {

		int Element = driver.findElements(SearchOption).size();
		Assert.assertEquals(Element, 1);
	}

	public void InstaLink(WebDriver driver) {

		int Element = driver.findElements(InstaLink).size();
		Assert.assertEquals(Element, 1);
	}

	public void TwitterLink(WebDriver driver) {

		int ImageSize = driver.findElements(TwitterLink).size();
		Assert.assertEquals(ImageSize, 1);
	}

	public void FacebookLink(WebDriver driver) {
		int ContentSize = driver.findElements(FacebookLink).size();
		Assert.assertEquals(ContentSize, 1);
	}

	public void YouTubeLink(WebDriver driver) {
		int ContentSize = driver.findElements(YouTubeLink).size();
		Assert.assertEquals(ContentSize, 1);
	}

	public void FeaturedPostImage(WebDriver driver) {
		int ImageSize = driver.findElements(FeaturedPostImage).size();
		Assert.assertEquals(ImageSize, 1);
	}

	public void FeaturedPostTitle(WebDriver driver) {
		int ContentSize = driver.findElements(FeaturedPostTitle).size();
		Assert.assertEquals(ContentSize, 1);

	}

	public void FeaturedPostAuthor(WebDriver driver) {
		int ContentSize = driver.findElements(FeaturedPostAuthor).size();
		Assert.assertEquals(ContentSize, 1);

	}

	public void SecondPostImage(WebDriver driver) {
		int ImageSize = driver.findElements(SecondPostImage).size();
		Assert.assertEquals(ImageSize, 1);
	}

	public void SecondPostTitle(WebDriver driver) {
		int ContentSize = driver.findElements(SecondPostTitle).size();
		Assert.assertEquals(ContentSize, 1);

	}

	public void SecondPostAuthor(WebDriver driver) {
		int ContentSize = driver.findElements(SecondPostAuthor).size();
		Assert.assertEquals(ContentSize, 1);

	}

	public void ThirdPostImage(WebDriver driver) {
		int ImageSize = driver.findElements(ThirdPostImage).size();
		Assert.assertEquals(ImageSize, 1);
	}

	public void ThirdPostTitle(WebDriver driver) {
		int ContentSize = driver.findElements(ThirdPostTitle).size();
		Assert.assertEquals(ContentSize, 1);
	}

	public void ThirdPostAuthor(WebDriver driver) throws InterruptedException {

		int ContentSize = driver.findElements(ThirdPostAuthor).size();
		Assert.assertEquals(ContentSize, 1);

	}

	public void LatestStoryImage(WebDriver driver) throws InterruptedException {

		WebElement element = driver.findElement(LatestStoryImage);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(1000);

		int videoFrame = driver.findElements(LatestStoryImage).size();
		Assert.assertEquals(videoFrame, 1);

	}

	public void LatestStoryTitle(WebDriver driver) throws InterruptedException {

		WebElement element = driver.findElement(LatestStoryTitle);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(1000);

		int videoFrame = driver.findElements(LatestStoryTitle).size();
		Assert.assertEquals(videoFrame, 1);

	}

	public void LatestStoryAuthor(WebDriver driver) throws InterruptedException {

		WebElement element = driver.findElement(LatestStoryAuthor);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(1000);

		int videoFrame = driver.findElements(LatestStoryAuthor).size();
		Assert.assertEquals(videoFrame, 1);

	}

	
	

	public void EatSleepReadReaptImage(WebDriver driver) throws InterruptedException {
		WebElement element = driver.findElement(EatSleepReadReaptImage);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(1000);

		int videoFrame = driver.findElements(EatSleepReadReaptImage).size();

		Assert.assertEquals(videoFrame, 1);
	}

	public void EatSleepReadReaptTitle(WebDriver driver) throws InterruptedException {

		WebElement element = driver.findElement(EatSleepReadReaptTitle);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(1000);

		int videoFrame = driver.findElements(EatSleepReadReaptTitle).size();

		Assert.assertEquals(videoFrame, 1);
	}

	public void EatSleepReadReaptAuthor(WebDriver driver) throws InterruptedException {

		WebElement element = driver.findElement(EatSleepReadReaptAuthor);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(1000);

		int videoFrame = driver.findElements(EatSleepReadReaptAuthor).size();

		Assert.assertEquals(videoFrame, 1);

	}

}
