package RestAssured1.RestAssured1;

import static com.jayway.restassured.RestAssured.baseURI;

import java.util.HashMap;
import java.util.Map;

import static com.jayway.restassured.RestAssured.*;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FetchArticleLikesTest {

	@Test(priority = 1)
	public void CheckStatus() {

		baseURI = "http://3.95.14.164/like";

		Map<String, Object> jsonAsMap = new HashMap<String, Object>();
		jsonAsMap.put("articleId", "2");

		String Response = given().header("Content-Type", "application/json").body(jsonAsMap).when().post("/fetchLikes")
				.then().statusCode(200).extract().asString();
		
		System.out.print("");
		System.out.print(Response);
		System.out.print("");
		Assert.assertEquals(Response.contains("message"), true);
		Assert.assertEquals(Response.contains("200"), true);
	}
}
