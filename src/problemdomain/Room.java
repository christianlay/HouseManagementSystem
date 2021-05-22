package problemdomain;

public class Room {
	
	private String name; 
	private String color;
	private double height;
	private double width;
	private boolean hasWindow;
	private double length;
	
	public Room() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Room(String name, String color, double height, double width, boolean hasWindow, double length) {
		super();
		this.name = name;
		this.color = color;
		this.height = height;
		this.width = width;
		this.hasWindow = hasWindow;
		this.length = length;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public boolean isHasWindow() {
		return hasWindow;
	}

	public void setHasWindow(boolean hasWindow) {
		this.hasWindow = hasWindow;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public String toString() {
		return "Room [name=" + name + ", color=" + color + ", height=" + height + ", width=" + width + ", hasWindow="
				+ hasWindow + ", length=" + length + "]";
	}
	
	
	
	

}
