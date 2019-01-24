package TestSuit;


import org.testng.annotations.Test;
import Pages.HomePage;
import Pages.FeedPage;



public class OneFeedTest extends ReportGenerateOneFeedAndroid {

	@Test(priority = 1)
	public void ClickShowFeed() throws Exception {
		test = extent.createTest("Test 34 - Click Show Feed");
		HomePage obj = new HomePage();
		obj.ShowFeed(driver);

	}

	
	@Test(priority = 2)
	public void CheckSearchBox() throws Exception {
		test = extent.createTest("Test 34 - Check Search Box");
		FeedPage obj = new FeedPage();
		obj.Searchbox(driver);
	}

	
	@Test(priority = 3)
	public void CheckFeaturedImage() throws Exception {
		test = extent.createTest("Test 34 - Check Featured Image");
		FeedPage obj = new FeedPage();
		obj.FeaturedImage(driver);

	}

	
	@Test(priority = 4)
	public void CheckFeaturedTitle() throws Exception {
		test = extent.createTest("Test 34 - Check Featured Title");
		FeedPage obj = new FeedPage();
		obj.FeaturedTitle(driver);
	}

	@Test(priority = 5)
	public void CheckCategoryOnFeaturedImage() throws Exception {
		test = extent.createTest("Test 34 - Check Category On Featured Image");
		FeedPage obj = new FeedPage();
		obj.CategoryOnFeaturedImage(driver);
	}

	@Test(priority = 6)
	public void CheckStorySource() throws Exception {
		test = extent.createTest("Test 34 - Check Story Source");
		FeedPage obj = new FeedPage();
		obj.StorySource(driver);
	}

	@Test(priority = 7)
	public void CheckStorywriter() throws Exception {
		test = extent.createTest("Test 34 - Check Story writer");
		FeedPage obj = new FeedPage();
		obj.Storywriter(driver);
	}

	@Test(priority = 8)
	public void CheckCardStoryImage() throws Exception {
		test = extent.createTest("Test 34 - Check Card Story Image");
		FeedPage obj = new FeedPage();
		obj.CardStoryImage(driver);
	}

	@Test(priority = 9)
	public void CheckCardStoryTitle() throws Exception {
		test = extent.createTest("Test 34 - Check Card Story Title");
		FeedPage obj = new FeedPage();
		obj.CardStoryTitle(driver);
	}

	@Test(priority = 10)
	public void CheckCardStorywriter() throws Exception {
		test = extent.createTest("Test 34 - Check Card Story writer");
		FeedPage obj = new FeedPage();
		obj.CardStorywriter(driver);
	}

//	@Test(priority = 9)
//	public void CheckCardStorySource() throws Exception {
//
//		FeedPage obj = new FeedPage();
//		obj.CardStorySource(driver);
//	}
	
	@Test(priority = 11)
	public void CheckListStoryImage() throws Exception {
		test = extent.createTest("Test 34 - Check List Story Image");
		FeedPage obj = new FeedPage();
		obj.ListStoryImage(driver);
	}
	@Test(priority = 12)
	public void CheckListStoryTitle() throws Exception {
		test = extent.createTest("Test 34 - Check List Story Title");
		FeedPage obj = new FeedPage();
		obj.ListStoryTitle(driver);
	}
	@Test(priority = 13)
	public void CheckListStoryWriter() throws Exception {
		test = extent.createTest("Test 34 - Check List Story Writer");
		FeedPage obj = new FeedPage();
		obj.ListStoryWriter(driver);
	}
	@Test(priority = 14)
	public void CheckListStorySource() throws Exception {
		test = extent.createTest("Test 34 - Check List Story Source");
		FeedPage obj = new FeedPage();
		obj.ListStorySource(driver);
	}

	@Test(priority = 15)
	public void CheckNextStoryFeaturedImage() throws Exception {
		test = extent.createTest("Test 34 - Check Next Story Featured Image");
		FeedPage obj = new FeedPage();
		obj.NextFeaturedStoryImage(driver);
	}
	@Test(priority = 16)
	public void CheckNextStoryFeaturedTitle() throws Exception {
		test = extent.createTest("Test 34 - Check Next Story Featured Title");
		FeedPage obj = new FeedPage();
		obj.NextStoryFeaturedTitle(driver);
	}
	
	@Test(priority = 17)
	public void CheckCategoryOnNextStoryFeaturedImage() throws Exception {
		test = extent.createTest("Test 34 - Check Category On NextStory Featured Image");
		FeedPage obj = new FeedPage();
		obj.CategoryOnNextStoryFeaturedImage(driver);
	}
	
	@Test(priority = 18)
	public void CheckNextFeaturedStorywriter() throws Exception {
		test = extent.createTest("Test 34 - Check NextFeatured Story writer");
		FeedPage obj = new FeedPage();
		obj.NextFeaturedStorywriter(driver);
	}
	
	@Test(priority = 19)
	public void CheckNextFeaturedStorySource() throws Exception {
		test = extent.createTest("Test 34 - Check NextFeatured Story Source");
		FeedPage obj = new FeedPage();
		obj.NextFeaturedStorySource(driver);
	}
}
