package Pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import Utils.WrapperForGenericMethodsApp;
import io.appium.java_client.android.AndroidDriver;

public class HomePage {

	By ShowFeed = By.id("com.sdk.wittyfeed.demo:id/btn_feed");
	
	
	@SuppressWarnings("rawtypes")
	public void ShowFeed(AndroidDriver driver) throws Exception {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WrapperForGenericMethodsApp Action = new WrapperForGenericMethodsApp();
		
		Action.Click(driver, ShowFeed);
        
		

	}

}
