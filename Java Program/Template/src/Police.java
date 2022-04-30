import java.util.Random;

public class Police extends Worker{

	int solved;
	
	public Police(String name) {
		super(name);
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println(name + " is solving crime");
		solved = new Random().nextInt(3) + 1;
	}

	@Override
	public void showEarning() {
		// TODO Auto-generated method stub
		System.out.println(name + " earned " + (solved * 15000));
	}

}
