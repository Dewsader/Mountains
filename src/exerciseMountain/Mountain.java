package exerciseMountain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Mountain {
	private String name;
	private Continent continent;	
	private String country;
	private int altitude;
	
	public Mountain(String name, Continent continent, String country,
			int altitude) {
		this.name = name;
		this.continent = continent;
		this.country = country;
		this.altitude = altitude;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAltitude() {
		return altitude;
	}

	public void setAltitude(int altitude) {
		this.altitude = altitude;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Continent getContinent() {
		return continent;
	}

	@Override
	public String toString() {
		return String.format("%-13s %-15s %-13s %dm",
				name, continent, country, altitude);
	}	
	
	public static class byName implements Comparator<Mountain>
	{
		@Override
		public int compare(Mountain arg0, Mountain arg1) {
			return arg0.name.compareTo(arg1.name);
		}
//		for(int i = 0; i < m.size()-1; i++)
//		{
//		String temp;
//		String temp2;
//		temp = m.get(i).getName().toLowerCase();
//		temp2 = m.get(i+1).getName().toLowerCase();
//		if(temp.charAt(1) < temp2.charAt(1))
//			{
//			m.add
//			}
//		}
//		
//		return null;
	}
}
