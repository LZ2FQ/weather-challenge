package de.exxcellent.challenge.analysis;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import de.exxcellent.utils.DataUtils;

public class FootballReports {

	List<Map<String, String>> footballData = new ArrayList<Map<String, String>>();

	String teamValueKey = "Team";
	String goalValueKey = "Goals";
	String goalAllowedValueKey = "GoalsAllowed";
	
	public FootballReports(String fileName) {
		footballData = DataUtils.readCSVToList(fileName);
	}

	public FootballReports(List<Map<String, String>> fileData) {
		footballData = fileData;
	}

	 /**
	  * Returns football team name with lowest absolute goal difference difference 
	  *
	  * @param  footballData  list with football data
	  * @return      football team name
	  */	 
	 public String getSmallestGoalDifferenceTeam() {
		 return DataAnalysis.getSmallestValuesSpreadKey(footballData, teamValueKey, goalValueKey, goalAllowedValueKey);
	 }
}
