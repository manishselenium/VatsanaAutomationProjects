package TestSuit;

import org.testng.annotations.Test;
import Pages.CreateNewPostPage;
import Pages.GlobalSignIn;
import io.appium.java_client.TouchAction;


public class CreateNewPostTestCasesTest extends ReportGenerateInnerVoiceApp {
	GlobalSignIn obj1 = new GlobalSignIn();
	
	CreateNewPostPage obj2 = new CreateNewPostPage();

	@Test(priority = 1)
	public void DoSignIn() throws Exception {
		test = extent.createTest("Test 34 - Click Show Feed");
		obj1.Login(driver);

	}

	@Test(priority = 2)
	public void CreatePostOption() throws Exception {
		test = extent.createTest("Test 34 - Click Show Feed");
		obj2.CreatePostOption(driver);

	}
	@Test(priority = 3)
	public void permission_allow_Audio() throws Exception {
		test = extent.createTest("Test 34 - Click Show Feed");
		obj2.permission_allow_Audio(driver);

	}
	
	@Test(priority = 4)
	public void TryNowButton() throws Exception {
		test = extent.createTest("Test 34 - Click Show Feed");
		(new TouchAction(driver)).tap(372, 1118).perform();

	}
	
	@Test(priority = 5)
	public void WriteText() throws Exception {
		test = extent.createTest("Test 34 - Click Show Feed");
		obj2.WriteText(driver);

	}
	@Test(priority = 6)
	public void SelectCategory() throws Exception {
		test = extent.createTest("Test 34 - Click Show Feed");
		obj2.SelectCategory(driver);

	}
	@Test(priority = 7)
	public void ClickNextOnPost() throws Exception {
		test = extent.createTest("Test 34 - Click Show Feed");
		obj2.ClickNextOnPost(driver);

	}
	@Test(priority = 8)
	public void SelectHasTag() throws Exception {
		test = extent.createTest("Test 34 - Click Show Feed");
		obj2.SelectHasTag(driver);

	}
	@Test(priority = 9)
	public void Publish() throws Exception {
		test = extent.createTest("Test 34 - Click Show Feed");
		obj2.Publish(driver);

	}
//	@Test(priority = 2)
//	public void CreatePostOption() throws Exception {
//		CreateNewPostPage obj2 = new CreateNewPostPage();
//		obj2.CreatePostOption(driver);
//
//	}
//
//	@Test(priority = 3)
//	public void permission_allow_Audio() {
//		CreateNewPostPage obj2 = new CreateNewPostPage();
//		obj2.permission_allow_Audio(driver);
//
//	}
//
//	@Test(priority = 4)
//	public void WriteText() {
//		CreateNewPostPage obj2 = new CreateNewPostPage();
//		obj2.WriteText(driver);
//
//	}
//
//	@Test(priority = 5)
//	public void SelectCategory() {
//		CreateNewPostPage obj2 = new CreateNewPostPage();
//		obj2.SelectCategory(driver);
//
//	}
//
//	@Test(priority = 6)
//	public void ClickNextOnPost() {
//		CreateNewPostPage obj2 = new CreateNewPostPage();
//		obj2.ClickNextOnPost(driver);
//
//	}
//
//	@Test(priority = 7)
//			public void SelectHasTag() {
//	
//
//		TouchAction action = new TouchAction(driver);
//		action.longPress(424, 1137).moveTo(443, 424).release().perform();
//		CreateNewPostPage obj2 = new CreateNewPostPage();
//		obj2.SelectHasTag(driver);
//
//	}
//
//	@Test(priority = 8)
//	public void Publish() {
//		CreateNewPostPage obj2 = new CreateNewPostPage();
//		obj2.Publish(driver);
//
//	}

}
