package com.rest.base;

import static io.restassured.RestAssured.given;
import org.apache.logging.log4j.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;



public class RestCore {

	private String baseUri;
	private RequestSpecification request;
	private Response resp;
	
	Logger log = LogManager.getLogger(RestCore.class);
	
	public RestCore(String baseUri) {
		this.baseUri=baseUri;		
		request = given().log().all().accept(ContentType.JSON);
	}	
	
	public String get() {
		resp = request.get(baseUri);
		return resp.asString();
	}	
	
	public String getResponseAsString() {
		log.debug("RESPONSE :");
		return this.resp.getBody().asString();
	}

	public int getStatusCode() {
		log.debug("STATUS CODE :");
		return this.resp.getStatusCode();
	}
	
	
	
	
}
