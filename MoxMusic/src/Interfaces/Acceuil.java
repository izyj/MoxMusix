package Interfaces;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author iisiramen
 */
public class Acceuil extends Page implements ActionListener {

    protected JButton ajoutMot;
    protected JButton supprimerMot;
    protected JButton nouvellePartie;
    protected JButton score;
    protected JButton quitter = new JButton();
    protected JPanel contener = new JPanel();
    protected JPanel contener1 = new JPanel();
    protected JPanel contener2 = new JPanel();
    protected JPanel contener3 = new JPanel();
    protected JPanel contener4 = new JPanel();
    protected JPanel contener5 = new JPanel();
    protected JPanel Phaut = new JPanel();
    protected JPanel PBas = new JPanel();
    public Acceuil() {

        contener= new JPanel();
        contener.setOpaque(false);
        contener.setLayout(new GridLayout(5,0));
        contener1= new JPanel();
        contener1.setOpaque(false);
        contener2= new JPanel();
        contener2.setOpaque(false);
        contener3= new JPanel();
        contener3.setOpaque(false);
        contener4= new JPanel();
        contener4.setOpaque(false);
        contener5= new JPanel();
        contener5.setOpaque(false);
        
        ajoutMot = new JButton(new ImageIcon("D:\\cle\\ecole\\Developpement\\java\\projet 3\\bouton-jouer2_07.jpg"));
        ajoutMot.setPressedIcon(new ImageIcon("D:\\cle\\ecole\\Developpement\\java\\projet 3\\bouton-jouer2_07on.jpg"));
        ajoutMot.addActionListener(this);
        ajoutMot.setContentAreaFilled(false);
        ajoutMot.setBorderPainted(false);
        ajoutMot.setOpaque(false);
        ajoutMot.setPreferredSize(new Dimension(200,100));
        contener1.add(ajoutMot);
        contener.add(contener1);
        
        score = new JButton(new ImageIcon("D:\\cle\\ecole\\Developpement\\java\\projet 3\\bouton-jouer2_08.jpg"));
        score.setPressedIcon(new ImageIcon("D:\\cle\\ecole\\Developpement\\java\\projet 3\\bouton-jouer2_08on.jpg"));
        score.addActionListener(this);
        score.setContentAreaFilled(false);
        score.setBorderPainted(false);
        score.setOpaque(false);
        score.setPreferredSize(new Dimension(200,100));
        contener5.add(score);
        contener.add(contener5);

        supprimerMot = new JButton(new ImageIcon("D:\\cle\\ecole\\Developpement\\java\\projet 3\\bouton-jouer2_05.jpg"));
        supprimerMot.setPressedIcon(new ImageIcon("D:\\cle\\ecole\\Developpement\\java\\projet 3\\bouton-jouer2_05on.jpg"));
        supprimerMot.addActionListener(this);
        supprimerMot.setOpaque(false);
        supprimerMot.setContentAreaFilled(false);
        supprimerMot.setBorderPainted(false);      
        supprimerMot.setPreferredSize(new Dimension(200,100));
        contener2.add(supprimerMot);
        contener.add(contener2);
        
        nouvellePartie = new JButton(new ImageIcon("D:\\cle\\ecole\\Developpement\\java\\projet 3\\bouton-jouer2_03.gif"));
        nouvellePartie.setPressedIcon(new ImageIcon("D:\\cle\\ecole\\Developpement\\java\\projet 3\\bouton-jouer2_03on.png"));
        nouvellePartie.addActionListener(this);
        nouvellePartie.setOpaque(false);
        nouvellePartie.setContentAreaFilled(false);
        nouvellePartie.setBorderPainted(false);
        nouvellePartie.setPreferredSize(new Dimension(200,100));
        contener3.add(nouvellePartie);
        contener.add(contener3);
        
        quitter = new JButton(new ImageIcon("D:\\cle\\ecole\\Developpement\\java\\projet 3\\bouton-jouer2_06.jpg"));
        quitter.setPressedIcon(new ImageIcon("D:\\cle\\ecole\\Developpement\\java\\projet 3\\bouton-jouer2_06on.jpg"));
        quitter.addActionListener(this);
        quitter.setOpaque(false);
        quitter.setContentAreaFilled(false);
        quitter.setBorderPainted(false);
        quitter.setPreferredSize(new Dimension(200,100));
        contener4.add(quitter);
        contener.add(contener4);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// fermer grace a la croix
        this.getContentPane().add(Phaut,BorderLayout.NORTH);
        this.getContentPane().add(contener,BorderLayout.CENTER);
        PBas.setLayout(new BorderLayout());
        this.getContentPane().add(PBas,BorderLayout.SOUTH);
        this.setVisible(true);
    }
public void actionPerformed(ActionEvent e) {

      //  if(e.getSource()==ajoutMot){
      //  AjoutMot ajout = new AjoutMot();

        //}
	//        if(e.getSource()==supprimerMot){
        	//            SupprimerMot test = new SupprimerMot();       

	//        }
	//      if(e.getSource()==nouvellePartie){
        	//       Partie start = new Partie();

	//      }
        
	//      if(e.getSource()==score){
	//      VoirScore sc = new VoirScore();

	//     }
        
	//     if(e.getSource()==quitter){
	//         System.exit(0);

        }
    }