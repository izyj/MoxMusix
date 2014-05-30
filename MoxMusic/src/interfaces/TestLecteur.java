package interfaces;

   import java.io.File;
   import java.net.*;
   import javax.swing.*;
 
   public class TestLecteur
  {
 
     public static void main( String args[] )
     {
        // Cr�er un objet JFileChooser
        JFileChooser fileChooser = new JFileChooser();
 
        // Afficher le JFileChooser
        int etat = fileChooser.showOpenDialog( null );
 
        // Si un fichier a �t� s�lectionn�
        if ( etat == JFileChooser.APPROVE_OPTION ) 
        {
           URL fichierVideo = null;
 
           try
           {
 
              fichierVideo = fileChooser.getSelectedFile().toURL();
              JFrame mediaTest = new JFrame( "Lecteur Multimedia" );
              mediaTest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
 
              // Faire appel � la classe Lecteur cr��e pr�c�demment 
              Lecteur monLecteur = new Lecteur( fichierVideo );
              mediaTest.add( monLecteur );
 
              // Afficher le lecteur
              monLecteur.setSize( 350, 300 );
              monLecteur.setVisible( true );
           } 
           catch ( Exception err )
           {
              JOptionPane.showMessageDialog(null, "Erreur "+err );
              System.exit(0);
           } 
 
 
        } 
     } 
  }