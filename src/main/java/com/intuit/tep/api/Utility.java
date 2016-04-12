package com.intuit.tep.api;

import static com.jayway.restassured.RestAssured.given;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;

import com.jayway.restassured.response.Response;

/**
*
* @author Sahil Maggu
*/

public class Utility {
final static Logger logger = Logger.getLogger(Utility.class);
public static Properties prop = null;
FileInputStream fs;
	public Utility(){
		if(prop == null){
			try{
				prop = new Properties();
				System.out.println(System.getProperty("user.dir"));
				 fs =  new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/EnvProperties/Globaldatafile.properties");
				prop.load(fs);
				}catch(Exception e){
					e.printStackTrace();
				}
		}
		overrideProperty();
		logger.info("Env set --> "+prop.get("ENV").toString());
		getEnvPropertiesFile();
	}
	private void overrideProperty() {
		if(prop.getProperty("ENV").toString().equalsIgnoreCase("MAVEN")){
		
			prop.setProperty("ENV", System.getProperty("ENV"));
			
		}
	}
	private void getEnvPropertiesFile() {
		
		if(prop.get("ENV").toString().equalsIgnoreCase("E2E")){
			try {
				fs =  new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/EnvProperties/E2Edatafile.properties");
				prop.load(fs);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else if(prop.get("ENV").toString().equalsIgnoreCase("PERF")){
			try {
				fs =  new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/EnvProperties/PRFdatafile.properties");
				prop.load(fs);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else if(prop.get("ENV").toString().equalsIgnoreCase("PROD")){
			try {
				fs =  new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/EnvProperties/PRODdatafile.properties");
				prop.load(fs);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	public static String getCokkie(){
		
		return null;
	}
	public String getEnvKey(){
		if(prop.get("ENV").toString().equalsIgnoreCase("E2E")){
			return prop.getProperty("E2EAPIkey");
		}else if(prop.get("ENV").toString().equalsIgnoreCase("PERF")){
			return prop.getProperty("E2EAPIkey");
		}else if(prop.get("ENV").toString().equalsIgnoreCase("PROD")){
			return prop.getProperty("ProdAPIkey");
		}
		return "Please set the environment";
	}
	public String getEnvKeyForTax(){
		if(prop.get("ENV").toString().equalsIgnoreCase("E2E")){
			return prop.getProperty("E2EAPIkeyForTax");
		}else if(prop.get("ENV").toString().equalsIgnoreCase("PERF")){
			return prop.getProperty("E2EAPIkeyForTax");
		}else if(prop.get("ENV").toString().equalsIgnoreCase("PROD")){
			return prop.getProperty("ProdAPIkeyForTax");
		}
		return "Please set the environment";
	}
	public String getEnvURL(){
		if(prop.get("ENV").toString().equalsIgnoreCase("E2E")){
			return prop.getProperty("E2EUrl");
		}else if(prop.get("ENV").toString().equalsIgnoreCase("PROD")){
			return prop.getProperty("ProdUrl");
		}else if(prop.get("ENV").toString().equalsIgnoreCase("PERF")){
			return prop.getProperty("PRFUrl");
		}
		return "Please set the environment";
	}
	public static Response postCall(String authorization,String contentType,String cookie,String body,String url){
		Response resp = given().
    			header("Authorization", authorization).header("Content-Type",contentType).
    			header("Cookie", cookie).
    			body(body).
    			post(url);
		return resp;
	}
	public static Response putCall(String authorization,String contentType,String cookie,String body,String url){
		Response resp = given().
    			header("Authorization", authorization).header("Content-Type",contentType).
    			header("Cookie", cookie).
    			body(body).
    			put(url);
		return resp;
	}
	public static Response deleteCall(String authorization,String contentType,String cookie,String url){
		Response resp = given().
    			header("Authorization", authorization).header("Content-Type",contentType).
    			header("Cookie", cookie).
    			delete(url);
		return resp;
	}
	public static Response getCall(String authorization,String contentType,String cookie,String url){
		Response resp = given().
    			header("Authorization", authorization).header("Content-Type",contentType).
    			header("Cookie", cookie).
    			get(url);
		return resp;
	}
	
	public static String getxmlAsString(String path) throws IOException{
		
		@SuppressWarnings("resource")
		BufferedReader br = new BufferedReader(new FileReader(new File(path)));
		String line;
		String sb = "";

		while((line=br.readLine())!= null){
			sb=sb+line.trim();
		}
		return sb;
	}
	
	
}
