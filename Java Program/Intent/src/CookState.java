
public class CookState extends State{

	public CookState(Chef c) {
		// TODO Auto-generated constructor stub
		super(c);
		System.out.println(c.name + " is cooking");
	}

	@Override
	public void changeState() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		c.state = new DeliverState(c);
	}

}
