package database;

import java.sql.*;
/**
 *
 * @author iisiramen
 */
public class ConnectionBD { 
    
    Statement MaCo;
    Connection Connect;

    public ConnectionBD() {
    
       
 
           try{ //Connexion à la base de données
              //Charge le driver
                Class.forName("org.postgresql.Driver");
              //Connexion à la base de données
                Connection maConnexion = DriverManager.getConnection("jdbc:postgresql:shopmusic", "iisiramen", "alexiane91");
              //Création de l'objet permettant d'exécuter des requêtes
                Connect = maConnexion;
                Statement stat = maConnexion.createStatement();
                MaCo = stat;
          }

        //Afficher un message si il y a une erreur avec le driver
          catch (ClassNotFoundException erreur){
           System.out.print("Erreur du driver");
          }

       //Afficher un message si il y a une erreur SQL ou autre
          catch (SQLException erreur){
            System.out.print(erreur+" "+2);
          }
    }//FIN CONNEXION

    public Statement getStat(){
        return(MaCo);
    }

}// FIN ConnectDB