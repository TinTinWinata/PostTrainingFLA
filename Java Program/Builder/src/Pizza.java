
public class Pizza {
	private boolean meat = false;
	private boolean cheese = true;
	private boolean mushroom = false;
	private String size = "regular";
	
	
	public Pizza(boolean meat, boolean cheese, boolean mushroom, String size) {
		super();
		this.meat = meat;
		this.cheese = cheese;
		this.mushroom = mushroom;
		this.size = size;
	}


	public boolean isMeat() {
		return meat;
	}


	public void setMeat(boolean meat) {
		this.meat = meat;
	}


	public boolean isCheese() {
		return cheese;
	}


	public void setCheese(boolean cheese) {
		this.cheese = cheese;
	}


	public boolean isMushroom() {
		return mushroom;
	}


	public void setMushroom(boolean mushroom) {
		this.mushroom = mushroom;
	}


	public String getSize() {
		return size;
	}


	public void setSize(String size) {
		this.size = size;
	}
	
	
}
