package com.restassured;


import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class BasicMethods {
	
	@Test
	public void postMethod() {
		RestAssured.baseURI="https://api.github.com";
		String bearerToken="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";
		Response response=RestAssured.given().headers("Authorization","bearer"+ bearerToken, "Content-type")
				.body("{\r\n"+" \"name\":\"NewRepo3\"\r\n"+"}")
				.when().post("/user/repos")
				.then().log().all().extract().response();
		System.out.println(response.asString());
		System.out.println(response.getStatusCode());
				
	}
}
