
public abstract class State {

	Chef c;
	
	public State(Chef c) {
		super();
		this.c = c;
	}

	public abstract void changeState();

}
