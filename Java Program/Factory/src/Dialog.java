
public class Dialog {

	private String os;
	private Button btn;
	
	public Dialog(String os)
	{
		this.os = os;
	}
	
	public void render()
	{
		btn.onTap();	
	}
	
	public Button createButton()
	{
		if(os.equals("android")) {
			btn = new MaterialButton();
		}
		else if(os.equals("ios")) {
			btn = new CuppertinoButton();
		}
		return btn;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public Button getBtn() {
		return btn;
	}

	public void setBtn(Button btn) {
		this.btn = btn;
	}
	
	
}
