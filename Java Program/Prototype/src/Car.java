
public class Car implements Cloneable{

	public String color;
	public String brand;
	
	public Car(String color, String brand) {
		super();
		this.color = color;
		this.brand = brand;
	}
	
	public Car(Car c)
	{
		super();
		this.color = c.color;
		this.brand = c.brand;
	}
	
	@Override
	protected Car clone() {
		return new Car(this);
	}

}
