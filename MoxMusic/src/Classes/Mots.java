package Classes;

public class Mots {
	
	private String Taille;
	private String Definition;
	
	public Mots(){}
	
	public Mots(String taille, String definition) {
		super();
		Taille = taille;
		Definition = definition;
	}
	
	public String getTaille() {
		return Taille;
	}
	public void setTaille(String taille) {
		Taille = taille;
	}
	public String getDefinition() {
		return Definition;
	}
	public void setDefinition(String definition) {
		Definition = definition;
	}
	

}
