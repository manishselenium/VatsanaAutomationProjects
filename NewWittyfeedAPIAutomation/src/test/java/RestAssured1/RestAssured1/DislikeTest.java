package RestAssured1.RestAssured1;

import static com.jayway.restassured.RestAssured.baseURI;

import java.util.HashMap;
import java.util.Map;

import static com.jayway.restassured.RestAssured.*;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DislikeTest {

	@Test(priority = 1)
	public void CheckStatus() {

		baseURI = "http://3.95.14.164/dislike";

		Map<String, Object> jsonAsMap = new HashMap<String, Object>();
		jsonAsMap.put("articleId", "2");
		jsonAsMap.put("userId", "2");

		String Response = given().header("Content-Type", "application/json").body(jsonAsMap).when().post("/dislike")
				.then().statusCode(200).extract().asString();
		

		System.out.print("");
		System.out.print(Response);
		System.out.print("");

		Assert.assertEquals(Response.contains("message"), true);
		Assert.assertEquals(Response.contains("_id"), true);
		Assert.assertEquals(Response.contains("articleId"), true);
		Assert.assertEquals(Response.contains("userId"), true);
		Assert.assertEquals(Response.contains("createdAt"), true);
		Assert.assertEquals(Response.contains("updatedAt"), true);

	}
}
