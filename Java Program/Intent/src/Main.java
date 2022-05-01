
public class Main {

	public Main() {
		Chef c = new Chef("arnold");
		c.state.changeState();
		c.state.changeState();
		c.state.changeState();
	}

	public static void main(String[] args) {
		new Main();
	}
}
