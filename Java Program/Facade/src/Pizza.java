
public class Pizza {
	private boolean meat = false;
	private boolean cheese = true;
	private boolean mushroom = false;
	private String size = "regular";
	
	public String getSize()
	{
		return size;
	}
	
	public Pizza(String size)
	{
		this.size = size;
	}
	
	public Pizza addMeat()
	{
		meat = true;
		return this;
	}
	public Pizza removeCheese()
	{
		cheese = false;
		return this;
	}
	public Pizza addMushroom()
	{
		mushroom = true;
		return this;
	}

	
}
