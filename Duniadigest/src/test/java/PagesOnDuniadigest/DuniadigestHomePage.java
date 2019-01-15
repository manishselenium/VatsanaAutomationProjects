package PagesOnDuniadigest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import UtilsOnFeed.WrapperGenericMethod;

public class DuniadigestHomePage {

	By SiteLogo = By.cssSelector(".brand-logo > img:nth-child(1)");
	By NewsDigest = By.cssSelector("li.subMenu:nth-child(1) > a:nth-child(1)");
	By Life = By.cssSelector("li.subMenu:nth-child(2) > a:nth-child(1)");
	By FilmyDunia = By.cssSelector("li.subMenu:nth-child(4) > a:nth-child(1)");
	By DharamParCharcha = By.cssSelector("li.subMenu:nth-child(4) > a:nth-child(1)");
	By MultiMedia = By.cssSelector("li.subMenu:nth-child(5) > a:nth-child(1)");
	By KhelKhiladi = By.cssSelector("li.subMenu:nth-child(6) > a:nth-child(1)");
	By MathaPachi = By.cssSelector("li.subMenu:nth-child(7) > a:nth-child(1)");
	By SearchOption = By.cssSelector(".searchselect > svg:nth-child(1)");
	By InstaLink = By.cssSelector(".right > li:nth-child(2) > a:nth-child(1) > svg:nth-child(1)");
	By TwitterLink = By.cssSelector(".right > li:nth-child(3) > a:nth-child(1) > svg:nth-child(1) > g:nth-child(1) > g:nth-child(1) > path:nth-child(1)");
	By FacebookLink = By.cssSelector(".right > li:nth-child(4) > a:nth-child(1) > svg:nth-child(1) > g:nth-child(1) > path:nth-child(1)");
	By YouTubeLink = By.cssSelector(".right > li:nth-child(5) > a:nth-child(1) > svg:nth-child(1) > g:nth-child(1) > path:nth-child(1)");
	By FeaturedPostImage = By.xpath("//*[@id='promoted_stories_img_0']");
	By FeaturedPostTitle = By.xpath("//*[@id='promoted_title_0']");
	By FeaturedPostAuthor = By.cssSelector(".l9 > p:nth-child(3)");
	By SecondPostImage = By.xpath("//*[@id='promoted_stories_img_1']");
	By SecondPostTitle = By.xpath("//*[@id='promoted_title_1']");
	By SecondPostAuthor = By.cssSelector("div.s6:nth-child(2) > p:nth-child(3)");
	By ThirdPostImage = By.xpath("//*[@id='promoted_stories_img_2']");
	By ThirdPostTitle = By.xpath("//*[@id='promoted_title_2']");
	By ThirdPostAuthor = By.cssSelector("div.l3:nth-child(3) > p:nth-child(3) > a:nth-child(2)");
	By LatestStoryImage = By.xpath("//*[@id='hm_ls_1']");
	By LatestStoryTitle = By.cssSelector("div.vtpl_mosaicContainer:nth-child(6) > section:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > h3:nth-child(2)");
	By LatestStoryAuthor = By.xpath("//*[@id='hm_ls_un_1']");
	By DDVideo1 = By.cssSelector("#hm_vid_1 > a:nth-child(2)");
	By DDVideo2 = By.cssSelector("#hm_vid_2 > a:nth-child(2)");
	By QuizeFeedImage = By.xpath("//*[@id='hm_qf_1']");
	By QuizefeedTitle = By.cssSelector("div.vtpl_mosaicContainer:nth-child(9) > section:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > h3:nth-child(2)");
	By QuizeFeedAuthor = By.xpath("//*[@id='hm_qf_un_1']");
	By EatSleepReadReaptImage = By.xpath("//*[@id='hm_lm_1']");
	By EatSleepReadReaptTitle = By.xpath("//*[@id='hm_lm_t_1']");
	By EatSleepReadReaptAuthor = By.cssSelector("#hm_lm_un_1");

	WrapperGenericMethod Action = new WrapperGenericMethod();

	public void SiteLogo(WebDriver driver) {

		int Element = driver.findElements(SiteLogo).size();
		Assert.assertEquals(Element, 1);
	}

	public void NewsDigestCategories(WebDriver driver) {

		int Element = driver.findElements(NewsDigest).size();
		Assert.assertEquals(Element, 1);
	}

	public void LifeCategories(WebDriver driver) throws InterruptedException {

		Thread.sleep(5000);

		int Element = driver.findElements(Life).size();
		Assert.assertEquals(Element, 1);
	}

	public void FilmyDuniaCategories(WebDriver driver) {

		int Element = driver.findElements(FilmyDunia).size();
		Assert.assertEquals(Element, 1);
	}

	public void DharamParCharchaCategories(WebDriver driver) {

		int Element = driver.findElements(DharamParCharcha).size();
		Assert.assertEquals(Element, 1);
	}
	
	public void MultiMediaCategories(WebDriver driver) {

		int Element = driver.findElements(MultiMedia).size();
		Assert.assertEquals(Element, 1);
	}

	public void KhelKhiladiCategories(WebDriver driver) {

		int Element = driver.findElements(KhelKhiladi).size();
		Assert.assertEquals(Element, 1);
	}
	
	public void MathaPachi(WebDriver driver) {

		int Element = driver.findElements(MathaPachi).size();
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

	public void DDVideo1(WebDriver driver) throws InterruptedException {
		WebElement element = driver.findElement(DDVideo1);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(1000);

		int videoFrame = driver.findElements(DDVideo1).size();
		Assert.assertEquals(videoFrame, 1);

	}

	public void DDVideo2(WebDriver driver) throws InterruptedException {
		WebElement element = driver.findElement(DDVideo2);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(1000);

		int videoFrame = driver.findElements(DDVideo2).size();
		Assert.assertEquals(videoFrame, 1);

	}

	public void QuizeFeedImage(WebDriver driver) throws InterruptedException {
		WebElement element = driver.findElement(QuizeFeedImage);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(1000);

		int videoFrame = driver.findElements(QuizeFeedImage).size();
		Assert.assertEquals(videoFrame, 1);

	}

	public void QuizefeedTitle(WebDriver driver) throws InterruptedException {
		WebElement element = driver.findElement(QuizefeedTitle);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(1000);

		int videoFrame = driver.findElements(QuizefeedTitle).size();
		Assert.assertEquals(videoFrame, 1);

	}

	public void QuizeFeedAuthor(WebDriver driver) throws InterruptedException {
		WebElement element = driver.findElement(QuizeFeedAuthor);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(1000);

		int videoFrame = driver.findElements(QuizeFeedAuthor).size();

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

		Assert.assertEquals(videoFrame, 2);

	}

}
