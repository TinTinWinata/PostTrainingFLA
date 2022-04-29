import java.util.Vector;

public class InternetPositive {

	public Vector<String> banned;
	public Internet i;
	
	public InternetPositive()
	{
		banned = new Vector<>();
		banned.add("reddit.com");
		i = new Internet();
	}
	
	
	public void protectedBrowse(String url)
	{
		if(banned.contains(url))
		{
			System.out.println("THIS SITE IS BLOCKED");
		}else {
			this.i.browse(url);
		}
	}
	
}
