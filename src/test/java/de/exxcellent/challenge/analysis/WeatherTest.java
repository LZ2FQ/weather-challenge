package de.exxcellent.challenge.analysis;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import de.exxcellent.challenge.analysis.WeatherReports;

public class WeatherTest {
        
    @Test
    public void smallestTemperatureSpreadTest() {
    	List<Map<String, String>> weatherDataList = new ArrayList<Map<String, String>>();
    	Map<String, String> dailyMap = null;

    	/* List data example
    	 * {MxT=88, MnT=59, Day=1}
    	 * {MxT=79, MnT=63, Day=2}
    	 * {MxT=77, MnT=55, Day=3}
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
    	
    	WeatherReports weather = new WeatherReports(weatherDataList);
    	assertTrue("Smallest Temperature is correcly found", weather.getSmallestTemperatureSpread().equals("2"));
    	
    }
        
}
