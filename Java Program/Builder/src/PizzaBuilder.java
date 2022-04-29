
public class PizzaBuilder {
	private boolean meat = false;
	private boolean cheese = true;
	private boolean mushroom = false;
	private String size = "regular";
	
	public PizzaBuilder(String size)
	{
		this.size = size;
	}
	
	public PizzaBuilder addMeat()
	{
		meat = true;
		return this;
	}
	public PizzaBuilder removeCheese()
	{
		cheese = false;
		return this;
	}
	public PizzaBuilder addMushroom()
	{
		mushroom = true;
		return this;
	}

	public Pizza build()
	{
		return new Pizza(meat, cheese, mushroom, size);
	}
	
}
