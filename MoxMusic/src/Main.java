import javax.swing.SwingUtilities;

import interfaces.Acceuil;
import interfaces.Lecteur;
import interfaces.TestLecteur;
import interfaces.Acceuil;


public class Main {


     

	public static void main(String[] args) {

          
			Runnable unThread = new Runnable(){
        		//traitement
        	  
				@Override
				public void run() {
				
					new Acceuil();
					
				}
        	};
        	SwingUtilities.invokeLater(unThread);
        	


    }



}