package paqueteC0;

import java.awt.BorderLayout;
import java.awt.Image;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class C01 extends JFrame{
    public C01(){
        setSize(400,180);
        setTitle("Playeritas online");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                
        componentes();
        setIconImage(new ImageIcon("logo.png").getImage());
        con();
    }
    public void componentes(){
        JPanel centro = new JPanel();
        add(centro,BorderLayout.CENTER);        
        JPanel sur = new JPanel();
        add(sur,BorderLayout.SOUTH);
        centro.setLayout(new BoxLayout(centro, BoxLayout.PAGE_AXIS));
        JLabel user = new JLabel("Usuario");
        JLabel pass = new JLabel("Contraseña");
        JTextField A1 = new JTextField(15);
        JTextField A2 = new JTextField(15);
        centro.add(user);
        centro.add(A1);
        centro.add(pass);
        centro.add(A2);
        
        //sur
        JButton i = new JButton("Iniciar");
        sur.add(i,BorderLayout.CENTER);
        }
    public void con(){
        /*
        
        Conexion en construcción
        
        */
    }
}
