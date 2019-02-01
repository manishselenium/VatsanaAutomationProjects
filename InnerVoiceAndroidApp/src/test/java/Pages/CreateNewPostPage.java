package Pages;

import org.openqa.selenium.By;

import Utils.WrapperForGenericMethodsApp;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;


public class CreateNewPostPage {
	
	By CreatePostOption = By.id("com.wittyfeed.innervoice:id/navigation_write");
	By permission_allow_Audio = By.id("com.android.packageinstaller:id/permission_allow_button");
	By GotIt = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.ViewFlipper/android.widget.ImageButton");
	By WriteText = By.id("com.wittyfeed.innervoice:id/custom_edittext_write_activity");
	By SelectCategory = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.Button[1]");
	By ClickNextOnPost = By.id("com.wittyfeed.innervoice:id/btn_next");
	By SelectHasTag = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.TextView");
    By Publish = By.id("com.wittyfeed.innervoice:id/text_publish");
    
   
	
	 WrapperForGenericMethodsApp Action = new WrapperForGenericMethodsApp();
	
	
public void CreatePostOption(AndroidDriver driver) throws Exception {

		Action.Click(driver, CreatePostOption);
		

	}

	@SuppressWarnings("rawtypes")
	public void permission_allow_Audio(AndroidDriver driver) {

	Action.Click(driver, permission_allow_Audio);

	}
	@SuppressWarnings("rawtypes")
	public void GotIt(AndroidDriver driver) {

	Action.Click(driver, GotIt);

	}
	
	
	@SuppressWarnings("rawtypes")
	public void WriteText(AndroidDriver driver) {

    Action.Sendkeys(driver, WriteText, "TestAutomation");

	}
	@SuppressWarnings("rawtypes")
	public void SelectCategory(AndroidDriver driver) {
    Action.Click(driver, SelectCategory);

	}
	
	
	@SuppressWarnings("rawtypes")
	public void ClickNextOnPost(AndroidDriver driver) {

	Action.Click(driver, ClickNextOnPost);

	}
	
	@SuppressWarnings("rawtypes")
	public void SelectHasTag(AndroidDriver driver) {

	
	TouchAction action = new TouchAction(driver);
	action.longPress(424,1137).moveTo(443,424).release().perform();
	Action.Click(driver, SelectHasTag);

	}
	


	
	
	@SuppressWarnings("rawtypes")
	public void Publish(AndroidDriver driver) {

	Action.Click(driver, Publish);
	(new TouchAction(driver)).tap(377, 281).perform();
	}
    
   
}
