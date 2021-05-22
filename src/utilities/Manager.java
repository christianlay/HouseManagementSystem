package utilities;

import problemdomain.*;

import java.awt.HeadlessException;
import java.util.*;


public class Manager {
	private ArrayList<House> houses;
	private ArrayList<Room> rooms;
	private Scanner in;
	Community c = new Community();
	House h = new House();
	Room r = new Room();


	public Manager() {
		this.houses = new ArrayList<House>();
		this.rooms = new ArrayList<Room>();
		this.in = new Scanner(System.in);

	}


	public void displayMenu() {
		int choice = 0;

		while(choice != 6) {
			System.out.println("Welcome in AMH company: How may I assist you?");
			System.out.println("1 \t Display Community Information");
			System.out.println("2 \t Add House");
			System.out.println("3 \t Display house Information");
			System.out.println("4 \t Add Room");
			System.out.println("5 \t Display room information");
			System.out.println("6 \t Exit");

			System.out.println("Enter Option: ");
			choice = in.nextInt();

			switch(choice) {
			case 1: displayCommunityInfo(); break;
			case 2: addHouse(); break;
			case 3: displayHouseInfo(); break;
			case 4: addRoom(); break;
			case 5: displayRoomInfo(); break;
			case 6: System.exit(0); 
			default: System.out.println("Wrong Number"); break;
			}

		}
	}


	private void addRoom() {
		r.setColor("White");
		r.setHeight(3.2);
		r.setLength(5);
		r.setName("Kitchen");
		r.setWidth(4);
		this.rooms.add(r);
		h.setRooms(rooms);


	}

	private void displayRoomInfo() {
		System.out.println(r);
	}

	private void displayHouseInfo() {
		System.out.println("House");
		System.out.println("House number: " + h.getHouseNumber());
		System.out.println("House address: " + h.getAddress());
		System.out.println("House numberOfRooms: " + h.getNumberOfRooms());
		System.out.println("House houseColor: " + h.getHouseCOlor());
		System.out.println("House hasGarage: " + h.isHasGarage());
		System.out.println("House rooms: [" + (h.getRooms() != null ? "Room [name =" + r.getName() + ", color=" + r.getColor() + ", height =" + r.getHeight() + ", width =" + r.getWidth() + ", length = " + r.getLength() + ", hasWindow = " + r.isHasWindow() + "]": "") + "]");


	}


	private void addHouse() {
		h.setAddress("11 Coral grove");
		h.setHasGarage(true);
		h.setHouseCOlor("Gray");
		h.setHouseNumber(23);
		h.setNumberOfRooms(5);
		this.houses.add(h);
		c.setNumberOfHouses();
		c.setHouses(houses);


	}


	private void displayCommunityInfo() {
		System.out.println(c);

	}


}
