package de.exxcellent.challenge.analysis;

import java.util.List;
import java.util.Map;

public class DataAnalysis {

	/**
	  * Returns String of the key field value with lowest absolute difference 
	  *         between minimum and maximum field values
	  * @param  listData  list with data for analysis
	  * @return      key field as a string
	  */	 
	 public static String getSmallestValuesSpreadKey(List<Map<String, String>> listData, 
			                                                            String keyField, 
			                                                            String minValueField,
			                                                            String maxValueField
			                                                            ) {
		 String keySmallestValuesSpread ="";
		 int smallestSpread = -1;
		 
		 for (Map<String, String> rowMap : listData) {
			 int valueDifference = Math.abs(Integer.parseInt(rowMap.get(maxValueField)) - Integer.parseInt(rowMap.get(minValueField)));
			 if (smallestSpread==-1 || smallestSpread>valueDifference) {
				 smallestSpread = valueDifference;
				 keySmallestValuesSpread = rowMap.get(keyField);
			 }
		 }
		 
		 return keySmallestValuesSpread;
	 }	
}
