package PagesOnDuniadigest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import UtilsOnFeed.WrapperGenericMethod;

public class DuniadigestCatagoriesPage {

	By HomePageLogo = By.cssSelector(".brand-logo > img:nth-child(1)");
	By HamburgerMenu = By.cssSelector(".sidenav-trigger > svg:nth-child(1)");
	By NewsDigest = By.cssSelector("li.vtpl_listMenu__section:nth-child(1) > a:nth-child(1)");
	By Kisee = By.cssSelector("li.vtpl_listMenu__section:nth-child(1) > ul:nth-child(2) > li:nth-child(1) > a:nth-child(1)");
	By ApnaHindustan = By.xpath("/html/body/ul/div[2]/div/ul/li[1]/ul/li[2]/a");
	By Firangi = By.xpath("/html/body/ul/div[2]/div/ul/li[1]/ul/li[3]/a");
	By SocialCharcha = By.xpath("/html/body/ul/div[2]/div/ul/li[1]/ul/li[4]/a");
	By Life = By.xpath("/html/body/ul/div[2]/div/ul/li[2]/a");
	By RahanSahan = By.cssSelector("li.vtpl_listMenu__section:nth-child(2) > ul:nth-child(2) > li:nth-child(1) > a:nth-child(1)");
	By Relationship = By.xpath("/html/body/ul/div[2]/div/ul/li[2]/ul/li[2]/a");
	By Health = By.xpath("/html/body/ul/div[2]/div/ul/li[2]/ul/li[3]/a");
	By Taknik = By.xpath("/html/body/ul/div[2]/div/ul/li[2]/ul/li[4]/a");
	By InternetReads = By.xpath("/html/body/ul/div[2]/div/ul/li[5]/a");
	By Hasithitoli = By.xpath("/html/body/ul/div[2]/div/ul/li[2]/ul/li[5]/a");
	By Gaming = By.xpath("/html/body/ul/div[2]/div/ul/li[5]/ul/li[2]/a");
	By FilmyDunia = By.cssSelector("li.vtpl_listMenu__section:nth-child(3) > a:nth-child(1)");
	By SitareZaminPe = By.xpath("/html/body/ul/div[2]/div/ul/li[3]/ul/li[1]/a");
	By ChugalKhorCachi = By.xpath("/html/body/ul/div[2]/div/ul/li[3]/ul/li[2]/a");
	By DharamParCharcha = By.xpath("/html/body/ul/div[2]/div/ul/li[4]/a");
	By GrahNakshtra = By.xpath("/html/body/ul/div[2]/div/ul/li[4]/ul/li[1]/a");
	By DharmikItihas = By.xpath("/html/body/ul/div[2]/div/ul/li[4]/ul/li[2]/a");
	By MultiMedia = By.xpath("/html/body/ul/div[2]/div/ul/li[5]/a");
	By Video = By.xpath("/html/body/ul/div[2]/div/ul/li[5]/ul/li[1]/a");
	By InfoGraphics = By.xpath("/html/body/ul/div[2]/div/ul/li[5]/ul/li[2]/a");
	By KhelKhiladi = By.xpath("/html/body/ul/div[2]/div/ul/li[6]/a");
	By MathPachi = By.xpath("/html/body/ul/div[2]/div/ul/li[7]/a");

	WrapperGenericMethod Action = new WrapperGenericMethod();

	public void ClickHamburgerMenu(WebDriver driver) {

		Action.Click(driver, HamburgerMenu);
	}

	public void NewsDigestCata(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(NewsDigest);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(NewsDigest).size();
		Assert.assertEquals(Element, 1);
	}

	public void NewsDigestSubCata(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(Kisee);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(Kisee).size();
		Assert.assertEquals(Element, 1);
	}

	public void LifeCata(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(Life);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(Life).size();
		Assert.assertEquals(Element, 1);
	}

	public void LifeCataSub(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(RahanSahan);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(RahanSahan).size();
		Assert.assertEquals(Element, 1);
	}

	public void FilmyDuniaCata(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(FilmyDunia);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(FilmyDunia).size();
		Assert.assertEquals(Element, 1);
	}

	public void FilmyDuniaSubCata(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(SitareZaminPe);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(SitareZaminPe).size();
		Assert.assertEquals(Element, 1);
	}

	public void DharamParCharchaCata(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(DharamParCharcha);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(DharamParCharcha).size();
		Assert.assertEquals(Element, 1);
	}

	public void DharamParCharchaSubCata(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(GrahNakshtra);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(GrahNakshtra).size();
		Assert.assertEquals(Element, 1);
	}
	
