package com.intuit.tep.api;

public final class Constants {
		private Constants(){
			
		}
		
		public static String baseUrl =new Utility().getEnvURL();
		//public static String fullKey ="Intuit_APIKey intuit_apikey="+new Utility().getEnvKey();
		public static String cookie ="";
		public static String TeamAPIURL =Utility.prop.getProperty("TeamAPIURL");
		//public static String assetId =Utility.prop.getProperty("assetId");
		public static String createdBy =Utility.prop.getProperty("createdBy");
		public static String gitRepoUrl =Utility.prop.getProperty("gitRepoUrl");
		public static String gitRepoBranch =Utility.prop.getProperty("gitRepoBranch");
		public static String pomlocation =Utility.prop.getProperty("pomlocation");
		public static String scriptRuntime =Utility.prop.getProperty("scriptRuntime");
		public static String scriptType =Utility.prop.getProperty("scriptType");
		public static String scriptLocation =Utility.prop.getProperty("scriptLocation");
		public static String apiTokenAWS =Utility.prop.getProperty("apiTokenAWS");
		public static String serverUrlAWS =Utility.prop.getProperty("serverUrlAWS");
		public static String credentialsId =Utility.prop.getProperty("credentialsId");
		public static String dataCenterAWS =Utility.prop.getProperty("dataCenterAWS");
		public static String apiTokenIHP =Utility.prop.getProperty("apiTokenIHP");
		public static String serverUrlIHP =Utility.prop.getProperty("serverUrlIHP");
		public static String dataCenterIHP =Utility.prop.getProperty("dataCenterIHP");
		
	// Nodes API Constants
		public static String labId =Utility.prop.getProperty("labId");
		public static String name =Utility.prop.getProperty("name");
		public static String description =Utility.prop.getProperty("description");
		public static String nodeType =Utility.prop.getProperty("nodeType");
		public static String hostName =Utility.prop.getProperty("hostName");
		public static String hostIp =Utility.prop.getProperty("hostIp");
		public static String vncPort =Utility.prop.getProperty("vncPort");
		public static String status =Utility.prop.getProperty("status");
		public static String deleted =Utility.prop.getProperty("deleted");
		public static String hostPort =Utility.prop.getProperty("hostPort");
		
	//SessionAPIExtended Constants
		public static String platform =Utility.prop.getProperty("platform");
		public static String browserName =Utility.prop.getProperty("browserName");
		public static String version =Utility.prop.getProperty("version");
		
		
}
