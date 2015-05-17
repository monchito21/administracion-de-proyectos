package paqueteC0;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import objetos.cliente;
import objetos.empleado;
import objetos.pedido;
import objetos.producto;
import objetos.suministro;
public class SQL {
    private DefaultListModel modelo;
    private pedido pL;
    private int a;
    public SQL(){
    }
public  Statement conn() {
    try{
    DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
    
    //Aqui ponganle el puerto de su computadora para que funcione es que yo le puse el 9418
    
    Connection  connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","scrum", "scrum");
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
    Connection  connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","scrum", "scrum");
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
    Connection  connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","scrum", "scrum");
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
    
    Connection  connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","scrum", "scrum");
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
    Connection  connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","scrum", "scrum");
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
    Connection  connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","scrum", "scrum");
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
        j.setSize(360,450);
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
public void tipoProducto(JComboBox tp) throws SQLException{
    String con ="select * from SCRUM.TIPOPRODUCTO";
    Connection  connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","scrum", "scrum");
    Statement statement = connection.createStatement();
    ResultSet rset = statement.executeQuery(con);
   
    while(rset.next()){
        tp.addItem(rset.getString("TIPO"));
    }
}
public void C05(int Id,int tipo,int cantidad,String estado,String tipoNom,String color, JFrame frame ) throws SQLException{
    String con = "select * from SCRUM.PRODUCTO where TIPOPRODUCTO_IDTIPO ="+tipo;
    String con2 ="select * from SCRUM.PERSONA where IDPERSONA="+Id;
    String conF="select max (FOLIOPEDIDO)from COMPRA";   
    String conC ="select * from SCRUM.CLIENTE where PERSONA_IDPERSONA="+Id;
    Connection  connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","scrum", "scrum");
    Statement statement = connection.createStatement();
    ResultSet rset = statement.executeQuery(con);    
    if(rset.next()==true){            
        double p =Double.parseDouble(rset.getString("PRECIO"));
        int idProducto= Integer.parseInt(rset.getString("IDPRODUCTO"));
        ResultSet rsetF = statement.executeQuery(conF);    
        rsetF.next();
        int folio = rsetF.getInt(1)+1;        
        
        ResultSet rsetC = statement.executeQuery(conC);
        if(rsetC.next()==true){
            ResultSet rset3 = statement.executeQuery(con2);
        if(rset3.next()==true){       
            double pT =p*cantidad;
            //String pTotal= Double.toString(pT);
            String precio= Double.toString(p);
            String can= Integer.toString(cantidad);
            String n = rset3.getString("NOMPERSONA");
            String aP=rset3.getString("APPERSONA");
            String aM=rset3.getString("AMPERSONA");        
            String nombre=n+" "+aP+" "+aM;
        JFrame j = new JFrame();
        j.setTitle("Pedido a registrar");
        j.setSize(390,500);
        j.setLocation(600,100);
        j.setResizable(false);
        j.setLayout(new GridLayout(9,1));
        JLabel id1 = new JLabel("Nombre: "+nombre);
        JLabel id2 = new JLabel("Producto: "+tipoNom);
        JLabel id8 = new JLabel("Color: "+color);
        JLabel id3 = new JLabel("Cantidad: "+cantidad+" piezas");
        JLabel id4 = new JLabel("Precio x Producto: $"+p);
        JLabel id5 = new JLabel("Precio total: $"+pT);
        JLabel id6 = new JLabel("Estado: "+estado);
        JLabel id7 = new JLabel("Folio: "+folio);
        
        JPanel pan = new JPanel();
        pan.setLayout(new FlowLayout(FlowLayout.CENTER));        
        JLabel label = new JLabel("Registrar pedido: ");
        JButton si = new JButton("Si");
        JButton no = new JButton("No");
        pan.add(label);
        pan.add(si);
        pan.add(no);
        
        j.add(pan);
        j.add(id1);
        j.add(id2);
        j.add(id8);
        j.add(id3);
        j.add(id4);
        j.add(id5);
        j.add(id6);
        j.add(id7);
        j.setVisible(true);
        si.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String inP = "INSERT INTO SCRUM.PEDIDO (FOLIO,PRODUCTO_IDPRODUCTO,CANTIDAD,PRECIOXPRODUCTO,PEDIDOCOL,PRECIOTOTAL,"
                        + "TIPOPRODUCTO_IDTIPO) VALUES('"+folio+"','"+idProducto+"','"+can+"','"+precio+"','"+color+"','"+pT+"','"+tipo+"')";
                String inE="INSERT INTO SCRUM.EDOCOMPRA (IDESTADO,ESTADO)VALUES ('"+folio+"','"+estado+"')";
                String inC="INSERT INTO SCRUM.COMPRA (FOLIOPEDIDO,CLIENTE_PERSONA_IDPERSONA,"
                        + "EDOCOMPRA_IDESTADO,PEDIDO_FOLIO,PRODUCTO_IDPRODUCTO)"
                        + "VALUES ('"+folio+"','"+Id+"','"+folio+"','"+folio+"','"+idProducto+"')";
                try {
                    statement.executeUpdate(inP);
                } catch (SQLException ex) {
                    Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    statement.executeUpdate(inE);
                } catch (SQLException ex) {
                    Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    statement.executeUpdate(inC);
                } catch (SQLException ex) {
                    Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
                }
                j.dispose();
                frame.dispose();                
            }
        });
        
        no.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                j.dispose();
            }
        });
        }
        else{
        JOptionPane.showMessageDialog(null,"No existe ese cliente");
    }
    }
        
    else{
        JOptionPane.showMessageDialog(null,"No existe ese cliente");
    }
    }
}

 public void C06(int id) throws SQLException{
     int idP=0;
     int idE=0;
     int idC=0;
     String con ="select * from SCRUM.COMPRA where FOLIOPEDIDO= "+id;    
     Connection  connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","scrum", "scrum");
     Statement statement = connection.createStatement();     
     ResultSet rset = statement.executeQuery(con);
     if(rset.next()){         
         idE=Integer.parseInt(rset.getString("EDOCOMPRA_IDESTADO"));
         idP=Integer.parseInt(rset.getString("PEDIDO_FOLIO"));
        idC=Integer.parseInt(rset.getString("CLIENTE_PERSONA_IDPERSONA"));
        String c ="select * from SCRUM.PERSONA where IDPERSONA= "+idC;
        String con1 ="select * from SCRUM.PEDIDO where FOLIO= "+idP;
        String con2 ="select * from SCRUM.EDOCOMPRA where IDESTADO= "+idE;     
        a=idE;
         rset = statement.executeQuery(c);
         rset.next();   
         String nombre=rset.getString("NOMPERSONA")+" "+rset.getString("APPERSONA")+" "+rset.getString("AMPERSONA");
         rset = statement.executeQuery(con1);
         rset.next();
         int idTP=Integer.parseInt(rset.getString("TIPOPRODUCTO_IDTIPO"));         
         String color=rset.getString("PEDIDOCOL");
         String cantidad=rset.getString("CANTIDAD");
         String p=rset.getString("PRECIOXPRODUCTO");
         String pT=rset.getString("PRECIOTOTAL");
         String con3="select * from SCRUM.TIPOPRODUCTO where IDTIPO= "+idTP;
         rset = statement.executeQuery(con3);
         rset.next();
         String tipoNom=rset.getString("TIPO");                           
         rset = statement.executeQuery(con2);
         rset.next();         
         String estado=rset.getString("ESTADO");         
         JFrame j = new JFrame();
        j.setTitle("Pedido a cancelar");
        j.setSize(390,500);
        j.setLocation(600,100);
        j.setResizable(false);
        j.setLayout(new GridLayout(9,1));
        JLabel id1 = new JLabel("Nombre: "+nombre);
        JLabel id2 = new JLabel("Producto: "+tipoNom);
        JLabel id8 = new JLabel("Color: "+color);
        JLabel id3 = new JLabel("Cantidad: "+cantidad+" piezas");
        JLabel id4 = new JLabel("Precio x Producto: $"+p);
        JLabel id5 = new JLabel("Precio total: $"+pT);
        JLabel id6 = new JLabel("Estado: "+estado);
        JLabel id7 = new JLabel("Folio: "+id);
        
        JPanel pan = new JPanel();
        pan.setLayout(new FlowLayout(FlowLayout.CENTER));        
        JLabel label = new JLabel("Cancelar pedido: ");
        JButton si = new JButton("Si");
        JButton no = new JButton("No");
        pan.add(label);
        pan.add(si);
        pan.add(no);
        
        j.add(pan);
        j.add(id1);
        j.add(id2);
        j.add(id8);
        j.add(id3);
        j.add(id4);
        j.add(id5);
        j.add(id6);
        j.add(id7);
        j.setVisible(true);       
        rset.close();
        si.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){                                             
                String query="update EDOCOMPRA set ESTADO=? where IDESTADO=?";
                try {
                    try (PreparedStatement m = connection.prepareStatement(query)) {
                        m.setString(1,"Cancelado");
                        m.setInt(2,a);
                        m.executeUpdate();
                        JOptionPane.showMessageDialog(null,"Pedido cancelado");
                        j.dispose();
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });
        no.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                j.dispose();
            }
        });
     }
     else{
         JOptionPane.showMessageDialog(null,"No se encontro el pedido");
     }    
 }
 public void C07B(JTextArea a,cliente c,JButton m,int id) throws SQLException{
     String con = "select * from SCRUM.CLIENTE where PERSONA_IDPERSONA="+id;
     String con2 = "select * from SCRUM.PERSONA where IDPERSONA="+id;
     Connection  connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","scrum", "scrum");
     Statement statement = connection.createStatement();     
     ResultSet rset = statement.executeQuery(con);
     if(rset.next()==true){
         String pass = rset.getString("PASSCLIENTE");
         rset = statement.executeQuery(con2);
         rset.next();
         String nom =rset.getString("NOMPERSONA");
         String aP=rset.getString("APPERSONA");
         String aM=rset.getString("AMPERSONA");
         String cal=rset.getString("CALLE");
         String no=rset.getString("NUMERO");
         String col=rset.getString("COLONIA");
         String mail=rset.getString("CORREO");         
         a.setText("");
         a.setText("Nombre: "+nom+" "+aP+" "+aM+"\nCalle: "+cal+"\nNumero: "+no
                 +"\nColonia: "+col+"\nCorreo: "+mail+"\nId: "+id+"\nContraseña: "+pass);                  
         c.setNombre(nom);
         c.setaP(aP);
         c.setaM(aM);
         c.setCalle(cal);
         c.setNo(no);
         c.setCol(col);
         c.setCorreo(mail);
         c.setId(id);
         c.setPass(pass);
         c.setIdCliente(id);
         m.setEnabled(true);
         rset.close();
     }
     else{
         JOptionPane.showMessageDialog(null,"No se encontro el cliente","Error",JOptionPane.ERROR_MESSAGE);
     }
 }
 public void C07(cliente c,JFrame j,JFrame frame,JButton b) throws SQLException{
     
     String con ="select * from SCRUM.CLIENTE where PERSONA_IDPERSONA= "+c.getIdCliente();    
     String con1 ="select * from SCRUM.PERSONA where IDPERSONA= "+c.getIdCliente();    
     Connection  connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","scrum", "scrum");
     Statement statement = connection.createStatement();     
     ResultSet rset = statement.executeQuery(con);
     if(rset.next()){         
         rset = statement.executeQuery(con1);
         rset.next();
         System.out.println("El cliente fue encontrado");
         rset.close();         
                String query1="update CLIENTE set PASSCLIENTE=? where PERSONA_IDPERSONA="+c.getIdCliente();
                String sql="update PERSONA set NOMPERSONA=?,APPERSONA=?,AMPERSONA=?,CALLE=?,NUMERO=?,COLONIA=?,CORREO=?"
                        + " where IDPERSONA="+c.getIdCliente();
                //String sql = "INSERT INTO PERSONA VALUES (?,?,?,?,?,?,?,?)";
                try {
                    try (PreparedStatement m = connection.prepareStatement(query1)) {
                        m.setString(1,c.getPass());
                        m.executeUpdate();
                        m.close();
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
                }
         try (PreparedStatement m = connection.prepareStatement(sql)) {
             m.setString(1,c.getNombre());
             m.setString(2,c.getaP());
             m.setString(3,c.getaM());
             m.setString(4,c.getCalle());
             m.setString(5,c.getNo());
             m.setString(6,c.getCol());
             m.setString(7,c.getCorreo());
             m.executeUpdate();
             m.close();
             
         }
                JOptionPane.showMessageDialog(null,"Los datos han sido moficifados");
                j.dispose();
                frame.dispose();
                b.setEnabled(true);
     }
 }
 public void idProducto(producto p) throws SQLException{
     String con="select max (IDTIPO)from TIPOPRODUCTO";   
     String con1="select max (IDPRODUCTO)from PRODUCTO";   
     Connection  connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","scrum", "scrum");
    Statement statement = connection.createStatement();
    ResultSet rset = statement.executeQuery(con);    
    rset.next();
    p.setIdTipo(rset.getInt(1)+1);       
    rset = statement.executeQuery(con1);
    rset.next();
    p.setIdProducto(rset.getInt(1)+1);
    rset.close();
 }
 public void rProducto(producto p) throws SQLException{
     String con ="INSERT INTO TIPOPRODUCTO(IDTIPO,TIPO)VALUES ('"+p.getIdTipo()+"','"+p.getTipo()+"')";
     String con1 ="INSERT INTO PRODUCTO(IDPRODUCTO,TIPOPRODUCTO_IDTIPO,PRECIO)VALUES ('"+p.getIdProducto()
             +"','"+p.getIdTipo()+"','"+p.getPrecio()+"')";
     Connection  connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","scrum", "scrum");
        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate(con);
            statement.executeUpdate(con1);
            statement.close();
        }       
 }
 public int cEmpleado(empleado e,int i) throws SQLException{    
    String consulta="select * from SCRUM.EMPLEADO where PERSONA_IDPERSONA= "+e.getId();    
    Connection  connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","scrum", "scrum");
    Statement statement = connection.createStatement();
    ResultSet rset = statement.executeQuery(consulta);
    if(rset.next()==true){
        if(Integer.parseInt(rset.getString("PASSEMPLEADO"))==e.getPass()){                     
            i=1;
        }
        else{
            JOptionPane.showMessageDialog(null,"Contraseña equivocada");
            i=0;
        }
    }
    else{
        JOptionPane.showMessageDialog(null,"El usuario no existe","ERROR",JOptionPane.ERROR_MESSAGE);
        i=0;
    }
    return i;
}
 public void idSuministro(suministro s,JButton si, JButton no,JTextArea a) throws SQLException{
     String con="select max (IDSUMINISTRO)from SUMINISTRO";   
     Connection  connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","scrum", "scrum");
    Statement statement = connection.createStatement();
    ResultSet rset = statement.executeQuery(con);    
    si.setEnabled(true);
    no.setEnabled(true);
    rset.next();
    s.setIdSuministro(rset.getInt(1)+1);
    s.setIdInventario(rset.getInt(1)+1);
    rset.close();
    a.setText(" Id Empleado: "+s.getIdEmpleado()+"\n Nombre de suministro: "+s.getNomSuministro()+"\n Cantidad: "
            +s.getCantidad()+"\n Id Inventario: "+s.getIdInventario()+"\n Id Suministro: "+s.getIdSuministro());
 }
 public void C08(suministro s,JFrame j) throws SQLException{
     String con="INSERT INTO SUMINISTRO (IDSUMINISTRO,NOMSUMINISTRO) VALUES('"+s.getIdSuministro()+"','"+s.getNomSuministro()+"')";
     String con1="INSERT INTO ALMACEN (IDINVENTARIO,EMPLEADO_PERSONA_IDPERSONA,SUMINISTRO_IDSUMINISTRO,CANTIDAD) VALUES"
             + "('"+s.getIdInventario()+"','"+s.getIdEmpleado()+"','"+s.getIdSuministro()+"','"+s.getCantidad()+"')";
     Connection  connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","scrum", "scrum");
        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate(con);
            statement.executeUpdate(con1);
            statement.close();
            JOptionPane.showMessageDialog(null,"Suministro registrado");
            j.dispose();
        }
 }
 public boolean cCliente(int a,boolean b) throws SQLException{
     String query ="SELECT *FROM SCRUM.CLIENTE WHERE PERSONA_IDPERSONA="+a;
     Connection  connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","scrum", "scrum");
     Statement statement = connection.createStatement();     
     ResultSet rset = statement.executeQuery(query);
     if(rset.next()){         
         b=true;
     }
     else{
         JOptionPane.showMessageDialog(null,"No existe un cliente con ese ID");
         b=false;
     }
     return b;
 }
 public void cCompra(int a,pedido[]array) throws SQLException{
     int i=0;
     String query ="SELECT *FROM SCRUM.COMPRA WHERE CLIENTE_PERSONA_IDPERSONA="+a;
     Connection  connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","scrum", "scrum");
     Statement statement = connection.createStatement();     
        try (ResultSet rset = statement.executeQuery(query)) {
            while(rset.next()!=false){
                pL = new pedido();
                pL.setIdPersona(a);
                pL.setFolio(Integer.parseInt(rset.getString("FOLIOPEDIDO")));
                pL.setIdEstado(Integer.parseInt(rset.getString("EDOCOMPRA_IDESTADO")));
                array[i]=pL;
                i=i+1;
            }  }
 }
 public pedido llenarPedido(pedido p) throws SQLException{
     String query ="SELECT *FROM SCRUM.PEDIDO WHERE FOLIO="+p.getFolio();    
     String query2 ="SELECT *FROM SCRUM.EDOCOMPRA WHERE IDESTADO="+p.getIdEstado();          
     String query3 ="SELECT *FROM SCRUM.PERSONA WHERE IDPERSONA="+p.getIdPersona();     
     Connection  connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","scrum", "scrum");
     Statement statement = connection.createStatement();     
     ResultSet rset = statement.executeQuery(query);
     if(rset.next()){  
         p.setIdTipo(Integer.parseInt(rset.getString("TIPOPRODUCTO_IDTIPO")));
         p.setCantidad(rset.getString("CANTIDAD"));
         p.setPxp(rset.getString("PRECIOXPRODUCTO"));
         p.setColor(rset.getString("PEDIDOCOL"));
         p.setpTotal(rset.getString("PRECIOTOTAL"));                  
         rset = statement.executeQuery(query2);
         rset.next();
         p.setEstado(rset.getString("ESTADO"));
         rset = statement.executeQuery(query3);
         rset.next();
         p.setCliente(rset.getString("NOMPERSONA")+" "+rset.getString("APPERSONA")+" "+rset.getString("AMPERSONA"));
         rset.close();
     }
     return p;
 }
 public pedido idTipo(pedido p) throws SQLException{
     String query ="SELECT *FROM SCRUM.TIPOPRODUCTO WHERE IDTIPO="+p.getIdTipo();
     Connection  connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","scrum", "scrum");
     Statement statement = connection.createStatement();     
     ResultSet rset = statement.executeQuery(query);
     if(rset.next()){  
         p.setTipo(rset.getString("TIPO"));
         rset.close();
     }
     return p;
 }
}