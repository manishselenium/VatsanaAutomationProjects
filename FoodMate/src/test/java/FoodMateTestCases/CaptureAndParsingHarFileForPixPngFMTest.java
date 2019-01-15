package FoodMateTestCases;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import net.lightbody.bmp.BrowserMobProxyServer;
import net.lightbody.bmp.client.ClientUtil;
import net.lightbody.bmp.core.har.Har;
import net.lightbody.bmp.proxy.CaptureType;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import de.sstoehr.harreader.HarReaderException;

public class CaptureAndParsingHarFileForPixPngFMTest extends ReportGenerateFoodMate {

static Properties properties = null;

@BeforeTest
public void RecordHAR() throws InterruptedException {

	WebDriver driver1;
	BrowserMobProxyServer proxy;

	proxy = new BrowserMobProxyServer();

	proxy.start();

	Proxy seleniumProxy = ClientUtil.createSeleniumProxy(proxy);
	try {
		String hostIp = Inet4Address.getLocalHost().getHostAddress();
		seleniumProxy.setHttpProxy(hostIp + ":" + proxy.getPort());
		seleniumProxy.setSslProxy(hostIp + ":" + proxy.getPort());
	} catch (UnknownHostException e) {
		e.printStackTrace();
	}

	ArrayList<String> cliArgsCap = new ArrayList<String>();
	cliArgsCap.add("--proxy=localhost:" + proxy.getPort());
	cliArgsCap.add("--ignore-ssl-errors=yes");

	DesiredCapabilities seleniumCapabilities = new DesiredCapabilities();

	seleniumCapabilities.setCapability(CapabilityType.PROXY, seleniumProxy);
	seleniumCapabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
	seleniumCapabilities.setCapability(CapabilityType.SUPPORTS_JAVASCRIPT, true);
	seleniumCapabilities.setCapability(PhantomJSDriverService.PHANTOMJS_CLI_ARGS, cliArgsCap);
	

	proxy.enableHarCaptureTypes(CaptureType.RESPONSE_HEADERS);
	

		File file = new File("/usr/bin/phantomjs");
		System.setProperty("phantomjs.binary.path", file.getAbsolutePath());
		
	driver1 = new PhantomJSDriver(seleniumCapabilities);
	try {
		proxy.newHar("wittyfeed");	

	driver1.get(
				"https://www.foodmate.me/christmas-dishes-from-around-the-world-72093?utm_source=homepage_promo");
		
		


		System.out.println("Page title is: " + driver1.getTitle());

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		Har har = proxy.getHar();

		File harFile = new File("/home/wittyfeed/harfiles/foodmate.har");
		har.writeTo(harFile);
		driver1.quit();
	} catch (IOException ioe) {
		ioe.printStackTrace();
	}

	proxy.stop();

}

	@Test(priority = 1)
	public void OpenGoogleappsHar_analyzer() {

		test = extent.createTest("Test 1 - Check Open Googleapps Har_analyzer");
		driver.get("https://toolbox.googleapps.com/apps/har_analyzer/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#fileSelector")).sendKeys("/home/wittyfeed/harfiles/foodmate.har");

		driver.findElement(By.cssSelector("#searchInput")).sendKeys("pix.png");

		driver.findElement(By.cssSelector("#search")).click();

