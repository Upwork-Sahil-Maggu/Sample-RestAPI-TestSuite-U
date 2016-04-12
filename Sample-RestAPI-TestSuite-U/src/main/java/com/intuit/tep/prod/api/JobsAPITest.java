package com.intuit.tep.prod.api;

import static com.jayway.restassured.RestAssured.given;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.intuit.tep.api.Utility;
import com.jayway.restassured.response.Response;

import static com.intuit.tep.api.Constants.*;
//import static com.intuit.tep.api.TestFactoryForTaxorNonTax.*;


public class JobsAPITest {
	final static Logger logger = Logger.getLogger(JobsAPITest.class);
	

	@BeforeClass
	 public void setUp(){
	    new Utility();
		cookie=Utility.getCokkie();
	 }
	
	
	@Test
	public void testGetAllPosts() {
		logger.info("POSTS API - Test /posts get all the POSTS");
		logger.info("verify that you are able to get All POSTS");
			
		logger.info("*************************************************************************************");
		logger.info("Executing :"+baseUrl+"/posts");
		Response resp = given().
	    			header("Content-Type","application/json").
	    			get(baseUrl+"/posts");
	    	logger.info("Response-->"+resp.getBody().asString());
	    	Assert.assertNotNull(resp.getBody().asString());
	    	Assert.assertEquals(200, resp.getStatusCode());
	 }
	@Test
	public void testGetPostByID() {
		logger.info("POSTS API - Test /posts get the POST by ID");
		logger.info("verify that you are able to get POSTS by ID");
			
		logger.info("*************************************************************************************");
		logger.info("Executing :"+baseUrl+"/posts/1");
		Response resp = given().
	    			header("Content-Type","application/json").
	    			get(baseUrl+"/posts/1");
	    	logger.info("Response-->"+resp.getBody().asString());
	    	Assert.assertNotNull(resp.getBody().asString());
	    	Assert.assertEquals(200, resp.getStatusCode());
	 }
	@Test
	public void testGetAllCommentsForPost() {
		logger.info("POSTS API - Test /posts/1/comments get all comments for Post");
		logger.info("verify that you are able to get all comments for Post");
			
		logger.info("*************************************************************************************");
		logger.info("Executing :"+baseUrl+"/posts/1/comments");
		Response resp = given().
	    			header("Content-Type","application/json").
	    			get(baseUrl+"/posts/1/comments");
	    	logger.info("Response-->"+resp.getBody().asString());
	    	Assert.assertNotNull(resp.getBody().asString());
	    	Assert.assertEquals(200, resp.getStatusCode());
	 }
	
}
