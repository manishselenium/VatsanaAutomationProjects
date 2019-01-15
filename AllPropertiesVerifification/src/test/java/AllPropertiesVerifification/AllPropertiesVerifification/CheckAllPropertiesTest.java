package AllPropertiesVerifification.AllPropertiesVerifification;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckAllPropertiesTest extends ReportGenerateAllProp

{

	@Test(priority = 1)
	public void CheckThephilipino() {

		driver.get("https://www.thephilipino.com/");

		String Title = driver.getTitle();
		// System.out.println(Title);
		Assert.assertEquals("Everything You Wanted to Read on the Internet", Title);
		driver.findElement(By.cssSelector(".brand-logo > svg:nth-child(1)"));
		test = extent.createTest("Test 1 - Check Thephilipino");

	}

	@Test(priority = 2)
	public void CheckMostlymoney() {

		driver.get("https://www.mostlymoney.me/");

		String Title = driver.getTitle();
		Assert.assertEquals("Money Made Easy - Finance, Economy and Business", Title);
		// System.out.println(Title);
		driver.findElement(By.cssSelector(".brand-logo > svg:nth-child(1)"));
		test = extent.createTest("Test 2 - Check Mostlymoney");

	}

	@Test(priority = 3)
	public void CheckHealthiastic() {

		driver.get("https://www.healthiastic.com/");

		String Title = driver.getTitle();
		Assert.assertEquals("Healthiastic | Stories on Health Tips, Fitness, Women's Beauty & Lifestyle", Title);
		// System.out.println(Title);
		driver.findElement(By.cssSelector(".brand-logo > svg:nth-child(1)"));
		test = extent.createTest("Test 3 - Check Healthiastic");

	}

	@Test(priority = 4)
	public void CheckFactsonly() {

		driver.get("https://www.factsonly.me/");

		String Title = driver.getTitle();
		Assert.assertEquals("Random, Interesting, Weird, Fun Facts and Everything on the Internet", Title);
		// System.out.println(Title);
		driver.findElement(By.cssSelector(".brand-logo > svg:nth-child(1)"));
		test = extent.createTest("Test 4 - Check Factsonly");

	}

	@Test(priority = 5)
	public void CheckWittyfeed() {

		driver.get("https://www.wittyfeed.tv/");

		String Title = driver.getTitle();
		Assert.assertEquals("WittyFeed - Latest News, Viral Stories and Trending Videos", Title);

		driver.findElement(By.cssSelector(".brand-logo > svg:nth-child(1)"));
		test = extent.createTest("Test 5 -  Check Wittyfeed");

	}

	@Test(priority = 6)
	public void CheckDuniadigest() {

		driver.get("https://www.duniadigest.com/");

		String Title = driver.getTitle();
		Assert.assertEquals(
				"Dunia Digest | जितने लोकल, उतने ग्लोबल | गली-मोहल्लों से विदेशों तक के किस्से, स्टोरीज़ व वीडियोज़",
				Title);
		// System.out.println(Title);
		driver.findElement(By.cssSelector("body > header > nav > div > div > a.brand-logo > img"));
		test = extent.createTest("Test 6 - Check Duniadigest");

	}

	@Test(priority = 7)
	public void CheckInnervoice() {

		driver.get("https://www.innervoice.ai/");

		String Title = driver.getTitle();
		Assert.assertEquals("InnerVoice - Inspiring & Motivational Quotes, Stories and Tales", Title);
		// System.out.println(Title);
		driver.findElement(By.cssSelector(".brand-logo > svg:nth-child(1)"));
		test = extent.createTest("Test 7 - Check Innervoice");

	}

	@Test(priority = 8)
	public void CheckThepopple() {

		driver.get("https://www.thepopple.com/");

		String Title = driver.getTitle();
		Assert.assertEquals("The Popple - Latest & Trending Stories and Videos from Around the Globe", Title);
		// System.out.println(Title);
		driver.findElement(By.cssSelector(".brand-logo > svg:nth-child(1)"));
		test = extent.createTest("Test 8 - Check Thepopple");

	}

	@Test(priority = 9)
	public void CheckGeeksmate() {

		driver.get("https://www.geeksmate.io/");

		String Title = driver.getTitle();
		Assert.assertEquals("GeeksMate - Latest Tech & Gadget News, Reviews, Stories, Gaming and Videos", Title);
		// System.out.println(Title);
		driver.findElement(By.cssSelector(".brand-logo > svg:nth-child(1)"));
		test = extent.createTest("Test 9 - Check Geeksmate");
	}

	@Test(priority = 10)
	public void CheckHollywoodpie() {

		driver.get("https://www.hollywoodpie.com/");

		String Title = driver.getTitle();
		Assert.assertEquals("We Have FILLINGS for You | Celebrity, Music and Film", Title);
		// System.out.println(Title);
		driver.findElement(By.cssSelector(".brand-logo > svg:nth-child(1)"));
		test = extent.createTest("Test 10 - Check Hollywoodpie");

	}

	@Test(priority = 11)
	public void CheckFoodmate() {

		driver.get("https://www.foodmate.me/");

		String Title = driver.getTitle();
		Assert.assertEquals("FoodMate - Veg and Non-Veg Food Recipes, Tricks and more..", Title);
		// System.out.println(Title);
		driver.findElement(By.cssSelector(".brand-logo > svg:nth-child(1)"));
		test = extent.createTest("Test 111 - Check Foodmate");

	}
}