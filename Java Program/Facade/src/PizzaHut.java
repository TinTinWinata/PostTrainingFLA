
public class PizzaHut {

	
	private Pizza createDough(String size)
	{
		return new Pizza(size);
	}
	private Pizza addToppings(Pizza p)
	{
		return p.addMeat().addMushroom();
	}
	private void deliver(Pizza p , String address)
	{
		System.out.println(p.getSize() + " pizza delivered to " + address);
	}
	public void order(String size, String address)
	{
		Pizza p = createDough(size);
		addToppings(p);
		deliver(p, address);
	}
}
