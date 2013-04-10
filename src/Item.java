public class Item {
	String content;
	String appereance;
	String name;
	int level;
	//Basisklasse, hier gemeinsames
	//Noch Klassen für jedes Item machen
	
	public Item() {
		
	}
	
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getAppereance() {
		return appereance;
	}
	public void setAppereance(String appereance) {
		this.appereance = appereance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	
	
}
