package PagesOnInnervoice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import UtilsOnFeed.WrapperGenericMethod;


public class InnerVoiceCatagoriesPage {

	By HomePageLogo = By.cssSelector(".brand-logo > svg:nth-child(1)");
	By HamburgerMenu = By.cssSelector(".navSide-logo > a:nth-child(1) > svg:nth-child(1)");
    By Explore = By.cssSelector("li.vtpl_listMenu__section:nth-child(1) > a:nth-child(1)");
    By Relationship = By.xpath("/html/body/ul/div[2]/div/ul/li[1]/ul/li[1]/a");
    By Motivation = By.xpath("/html/body/ul/div[2]/div/ul/li[1]/ul/li[2]/a");
    By SocialIssues = By.xpath("/html/body/ul/div[2]/div/ul/li[1]/ul/li[3]/a");
    By OpenLetter0 = By.xpath("/html/body/ul/div[2]/div/ul/li[1]/ul/li[4]/a");
    By Psychology = By.xpath("/html/body/ul/div[2]/div/ul/li[1]/ul/li[5]/a");
    By QuotesAndThoughts = By.xpath("/html/body/ul/div[2]/div/ul/li[1]/ul/li[6]/a");
    By People = By.xpath("/html/body/ul/div[2]/div/ul/li[1]/ul/li[7]/a");
    By Tales = By.xpath("/html/body/ul/div[2]/div/ul/li[2]/a");
    By ShortTales = By.xpath("/html/body/ul/div[2]/div/ul/li[2]/ul/li[1]/a");
    By LongTales = By.linkText("Long Tales");
    By OpenLetter1 = By.linkText("Openletter");
    By Opinion = By.xpath("/html/body/ul/div[2]/div/ul/li[2]/ul/li[4]/a");
    By Poem = By.xpath("/html/body/ul/div[2]/div/ul/li[2]/ul/li[5]/a");
    By Videos = By.xpath("/html/body/ul/div[2]/div/ul/li[3]/a");
    By Unheard = By.xpath("/html/body/ul/div[2]/div/ul/li[3]/ul/li[1]/a");
    By ShortStories = By.xpath("/html/body/ul/div[2]/div/ul/li[3]/ul/li[2]/a");
    By Express = By.xpath("/html/body/ul/div[2]/div/ul/li[4]/a");
    By Askup = By.xpath("/html/body/ul/div[2]/div/ul/li[4]/ul/li[1]/a");
    By Advice = By.xpath("/html/body/ul/div[2]/div/ul/li[4]/ul/li[2]/a");
    By IVPicks = By.xpath("/html/body/ul/div[2]/div/ul/li[5]/a");



	WrapperGenericMethod Action = new WrapperGenericMethod();


	public void ClickHamburgerMenu(WebDriver driver) {

		Action.Click(driver, HamburgerMenu);
	}

	public void ExploreCata(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(Explore);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(Explore).size();
		Assert.assertEquals(Element, 1);
	}

	public void ExploreSubCata(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(Relationship);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(Relationship).size();
		Assert.assertEquals(Element, 1);
	}

	public void TalesCata(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(Tales);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(Tales).size();
		Assert.assertEquals(Element, 1);
	}

	public void TalesSubCata(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(ShortTales);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(ShortTales).size();
		Assert.assertEquals(Element, 1);
	}

	public void VideosCata(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(Videos);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(Videos).size();
		Assert.assertEquals(Element, 1);
	}

	
	public void VideosSubCata(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(Unheard);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(Unheard).size();
		Assert.assertEquals(Element, 1);
	}

	
	
	public void ExpressCata(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(Express);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(Express).size();
		Assert.assertEquals(Element, 1);
	}

	
	public void ExpressSubCata(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(Askup);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(Askup).size();
		Assert.assertEquals(Element, 1);
	}

	public void IVPicks(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(Opinion);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(IVPicks).size();
		Assert.assertEquals(Element, 1);
	}

