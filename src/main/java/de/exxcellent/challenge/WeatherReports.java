package de.exxcellent.challenge;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.supercsv.io.CsvListReader;
import org.supercsv.prefs.CsvPreference;

public class WeatherReports {

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
			      		      			  
		 } catch (IOException io ) {
			 
		 }
		 
		 return rows;
	 }

	 /**
	  * Returns String of the day number with lowest temeparature difference 
	  *
	  * @param  weatherData  list with weather data
	  * @return      day number as a string
	  */	 
	 public static String getSmallestTemperatureSpread(List<Map<String, String>> weatherData) {
		 String daySmallestTempeartureSpread ="";
		 int smallestTemperatureSpread = -1;
		 
		 String dayField = "Day";
		 String minTempField = "MnT";
		 String maxTempField = "MxT";
		 
		 for (Map<String, String> rowMap : weatherData) {
			 int valueDifference = Integer.parseInt(rowMap.get(maxTempField)) - Integer.parseInt(rowMap.get(minTempField));
			 if (smallestTemperatureSpread==-1 || smallestTemperatureSpread>valueDifference) {
				 smallestTemperatureSpread = valueDifference;
				 daySmallestTempeartureSpread = rowMap.get(dayField);
			 }
		 }
		 
		 return daySmallestTempeartureSpread;
	 }
}
