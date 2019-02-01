package Pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import Utils.WrapperForGenericMethodsApp;
import io.appium.java_client.android.AndroidDriver;

public class UserFollowPage {
	
	
	By UserProfileIcon = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[1]");
	By FollowButton = By.id("com.wittyfeed.innervoice:id/button_follow");
	//By FollowButton = By.id("com.wittyfeed.innervoice:id/button_follow");
//	By PostSearchResult = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout[3]/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[1]");

//	By HashtagSearchResult = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout[3]/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[5]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[1]");
//	By SelectPeople = By.id("com.wittyfeed.innervoice:id/btn_people");
//	By PeopleSearchResult = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout[3]/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[1]");


	WrapperForGenericMethodsApp Action = new WrapperForGenericMethodsApp();

public void UserProfileIcon(AndroidDriver driver) {
	
	Action.Click(driver, UserProfileIcon);
	
}

public void FollowButton(AndroidDriver driver) {
	
	Action.Click(driver, FollowButton);
	
	String str = Action.GetText(driver, FollowButton);
	System.out.println("Hello1");
	System.out.println(str);
	System.out.println("Hello1");
	Assert.assertEquals(str, "FOLLOWING");
}

public void UnFollowButton(AndroidDriver driver) {
	
	Action.Click(driver, FollowButton);
	
	String str = Action.GetText(driver, FollowButton);
	System.out.println("Hello");
	System.out.println(str);
	System.out.println("Hello");
	Assert.assertEquals(str, "FOLLOW  +");
}
}
