package RestAssured1.RestAssured1;

import static com.jayway.restassured.RestAssured.baseURI;
import static com.jayway.restassured.RestAssured.given;
import java.util.HashMap;
import java.util.Map;
import org.testng.annotations.Test;



public class GetAllUserTest {

	
	@Test(priority = 1)
	public void CheckStatus() {
		
		
		



	baseURI ="http://3.95.14.164/users";
		
		 Map<String, Object>  jsonAsMap = new HashMap<String, Object>();
//		 jsonAsMap.put("offset", "0");
//		 jsonAsMap.put("limit", "2");
		 jsonAsMap.put("status", "active");
				 
String Response = given().header("Content-Type","application/json").body(jsonAsMap).when().post("/users").then().statusCode(200).extract().asString();;

System.out.print("");
System.out.print(Response);
System.out.print("");

//Assert.assertEquals(Response.contains("message") , true );
//Assert.assertEquals(Response.contains("data") , true );
//Assert.assertEquals(Response.contains("_id") , true );
//Assert.assertEquals(Response.contains("fingerPrint") , true );
//Assert.assertEquals(Response.contains("firstName") , true );
//Assert.assertEquals(Response.contains("lastName") , true );
//Assert.assertEquals(Response.contains("displayName") , true );
//Assert.assertEquals(Response.contains("createdAt") , true );
//Assert.assertEquals(Response.contains("updatedAt") , true );
//Assert.assertEquals(Response.contains("status") , true );
//Assert.assertEquals(Response.contains("profilePic") , true );
//Assert.assertEquals(Response.contains("__v") , true );
//Assert.assertEquals(Response.contains("otp") , true );
//Assert.assertEquals(Response.contains("mobNo") , true );

	}
}
