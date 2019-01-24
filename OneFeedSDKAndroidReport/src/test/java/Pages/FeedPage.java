package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import Utils.WrapperForGenericMethods;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class FeedPage {
	By Searchbox = By.id("com.sdk.wittyfeed.demo:id/view_search");
	By FeaturedImage = By.id("com.sdk.wittyfeed.demo:id/image_poster_solo");
	By FeaturedTitle = By.id("com.sdk.wittyfeed.demo:id/view_title");
	By CategoryOnFeaturedImage = By.id("com.sdk.wittyfeed.demo:id/view_category");
	By StorySource = By.id("com.sdk.wittyfeed.demo:id/view_publisher_name");
	By Storywriter = By.id("com.sdk.wittyfeed.demo:id/view_writer");
	By CardStoryImage = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ImageView");
	By CardStoryTitle = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.TextView[1]");
	By CardStorySource = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.TextView[2]");
	By CardStorywriter = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.TextView[3]");
	By ListStoryImage = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.FrameLayout/android.widget.ImageView");
	By ListStoryTitle = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.TextView[1]");
	By ListStorySource = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.TextView[2]");
	By ListStoryWriter = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.TextView[3]");
    By NextFeaturedStoryImage = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ImageView");
    By NextStoryFeaturedTitle = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.TextView[1]");
	By CategoryOnNextStoryFeaturedImage = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.TextView");
	By NextFeaturedStorySource = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.TextView[2]");
	By NextFeaturedStorywriter = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.TextView[3]");
	
	@SuppressWarnings("rawtypes")
	public void Searchbox(AndroidDriver driver) throws Exception {

		int Element = driver.findElements(Searchbox).size();
		Assert.assertEquals(Element, 1);

	}

	@SuppressWarnings("rawtypes")
	public void FeaturedImage(AndroidDriver driver) {

		int Element = driver.findElements(FeaturedImage).size();
		Assert.assertEquals(Element, 1);

	}
	@SuppressWarnings("rawtypes")
	public void FeaturedTitle(AndroidDriver driver) {

		int Element = driver.findElements(FeaturedImage).size();
		Assert.assertEquals(Element, 1);

	}
	
	@SuppressWarnings("rawtypes")
	public void CategoryOnFeaturedImage(AndroidDriver driver) {

		int Element = driver.findElements(CategoryOnFeaturedImage).size();
		Assert.assertEquals(Element, 3);

	}
	
	@SuppressWarnings("rawtypes")
	public void StorySource(AndroidDriver driver) {

		int Element = driver.findElements(StorySource).size();
		Assert.assertEquals(Element, 1);
		
	}
	
	@SuppressWarnings("rawtypes")
	public void Storywriter(AndroidDriver driver) {

		int Element = driver.findElements(Storywriter).size();
		Assert.assertEquals(Element, 1);

	}
	
	@SuppressWarnings("rawtypes")
	public void CardStoryImage(AndroidDriver driver) {

		int Element = driver.findElements(CardStoryImage).size();
		Assert.assertEquals(Element, 1);
	}
	@SuppressWarnings("rawtypes")
	public void CardStoryTitle(AndroidDriver driver) {


		TouchAction action = new TouchAction(driver);
		action.longPress(424,1137).moveTo(443,424).release().perform();

		int Element = driver.findElements(CardStoryTitle).size();
		Assert.assertEquals(Element, 1);
	}
	
	@SuppressWarnings("rawtypes")
	public void CardStorywriter(AndroidDriver driver) {

		int Element = driver.findElements(CardStorywriter).size();
		Assert.assertEquals(Element, 1);
	}
	

	public void ListStoryImage(AndroidDriver driver) {

		int Element = driver.findElements(ListStoryImage).size();
		Assert.assertEquals(Element, 1);
	}
	
	public void ListStoryTitle(AndroidDriver driver) {

		int Element = driver.findElements(ListStoryTitle).size();
		Assert.assertEquals(Element, 1);
	}
	public void ListStorySource(AndroidDriver driver) {

		int Element = driver.findElements(ListStorySource).size();
		Assert.assertEquals(Element, 1);
	}
	public void ListStoryWriter(AndroidDriver driver) {

		int Element = driver.findElements(ListStoryWriter).size();
		Assert.assertEquals(Element, 1);
	}
	
	public void NextFeaturedStoryImage(AndroidDriver driver) {
		
		TouchAction action = new TouchAction(driver);
		action.longPress(424,1137).moveTo(443,424).release().perform();
		action.longPress(424,1137).moveTo(443,424).release().perform();

		int Element = driver.findElements(NextFeaturedStoryImage).size();
		Assert.assertEquals(Element, 1);
	}
	
public void NextStoryFeaturedTitle(AndroidDriver driver) {
		
		

		int Element = driver.findElements(NextStoryFeaturedTitle).size();
		Assert.assertEquals(Element, 1);
	}
public void CategoryOnNextStoryFeaturedImage(AndroidDriver driver) {
	
	

	int Element = driver.findElements(CategoryOnNextStoryFeaturedImage).size();
	Assert.assertEquals(Element, 1);
}
public void NextFeaturedStorySource(AndroidDriver driver) {
	
	

	int Element = driver.findElements(NextFeaturedStorySource).size();
	Assert.assertEquals(Element, 1);
}
public void NextFeaturedStorywriter(AndroidDriver driver) {
	
	
	int Element = driver.findElements(NextFeaturedStorywriter).size();
	Assert.assertEquals(Element, 1);
}

	
}
