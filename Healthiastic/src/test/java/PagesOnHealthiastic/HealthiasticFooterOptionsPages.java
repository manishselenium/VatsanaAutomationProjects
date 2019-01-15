package PagesOnHealthiastic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import UtilsOnFeed.WrapperGenericMethod;


public class HealthiasticFooterOptionsPages extends HealthiasticCatagoriesPage {

	By SiteLogo = By.cssSelector(".brand-logo > svg:nth-child(1)");
	By TermsOfUse = By.cssSelector(".list-inline > li:nth-child(2) > a:nth-child(1)");
	By PrivacyPolicy = By.cssSelector(".list-inline > li:nth-child(2) > a:nth-child(1)");
	By TermsOfUseElement = By.cssSelector("div.col:nth-child(1) > h1:nth-child(1)");
	By PrivacyPolicyElement = By.cssSelector("div.l12:nth-child(1) > h1:nth-child(1)");
	
	WrapperGenericMethod Action = new WrapperGenericMethod();

	public void ClickHamburgerMenu(WebDriver driver) {

		Action.Click(driver, HamburgerMenu);
	}



	public void TermsOfUse(WebDriver driver) {

		int Element = driver.findElements(TermsOfUse).size();
		Assert.assertEquals(Element, 1);
	}

	public void PrivacyPolicy(WebDriver driver) throws InterruptedException {

		int Element = driver.findElements(PrivacyPolicy).size();
		Assert.assertEquals(Element, 1);
	}

	
	public void TermsOfUsePage(WebDriver driver) throws InterruptedException {

		WebElement element = driver.findElement(TermsOfUse);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(1000);

		Action.Click(driver, TermsOfUse);

		int Element = driver.findElements(TermsOfUseElement).size();
		Assert.assertEquals(Element, 1);

		Action.Click(driver, SiteLogo);
		
		Action.Click(driver, HamburgerMenu);
	}

	public void PrivacyPolicyPage(WebDriver driver) throws InterruptedException {

		WebElement element = driver.findElement(PrivacyPolicy);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(1000);

		Action.Click(driver, PrivacyPolicy);

		int Element = driver.findElements(PrivacyPolicyElement).size();
		Assert.assertEquals(Element, 1);

		Action.Click(driver, SiteLogo);
		
		Action.Click(driver, HamburgerMenu);
	}

	

}
