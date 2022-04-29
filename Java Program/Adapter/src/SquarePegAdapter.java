
public class SquarePegAdapter {

	public SquarePeg peg;
	
	public SquarePegAdapter(SquarePeg peg)
	{
		super();
		this.peg = peg;
	}
	
	public int getRadius() {
		return (int) (peg.width * Math.sqrt(2) / 2);
	}
}
