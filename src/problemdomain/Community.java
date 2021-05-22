package problemdomain;

import java.util.*;

public class Community {
	private static String partOfCity = "North";
	private int numberOfHouses;
	private ArrayList<House> houses;
	
	
	public Community() {
		super();
		
		// TODO Auto-generated constructor stub
	}

	public Community(ArrayList<House> houses) {
		super();
		this.houses = houses;
	}

	public static String getPartOfCity() {
		return partOfCity;
	}

	
	public static void setPartOfCity(String partOfCity) {
		Community.partOfCity = partOfCity;
	}

	public int getNumberOfHouses() {
		return numberOfHouses;
	}

	public void setNumberOfHouses() {
		numberOfHouses++;
	}

	public ArrayList<House> getHouses() {
		return houses;
	}

	public void setHouses(ArrayList<House> houses) {
		this.houses = houses;
	}

	@Override
	public String toString() {
		return "Community [numberOfHouses=" + numberOfHouses + ", houses=" + houses + "]";
	}
	
	
	

	

}
