
public class User {

	String name;
	String preference;
	
	public User(String name, String preference) {
		super();
		this.name = name;
		this.preference = preference;
	}

	public void update(String product) {
		System.out.println(name + " has been notified about " + product);
	}

}
