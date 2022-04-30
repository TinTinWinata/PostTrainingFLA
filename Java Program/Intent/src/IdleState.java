
public class IdleState extends State{

	public IdleState(Chef c) {
		// TODO Auto-generated constructor stub
		super(c);
		System.out.println(c.name + " is available");
	}

	@Override
	public void changeState() {
		// TODO Auto-generated method stub
		c.state = new CookState(c);
	}
	
	

}
