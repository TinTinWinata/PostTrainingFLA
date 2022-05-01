import java.util.Vector;

public class Shop {
	
	Vector<User> subs;

	public Shop() {
		super();
		subs = new Vector<User>();
	}

	public void addSub(User u) {
		subs.add(u);
	}

	public void notifySubs(String product, String type) {
		for (User s : subs) {
			if(s.preference == type) s.update(product);
		}
	}
}
