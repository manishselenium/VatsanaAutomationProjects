package RestAssured1.RestAssured1;

import static com.jayway.restassured.RestAssured.baseURI;

import java.util.HashMap;
import java.util.Map;

import static com.jayway.restassured.RestAssured.*;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FetchArticleBookmarksTest {

	@Test(priority = 1)
	public void CheckStatus() {

		baseURI = "http://3.95.14.164/bookmark";

		Map<String, Object> jsonAsMap = new HashMap<String, Object>();
		jsonAsMap.put("userId", "2");

		String Response = given().header("Content-Type", "application/json").body(jsonAsMap).when()
				.post("/fetchBookmarks").then().statusCode(200).extract().asString();
		

		System.out.print("");
		System.out.print(Response);
		System.out.print("");

		Assert.assertEquals(Response.contains("message"), true);
		Assert.assertEquals(Response.contains("data"), true);
		Assert.assertEquals(Response.contains("media"), true);
		Assert.assertEquals(Response.contains("media_source"), true);
		Assert.assertEquals(Response.contains("image_url"), true);
		Assert.assertEquals(Response.contains("showReplaceImageLoader"), true);
		Assert.assertEquals(Response.contains("caption"), true);
		Assert.assertEquals(Response.contains("type"), true);
		Assert.assertEquals(Response.contains("question"), true);
		Assert.assertEquals(Response.contains("is_option_disabled"), true);
		Assert.assertEquals(Response.contains("options"), true);
		Assert.assertEquals(Response.contains("type"), true);
		Assert.assertEquals(Response.contains("question"), true);

	}
}
