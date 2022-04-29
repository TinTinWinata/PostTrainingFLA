import java.util.Vector;

public class Chat extends Mediator{

	Vector<User> users;
	public Chat()
	{
		users = new Vector<>();
	}
	
	@Override
	public void sendMessage(User user, String msg) {
		System.out.println(user.name + " send : " + msg);
		for (User u: users) {
			if(user.name == u.name)
				continue;
			u.recieveMessage(msg);
		}
	}
	@Override
	public void addUser(User user) {
		users.add(user);
		
	}
	
}
