package TestSuit;

import org.testng.annotations.Test;

import Pages.GlobalSignIn;

import Pages.SearchPage;

public class SearchPagetestcasesTest extends ReportGenerateInnerVoiceApp {
	GlobalSignIn obj1 = new GlobalSignIn();

	SearchPage obj2 = new SearchPage();

	@Test(priority = 1)
	public void DoSignIn() throws Exception {
		test = extent.createTest("Test 34 - Click Show Feed");
		obj1.Login(driver);

	}

	@Test(priority = 2)
	public void ClickSearchIcon() throws Exception {
		test = extent.createTest("Test 34 - Click Show Feed");

		obj2.SearchIcon(driver);

	}

	@Test(priority = 3)
	public void GetPostSearchResult() throws Exception {
		test = extent.createTest("Test 34 - Check Search Box");

		obj2.PostSearchResult(driver);
	}

	@Test(priority = 4)
	public void GetHashtagSearchResult() throws Exception {
		test = extent.createTest("Test 34 - Check Search Box");

		obj2.HashtagSearchResult(driver);
	}

	@Test(priority = 5)
	public void GetPeopleSearchResult() throws Exception {
		test = extent.createTest("Test 34 - Check Search Box");

		obj2.PeopleSearchResult(driver);
	}

}
