
public class Chef {

	String name;
	State state;
	
	
	
	public Chef(String name) {
		super();
		this.name = name;
		this.state = new IdleState(this);
	}



	public Chef() {
		// TODO Auto-generated constructor stub
	}

}
