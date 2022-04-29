
public class Main {

	public Main()
	{
		Settings s = Settings.getInstances();
		Settings s2 = Settings.getInstances();
		
		System.out.println(s.getLang());
		s2.setLang("eu");
		System.out.println(s.getLang());
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
