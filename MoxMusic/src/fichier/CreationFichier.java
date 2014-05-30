package fichier;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import classes.Chanson;
	
	/**
	 *
	 * @author Isaac
	 */
	public class CreationFichier {
	    
	     public CreationFichier(ArrayList<Chanson> colFichier,String nomFichier){
	         
	        try {
	            FileOutputStream fichier = new FileOutputStream(nomFichier);
	            ObjectOutputStream s = new ObjectOutputStream(fichier);
	            try {
	                
	                s.writeObject(colFichier);
	                s.flush();
	                s.close();
	                
	                }
	            finally {//fermeture des flux
	                    try {
	                    s.close();
	                        }
	                    finally {
	                    fichier.close();
	                            }
	                    }

	        } catch (IOException e) {
	            System.out.println("Probleme creation fichier ");
	           e.printStackTrace();
	        }


	    }



	    
	    
	}
