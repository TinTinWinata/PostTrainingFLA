
public class Settings {
	
	
	private String lang = "id";
	private String theme = "dark";
	
	private static Settings instances;
	
	public static Settings getInstances()
	{
		if(instances == null)
		{
			instances = new Settings(); 
		}
			return instances;
	
	}

	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}


	public Settings()
	{
		
	}
	
}
