package com.intuit.tep.api;


public class TestFactory {
	public static String fullKey ="Intuit_APIKey intuit_apikey="+new Utility().getEnvKey();
	public static String assetId =Utility.prop.getProperty("assetId");
	public static String fullkeyForTaxApp="Intuit_APIKey intuit_apikey="+new Utility().getEnvKeyForTax();
	public static String assetIdForTaxApp =Utility.prop.getProperty("assetIdForTaxApp");
/*	
	@Factory
    public Object[] factoryMethod() 
    {
//       return new Object[] { new JobsAPITest(fullKey,assetId), new JobsAPITest(fullkeyForTaxApp,assetIdForTaxApp),new AppsAPITest(),new LabsAPITest()
//        ,new LogsAPITest(), new NodesAPItest(), new SauceconnectTunnelAPITest(), new ScreenshotsAPITest(),new SessionAPITest(), new TunnelMachineAPITest()
//        ,new UserAPITest()};
       return new Object[] { new JobsAPITest(fullKey,assetId), new JobsAPITest(fullkeyForTaxApp,assetIdForTaxApp)};
    }*/
}
