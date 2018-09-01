package de.exxcellent.challenge.analysis;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import de.exxcellent.challenge.analysis.DataAnalysis;

public class DataAnalysisTest {
	   @Test
	    public void getSmallestValuesSpreadKeyTest() {
	    	List<Map<String, String>> dataList = new ArrayList<Map<String, String>>();
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
	    	dataList.add(dailyMap);

	    	dailyMap = new HashMap<String,String>();    	
	    	dailyMap.put("MxT", "79");
	    	dailyMap.put("MnT", "63");
	    	dailyMap.put("Day", "2");
	    	dataList.add(dailyMap);

	    	dailyMap = new HashMap<String,String>();    	
	    	dailyMap.put("MxT", "77");
	    	dailyMap.put("MnT", "55");
	    	dailyMap.put("Day", "3");
	    	dataList.add(dailyMap);    
	    	
	    	assertTrue("Smallest Temperature is correcly found", 
	    			 DataAnalysis.getSmallestValuesSpreadKey(dataList, "Day", "MnT", "MxT").equals("2"));
	    	
	    }
}
