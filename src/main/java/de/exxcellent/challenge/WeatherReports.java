package de.exxcellent.challenge;

import java.util.List;
import java.util.Map;

public class WeatherReports {

	 /**
	  * Returns String of the day number with lowest temeparature difference 
	  *
	  * @param  weatherData  list with weather data
	  * @return      day number as a string
	  */	 
	 public static String getSmallestTemperatureSpread(List<Map<String, String>> weatherData) {
		 
		 return AppUtils.getSmallestValuesSpreadKey(weatherData, "Day", "MnT", "MxT");
	 }
}
