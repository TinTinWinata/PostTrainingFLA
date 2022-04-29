
public class User {
	
	String name;
	Mediator room;
	
	public User(String name)
	{
		super();
		this.name = name;
	}
	
	public void joinChat(Mediator room)
	{
		this.room = room;
		this.room.addUser(this);
	}
	
	public void sendMessage(String msg)
	{
		this.room.sendMessage(this, msg);
	}
	public void recieveMessage(String msg)
	{
		System.out.println(name + " recieved: " + msg);
	}
}
