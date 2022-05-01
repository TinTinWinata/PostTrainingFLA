
public class Main {

	public Main() {
		Shop s = new Shop();

		User hady = new User("hady", "handheld");
		User vito = new User("vito", "computer");
		User justine = new User("justine", "handheld");
		s.addSub(hady);
		s.addSub(vito);
		s.addSub(justine);
		s.notifySubs("Samsung S22", "handheld");
	}
	
	public static void main(String[] args) {
		new Main();
	}

}
