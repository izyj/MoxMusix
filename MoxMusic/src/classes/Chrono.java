package classes;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Isaac
 */
public class Chrono extends JLabel {
    /** f : Font appliqu� au texte */
private static Font f = new Font("Book Antiqua", Font.BOLD, 25);
/** timer : timer servant � d�cr�menter le chronometre */
private Timer timer;
/** couleur : couleur de fond du chronometre */
private Color couleur=Color.orange;
/** tempsRestant : temps restant */
private int tempsRestant;
/** temps : temps initial */
private int temps;
/**
* Construction du chronometre
* @param N : le nombre de secondes initial
*/
public Chrono(int N){
timer = createTimer ();
timer.start();
setOpaque(false);
setPreferredSize(new Dimension(72, 72));
this.setTempsRestant(N);
this.setTemps(N);
}
public Chrono(int N, Color couleur){
this.couleur=couleur;
timer = createTimer ();
timer.start();
setOpaque(false);
setPreferredSize(new Dimension(72, 72));
this.setTempsRestant(N);
this.setTemps(N);
}
/**
* Permet de d�marrer le chronometre
*/
public void start(){
timer.start ();
}
/**
* Permet d'arreter le chronometre
*/
public void stop(){
timer.stop ();
}
/**
* Methode qui cr�e un Timer
* @return le timer
*/
private Timer createTimer (){
ActionListener action = new ActionListener (){
public void actionPerformed (ActionEvent event){
if(tempsRestant>0){
tempsRestant--;
repaint();
}
else{
    
timer.stop();
}
}
};
return new Timer (1000, action);
}
/**
* Red�finition de la m�thode paintCompnent
*/
public void paintComponent(Graphics g) {
this.drawCircle(g, 35, 35, 30);
}
/**
* Fonction qui permet de dessiner le chronometre
* @param cg : element graphique
* @param xCenter : abscice du centre du cercle
* @param yCenter : ordonnee du centre du cercle
* @param r : rayon du cercle
*/
public void drawCircle(Graphics cg, int xCenter, int yCenter, int r) {
cg.setColor(Color.white);
cg.fillOval(xCenter-r, yCenter-r, 2*r, 2*r);
cg.setColor(couleur);
cg.fillArc(xCenter-r, yCenter-r, 2*r, 2*r, 90, -(360-tempsRestant*360/temps));
cg.setColor(Color.black);
cg.setFont(f);
if(tempsRestant>9){
cg.drawString(""+this.tempsRestant, 24, 42);
}
else{
cg.drawString("0"+this.tempsRestant, 24, 42);
}
}
public Timer getTimer() {
return timer;
}
public void setTimer(Timer timer) {
this.timer = timer;
}
public int getTempsRestant() {
return tempsRestant;
}
public void setTempsRestant(int tempsRestant) {
this.tempsRestant = tempsRestant;
}
public int getTemps() {
return temps;
}
public void setTemps(int temps) {
this.temps = temps;
} 
    
}
