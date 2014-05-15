package classes;

import java.io.Serializable;

public class Mots implements Serializable {
	
	private int numMot;
    private String nomMot;
    private Indice indice;
	
	
	public Mots() {
		
	}

	

	public Mots(int numMot, String nomMot, Indice indice) {

		this.numMot = numMot;
		this.nomMot = nomMot;
		this.indice = indice;
	}



	public int getNumMot() {
		return numMot;
	}


	public void setNumMot(int numMot) {
		this.numMot = numMot;
	}


	public String getNomMot() {
		return nomMot;
	}


	public void setNomMot(String nomMot) {
		this.nomMot = nomMot;
	}


	public Indice getIndice() {
		return indice;
	}


	public void setIndice(Indice indice) {
		this.indice = indice;
	}
	
}
