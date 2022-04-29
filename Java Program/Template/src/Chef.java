import java.util.Random;

public class Chef extends Worker {

	int cooked;

	public Chef(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println(name + " is cooking");
		cooked = new Random().nextInt(15) + 5;
	}

	@Override
	public void showEarning() {
		// TODO Auto-generated method stub
		System.out.println(name + " earned " + (cooked * 2000));
	}

}