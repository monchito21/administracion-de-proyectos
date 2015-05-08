package paqueteC0;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import objetos.cliente;
public class C07M extends javax.swing.JFrame {
    final private SQL sql= new SQL();
    private JFrame j,frame;
    private JButton boton;
    public C07M(cliente c,JButton b) {
        boton=b;
        frame=this;
        setTitle("Modifica cliente");
        setIconImage(new ImageIcon("cliente.png").getImage());
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        eventos(c);
        llenar(c);
        b.setEnabled(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        aPaterno = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        aMaterno = new javax.swing.JTextField();
        calle = new javax.swing.JTextField();
        col = new javax.swing.JTextField();
        numero = new javax.swing.JTextField();
        mail = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        con = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre");

        save.setText("Guardar");

        cancelar.setText("cancelar");

        jLabel10.setText("A. Materno");

        jLabel11.setText("A. Paterno");

        jLabel12.setText("Calle");

        jLabel13.setText("Colonia");

        jLabel14.setText("Numero");

        jLabel15.setText("E-mail");

        jLabel17.setText("Contraseña");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(save)
                        .addGap(67, 67, 67)
                        .addComponent(cancelar)
                        .addGap(82, 82, 82))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel17)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(col)
                            .addComponent(numero)
                            .addComponent(mail)
                            .addComponent(aMaterno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                            .addComponent(aPaterno)
                            .addComponent(calle)
                            .addComponent(con)
                            .addComponent(nombre))))
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelar)
                    .addComponent(save))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calle, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(col, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mail, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(con, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(C07M.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(C07M.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(C07M.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(C07M.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aMaterno;
    private javax.swing.JTextField aPaterno;
    private javax.swing.JTextField calle;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField col;
    private javax.swing.JTextField con;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JTextField mail;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField numero;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables
    public void llenar(cliente c){        
        nombre.setText(c.getNombre());
        aPaterno.setText(c.getaP());
        aMaterno.setText(c.getaM());
        calle.setText(c.getCalle());
        numero.setText(c.getNo());
        col.setText(c.getCol());
        con.setText(c.getPass());
        mail.setText(c.getCorreo());
    }
    public void eventos(cliente cli){
        save.addActionListener(new ActionListener(){
            @Override            
            public void actionPerformed(ActionEvent e){
        if(nombre.getText().equals("") || aPaterno.getText().equals("") ||aMaterno.getText().equals("") ||
                        calle.getText().equals("") ||col.getText().equals("") 
                ||numero.getText().equals("") ||mail.getText().equals("") ||con.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Faltan campos por llenar");
                }
                else{
                    nombre.setEnabled(false);
                    aPaterno.setEnabled(false);
                    aMaterno.setEnabled(false);
                    calle.setEnabled(false);
                    col.setEnabled(false);
                    numero.setEnabled(false);                    
                    mail.setEnabled(false);
                    con.setEnabled(false);
                    if(numero.getText().matches("[0-9]*")&& numero.getText().length()<=10){                                        
                    cli.setNombre( nombre.getText());
                    cli.setaP(aPaterno.getText());
                    cli.setaM(aMaterno.getText());
                    cli.setCalle(calle.getText());
                    cli.setCol(col.getText());
                    cli.setNo(numero.getText());                    
                    cli.setCorreo(mail.getText());
                    cli.setPass(con.getText());
                    JFrame j = new JFrame();
        j.setTitle("Nuevos datos");
        j.setSize(360,450);
        j.setLocation(600,100);
        j.setResizable(false);
        j.setLayout(new GridLayout(7,1));
        JLabel n1 = new JLabel("Nombre: "+cli.getNombre()+" "+cli.getaP()+" "+cli.getaM()+" ");
        JLabel ca1 = new JLabel("Calle: "+cli.getCalle()+" #"+cli.getNo());
        JLabel col1 = new JLabel("Colonia: "+cli.getCol());
        JLabel email = new JLabel("E-mail: "+cli.getCorreo());
        JLabel id1 = new JLabel("Id: "+cli.getId());
        JLabel pass = new JLabel("Contraseña: "+cli.getPass());
        JPanel p = new JPanel();
        p.setLayout(new FlowLayout(FlowLayout.CENTER));        
        JLabel label = new JLabel("Estos son los datos que desea guardar");
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
        j.add(pass);
        j.setVisible(true);
        si.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                try {
                    sql.C07(cli,j,frame,boton);
                } catch (SQLException ex) {
                    Logger.getLogger(C07M.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        no.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                nombre.setEnabled(true);
                    aPaterno.setEnabled(true);
                    aMaterno.setEnabled(true);
                    calle.setEnabled(true);
                    col.setEnabled(true);
                    numero.setEnabled(true);                    
                    mail.setEnabled(true);
                    con.setEnabled(true);
                j.dispose();
            }
        });
                    }
        }
        
            }});
    }
    
}
