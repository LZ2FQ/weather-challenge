package de.exxcellent.challenge;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class FootballTest {
        
    @Test
    public void getSmallestGoalDifferenceTeamTest() {
    	List<Map<String, String>> footballDataList = new ArrayList<Map<String, String>>();
    	Map<String, String> teamMap = null;

    	/* List data example
    	 * Team,Goals,Goals Allowed
    	 * Arsenal,79,36
         * Liverpool,67,30
         * Manchester United,87,45
    	*/

    	teamMap = new HashMap<String,String>();    	
    	teamMap.put("Team", "Arsenal");
    	teamMap.put("Goals", "79");
    	teamMap.put("GoalsAllowed", "36");
    	footballDataList.add(teamMap);

    	teamMap = new HashMap<String,String>();    	
    	teamMap.put("Team", "Liverpool");
    	teamMap.put("Goals", "67");
    	teamMap.put("GoalsAllowed", "30");
    	footballDataList.add(teamMap);

    	teamMap = new HashMap<String,String>();    	
    	teamMap.put("Team", "Manchester United");
    	teamMap.put("Goals", "87");
    	teamMap.put("GoalsAllowed", "45");
    	footballDataList.add(teamMap);    
    	
    	assertTrue("Football team with smallest goal distance found", FootballReports.getSmallestGoalDifferenceTeam(footballDataList).equals("Liverpool"));
    	
    }
        
}
