
public class RoundHole {

	
	public int radius;

	public RoundHole(int radius) {
		super();
		this.radius = radius;
	}
	public boolean fits(RoundPeg peg)
	{
		return peg.radius <= this.radius;
	}
	
}
