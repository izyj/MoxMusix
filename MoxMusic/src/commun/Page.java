package commun;

import javax.swing.ImageIcon;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.filechooser.FileNameExtensionFilter;


public class Page extends JFrame implements ActionListener{

    protected ImageIcon hh;
    protected AfficheImage image ;
    protected JMenuBar menuBar;
    protected JMenu menuFichier, menuParametre;
    protected JMenuItem menuItem;
    protected JMenuItem ajouterFichier;
    protected Toolkit tk = Toolkit.getDefaultToolkit();
    Dimension d = tk.getScreenSize(); // dimension de l'ecran
    public Page() {

        
        //Definition du fond d'ecran
        //image =new AfficheImage("D:\\cle\\ecole\\Developpement\\java\\projet 3\\2546139-jeux-crits-avec-les-touches-du-clavier-sur-fond-bleu.jpg");
       // image.setOpaque(false);
       // this.setContentPane(image);
    	menuBar = new JMenuBar();
    	menuFichier = new JMenu("Fichier");
    	menuParametre = new JMenu("Parametre");
    	menuFichier.setMnemonic(KeyEvent.VK_A);
    	menuFichier.getAccessibleContext().setAccessibleDescription(
    	        "The only menu in this program that has menu items");
    	menuBar.add(menuFichier);
    	menuBar.add(menuParametre);
    	menuItem = new JMenuItem("A text-only menu item",
                KeyEvent.VK_T);
    	menuItem.addActionListener(this);
		menuItem.setAccelerator(KeyStroke.getKeyStroke(
		KeyEvent.VK_1, ActionEvent.ALT_MASK));
		menuItem.getAccessibleContext().setAccessibleDescription(
		"This doesn't really do anything");
		menuFichier.add(menuItem);
		

		
	     this.setJMenuBar(menuBar);
        this.setResizable(false);
        this.setLocationRelativeTo(null);//centre la fenetre a l'ouverture
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);// fermer grace a la croix
        this.setTitle("MoXMusic");
        this.setSize(800,600);
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



@Override
	public void actionPerformed(ActionEvent e) {
	if(e.getSource() == menuItem){
		JFileChooser chooser = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter(
		    "JPG & GIF Images", "jpg", "gif");
		chooser.setFileFilter(filter);
		int returnVal = chooser.showOpenDialog(null);
		if(returnVal == JFileChooser.APPROVE_OPTION) {
		   System.out.println("You chose to open this file: " +
		        chooser.getSelectedFile().getName());
		
		System.out.println("marche");
		}
		
		}
	}

}