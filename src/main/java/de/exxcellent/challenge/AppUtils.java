package de.exxcellent.challenge;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.supercsv.io.CsvListReader;
import org.supercsv.prefs.CsvPreference;

public class AppUtils {

	 /**
	  * Reads CSV file and converts it to List<Map<String, String>>
	  *
	  * @param  fileName  relative path to file resource
	  * @return      List<Map<String, String>>
	  */	
	 public static List<Map<String, String>> readCSVToList(String fileName) {
		 List<Map<String, String>> rows = new ArrayList<Map<String, String>>();
		 
		 try {
		        CsvListReader csvReader = new CsvListReader(new InputStreamReader(
				 WeatherReports.class.getClassLoader().getResourceAsStream(fileName)),
			        CsvPreference.STANDARD_PREFERENCE);
			    
			    //Read CSV Header
			    List<String> header = new ArrayList<String>(csvReader.read());
			      List<String> rowAsTokens;
			      
			      //Read the CSV as List of Maps where each Map represents row data			      
			      Map<String, String> row = null;
			      
			      while ((rowAsTokens = csvReader.read()) != null) {
			        //Create Map for each row in CSV
			        row = new HashMap<String, String>();
			        
			        for (int i = 0 ; i < header.size() ; i ++) {
			          row.put(header.get(i).replace(" ", ""), rowAsTokens.get(i));
			        }
			        
			        //add Row map to list of rows
			        rows.add(row);
			      }
			      		    
			      csvReader.close();     
		 } catch (IOException io ) {
			 
		 }
		 
		 return rows;
	 }

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
