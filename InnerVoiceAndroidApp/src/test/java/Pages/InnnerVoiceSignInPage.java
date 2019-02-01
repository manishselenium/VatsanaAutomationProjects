package Pages;

import org.openqa.selenium.By;


import Utils.WrapperForGenericMethodsApp;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class InnnerVoiceSignInPage {
	By Facebook = By.id("com.wittyfeed.innervoice:id/btn_facebook");
	By FacebookEmail = By.id("m_login_email");
	By FacebookPassword = By.id("m_login_password");
	By LoginButton = By.xpath("//android.widget.Button[@content-desc='Log In ']");
	By ContinuAsInFB = By.id("u_0_3");
	By SelectInterest1 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.Button");
	By SelectInterest2 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.Button");
	By SelectInterest3 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[4]/android.widget.Button");
	By NextButton = By.id("com.wittyfeed.innervoice:id/next");
	By AccessPhotoMediaAllow = By.id("com.android.packageinstaller:id/permission_allow_button");
	By permission_allow_Audio = By.id("com.android.packageinstaller:id/permission_allow_button");
	
	By twitter = By.id("com.wittyfeed.innervoice:id/btn_twitter");
	By twitterEmail = By.id("username_or_email");
	By twitterPassword = By.id("password");
	By twitterLoginButton = By.id("allow");
	
	
	
	//	By CategoryOnFeaturedImage = By.id("com.sdk.wittyfeed.demo:id/view_category");
//	By StorySource = By.id("com.sdk.wittyfeed.demo:id/view_publisher_name");
//	By Storywriter = By.id("com.sdk.wittyfeed.demo:id/view_writer");
//	By CardStoryImage = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ImageView");
//	By CardStoryTitle = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.TextView[1]");
//	By CardStorySource = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.TextView[2]");
//	By CardStorywriter = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.TextView[3]");
//	By ListStoryImage = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.FrameLayout/android.widget.ImageView");
//	By ListStoryTitle = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.TextView[1]");
//	By ListStorySource = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.TextView[2]");
//	By ListStoryWriter = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.TextView[3]");
//    By NextFeaturedStoryImage = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ImageView");
//    By NextStoryFeaturedTitle = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.TextView[1]");
//	By CategoryOnNextStoryFeaturedImage = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.TextView");
//	By NextFeaturedStorySource = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.TextView[2]");
//	By NextFeaturedStorywriter = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.TextView[3]");
	
	
	WrapperForGenericMethodsApp Action = new WrapperForGenericMethodsApp();
	@SuppressWarnings("rawtypes")
	public void ClickFacebook(AndroidDriver driver) throws Exception {

		Action.Click(driver, Facebook);
		

	}

	@SuppressWarnings("rawtypes")
	public void FacebookEmail(AndroidDriver driver) {

    Action.Sendkeys(driver, FacebookEmail, "7974346641");

	}
	@SuppressWarnings("rawtypes")
	public void FacebookPassword(AndroidDriver driver) {
    Action.Sendkeys(driver, FacebookPassword, "Witty@123");

	}
	
	@SuppressWarnings("rawtypes")
	public void LoginButton(AndroidDriver driver) {

	Action.Click(driver, LoginButton);

	}
	
	@SuppressWarnings("rawtypes")
	public void ContinuAsInFB(AndroidDriver driver) {

	Action.Click(driver, ContinuAsInFB);

	}
	
	@SuppressWarnings("rawtypes")
	public void SelectInterest(AndroidDriver driver) {

	Action.Click(driver, SelectInterest1);
	Action.Click(driver, SelectInterest2);
	TouchAction action = new TouchAction(driver);
	action.longPress(424,1137).moveTo(443,424).release().perform();
	Action.Click(driver, SelectInterest3);

	}
	
	@SuppressWarnings("rawtypes")
	public void ClickNextButton(AndroidDriver driver) {

		Action.Click(driver, NextButton);
		
	}
	
	
	public void Clicktwitter(AndroidDriver driver) throws Exception {

		Action.Click(driver, twitter);
		

	}

	@SuppressWarnings("rawtypes")
	public void twitterEmail(AndroidDriver driver) {

    Action.Sendkeys(driver, twitterEmail, "manish@vatsana.com");

	}
	@SuppressWarnings("rawtypes")
	public void twitterPassword(AndroidDriver driver) {
    Action.Sendkeys(driver, twitterPassword, "Gate6@123");

	}
	
	@SuppressWarnings("rawtypes")
	public void LoginButtonTwitter(AndroidDriver driver) {

	Action.Click(driver, twitterLoginButton);

	}
	
	public void AccessPhotoMediaAllow(AndroidDriver driver) {

	Action.Click(driver, AccessPhotoMediaAllow);

	}
	
	
//	@SuppressWarnings("rawtypes")
//	public void Storywriter(AndroidDriver driver) {
//
//		int Element = driver.findElements(Storywriter).size();
//		Assert.assertEquals(Element, 1);
//
//	}
//	
//	@SuppressWarnings("rawtypes")
//	public void CardStoryImage(AndroidDriver driver) {
//
//		int Element = driver.findElements(CardStoryImage).size();
//		Assert.assertEquals(Element, 1);
//	}
//	@SuppressWarnings("rawtypes")
//	public void CardStoryTitle(AndroidDriver driver) {
//
//
//		TouchAction action = new TouchAction(driver);
//		action.longPress(424,1137).moveTo(443,424).release().perform();
//
//		int Element = driver.findElements(CardStoryTitle).size();
//		Assert.assertEquals(Element, 1);
//	}
//	
//	@SuppressWarnings("rawtypes")
//	public void CardStorywriter(AndroidDriver driver) {
//
//		int Element = driver.findElements(CardStorywriter).size();
//		Assert.assertEquals(Element, 1);
//	}
//	
//
//	public void ListStoryImage(AndroidDriver driver) {
//
//		int Element = driver.findElements(ListStoryImage).size();
//		Assert.assertEquals(Element, 1);
//	}
//	
//	public void ListStoryTitle(AndroidDriver driver) {
//
//		int Element = driver.findElements(ListStoryTitle).size();
//		Assert.assertEquals(Element, 1);
//	}
//	public void ListStorySource(AndroidDriver driver) {
//
//		int Element = driver.findElements(ListStorySource).size();
//		Assert.assertEquals(Element, 1);
//	}
//	public void ListStoryWriter(AndroidDriver driver) {
//
//		int Element = driver.findElements(ListStoryWriter).size();
//		Assert.assertEquals(Element, 1);
//	}
//	
//	public void NextFeaturedStoryImage(AndroidDriver driver) {
//		
//		TouchAction action = new TouchAction(driver);
//		action.longPress(424,1137).moveTo(443,424).release().perform();
//		action.longPress(424,1137).moveTo(443,424).release().perform();
//
//		int Element = driver.findElements(NextFeaturedStoryImage).size();
//		Assert.assertEquals(Element, 1);
//	}
//	
//public void NextStoryFeaturedTitle(AndroidDriver driver) {
//		
//		
//
//		int Element = driver.findElements(NextStoryFeaturedTitle).size();
//		Assert.assertEquals(Element, 1);
//	}
//public void CategoryOnNextStoryFeaturedImage(AndroidDriver driver) {
//	
//	
//
//	int Element = driver.findElements(CategoryOnNextStoryFeaturedImage).size();
//	Assert.assertEquals(Element, 1);
//}
//public void NextFeaturedStorySource(AndroidDriver driver) {
//	
//	
//
//	int Element = driver.findElements(NextFeaturedStorySource).size();
//	Assert.assertEquals(Element, 1);
//}
//public void NextFeaturedStorywriter(AndroidDriver driver) {
//	
//	
//	int Element = driver.findElements(NextFeaturedStorywriter).size();
//	Assert.assertEquals(Element, 1);
//}

	
}
