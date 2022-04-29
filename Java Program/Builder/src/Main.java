
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza p = new PizzaBuilder("Large").addMeat().removeCheese().addMushroom().build();
		System.out.println(p.getSize());
		
	}

}
