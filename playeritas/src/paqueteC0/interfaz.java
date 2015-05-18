package paqueteC0;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import objetos.pedido;

public final class interfaz extends javax.swing.JFrame {
    private final SQL sql = new SQL();
    private C05 nP;   
    private boolean ba =false;
    private pedido p= new pedido();
    private final pedido[]array = new pedido[100];    
    public interfaz(JFrame j,String n) {        
        j.dispose();
        initComponents();
        setIconImage(new ImageIcon("logo2.png").getImage()); 
        setTitle(n);
        eventos();
        consultar();
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
        cliente = new javax.swing.JTextField();
        consultar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        pedidos = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        pedido = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        mostrar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        registra = new javax.swing.JMenuItem();
        modifica = new javax.swing.JMenuItem();
        elimina = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        nS = new javax.swing.JMenuItem();
        nProducto = new javax.swing.JMenuItem();

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

        consultar.setText("Consultar");

        jScrollPane1.setViewportView(pedidos);

        pedido.setEditable(false);
        pedido.setColumns(20);
        pedido.setFont(new java.awt.Font("Maiandra GD", 0, 13)); // NOI18N
        pedido.setLineWrap(true);
        pedido.setRows(5);
        jScrollPane2.setViewportView(pedido);

        jLabel3.setText("Id de cliente");

        mostrar.setText("Mostrar");

        jMenu2.setText("Clientes");

        registra.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        registra.setText("Registra");
        registra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registraActionPerformed(evt);
            }
        });
        jMenu2.add(registra);

        modifica.setText("Modifica");
        modifica.setToolTipText("Modifica datos de cliente");
        jMenu2.add(modifica);

        elimina.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        elimina.setText("Elimina");
        jMenu2.add(elimina);

        jMenuBar1.add(jMenu2);

        jMenu1.setText("Almacen");

        nS.setText("Nuevo suministro");
        nS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nSActionPerformed(evt);
            }
        });
        jMenu1.add(nS);

        nProducto.setText("Nuevo producto");
        nProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nProductoActionPerformed(evt);
            }
        });
        jMenu1.add(nProducto);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(b)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(i, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombre)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(c)))
                        .addContainerGap(173, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(mostrar, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(jLabel3)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(consultar)
                                        .addGap(70, 70, 70))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap())))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(11, 11, 11)
                                .addComponent(nPedido)
                                .addGap(28, 28, 28)
                                .addComponent(cancelar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(consultar)))
                .addGap(18, 18, 18)
                .addComponent(mostrar)
                .addContainerGap(21, Short.MAX_VALUE))
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

    private void nSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nSActionPerformed

    private void nProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nProductoActionPerformed

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
    private javax.swing.JTextField cliente;
    private javax.swing.JButton consultar;
    private javax.swing.JMenuItem elimina;
    private javax.swing.JTextField i;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem modifica;
    private javax.swing.JButton mostrar;
    private javax.swing.JButton nPedido;
    private javax.swing.JMenuItem nProducto;
    private javax.swing.JMenuItem nS;
    private javax.swing.JLabel nombre;
    private javax.swing.JTextArea pedido;
    private javax.swing.JList pedidos;
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
 modifica.addActionListener(new ActionListener(){
     @Override
     public void actionPerformed(ActionEvent e){
         C07 m = new C07();
         m.setVisible(true);
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
      int id=0;
      id=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el Folio de Pedido"));
      
         try {
             sql.C06(id);
         } catch (SQLException ex) {
             Logger.getLogger(interfaz.class.getName()).log(Level.SEVERE, null, ex);
         }      
     }
 });
 nProducto.addActionListener(new ActionListener(){
     @Override
     public void actionPerformed(ActionEvent e){
             C08P v = new C08P();
             v.setVisible(true);
     }
 });
 nS.addActionListener(new ActionListener(){
     @Override
     public void actionPerformed(ActionEvent e){
             C08 v = new C08();
             v.setVisible(true);
     }
 });
}
public void consultar(){
    mostrar.setEnabled(false);
    pedidos.setEnabled(false);
    consultar.addActionListener(new ActionListener(){
        @Override        
        public void actionPerformed(ActionEvent e){
           DefaultListModel modelo = new DefaultListModel();
           pedido.setText("");
            int i=0;
            if(cliente.getText().equals("")){
                JOptionPane.showMessageDialog(null,"No ha introducido el ID","ERROR",JOptionPane.WARNING_MESSAGE);                
        }
            else{
                if(cliente.getText().matches("[0-9]*") ){                    
                 int a=Integer.parseInt(cliente.getText());
                    try {
                        ba=sql.cCliente(a, ba);
                        while(array[i]!=null){
                            array[i]=null;
                            i++;
                        }
                        i=0;
                    } catch (SQLException ex) {
                        Logger.getLogger(interfaz.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    if(ba==true){
                        mostrar.setEnabled(ba);
                     try {
                         sql.cCompra(a, array);
                     } catch (SQLException ex) {
                         Logger.getLogger(interfaz.class.getName()).log(Level.SEVERE, null, ex);
                     }
                     
                        
            while(array[i]!=null){
                modelo.addElement(array[i].getFolio());                
                i++;
            }
            pedidos.setModel(modelo);
            pedidos.setEnabled(true);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null,"El id debe ser numerico","ERROR",JOptionPane.WARNING_MESSAGE);
                    cliente.setText("");
                }
                }
        }
    });
    /*pedidos.addListSelectionListener(new ListSelectionListener(){
        @Override
        public void valueChanged(ListSelectionEvent e){            
            
        }
    });*/
    mostrar.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            
            int po =pedidos.getSelectedIndex();            
            if(array[0]!=null ){
                if(po<=0){
                    po=0;
            try {                
                array[po]=sql.llenarPedido(array[po]);
                array[po]=sql.idTipo(array[po]);
            } catch (SQLException ex) {
                Logger.getLogger(interfaz.class.getName()).log(Level.SEVERE, null, ex);
            }    
            
          pedido.setText("");
          pedido.setText(" Nombre: "+array[po].getCliente()+"\n Producto: "+array[po].getTipo()+"\n Cantidad: "+array[po].getCantidad()
          +"\n Precio x producto: $"+array[po].getPxp()+"\n Precio total: $"+array[po].getpTotal()+"\n Color: "+array[po].getColor()
          +"\n Estado: "+array[po].getEstado());
        }
                else{try {                
                array[po]=sql.llenarPedido(array[po]);
                array[po]=sql.idTipo(array[po]);
            } catch (SQLException ex) {
                Logger.getLogger(interfaz.class.getName()).log(Level.SEVERE, null, ex);
            }    
            
          pedido.setText("");
          pedido.setText(" Nombre: "+array[po].getCliente()+"\n Producto: "+array[po].getTipo()+"\n Cantidad: "+array[po].getCantidad()
          +"\n Precio x producto: $"+array[po].getPxp()+"\n Precio total: $"+array[po].getpTotal()+"\n Color: "+array[po].getColor()
          +"\n Estado: "+array[po].getEstado());
                }
            }
            else{
                JOptionPane.showMessageDialog(null,"No cuenta con pedidos el cliente");
            }
            System.out.println(po);
        }
    });
}
}