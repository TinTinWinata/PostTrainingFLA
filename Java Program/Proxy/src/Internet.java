import java.util.Vector;

public class Internet {

	
	Vector<String> sites;
	public Internet()
	{
		sites = new Vector<>();
		sites.add("google.com");
		sites.add("youtube.com");
		sites.add("reddit.com");
	}
	
	public void browse(String url)
	{
		if(sites.contains(url))
		{
			System.out.println("Opening " + url + " at ip " + sites.indexOf(url));
		}else {
			System.out.println("No site found");
		}
	}
	
}
