package TestSuit;


import org.testng.annotations.Test;
import Pages.HomePage;
import Pages.InnnerVoiceSignInPage;



public class InnerVoiceSignInTestCases extends ReportGenerateInnerVoiceApp {

//	@Test(priority = 1)
//	public void Facebook() throws Exception {
//		test = extent.createTest("Test 34 - Click Show Feed");
//		InnnerVoiceSignInPage obj = new InnnerVoiceSignInPage();
//		obj.ClickFacebook(driver);
//
//	}
//
//	
//	@Test(priority = 2)
//	public void EnterFacebookEmail() throws Exception {
//		test = extent.createTest("Test 34 - Check Search Box");
//		InnnerVoiceSignInPage obj = new InnnerVoiceSignInPage();
//		obj.FacebookEmail(driver);
//	}
//
//	
//	@Test(priority = 3)
//	public void EnterFacebookPassword() throws Exception {
//		test = extent.createTest("Test 34 - Check Featured Image");
//		InnnerVoiceSignInPage obj = new InnnerVoiceSignInPage();
//		obj.FacebookPassword(driver);
//
//	}
//
//	
//	@Test(priority = 4)
//	public void ClickLoginButton() throws Exception {
//		test = extent.createTest("Test 34 - Check Featured Title");
//		InnnerVoiceSignInPage obj = new InnnerVoiceSignInPage();
//		obj.LoginButton(driver);
//	}
//
//	@Test(priority = 5)
//	public void ContinuAsInFB() throws Exception {
//		test = extent.createTest("Test 34 - Check Category On Featured Image");
//		InnnerVoiceSignInPage obj = new InnnerVoiceSignInPage();
//		obj.ContinuAsInFB(driver);
//	}
//
//	@Test(priority = 6)
//	public void SelectInterest() throws Exception {
//		test = extent.createTest("Test 34 - Check Story Source");
//		InnnerVoiceSignInPage obj = new InnnerVoiceSignInPage();
//		obj.SelectInterest(driver);
//	}
//
//	@Test(priority = 7)
//	public void ClickNextButton() throws Exception {
//		test = extent.createTest("Test 34 - Check Story writer");
//		InnnerVoiceSignInPage obj = new InnnerVoiceSignInPage();
//		obj.ClickNextButton(driver);
//	}

	@Test(priority = 1)
	public void Clicktwitter() throws Exception {
		test = extent.createTest("Test 34 - Click Show Feed");
		InnnerVoiceSignInPage obj = new InnnerVoiceSignInPage();
		obj.Clicktwitter(driver);

	}

	
	@Test(priority = 2)
	public void twitterEmail() throws Exception {
		test = extent.createTest("Test 34 - Check Search Box");
		InnnerVoiceSignInPage obj = new InnnerVoiceSignInPage();
		obj.twitterEmail(driver);
	}

	
	@Test(priority = 3)
	public void EntertwitterPassword() throws Exception {
		test = extent.createTest("Test 34 - Check Featured Image");
		InnnerVoiceSignInPage obj = new InnnerVoiceSignInPage();
		obj.twitterPassword(driver);

	}

	
	@Test(priority = 4)
	public void LoginButtonTwitter() throws Exception {
		test = extent.createTest("Test 34 - Check Featured Title");
		InnnerVoiceSignInPage obj = new InnnerVoiceSignInPage();
		obj.LoginButtonTwitter(driver);
	}
	@Test(priority = 5)
	public void ClickNextButton() throws Exception {
		test = extent.createTest("Test 34 - Check Story writer");
		InnnerVoiceSignInPage obj = new InnnerVoiceSignInPage();
		obj.ClickNextButton(driver);
	}
	
	
	@Test(priority = 6)
	public void ClickAccessPhotoMediaAllow() throws Exception {
		test = extent.createTest("Test 34 - Check Story writer");
		InnnerVoiceSignInPage obj = new InnnerVoiceSignInPage();
		obj.AccessPhotoMediaAllow(driver);
	}
}
