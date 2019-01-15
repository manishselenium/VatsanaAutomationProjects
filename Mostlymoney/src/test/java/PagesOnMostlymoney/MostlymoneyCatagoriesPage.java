package PagesOnMostlymoney;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import UtilsOnFeed.WrapperGenericMethod;

public class MostlymoneyCatagoriesPage {

	By HomePageLogo = By.cssSelector(".brand-logo > svg:nth-child(1)");
	By HamburgerMenu = By.cssSelector(".sidenav-trigger > svg:nth-child(1)");
	By Money = By.cssSelector("li.web_listMenu__section:nth-child(1) > a:nth-child(1)");
	By Life= By.cssSelector("li.web_listMenu__section:nth-child(2) > a:nth-child(1)");
	By Success = By.cssSelector("li.web_listMenu__section:nth-child(3) > a:nth-child(1)");
	By Security = By.cssSelector("li.web_listMenu__section:nth-child(4) > a:nth-child(1)");
	
	
	

	WrapperGenericMethod Action = new WrapperGenericMethod();

	public void ClickHamburgerMenu(WebDriver driver) {

		Action.Click(driver, HamburgerMenu);
	}

	public void MoneyCata(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(Money);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(Money).size();
		Assert.assertEquals(Element, 1);
	}

	public void LifeCata(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(Life);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(Life).size();
		Assert.assertEquals(Element, 1);
	}

	public void SuccessCata(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(Success);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(Success).size();
		Assert.assertEquals(Element, 1);
	}

	public void SecurityCata(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(Security);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(Security).size();
		Assert.assertEquals(Element, 1);
	}



	public void ClickMoney(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(Money);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Money);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.mostlymoney.me/money");

		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void ClickLife(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(Life);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Life);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.mostlymoney.me/life");

		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void ClickSuccess(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(Success);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Success);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.mostlymoney.me/success");

		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void ClickSecurity(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(Security);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Security);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.mostlymoney.me/security");

		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}
	

}
