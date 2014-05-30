package classes;

import java.util.ArrayList;

import module.IModule;

public class Album implements IModule {
	
	private int idAlbum;
	private String titreAlbum;
	private String titreNom;
	private ArrayList<Chanson> lesChanson;
	
	
	public Album() {
		super();
	}

	public Album(int idAlbum, String titreAlbum, String titreNom,
			ArrayList<Chanson> lesChanson) {
		super();
		this.idAlbum = idAlbum;
		this.titreAlbum = titreAlbum;
		this.titreNom = titreNom;
		this.lesChanson = lesChanson;
	}

	public int getIdAlbum() {
		return idAlbum;
	}

	public void setIdAlbum(int idAlbum) {
		this.idAlbum = idAlbum;
	}

	public String getTitreAlbum() {
		return titreAlbum;
	}

	public void setTitreAlbum(String titreAlbum) {
		this.titreAlbum = titreAlbum;
	}

	public String getTitreNom() {
		return titreNom;
	}

	public void setTitreNom(String titreNom) {
		this.titreNom = titreNom;
	}

	public ArrayList<Chanson> getLesChanson() {
		return lesChanson;
	}

	public void setLesChanson(ArrayList<Chanson> lesChanson) {
		this.lesChanson = lesChanson;
	}

	@Override
	public void plug() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unplug() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