		driver.findElement(By.cssSelector("#p0\\:row_0 > td:nth-child(4)")).click();
	}

	@Test(priority = 2)
	public void CheckGMTValue() {
		test = extent.createTest("Test 2 - Check GMT Value");
		String gmt = driver
				.findElement(By.cssSelector(
						"#infoTabContent > dl:nth-child(2) > dd:nth-child(6) > ul:nth-child(1) > li:nth-child(1)"))
				.getText();

		String[] GmtSplit = gmt.split(" ");
		String Gmtvalue = String.valueOf(GmtSplit[1]);

		if (Gmtvalue.equals("null"))

		{
			System.out.println("Sending null value in gmt");
		}

		else {
			System.out.println(gmt);
		}
	}

	@Test(priority = 3)
	public void Checkvisit_blockValue() {
		test = extent.createTest("Test 3 - Check visit_block Value");
		String visit_block = driver
				.findElement(By.cssSelector(
						"#infoTabContent > dl:nth-child(2) > dd:nth-child(6) > ul:nth-child(1) > li:nth-child(2)"))
				.getText();

		String[] visit_blocksplit = visit_block.split(" ");
		String visit_blockValue = String.valueOf(visit_blocksplit[1]);

		if (visit_blockValue.equals("null"))

		{
			System.out.println("Sending null value in gmt");
		}

		else {
			System.out.println(visit_block);
		}
	}

	@Test(priority = 4)
	public void Checkcountry_codeValue() {

		test = extent.createTest("Test 4 - Check country_code Value");
		String country_code = driver
				.findElement(By.cssSelector(
						"#infoTabContent > dl:nth-child(2) > dd:nth-child(6) > ul:nth-child(1) > li:nth-child(3)"))
				.getText();

		String[] country_codesplit = country_code.split(" ");
		String country_codevalue = String.valueOf(country_codesplit[1]);

		if (country_codevalue.equals("null"))

		{
			System.out.println("Sending null value in country_code");
		}

		else {
			System.out.println(country_code);
		}
	}

	@Test(priority = 5)
		public void Checklanguage_EnglishValue() {
			test = extent.createTest("Test 5 - Check language_English Value");
		
			
String language_English = driver
				.findElement(By.cssSelector("#infoTabContent > dl:nth-child(2) > dd:nth-child(6) > ul:nth-child(1) > li:nth-child(4)"))
				.getText();

		try {
			String[] language_Englishsplit = language_English.split(" ");
			String language_Englishvalue = String.valueOf(language_Englishsplit[1]);

			if (language_Englishvalue.equals("null"))

			{
				System.out.println("Sending null value in language_English");
			}

			else {
				System.out.println(language_English);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Sending blank value in language_English");

		}
	}
	@Test(priority = 6)
	public void Checkcategory_peopleValue() {

		test = extent.createTest("Test 6 - Check category_people Value");

		String category_people = driver
				.findElement(By.cssSelector(
						"#infoTabContent > dl:nth-child(2) > dd:nth-child(6) > ul:nth-child(1) > li:nth-child(5)"))
				.getText();
		try {
			String[] category_peoplesplit = category_people.split(" ");
			String category_peoplevalue = String.valueOf(category_peoplesplit[1]);

			if (category_peoplevalue.equals("null"))

			{
				System.out.println("Sending null value in category_people");
			}

			else {
				System.out.println(category_people);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Sending blank value in language_English");

		}
	}

	@Test(priority = 7)
	public void Checkwriter_nameValue() {
		test = extent.createTest("Test 7 - Check writer_name Value");

		String writer_name = driver
				.findElement(By.cssSelector(
						"#infoTabContent > dl:nth-child(2) > dd:nth-child(6) > ul:nth-child(1) > li:nth-child(6)"))
				.getText();
		try {
			String[] writer_namesplit = writer_name.split(" ");
			String writer_namevalue = String.valueOf(writer_namesplit[1]);

			if (writer_namevalue.equals("null"))

			{
				System.out.println("Sending null value in writer_name");
			}

			else {
				System.out.println(writer_name);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Sending blank value in language_English");

		}
	}

	@Test(priority = 8)
	public void Checkwriter_idValue() {

		test = extent.createTest("Test 8 - Check writer_id Value");

		String writer_id = driver
				.findElement(By.cssSelector(
						"#infoTabContent > dl:nth-child(2) > dd:nth-child(6) > ul:nth-child(1) > li:nth-child(7)"))
				.getText();
		try {
			String[] writer_idsplit = writer_id.split(" ");
			String writer_idvalue = String.valueOf(writer_idsplit[1]);

			if (writer_idvalue.equals("null"))

			{
				System.out.println("Sending null value in writer_id");
			}

			else {
				System.out.println(writer_id);
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Sending blank value in language_English");

		}
	}

	@Test(priority = 9)
	public void Checkcategory_idValue() {

		test = extent.createTest("Test 9 - Check category_id Value");

		String category_id = driver
				.findElement(By.cssSelector(
						"#infoTabContent > dl:nth-child(2) > dd:nth-child(6) > ul:nth-child(1) > li:nth-child(8)"))
				.getText();

		try {
			String[] category_idsplit = category_id.split(" ");
			String category_idvalue = String.valueOf(category_idsplit[1]);

			if (category_idvalue.equals("null"))

			{
				System.out.println("Sending null value in category_id");
			}

			else {
				System.out.println(category_id);
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Sending blank value in language_English");

		}
	}

	@Test(priority = 10)
	public void Checkstory_idValue() {

		test = extent.createTest("Test 10 - Check story_id Value");

		String story_id = driver
				.findElement(By.cssSelector(
						"#infoTabContent > dl:nth-child(2) > dd:nth-child(6) > ul:nth-child(1) > li:nth-child(9)"))
				.getText();

		try {
			String[] story_idsplit = story_id.split(" ");
			String story_idvalue = String.valueOf(story_idsplit[1]);

			if (story_idvalue.equals("null"))

			{
				System.out.println("Sending null value in story_id");
			}

			else {
				System.out.println(story_id);
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Sending blank value in language_English");

		}
	}

	@Test(priority = 11)
	public void Checkgoogle_entitiesValue() {

		test = extent.createTest("Test 11 - Check google_entities Value");

		String google_entities = driver
				.findElement(By.cssSelector(
						"#infoTabContent > dl:nth-child(2) > dd:nth-child(6) > ul:nth-child(1) > li:nth-child(10)"))
				.getText();
//System.out.println(google_entities);

		try {
			String[] google_entitiessplit = google_entities.split(" ");
			String google_entitiesvalue = String.valueOf(google_entitiessplit[1]);

			if (google_entitiesvalue.equals("null"))

			{
				System.out.println("Sending null value in google_entities");
			}

			else {
				System.out.println(google_entities);
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Sending blank value in language_English");

		}
	}

	@Test(priority = 12)
	public void Checkpage_typeValue() {

		test = extent.createTest("Test 12 - Check page_type Value");

		String page_type = driver
				.findElement(By.cssSelector(
						"#infoTabContent > dl:nth-child(2) > dd:nth-child(6) > ul:nth-child(1) > li:nth-child(11)"))
				.getText();
//System.out.println(page_type);

		try {
			String[] page_typesplit = page_type.split(" ");
			String page_typevalue = String.valueOf(page_typesplit[1]);

			if (page_typevalue.equals("null"))

			{
				System.out.println("Sending null value in page_type");
			}

			else {
				System.out.println(page_type);
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Sending blank value in language_English");

		}
	}

	@Test(priority = 13)
	public void CheckcityValue() {

		test = extent.createTest("Test 13 - Check city Value");

		String city = driver
				.findElement(By.cssSelector(
						"#infoTabContent > dl:nth-child(2) > dd:nth-child(6) > ul:nth-child(1) > li:nth-child(12)"))
				.getText();

		try {
			String[] CitySplit = city.split(" ");
			String CityValue = String.valueOf(CitySplit[1]);

			if (CityValue.equals("null"))

			{
				System.out.println("Sending null value in city");
			}

			else {
				System.out.println(city);
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Sending blank value in language_English");

		}
	}

	@Test(priority = 14)
	public void Checkcountry_nameValue() {
		test = extent.createTest("Test 14 - Check country_name Value");
		String country_name = driver
				.findElement(By.cssSelector(
						"#infoTabContent > dl:nth-child(2) > dd:nth-child(6) > ul:nth-child(1) > li:nth-child(13)"))
				.getText();
//System.out.println(country_name);

		try {
			String[] country_namesplit = country_name.split(" ");
			String country_namevalue = String.valueOf(country_namesplit[1]);

			if (country_namevalue.equals("null"))

			{
				System.out.println("Sending null value in country_name");
			}

			else {
				System.out.println(country_name);
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Sending blank value in language_English");

		}
	}

	@Test(priority = 15)
	public void CheckfpValue() {

		test = extent.createTest("Test 15 - Check fp Value");
		String fp = driver
				.findElement(By.cssSelector(
						"#infoTabContent > dl:nth-child(2) > dd:nth-child(6) > ul:nth-child(1) > li:nth-child(14)"))
				.getText();
//System.out.println(fp);

		try {
			String[] fpsplit = fp.split(" ");
			String fpvalue = String.valueOf(fpsplit[1]);

			if (fpvalue.equals("null"))

			{
				System.out.println("Sending null value in fp");
			}

			else {
				System.out.println(fp);
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Sending blank value in language_English");

		}
	}

	@Test(priority = 16)
	public void Checkpage_urlValue() {
		test = extent.createTest("Test 16 - Check page_url Value");

		String page_url = driver
				.findElement(By.cssSelector(
						"#infoTabContent > dl:nth-child(2) > dd:nth-child(6) > ul:nth-child(1) > li:nth-child(15)"))
				.getText();
//System.out.println(page_url);

		try {
			String[] page_urlsplit = page_url.split(" ");
			String page_urlvalue = String.valueOf(page_urlsplit[1]);

			if (page_urlvalue.equals("null"))

			{
				System.out.println("Sending null value in page_url");
			}

			else {
				System.out.println(page_url);
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Sending blank value in language_English");

		}
	}

	@Test(priority = 17)
	public void Checkclient_ipValue() {

		test = extent.createTest("Test 17 - Check client_ip Value");

		String client_ip = driver
				.findElement(By.cssSelector(
						"#infoTabContent > dl:nth-child(2) > dd:nth-child(6) > ul:nth-child(1) > li:nth-child(16)"))
				.getText();
//System.out.println(client_ip);

		try {
			String[] client_ipsplit = client_ip.split(" ");
			String client_ipvalue = String.valueOf(client_ipsplit[1]);

			if (client_ipvalue.equals("null"))

			{
				System.out.println("Sending null value in client_ip");
			}

			else {
				System.out.println(client_ip);
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Sending blank value in language_English");

		}
	}

	@Test(priority = 18)
	public void Checkreferral_domainValue() {

		test = extent.createTest("Test 18 - Check referral_domain Value");

		String referral_domain = driver
				.findElement(By.cssSelector(
						"#infoTabContent > dl:nth-child(2) > dd:nth-child(6) > ul:nth-child(1) > li:nth-child(17)"))
				.getText();
//System.out.println(referral_domain);

		try {
			String[] referral_domainsplit = referral_domain.split(" ");
			String referral_domainvalue = String.valueOf(referral_domainsplit[1]);

			if (referral_domainvalue.equals("null"))

			{
				System.out.println("Sending null value in referral_domain");
			}

			else {
				System.out.println(referral_domain);
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Sending blank value in language_English");

		}
	}

	@Test(priority = 19)
	public void Checkdev_sourceValue() {

		test = extent.createTest("Test 19 - Check dev_source Value");

		String dev_source = driver
				.findElement(By.cssSelector(
						"#infoTabContent > dl:nth-child(2) > dd:nth-child(6) > ul:nth-child(1) > li:nth-child(18)"))
				.getText();
//System.out.println(dev_source);

		try {
			String[] dev_sourcesplit = dev_source.split(" ");
			String dev_sourcevalue = String.valueOf(dev_sourcesplit[1]);

			if (dev_sourcevalue.equals("null"))

			{
				System.out.println("Sending null value in dev_source");
			}

			else {
				System.out.println(dev_source);
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Sending blank value in language_English");

		}
	}

	@Test(priority = 20)
	public void CheckPBValue() {

		test = extent.createTest("Test 20 - Check PB Value");

		String PB = driver
				.findElement(By.cssSelector(
						"#infoTabContent > dl:nth-child(2) > dd:nth-child(6) > ul:nth-child(1) > li:nth-child(19)"))
				.getText();
//System.out.println(PB);

		try {
			String[] PBsplit = PB.split(" ");
			String PBvalue = String.valueOf(PBsplit[1]);

			if (PBvalue.equals("null"))

			{
				System.out.println("Sending null value in PB");
			}

			else {
				System.out.println(PB);
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Sending blank value in language_English");

		}
	}

	@Test(priority = 21)
	public void Checkstory_tagsValue() {

		test = extent.createTest("Test 21 - Check story_tags Value");

		String story_tags = driver
				.findElement(By.cssSelector(
						"#infoTabContent > dl:nth-child(2) > dd:nth-child(6) > ul:nth-child(1) > li:nth-child(20)"))
				.getText();
//System.out.println(story_tags);

		try {
			String[] story_tagssplit = story_tags.split(" ");
			String story_tagsvalue = String.valueOf(story_tagssplit[1]);

			if (story_tagsvalue.equals("null"))

			{
				System.out.println("Sending null value in story_tags");
			}

			else {
				System.out.println(story_tags);
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Sending blank value in language_English");

		}
	}

	@Test(priority = 22)
	public void Checkcurrent_blockValue() {

		test = extent.createTest("Test 22 - Check current_block Value");

		String current_block = driver
				.findElement(By.cssSelector(
						"#infoTabContent > dl:nth-child(2) > dd:nth-child(6) > ul:nth-child(1) > li:nth-child(21)"))
				.getText();
//System.out.println(current_block);

		try {
			String[] current_blocksplit = current_block.split(" ");
			String current_blockvalue = String.valueOf(current_blocksplit[1]);

			if (current_blockvalue.equals("null"))

			{
				System.out.println("Sending null value in current_block");
			}

			else {
				System.out.println(current_block);
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Sending blank value in language_English");

		}
	}

	@Test(priority = 23)
	public void Checktotal_blocksValue() {

		test = extent.createTest("Test 23 - Check total_blocks Value");

		String total_blocks = driver
				.findElement(By.cssSelector(
						"#infoTabContent > dl:nth-child(2) > dd:nth-child(6) > ul:nth-child(1) > li:nth-child(22)"))
				.getText();
//System.out.println(total_blocks);
		try {
			String[] total_blockssplit = total_blocks.split(" ");
			String total_blocksvalue = String.valueOf(total_blockssplit[1]);

			if (total_blocksvalue.equals("null"))

			{
				System.out.println("Sending null value in total_blocks");
			}

			else {
				System.out.println(total_blocks);
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Sending blank value in language_English");

		}
	}

	@Test(priority = 24)
	public void CheckdomainValue() {

		test = extent.createTest("Test 24 - Check domain Value");

		String domain = driver
				.findElement(By.cssSelector(
						"#infoTabContent > dl:nth-child(2) > dd:nth-child(6) > ul:nth-child(1) > li:nth-child(23)"))
				.getText();
//System.out.println(domain);
		try {
			String[] domainsplit = domain.split(" ");
			String domainvalue = String.valueOf(domainsplit[1]);

			if (domainvalue.equals("null"))

			{
				System.out.println("Sending null value in domain");
			}

			else {
				System.out.println(domain);
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Sending blank value in language_English");

		}
	}

	@Test(priority = 25)
	public void CheckadPartnerValue() {

		test = extent.createTest("Test 25 - Check adPartner Value");

		String adPartner = driver
				.findElement(By.cssSelector(
						"#infoTabContent > dl:nth-child(2) > dd:nth-child(6) > ul:nth-child(1) > li:nth-child(24)"))
				.getText();
//System.out.println(adPartner);

		try {
			String[] adPartnersplit = adPartner.split(" ");
			String adPartnervalue = String.valueOf(adPartnersplit[1]);

			if (adPartnervalue.equals("null"))

			{
				System.out.println("Sending null value in adPartner");
			}

			else {
				System.out.println(adPartner);
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Sending blank value in language_English");

		}
	}

	@Test(priority = 26)
	public void CheckadblockerValue() {

		test = extent.createTest("Test 26 - Check adblocker Value");

		String adblocker = driver
				.findElement(By.cssSelector(
						"#infoTabContent > dl:nth-child(2) > dd:nth-child(6) > ul:nth-child(1) > li:nth-child(25)"))
				.getText();
//System.out.println(adblocker);

		try {
			String[] adblockersplit = adblocker.split(" ");
			String adblockervalue = String.valueOf(adblockersplit[1]);

			if (adblockervalue.equals("null"))

			{
				System.out.println("Sending null value in adblocker");
			}

			else {
				System.out.println(adblocker);
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Sending blank value in language_English");

		}
	}

	@Test(priority = 27)
	public void CheckofcValue() {

		test = extent.createTest("Test 27 - Check ofc Value");

		String ofc = driver
				.findElement(By.cssSelector(
						"#infoTabContent > dl:nth-child(2) > dd:nth-child(6) > ul:nth-child(1) > li:nth-child(26)"))
				.getText();
//System.out.println(ofc);

		try {
			String[] ofcsplit = ofc.split(" ");
			String ofcvalue = String.valueOf(ofcsplit[1]);

			if (ofcvalue.equals("null"))

			{
				System.out.println("Sending null value in ofc");
			}

			else {
				System.out.println(ofc);
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Sending blank value in language_English");

		}
	}

	@Test(priority = 28)
	public void Checktotal_adsValue() {

		test = extent.createTest("Test 28 - Check total_ads Value");

		String total_ads = driver
				.findElement(By.cssSelector(
						"#infoTabContent > dl:nth-child(2) > dd:nth-child(6) > ul:nth-child(1) > li:nth-child(27)"))
				.getText();
//System.out.println(total_ads);

		try {
			String[] total_adssplit = total_ads.split(" ");
			String total_adsvalue = String.valueOf(total_adssplit[1]);

			if (total_adsvalue.equals("null"))

			{
				System.out.println("Sending null value in total_ads");
			}

			else {
				System.out.println(total_ads);
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Sending blank value in language_English");

		}
	}

	@Test(priority = 29)
	public void Checktree_idValue() {

		test = extent.createTest("Test 29 - Check tree_id Value");

		String tree_id = driver
				.findElement(By.cssSelector(
						"#infoTabContent > dl:nth-child(2) > dd:nth-child(6) > ul:nth-child(1) > li:nth-child(28)"))
				.getText();
//System.out.println(tree_id);

		try {
			String[] tree_idsplit = tree_id.split(" ");
			String tree_idvalue = String.valueOf(tree_idsplit[1]);

			if (tree_idvalue.equals("null"))

			{
				System.out.println("Sending null value in tree_id");
			}

			else {
				System.out.println(tree_id);
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Sending blank value in language_English");

		}
	}

	@Test(priority = 30)
	public void CheckussValue() {

		test = extent.createTest("Test 30 - Check uss Value");

		String uss = driver
				.findElement(By.cssSelector(
						"#infoTabContent > dl:nth-child(2) > dd:nth-child(6) > ul:nth-child(1) > li:nth-child(29)"))
				.getText();
//System.out.println(uss);

		try {
			String[] usssplit = uss.split(" ");
			String ussvalue = String.valueOf(usssplit[1]);

			if (ussvalue.equals("null"))

			{
				System.out.println("Sending null value in uss");
			}

			else {
				System.out.println(uss);
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Sending blank value in language_English");

		}
	}

	@Test(priority = 31)
	public void CheckpidValue() {

		test = extent.createTest("Test 31 - Check pid Value");

		String pid = driver
				.findElement(By.cssSelector(
						"#infoTabContent > dl:nth-child(2) > dd:nth-child(6) > ul:nth-child(1) > li:nth-child(30)"))
				.getText();
//System.out.println(pid);

		try {
			String[] pidsplit = pid.split(" ");
			String pidvalue = String.valueOf(pidsplit[1]);

			if (pidvalue.equals("null"))

			{
				System.out.println("Sending null value in pid");
			}

			else {
				System.out.println(pid);
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Sending blank value in language_English");

		}
	}

	@Test(priority = 32)
	public void Checkinit_story_idValue() {

		test = extent.createTest("Test 32 - Check init_story_id Value");

		String init_story_id = driver
				.findElement(By.cssSelector(
						"#infoTabContent > dl:nth-child(2) > dd:nth-child(6) > ul:nth-child(1) > li:nth-child(31)"))
				.getText();
//System.out.println(init_story_id);

		try {
			String[] init_story_idsplit = init_story_id.split(" ");
			String init_story_idvalue = String.valueOf(init_story_idsplit[1]);

			if (init_story_idvalue.equals("null"))

			{
				System.out.println("Sending null value in init_story_id");
			}

			else {
				System.out.println(init_story_id);
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Sending blank value in language_English");

		}
	}}


