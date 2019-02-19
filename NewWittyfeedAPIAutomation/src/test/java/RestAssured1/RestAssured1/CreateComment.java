package RestAssured1.RestAssured1;

import java.util.HashMap;
import java.util.Map;
import static com.jayway.restassured.RestAssured.*;
import org.json.JSONException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateComment {

	@Test(priority = 1)
	public void CheckStatus() throws JSONException {

		baseURI = "http://3.95.14.164/comments";

		Map<String, Object> jsonAsMap = new HashMap<String, Object>();
		jsonAsMap.put("userId", "5c63cdb0c6dafe4877a72827");
		jsonAsMap.put("articleId", "38237");
		jsonAsMap.put("type", "text");
		jsonAsMap.put("comment", "eng");

		String Response = given().header("Content-Type", "application/json").body(jsonAsMap).when().post("/create")
				.then().statusCode(200).extract().asString();
		

		System.out.print("");
		System.out.print(Response);
		System.out.print("");

		Assert.assertEquals(Response.contains("status"), true);
		Assert.assertEquals(Response.contains("message"), true);
		Assert.assertEquals(Response.contains("data"), true);

	}

}
