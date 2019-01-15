package UtilsOnFeed;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WrapperGenericMethod {

	public void Click(WebDriver driver, By by) {
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);

		driver.findElement(by).click();
	}

	public void Sendkeys(WebDriver driver, By by, String key) {
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);

		driver.findElement(by).sendKeys(key);
	}

	public String NoAction(WebDriver driver, By by) {
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);

		String Obj = driver.findElement(by).getAttribute("name");

		return Obj;

	}

	public String GetText(WebDriver driver, By by) {
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		String Text = driver.findElement(by).getText();

		return Text;
	}

	public void Clear(WebDriver driver, By by) {
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);

		driver.findElement(by).clear();
	}
	
	
}
