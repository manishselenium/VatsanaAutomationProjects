package TestSuit;

import org.testng.annotations.Test;
import Pages.GlobalSignIn;
import Pages.UserFollowPage;

public class UserFollowPageTestcasesTest extends ReportGenerateInnerVoiceApp {
	GlobalSignIn obj1 = new GlobalSignIn();
    UserFollowPage obj2 = new UserFollowPage();

	@Test(priority = 1)
	public void DoSignIn() throws Exception {
		test = extent.createTest("Test 34 - Click Show Feed");
		obj1.Login(driver);

	}
	@Test(priority = 2)
	public void ClickUserProfileIcon() throws Exception {
		test = extent.createTest("Test 34 - Click Show Feed");

		obj2.UserProfileIcon(driver);

	}
	
	@Test(priority = 3)
	public void ClickFollowButton() throws Exception {
		test = extent.createTest("Test 34 - Click Show Feed");

		obj2.FollowButton(driver);

	}

	@Test(priority = 4)
	public void ClickUnFollowButton() throws Exception {
		test = extent.createTest("Test 34 - Check Search Box");

		obj2.UnFollowButton(driver);
	}
}
