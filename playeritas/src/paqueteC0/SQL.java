package paqueteC0;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SQL {
    
    public SQL(){
    }
public  Statement conn() {
    try{
    DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
    
    //Aqui ponganle el puerto de su computadora para que funcione es que yo le puse el 9418
    
    Connection  connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:9418:XE","scrum", "scrum");
    Statement statement = connection.createStatement();
    //JOptionPane.showMessageDialog(null, "Conexion BD exitosa");
    return statement;
    }
    catch(SQLException | HeadlessException e){      
        JOptionPane.showMessageDialog(null,"Ocurrio un error al conectar con la base de datos","Error",JOptionPane.WARNING_MESSAGE);
        System.exit(0);
        return null;
 }
}
public void C01(int A1, int A2,JFrame frame) throws SQLException{    
    String consulta="select * from SCRUM.EMPLEADO,SCRUM.PERSONA where PERSONA_IDPERSONA= "+A1;    
    Connection  connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:9418:XE","scrum","scrum");
    Statement statement = connection.createStatement();
    ResultSet rset = statement.executeQuery(consulta);
    if(rset.next()==true){
        if(rset.getString("PASSEMPLEADO").equals(Integer.toString(A2))){ 
                    String n= rset.getString("NOMPERSONA");
                    interfaz in = new interfaz(frame,n);
                    in.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null,"Contraseña equivocada");
        }
    }
    else{
        JOptionPane.showMessageDialog(null,"El usuario no existe","ERROR",JOptionPane.ERROR_MESSAGE);
    }
}
public void C02(int m) throws SQLException{        
    String consulta="select * from SCRUM.PERSONA where IDPERSONA="+m;   
    String consulta2="select PERSONA_IDPERSONA from SCRUM.CLIENTE where PERSONA_IDPERSONA="+m;
    Connection  connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:9418:XE","scrum","scrum");
    Statement statement = connection.createStatement();
    ResultSet rset = statement.executeQuery(consulta);                
        //ventana
        if(rset.next()==true){
        JFrame j = new JFrame();
        j.setTitle("Cliente");
        j.setSize(320,400);
        j.setLocation(600,100);
        
        j.setResizable(false);
        j.setLayout(new GridLayout(5,1));
        //consulta de datos        
        String nom =rset.getString("NOMPERSONA");
        String ap =rset.getString("APPERSONA");
        String am =rset.getString("AMPERSONA");
        String ca =rset.getString("CALLE");
        String num =rset.getString("NUMERO");
        String col =rset.getString("COLONIA");
        String mail =rset.getString("CORREO");
        String id =rset.getString("IDPERSONA");        
        ResultSet rset2 = statement.executeQuery(consulta2);
        if(rset2.next()==true){
        //datos en la ventana
        
        JLabel n1 = new JLabel("Nombre: "+nom+" "+ap+" "+am+" ");
        JLabel ca1 = new JLabel("Calle: "+ca+" #"+num);
        JLabel col1 = new JLabel("Colonia: "+col);
        JLabel email = new JLabel("E-mail: "+mail);
        JLabel id1 = new JLabel("Id: "+id);
        j.add(n1);
        j.add(ca1);
        j.add(col1);
        j.add(email);
        j.add(id1);        
        j.setVisible(true);
        }
        
    else{
        JOptionPane.showMessageDialog(null,"El usuario no existe ","ERROR",JOptionPane.QUESTION_MESSAGE);
    }
        }
        else{
        JOptionPane.showMessageDialog(null,"El usuario no existe ","ERROR",JOptionPane.QUESTION_MESSAGE);
    }
}
public void consulta(int id) throws SQLException{
    String c ="select * from SCRUM.PERSONA where IDPERSONA="+id;
    
    Connection  connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:9418:XE","scrum","scrum");
    Statement statement = connection.createStatement();
    ResultSet rset = statement.executeQuery(c);
    if(rset.next()==true){
    JOptionPane.showMessageDialog(null,"El id de usuario ya esta ocupado","Error",JOptionPane.QUESTION_MESSAGE);        
    }
    else{
        JOptionPane.showMessageDialog(null,"El usuario es valido");        
    }
}
public void C03(JFrame f,String nom,int ID,String aP,
        String aM,String calle,
        String col,int n,String mail, String pass,JTextField nombre,JTextField aPaterno
        ,JTextField aMaterno,JTextField cal,JTextField colo,
        JTextField numero,JTextField id,JTextField email,JTextField con) throws SQLException{   
    String c ="select * from SCRUM.PERSONA where IDPERSONA="+ID;
    String inP = "INSERT INTO SCRUM.PERSONA (IDPERSONA,NOMPERSONA,APPERSONA,AMPERSONA,CALLE,"
            + "NUMERO, COLONIA,CORREO ) VALUES ('"+ID+"','"+nom+"','"+aP+"','"+aM+"','"+calle+
            "','"+n+"','"+col+"','"+mail+"')";
    String inC = "INSERT INTO SCRUM.CLIENTE (PERSONA_IDPERSONA,PASSCLIENTE) VALUES ('"+ID+"','"+pass+"')";
    Connection  connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:9418:XE","scrum","scrum");
    Statement statement = connection.createStatement();
    ResultSet rset = statement.executeQuery(c);
    if(rset.next()==true){
    JOptionPane.showMessageDialog(null,"El id de usuario ya esta ocupado","Error",JOptionPane.QUESTION_MESSAGE);        
    nombre.setEnabled(true);
                    aPaterno.setEnabled(true);
                    aMaterno.setEnabled(true);
                    cal.setEnabled(true);
                    colo.setEnabled(true);
                    numero.setEnabled(true);
                    id.setEnabled(true);
                    email.setEnabled(true);
                    con.setEnabled(true);
    }
    else{
        JOptionPane.showMessageDialog(null,"Datos guardados");                
    statement.executeUpdate(inP);
    statement.executeUpdate(inC);
    f.dispose();
    }
}
public void C04(int id) throws SQLException{
    String con ="select * from SCRUM.CLIENTE where PERSONA_IDPERSONA="+id;
    String con2 ="select * from SCRUM.PERSONA where IDPERSONA="+id;
    String deleteC = "DELETE SCRUM.CLIENTE WHERE PERSONA_IDPERSONA ="+id;
    String deleteP = "DELETE SCRUM.PERSONA WHERE IDPERSONA ="+id;
    Connection  connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:9418:XE","scrum","scrum");
    Statement statement = connection.createStatement();
    ResultSet rset = statement.executeQuery(con);
    if(rset.next()==false){
    JOptionPane.showMessageDialog(null,"El usuario no existe","Error",JOptionPane.QUESTION_MESSAGE);        
    }
    else{
        ResultSet rset2 = statement.executeQuery(con2);
        if(rset2.next()==true){
                    String n = rset2.getString("NOMPERSONA");
                    String ap= rset2.getString("APPERSONA");
                    String am= rset2.getString("AMPERSONA");
                    String c = rset2.getString("CALLE");
                    String co= rset2.getString("COLONIA");
                    int num = Integer.parseInt(rset2.getString("NUMERO"));
                    int idP = Integer.parseInt(rset2.getString("IDPERSONA"));
                    String m=rset2.getString("CORREO");
                    JFrame j = new JFrame();
        j.setTitle("Cliente a eliminar");
        j.setSize(320,400);
        j.setLocation(600,100);
        j.setResizable(false);
        j.setLayout(new GridLayout(6,1));
        JLabel n1 = new JLabel("Nombre: "+n+" "+ap+" "+am+" ");
        JLabel ca1 = new JLabel("Calle: "+c+" #"+num);
        JLabel col1 = new JLabel("Colonia: "+co);
        JLabel email = new JLabel("E-mail: "+m);
        JLabel id1 = new JLabel("Id: "+idP);
        JPanel p = new JPanel();
        p.setLayout(new FlowLayout(FlowLayout.CENTER));        
        JLabel label = new JLabel("¿Este es el cliente que desea eliminar?      ");
        JButton si = new JButton("Si");
        JButton no = new JButton("No");
        p.add(label);
        p.add(si);
        p.add(no);
        j.add(p);
        j.add(n1);
        j.add(ca1);
        j.add(col1);
        j.add(email);
        j.add(id1);        
        j.setVisible(true);
        si.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e1){
                try {                                        
                 Statement statement = connection.createStatement();
                 statement.execute(deleteC);
                 statement.execute(deleteP);
                 j.dispose();
                 JOptionPane.showMessageDialog(null,"El cliente a sido eliminado");
                } catch (SQLException ex) {
                    Logger.getLogger(C03.class.getName()).log(Level.SEVERE, null, ex);
                }                
            }
        });        
        no.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e2){
                j.dispose();
            }
        });
    }
    }
}

}