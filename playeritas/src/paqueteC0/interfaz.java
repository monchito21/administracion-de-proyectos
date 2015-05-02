package paqueteC0;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import objetos.canPedido;

public final class interfaz extends javax.swing.JFrame {
    private final SQL sql = new SQL();
    private C05 nP;   
    private canPedido pedidos;
    public interfaz(JFrame j,String n) {
        j.dispose();
        initComponents();
        setIconImage(new ImageIcon("logo2.png").getImage()); 
        setTitle(n);
        eventos();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombre = new javax.swing.JLabel();
        i = new javax.swing.JTextField();
        c = new javax.swing.JRadioButton();
        b = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nPedido = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        registra = new javax.swing.JMenuItem();
        elimina = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        i.setToolTipText("ID");
        i.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iActionPerformed(evt);
            }
        });

        c.setSelected(true);
        c.setText("Cliente");

        b.setText("Buscar");

        jLabel2.setText("ID de Usuario");

        jLabel1.setText("Pedidos");

        nPedido.setText("Nuevo");
        nPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nPedidoActionPerformed(evt);
            }
        });

        cancelar.setText("Cancelar");

        jMenu2.setText("Clientes");

        registra.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        registra.setText("Registra");
        registra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registraActionPerformed(evt);
            }
        });
        jMenu2.add(registra);

        elimina.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        elimina.setText("Elimina");
        jMenu2.add(elimina);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(b)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(i, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombre)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(c)))
                .addContainerGap(173, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombre)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(b)
                        .addComponent(c)
                        .addComponent(i, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addComponent(nPedido)
                .addGap(28, 28, 28)
                .addComponent(cancelar)
                .addContainerGap(169, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registraActionPerformed

    private void iActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iActionPerformed

    private void nPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nPedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nPedidoActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JButton b;
    private javax.swing.JRadioButton c;
    private javax.swing.JButton cancelar;
    private javax.swing.JMenuItem elimina;
    private javax.swing.JTextField i;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JButton nPedido;
    private javax.swing.JLabel nombre;
    private javax.swing.JMenuItem registra;
    // End of variables declaration//GEN-END:variables
public void eventos(){
 b.addActionListener(new ActionListener(){
     @Override
     public void actionPerformed(ActionEvent e){
         if(!"".equals(i.getText())){
         if(i.getText().matches("[0-9]*")){
             int a = Integer.parseInt(i.getText());             
         if(c.isSelected()==true){
                 try {
                     sql.C02(a);
                 } catch (SQLException ex) {
                     Logger.getLogger(interfaz.class.getName()).log(Level.SEVERE, null, ex);
                 }
         }
         }
         
         else{
             JOptionPane.showMessageDialog(null,"El ID debe ser un numero","Error al buscar",JOptionPane.WARNING_MESSAGE);
         }
     }
            else{
             JOptionPane.showMessageDialog(null,"No ha ingresado datos");
 }
     }  
 });
 
 //Registra clientes
 
 registra.addActionListener(new ActionListener(){
     @Override
     public void actionPerformed(ActionEvent e){
         C03 r = new C03();
         r.setVisible(true);
     }
 });
 elimina.addActionListener(new ActionListener(){
     @Override
     public void actionPerformed(ActionEvent e){
         String n = JOptionPane.showInputDialog("Ingrese el iD de usuario a eliminar");
         if(n.matches("[0-9]*")){
             int id = Integer.parseInt(n);
             try {
                 sql.C04(id);
             } catch (SQLException ex) {
                 Logger.getLogger(interfaz.class.getName()).log(Level.SEVERE, null, ex);
             }
         }
         else{
             JOptionPane.showMessageDialog(null,"No ha ingresado un valor numerico");
         }
     }
 });
 nPedido.addActionListener(new ActionListener(){
     @Override
     public void actionPerformed(ActionEvent e){
         try {
             nP = new C05();
         } catch (SQLException ex) {
             Logger.getLogger(interfaz.class.getName()).log(Level.SEVERE, null, ex);
         }
         nP.setVisible(true);
     }
 });
 cancelar.addActionListener(new ActionListener(){
     @Override
     public void actionPerformed(ActionEvent e){
         pedidos = new canPedido();
         pedidos.setVisible(true);
     }
 });
}
}