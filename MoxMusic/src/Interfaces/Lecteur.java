package Interfaces;

import java.awt.BorderLayout;
import java.awt.Component;
import java.io.IOException;
import java.net.URL;
import javax.media.CannotRealizeException;
import javax.media.Manager;
import javax.media.NoPlayerException;
import javax.media.Player;
import javax.swing.JPanel;

public class Lecteur extends JPanel
{
  public Lecteur( URL url_media )
  {
     setLayout( new BorderLayout() );


     Manager.setHint( Manager.LIGHTWEIGHT_RENDERER, true );
     try
     {

        // Cr�er un lecteur pour lire le fichier specifi�    
        Player mediaPlayer = Manager.createRealizedPlayer( url_media );

        // Cr�er les composants de video et de contr�le PlaysBack
        Component video = mediaPlayer.getVisualComponent();           
        Component controles = mediaPlayer.getControlPanelComponent();  

        // Ajouter les composants  dans le JPanel
        if ( video != null )
           add( video, BorderLayout.CENTER );

        if ( controles != null )
           add( controles, BorderLayout.SOUTH );

        // Lancer la lecture de fichier s�lectionn� 
        mediaPlayer.start(); 
     } 
     catch ( Exception err )
     {
        System.err.println( "Erreur: "+err );
     } 

  } 
}