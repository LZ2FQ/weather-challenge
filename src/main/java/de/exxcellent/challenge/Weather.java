package de.exxcellent.challenge;

public class Weather {
	int dayNumber;
	int maxTemperature;
	int minTemperature;
	
	public void setDayNumber(int day) {
		dayNumber = day;
	}
	
	public int getDayNumber() {
		return dayNumber;
	}

	public void setMaxTemperature(int temperature) {
		maxTemperature = temperature;
	}
	
	public int getMaxTemperature() {
		return maxTemperature;
	}	

	public void setMinTemperature(int temperature) {
		minTemperature = temperature;
	}
	
	public int getMinTemperature() {
		return minTemperature;
	}		
}
