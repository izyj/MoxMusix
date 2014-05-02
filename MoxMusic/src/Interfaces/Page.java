package Interfaces;

import javax.swing.ImageIcon;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;


class Page extends JFrame{

    protected ImageIcon hh;
    protected AfficheImage image ;

    public Page() {

        
        //Definition du fond d'ecran
        image =new AfficheImage("D:\\cle\\ecole\\Developpement\\java\\projet 3\\2546139-jeux-crits-avec-les-touches-du-clavier-sur-fond-bleu.jpg");
        image.setOpaque(false);
        this.setContentPane(image);

        
        this.setResizable(false);
        this.setLocationRelativeTo(null);//position de la fenetre a l'ouverture
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);// fermer grace a la croix
        this.setTitle("MoXMusic");
        this.setSize(500,600);
        this.setVisible(true);

    }

    

class AfficheImage extends JPanel {

    private Image fond;

    public AfficheImage(String s) {
        fond = getToolkit().getImage(s);
    }
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawImage(fond, 0, 0, getWidth(), getHeight(), this);
    }

}


}