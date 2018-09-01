package de.exxcellent.challenge.analysis;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import de.exxcellent.utils.DataUtils;

public class WeatherReports {

	List<Map<String, String>> weatherData = new ArrayList<Map<String, String>>();

	String dayValueKey = "Day";
	String minValueKey = "MnT";
	String maxValueKey = "MxT";
	
	public WeatherReports(String fileName) {
		weatherData = DataUtils.readCSVToList(fileName);
	}

	public WeatherReports(List<Map<String, String>> fileData) {
		weatherData = fileData;
	}
	 /**
	  * Returns String of the day number with lowest temeparature difference 
	  *
	  * @param  weatherData  list with weather data
	  * @return      day number as a string
	  */	 
	 public String getSmallestTemperatureSpread() {
		 
		 return DataAnalysis.getSmallestValuesSpreadKey(weatherData, dayValueKey, minValueKey, maxValueKey);
	 }
}
