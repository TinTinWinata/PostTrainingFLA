
public class DeliverState extends State{

	public DeliverState(Chef c) {
		super(c);
		System.out.println(c.name + " is delivering");
	}

	@Override
	public void changeState() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		c.state = new IdleState(c);
		
	}

}
