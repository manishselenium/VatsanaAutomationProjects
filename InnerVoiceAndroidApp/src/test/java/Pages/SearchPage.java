package Pages;


import org.openqa.selenium.By;
import org.testng.Assert;

import Utils.WrapperForGenericMethodsApp;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class SearchPage {
	
	By SearchIcon = By.id("com.wittyfeed.innervoice:id/navigation_search");
	By SearchBox = By.id("com.wittyfeed.innervoice:id/search_src_text");
	By PostSearchResult = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout[3]/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[1]");
	By SelectHashtag = By.id("com.wittyfeed.innervoice:id/btn_hashtag");
	By HashtagSearchResult = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout[3]/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[5]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[1]");
	By SelectPeople = By.id("com.wittyfeed.innervoice:id/btn_people");
	By PeopleSearchResult = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout[3]/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[1]");
//	By NextButton = By.id("com.wittyfeed.innervoice:id/next");
//	By AccessPhotoMediaAllow = By.id("com.android.packageinstaller:id/permission_allow_button");

	WrapperForGenericMethodsApp Action = new WrapperForGenericMethodsApp();

public void SearchIcon(AndroidDriver driver) {
	
	Action.Click(driver, SearchIcon);
	
}

public void PostSearchResult(AndroidDriver driver) {
	
	Action.Sendkeys(driver, SearchBox, "test");
	driver.pressKeyCode(AndroidKeyCode.ENTER);

	
	String str = Action.GetText(driver, PostSearchResult);
	Assert.assertEquals(str, "Test 3 \n" + 
			"\n" + 
			"");
}
public void HashtagSearchResult(AndroidDriver driver) {
	Action.Click(driver, SelectHashtag);
	driver.findElement(SearchBox).clear();
	Action.Sendkeys(driver, SearchBox, "love");
	driver.pressKeyCode(AndroidKeyCode.ENTER);
	String str = Action.GetText(driver, HashtagSearchResult);
	System.out.println("Hello1");
	System.out.println(str);
	System.out.println("Hello1");
	
	
	Assert.assertEquals(str, "awesome\n" + 
			"\n" + 
			"#Philosophy #love \n" + 
			"\n" + 
			"");
}
public void PeopleSearchResult(AndroidDriver driver) {
	Action.Click(driver, SelectPeople);
	driver.findElement(SearchBox).clear();
	Action.Sendkeys(driver, SearchBox, "rohit");
	driver.pressKeyCode(AndroidKeyCode.ENTER);
	String str = Action.GetText(driver, PostSearchResult);
	System.out.println("Hello");
	System.out.println(str);
	System.out.println("Hello");
	Assert.assertEquals(str, "FOLLOW +");
}
}