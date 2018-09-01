package de.exxcellent.challenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * The entry class for your solution. This class is only aimed as starting point and not intended as baseline for your software
 * design. Read: create your own classes and packages as appropriate.
 *
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 */
public final class App {

    public static void main(String... args) {

        // Your preparation code …
        String weatherDataFile = "de/exxcellent/challenge/weather.csv";
        List<Map<String, String>> weatherData = new ArrayList<Map<String, String>>();
        weatherData = AppUtils.readCSVToList(weatherDataFile);

        String dayWithSmallestTempSpread = WeatherReports.getSmallestTemperatureSpread(weatherData);     // Your day analysis function call …
        String teamWithSmallesGoalSpread = "A good team"; // Your goal analysis function call …
        
        
        System.out.printf("Day with smallest temperature spread : %s%n", dayWithSmallestTempSpread);
        System.out.printf("Team with smallest goal spread       : %s%n", teamWithSmallesGoalSpread);
    }
}
