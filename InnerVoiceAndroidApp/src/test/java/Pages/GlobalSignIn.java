package Pages;

import org.openqa.selenium.By;

import Utils.WrapperForGenericMethodsApp;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class GlobalSignIn  {
	
	By twitter = By.id("com.wittyfeed.innervoice:id/btn_twitter");
	By twitterEmail = By.id("username_or_email");
	By twitterPassword = By.id("password");
	By twitterLoginButton = By.id("allow");
	By MobileNumberfield = By.id("challenge_response");
	By Submit = By.xpath("//android.widget.Button[@content-desc='Submit']");
	By AuthorizeAppButton = By.xpath("//android.widget.Button[@content-desc='Authorize app']");
	By NextButton = By.id("com.wittyfeed.innervoice:id/next");
	By AccessPhotoMediaAllow = By.id("com.android.packageinstaller:id/permission_allow_button");
	WrapperForGenericMethodsApp Action = new WrapperForGenericMethodsApp();
	
	public void Login(AndroidDriver driver) throws Exception {

		Action.Click(driver, twitter);
		Action.Sendkeys(driver, twitterEmail, "manish@vatsana.com");
        Action.Sendkeys(driver, twitterPassword, "Gate6@123");
        Action.Click(driver, twitterLoginButton);
//        Action.Sendkeys(driver, MobileNumberfield, "7974346641");
//        (new TouchAction(driver)).tap(644, 413).perform();
//        Action.Click(driver, Submit);
       // Action.Click(driver, AuthorizeAppButton);
        Action.Click(driver, NextButton);
        Action.Click(driver, AccessPhotoMediaAllow);
        
  
       
	}

	
}
