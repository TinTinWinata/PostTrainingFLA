
public class Main {

	
	public Main()
	{
		SquarePeg sp = new SquarePeg(30);
		RoundHole rh = new RoundHole(30);
		
		SquarePegAdapter adapter = new SquarePegAdapter(sp);
		RoundPeg rp = new RoundPeg(adapter.getRadius());
		
		System.out.println(rh.fits(rp));
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}
	}
	
