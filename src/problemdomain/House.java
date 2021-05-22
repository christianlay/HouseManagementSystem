package problemdomain;

import java.util.*;

/**
 * @author 14037
 *
 */

public class House {
	private int houseNumber;
	private String address;
	private int numberOfRooms;
	private String houseCOlor;
	private boolean hasGarage;
	private ArrayList<Room> rooms;
	
	public House() {
		super();
		// TODO Auto-generated constructor stub
				
	}

	public House(int houseNumber, String address, int numberOfRooms, String houseCOlor, boolean hasGarage,
			ArrayList<Room> rooms) {
		super();
		this.houseNumber = houseNumber;
		this.address = address;
		this.numberOfRooms = numberOfRooms;
		this.houseCOlor = houseCOlor;
		this.hasGarage = hasGarage;
		this.rooms = new ArrayList<Room>();
	}

	public int getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getNumberOfRooms() {
		return numberOfRooms;
	}

	public void setNumberOfRooms(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}

	public String getHouseCOlor() {
		return houseCOlor;
	}

	public void setHouseCOlor(String houseCOlor) {
		this.houseCOlor = houseCOlor;
	}

	public boolean isHasGarage() {
		return hasGarage;
	}

	public void setHasGarage(boolean hasGarage) {
		this.hasGarage = hasGarage;
	}

	public ArrayList<Room> getRooms() {
		return rooms;
	}

	public void setRooms(ArrayList<Room> rooms) {
		this.rooms = rooms;
	}

	@Override
	public String toString() {
		return "House [houseNumber=" + houseNumber + ", address=" + address + ", numberOfRooms=" + numberOfRooms
				+ ", houseCOlor=" + houseCOlor + ", hasGarage=" + hasGarage + ", rooms=" + rooms + "]";
	}
	
	

	

}
