package de.exxcellent.challenge;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WeatherTest {
    
	private String successLabel = "not successful";

    @Before
    public void setUp() throws Exception {
        successLabel = "successful";
    }

    @Test
    public void aPointlessTest() {
        Assert.assertEquals("Expectations met", "successful", successLabel);
    }
    
    @Test
    public void smallestTemperatureSpreadTest() {
    	List<Map<String, String>> weatherDataList = new ArrayList<Map<String, String>>();
    	Map<String, String> dailyMap = null;

    	/* List data example
    	 *   		{MxT=88, MnT=59, Day=1}
    	{MxT=79, MnT=63, Day=2}
    	{MxT=77, MnT=55, Day=3}
    	*/

    	dailyMap = new HashMap<String,String>();    	
    	dailyMap.put("MxT", "88");
    	dailyMap.put("MnT", "59");
    	dailyMap.put("Day", "1");
    	weatherDataList.add(dailyMap);

    	dailyMap = new HashMap<String,String>();    	
    	dailyMap.put("MxT", "79");
    	dailyMap.put("MnT", "63");
    	dailyMap.put("Day", "2");
    	weatherDataList.add(dailyMap);

    	dailyMap = new HashMap<String,String>();    	
    	dailyMap.put("MxT", "77");
    	dailyMap.put("MnT", "55");
    	dailyMap.put("Day", "3");
    	weatherDataList.add(dailyMap);    
    	
    	assertTrue("Smallest Temperature is correcly found", 2==WeatherReports.getSmallestTemperatureSpread(weatherDataList));
    	
    }
        
}
