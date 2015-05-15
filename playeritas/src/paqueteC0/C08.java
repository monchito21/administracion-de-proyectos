package paqueteC0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import objetos.suministro;
import objetos.empleado;
public final class C08 extends javax.swing.JFrame {
    private suministro s;
    private SQL sql;
    private empleado em;
    private int i=0;
    private JFrame j;
    public C08() {
        j=this;
        sql = new SQL();
        s = new suministro();
        em= new empleado();        
        initComponents();
        setTitle("Nuevo suministro");
        setResizable(false);     
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocation(400, 200);
        eventos();
        try {
            llenar();
        } catch (SQLException ex) {
            Logger.getLogger(C08.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        lista = new javax.swing.JComboBox();
        cantidad = new javax.swing.JSpinner();
        pass = new javax.swing.JPasswordField();
        re = new javax.swing.JButton();
        can = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        si = new javax.swing.JButton();
        no = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Id Empleado: ");

        jLabel2.setText("Producto:");

        jLabel3.setText("Contraseña:");

        jLabel4.setText("Cantidad:");

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        cantidad.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));
        cantidad.setToolTipText("Numero de piezas");

        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });

        re.setText("Registrar");

        can.setText("Cancelar");

        area.setColumns(20);
        area.setRows(5);
        jScrollPane1.setViewportView(area);

        si.setText("Si");

        no.setText("No");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(id)
                    .addComponent(lista, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                    .addComponent(pass))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(re, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                    .addComponent(can, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(si, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(no, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(re))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(can))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(si))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(no))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(C08.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(C08.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(C08.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(C08.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area;
    private javax.swing.JButton can;
    private javax.swing.JSpinner cantidad;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox lista;
    private javax.swing.JButton no;
    private javax.swing.JPasswordField pass;
    private javax.swing.JButton re;
    private javax.swing.JButton si;
    // End of variables declaration//GEN-END:variables

    public void llenar() throws SQLException{
        sql.tipoProducto(lista);
        si.setEnabled(false);
        no.setEnabled(false);
        area.setEditable(false);
    }
    public void eventos(){
        re.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(id.getText().equals("") || pass.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Faltan campos por llenar","ERROR",JOptionPane.WARNING_MESSAGE);
                }
                else{
                                        
                if(id.getText().matches("[0-9]*") && pass.getText().matches("[0-9]*")){                    
                em.setId(Integer.parseInt(id.getText()));
                em.setPass(Integer.parseInt(pass.getText()));
                em.imprime();
                    try {
                        i=sql.cEmpleado(em,i);
                    } catch (SQLException ex) {
                        Logger.getLogger(C08.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                if(i>0){
                    s.setIdEmpleado(em.getId());
                    s.setCantidad(cantidad.getValue().toString());
                    s.setNomSuministro(lista.getSelectedItem().toString());
                    try {
                        sql.idSuministro(s,si,no,area);
                        re.setEnabled(false);                        
                        id.setEnabled(false);
                        cantidad.setEnabled(false);
                        pass.setEnabled(false);
                        lista.setEnabled(false);
                    } catch (SQLException ex) {
                        Logger.getLogger(C08.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    s.imprime();                    
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null,"Los datos no son validos","ERROR",JOptionPane.WARNING_MESSAGE);
                }
                }                
            }                
        });
        can.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){                
               j.dispose();
            }
        });
        si.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                try {
                    sql.C08(s,j);
                } catch (SQLException ex) {
                    Logger.getLogger(C08.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        no.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){                
                re.setEnabled(true);
                id.setEnabled(true);
                cantidad.setEnabled(true);
                pass.setEnabled(true);
                lista.setEnabled(true);
                no.setEnabled(false);
                si.setEnabled(false);
                area.setText("");
            }
        });
    }
}