	public void MultiMediaCata(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(MultiMedia);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(MultiMedia).size();
		Assert.assertEquals(Element, 1);
	}
	public void MultiMediaSubCata(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(Video);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(Video).size();
		Assert.assertEquals(Element, 1);
	}
	
	
	public void KhelKhiladiCata(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(KhelKhiladi);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(KhelKhiladi).size();
		Assert.assertEquals(Element, 1);
	}
	
	public void MathPachiCata(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(MathPachi);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(MathPachi).size();
		Assert.assertEquals(Element, 1);
	}
	
	public void ClickNewsDigest(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(NewsDigest);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, NewsDigest);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.duniadigest.com/news-digest");

		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void ClickKisee(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(Kisee);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Kisee);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.duniadigest.com/news-digest/kisse");

		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void ClickApnaHindustan(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(ApnaHindustan);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, ApnaHindustan);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.duniadigest.com/news-digest/apna-hindustan");

		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void ClickFirangi(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(Firangi);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Firangi);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.duniadigest.com/news-digest/firangi");

		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void ClickSocialCharcha(WebDriver driver) throws InterruptedException {

		WebElement element1 = driver.findElement(SocialCharcha);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, SocialCharcha);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.duniadigest.com/news-digest/social-charcha");

		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);

	}



	public void ClickLife(WebDriver driver) throws InterruptedException {

		WebElement element1 = driver.findElement(Life);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Life);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.duniadigest.com/life");

		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void ClickBestRahanSahan(WebDriver driver) throws InterruptedException {

		WebElement element1 = driver.findElement(RahanSahan);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, RahanSahan);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.duniadigest.com/life/rahan-sahan");

		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void ClickRelationship(WebDriver driver) throws InterruptedException {

		WebElement element1 = driver.findElement(Relationship);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Relationship);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.duniadigest.com/life/relationship");

		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void ClickHealth(WebDriver driver) throws InterruptedException {

		WebElement element1 = driver.findElement(Health);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Health);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.duniadigest.com/life/health");

		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void ClickTaknik(WebDriver driver) throws InterruptedException {

		WebElement element1 = driver.findElement(Taknik);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Taknik);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.duniadigest.com/life/technology");

		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void ClickHasithitoli(WebDriver driver) throws InterruptedException {

		WebElement element1 = driver.findElement(Hasithitoli);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Hasithitoli);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.duniadigest.com/life/hansi-thitholi");

		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}



	public void ClickFilmyDunia(WebDriver driver) throws InterruptedException {

		WebElement element1 = driver.findElement(FilmyDunia);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, FilmyDunia);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.duniadigest.com/filmy-dunia");

		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void ClickSitareZaminPe(WebDriver driver) throws InterruptedException {

		WebElement element1 = driver.findElement(SitareZaminPe);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, SitareZaminPe);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.duniadigest.com/filmy-dunia/sitare-jamin-par");

		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void ClickChugalKhorCachi(WebDriver driver) throws InterruptedException {

		WebElement element1 = driver.findElement(ChugalKhorCachi);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, ChugalKhorCachi);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.duniadigest.com/filmy-dunia/chugalkhor-chachi");

		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void ClickDharamParCharcha(WebDriver driver) throws InterruptedException {

		WebElement element1 = driver.findElement(DharamParCharcha);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, DharamParCharcha);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.duniadigest.com/religion");

		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}
	
	public void ClickGrahNakshtra(WebDriver driver) throws InterruptedException {

		WebElement element1 = driver.findElement(GrahNakshtra);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, GrahNakshtra);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.duniadigest.com/religion/astrology");

		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}
	public void ClickDharmikItihas(WebDriver driver) throws InterruptedException {

		WebElement element1 = driver.findElement(DharmikItihas);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, DharmikItihas);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.duniadigest.com/religion/history-religion");

		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}
	public void ClickMultiMedia(WebDriver driver) throws InterruptedException {

		WebElement element1 = driver.findElement(MultiMedia);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, MultiMedia);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.duniadigest.com/multimedia");

		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}
	public void ClickVideo(WebDriver driver) throws InterruptedException {

		WebElement element1 = driver.findElement(Video);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Video);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.duniadigest.com/multimedia/video");

		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}
	public void ClickInfoGraphics(WebDriver driver) throws InterruptedException {

		WebElement element1 = driver.findElement(InfoGraphics);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, InfoGraphics);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.duniadigest.com/multimedia/infographics");

		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}
	public void ClickKhelKhiladi(WebDriver driver) throws InterruptedException {

		WebElement element1 = driver.findElement(KhelKhiladi);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, KhelKhiladi);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.duniadigest.com/khel-khiladi");

		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}
	public void ClickMathPachi(WebDriver driver) throws InterruptedException {

		WebElement element1 = driver.findElement(MathPachi);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, MathPachi);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.duniadigest.com/quiz");

		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}
}
