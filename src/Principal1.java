
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sherrera18
 */
public class Principal1 extends javax.swing.JFrame {

    /**
     * Creates new form Principal1
     */
    double v[];
    public Principal1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtLongitud = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        cmdCrear = new javax.swing.JButton();
        cmdLlenarManual = new javax.swing.JButton();
        cmdLlenarAuto = new javax.swing.JButton();
        cmdMostrar = new javax.swing.JButton();
        cmdBorrar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("JasmineUPC", 3, 24)); // NOI18N
        jLabel1.setText("MANEJO DE VECTORES");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Iniciales"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Longitud:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 14, 60, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 110, 40));

        txtLongitud.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLongitudKeyTyped(evt);
            }
        });
        getContentPane().add(txtLongitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 100, 30));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdCrear.setText("Crear");
        cmdCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCrearActionPerformed(evt);
            }
        });
        jPanel2.add(cmdCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 130, -1));

        cmdLlenarManual.setText("Llenar Manual");
        cmdLlenarManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLlenarManualActionPerformed(evt);
            }
        });
        jPanel2.add(cmdLlenarManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 130, -1));

        cmdLlenarAuto.setText("Llenar Auto");
        cmdLlenarAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLlenarAutoActionPerformed(evt);
            }
        });
        jPanel2.add(cmdLlenarAuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 130, -1));

        cmdMostrar.setText("Mostrar");
        cmdMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMostrarActionPerformed(evt);
            }
        });
        jPanel2.add(cmdMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 130, -1));

        cmdBorrar.setText("Borrar");
        cmdBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBorrarActionPerformed(evt);
            }
        });
        jPanel2.add(cmdBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 130, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 180, 180));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtResultado.setEditable(false);
        txtResultado.setColumns(20);
        txtResultado.setRows(5);
        jScrollPane1.setViewportView(txtResultado);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 190, 130));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCrearActionPerformed
        // TODO add your handling code here:
        int longitud;
        if (txtLongitud.getText().trim().isEmpty()){
        JOptionPane.showMessageDialog(this,"Digite la longitud","ERROR",JOptionPane.ERROR_MESSAGE);
        
        txtLongitud.requestFocusInWindow();
        } else if (Integer.parseInt(txtLongitud.getText().trim())==0){
        JOptionPane.showMessageDialog(this, "La longitud no puede ser cero","ERROR",JOptionPane.ERROR_MESSAGE);
        txtLongitud.requestFocusInWindow();
        txtLongitud.selectAll();
        
        }else{
        longitud = Integer.parseInt(txtLongitud.getText().trim());
        v= new double [longitud];
        JOptionPane.showMessageDialog (this, "El vector se ha creado exitosamente");
        
        
        }
            
    
            
        
    }//GEN-LAST:event_cmdCrearActionPerformed

    private void txtLongitudKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLongitudKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
          if (!Character.isDigit(c)){
          
          getToolkit().beep();
          evt.consume();
          }
    }//GEN-LAST:event_txtLongitudKeyTyped

    private void cmdLlenarManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLlenarManualActionPerformed
        // TODO add your handling code here:
        double n;
        for (int i=0; i<v.length; i++) {
        n= Double.parseDouble(JOptionPane.showInputDialog(this, "Digite el elemento en la posicion"+i));
        v[i]=n;
        
        }
    
        
    }//GEN-LAST:event_cmdLlenarManualActionPerformed

    private void cmdMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMostrarActionPerformed
        // TODO add your handling code here:
        for (int i=0; i<v.length; i++) {
        txtResultado.append(v[i]+ " ");
        
        }
        
    }//GEN-LAST:event_cmdMostrarActionPerformed

    private void cmdBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBorrarActionPerformed
        // TODO add your handling code here:
        txtLongitud.setText("");
        txtResultado.setText("");
        
        v = null;
        txtLongitud.requestFocusInWindow();
    }//GEN-LAST:event_cmdBorrarActionPerformed

    private void cmdLlenarAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLlenarAutoActionPerformed
        // TODO add your handling code here:
        double n;
        for (int i=0; i<v.length; i++) {
        n= (int) (Math.random()*50+1);
        
        v[i]=n;
        
        JOptionPane.showMessageDialog(this, "Vector Llenado Correctamente");
        }
    }//GEN-LAST:event_cmdLlenarAutoActionPerformed

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
            java.util.logging.Logger.getLogger(Principal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdBorrar;
    private javax.swing.JButton cmdCrear;
    private javax.swing.JButton cmdLlenarAuto;
    private javax.swing.JButton cmdLlenarManual;
    private javax.swing.JButton cmdMostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtLongitud;
    private javax.swing.JTextArea txtResultado;
    // End of variables declaration//GEN-END:variables
}