	public void ClickExplore(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(Explore);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Explore);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.innervoice.ai/explore");
		
		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}
	
	public void ClickRelationship(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(Relationship);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Relationship);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.innervoice.ai/explore/relationship");
		
		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}
	
	public void ClickMotivation(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(Motivation);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Motivation);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.innervoice.ai/explore/motivation");
		
		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void ClickSocialIssues(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(SocialIssues);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, SocialIssues);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.innervoice.ai/explore/social-issues");
		
		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}
	public void ClickOpenLetter0(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(OpenLetter0);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, OpenLetter0);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.innervoice.ai/explore/open-letter");
		
		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}
	public void ClickPsychology(WebDriver driver) throws InterruptedException {
		
		WebElement element1 = driver.findElement(Psychology);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Psychology);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.innervoice.ai/explore/psychology");
		
		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
		

	}

	public void ClickQuotesAndThoughts(WebDriver driver) throws InterruptedException {
		
		WebElement element1 = driver.findElement(QuotesAndThoughts);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, QuotesAndThoughts);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.innervoice.ai/explore/quotes-and-thoughts");
		
		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void ClickPeople(WebDriver driver) throws InterruptedException {
		
		WebElement element1 = driver.findElement(People);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, People);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.innervoice.ai/explore/people");
		
		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void ClickTales(WebDriver driver) throws InterruptedException {
		
		WebElement element1 = driver.findElement(Tales);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Tales);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.innervoice.ai/tales");
		
		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void ClickShortTales(WebDriver driver) throws InterruptedException {
		
		WebElement element1 = driver.findElement(ShortTales);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, ShortTales);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.innervoice.ai/tales/short-tales");
		
		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void ClickLongTales(WebDriver driver) throws InterruptedException {
		
		WebElement element1 = driver.findElement(LongTales);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, LongTales);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.innervoice.ai/tales/long-tales");
		
		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void ClickOpenLetter1(WebDriver driver) throws InterruptedException {
		
		WebElement element1 = driver.findElement(OpenLetter1);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, OpenLetter1);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.innervoice.ai/tales/openletter");
		
		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void ClickOpinion(WebDriver driver) throws InterruptedException {
		
		WebElement element1 = driver.findElement(Opinion);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Opinion);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.innervoice.ai/tales/opinion-posts");
		
		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void ClickPoem(WebDriver driver) throws InterruptedException {
		
		WebElement element1 = driver.findElement(Poem);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Poem);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.innervoice.ai/tales/poem");
		
		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}
	
	public void ClickVideos(WebDriver driver) throws InterruptedException {
		
		WebElement element1 = driver.findElement(Videos);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Videos);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.innervoice.ai/videos");
		
		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void ClickUnheard(WebDriver driver) throws InterruptedException {
		
		WebElement element1 = driver.findElement(Unheard);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Unheard);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.innervoice.ai/videos/unheard");
		
		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void ClickShortStories(WebDriver driver) throws InterruptedException {
		
		WebElement element1 = driver.findElement(ShortStories);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, ShortStories);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.innervoice.ai/videos/short-stories");
		
		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void ClickExpress(WebDriver driver) throws InterruptedException {
		
		WebElement element1 = driver.findElement(Express);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Express);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.innervoice.ai/express");
		
		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void ClickAskup(WebDriver driver) throws InterruptedException {
		
		WebElement element1 = driver.findElement(Askup);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Askup);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.innervoice.ai/express/askup");
		
		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void ClickAdvice(WebDriver driver) throws InterruptedException {
		
		WebElement element1 = driver.findElement(Advice);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Advice);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.innervoice.ai/express/advice");
		
		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void ClickIVPicks(WebDriver driver) throws InterruptedException {
		
		WebElement element1 = driver.findElement(IVPicks);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, IVPicks);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.innervoice.ai/iv-picks");
		
		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}



	

}
