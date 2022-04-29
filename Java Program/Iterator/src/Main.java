import java.util.Vector;

public class Main {

	public Main()
	{
		Vector<String> data = new Vector<>();
		
		data.add("Justine");
		data.add("Winata");
		data.add("Purwoko");
		
		FIFOIterator fi = new FIFOIterator(data);
		LIFOIterator li = new LIFOIterator(data);
		
		while(fi.hasNext())
		{
			System.out.println(fi.getNext());
		}
		
		while(li.hasNext())
		{
			System.out.println(li.getNext());
		}
		
	}
	
	public static void main(String[] args) {
		new Main();
	}

}
