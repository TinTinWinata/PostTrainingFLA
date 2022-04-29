
public class Main {

	
	public Main()
	{
		Car car1 = new Car("Red", "Mitsubishi");
		Car car2 = car1.clone();
		System.out.println(car2.brand);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
