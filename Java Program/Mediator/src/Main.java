
public class Main {

	public Main() {
		User nelson = new User("Nelson");
		User justine = new User("Justine");
		User winata = new User("Winata");

		Chat c = new Chat();
		nelson.joinChat(c);
		justine.joinChat(c);
		winata.joinChat(c);

		nelson.sendMessage("Hello Ges");
	}

	public static void main(String[] args) {
		new Main();
	}

}
