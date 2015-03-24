package paqueteC0;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class C01 extends JFrame{
    private JButton i;
    private JTextField A1;
    private JPasswordField A2;
    private final JFrame frame;
    public C01(){
        setSize(400,180);
        setTitle("Playeritas online");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                
        componentes();
        setIconImage(new ImageIcon("logo.png").getImage());
        con();
        frame = this;
    }
    public void componentes(){
        JPanel centro = new JPanel();
        add(centro,BorderLayout.CENTER);        
        JPanel sur = new JPanel();
        add(sur,BorderLayout.SOUTH);
        centro.setLayout(new BoxLayout(centro, BoxLayout.PAGE_AXIS));
        JLabel user = new JLabel("Usuario");
        JLabel pass = new JLabel("Contraseña");
        A1 = new JTextField(15);
        A2 = new JPasswordField(15);
        centro.add(user);
        centro.add(A1);
        centro.add(pass);
        centro.add(A2);
        
        //sur
        i = new JButton("Iniciar");
        sur.add(i,BorderLayout.CENTER);
        }
    public void con(){
        /*
        
           Conexion en construcción
        
        */
        i.addActionListener(new ActionListener(){
            @Override 
            public void actionPerformed(ActionEvent e){
                if(A1.getText().equals("") || A2.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Faltan campos por llenar");
                }
                else{
                    interfaz in = new interfaz(frame);
                    in.setVisible(true);
                }
            }
        });
    }
}
