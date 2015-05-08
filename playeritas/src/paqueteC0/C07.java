package paqueteC0;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class C07 extends JFrame{
    private JTextField id;
    private JButton b,m;
    private JTextArea a;
    private int cliente;
    private SQL sql;
    public C07(){
        sql = new SQL();
        setResizable(false);
     setTitle("Modifica cliente");          
     setSize(400,350);
        setLocation(450, 100);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        elementos();
        buscar();
        modificar();
    }    
    public void elementos(){
        JPanel panel1= new JPanel();
        JPanel panel2= new JPanel();
        panel1.setLayout(new FlowLayout(FlowLayout.CENTER));
        add(panel1,BorderLayout.NORTH);
        add(panel2,BorderLayout.CENTER);
        m = new JButton("Modificar");
        m.setEnabled(false);
        id = new JTextField(20);               
        b = new JButton("Buscar");
        a = new JTextArea(15,31);
        a.setEditable(false);
        add(m,BorderLayout.SOUTH);
        JScrollPane s = new JScrollPane(a);
        panel1.add(id);
        panel1.add(b);
        panel2.add(s);
    }
    public void buscar(){
        b.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(id.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"No ha ingresado un id");
                }else{                    
                    cliente = Integer.parseInt(id.getText());
                    System.out.println(cliente);
                    try {
                        sql.C07B(a,cliente,m);
                    } catch (SQLException ex) {
                        Logger.getLogger(C07.class.getName()).log(Level.SEVERE, null, ex);
                    }                    
                }
            }
        });
    }
    public void modificar(){
        m.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                
            }
        });
    }
}
