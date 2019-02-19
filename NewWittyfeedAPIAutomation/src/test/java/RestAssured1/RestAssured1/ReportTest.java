package RestAssured1.RestAssured1;

import static com.jayway.restassured.RestAssured.baseURI;

import java.util.HashMap;
import java.util.Map;

import static com.jayway.restassured.RestAssured.*;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ReportTest {

	
@Test(priority = 1)
public void CheckStatus() {
		
	
baseURI = "http://3.95.14.164/report";
	


Map<String, Object>  jsonAsMap = new HashMap<String, Object>();
jsonAsMap.put("userId", "5c63cdb0c6dafe4877a72827");
jsonAsMap.put("articleId", "1");
jsonAsMap.put("optionId", "1");
jsonAsMap.put("optionText", "Hello");
jsonAsMap.put("comment", "Test12");

String Response = given().header("Content-Type","application/json").body(jsonAsMap).when().post("/report").then().statusCode(200).extract().asString();;

System.out.print("");
System.out.print(Response);
System.out.print("");
Assert.assertEquals(Response.contains("message") , true );
Assert.assertEquals(Response.contains("_id") , true );
Assert.assertEquals(Response.contains("articleId") , true );
Assert.assertEquals(Response.contains("userId") , true );
Assert.assertEquals(Response.contains("createdAt") , true );
Assert.assertEquals(Response.contains("updatedAt") , true );


	}
}
