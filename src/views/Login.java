package views;

import com.sun.jdi.connect.spi.Connection;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.sql.*;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        setImageLabel(lblLogo,"C:\\Users\\juanp\\Documents\\NetBeansProjects\\PagaMe\\src\\images\\pagaMeAzul.png");
        setImageLabel(lblFondo,"C:\\Users\\juanp\\Documents\\NetBeansProjects\\PagaMe\\src\\images\\fondoPAGAme.png");
        setImageLabel(lblIcon,"C:\\Users\\juanp\\Documents\\NetBeansProjects\\PagaMe\\src\\images\\logoKoppel.png");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblContra = new javax.swing.JLabel();
        txtContra = new javax.swing.JTextField();
        lblTipo = new javax.swing.JLabel();
        txtTipo = new javax.swing.JTextField();
        btnEntrar = new javax.swing.JButton();
        lblIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setForeground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogo.setBackground(new java.awt.Color(255, 255, 255));
        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bg.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 170, 260, 120));
        lblLogo.getAccessibleContext().setAccessibleName("lblLogo");

        lblFondo.setBackground(new java.awt.Color(255, 255, 255));
        bg.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 0, 260, 580));
        lblFondo.getAccessibleContext().setAccessibleName("lblFondo");

        lblUsuario.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        lblUsuario.setText("Usuario");
        bg.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 100, 30));
        bg.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 440, 30));

        lblContra.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        lblContra.setText("Contraseña");
        bg.add(lblContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));
        bg.add(txtContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 440, 30));

        lblTipo.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        lblTipo.setText("Tipo");
        bg.add(lblTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, -1, -1));
        bg.add(txtTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, 440, 30));

        btnEntrar.setBackground(new java.awt.Color(15, 103, 175));
        btnEntrar.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar.setText("Entrar");
        btnEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        bg.add(btnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 470, 150, 60));

        lblIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIcon.setMaximumSize(new java.awt.Dimension(408, 83));
        lblIcon.setMinimumSize(new java.awt.Dimension(408, 83));
        lblIcon.setPreferredSize(new java.awt.Dimension(408, 83));
        bg.add(lblIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, -1, 70));
        lblIcon.getAccessibleContext().setAccessibleName("lblIcon");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 889, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private Connection conectar(){
        Connection con = null;
        try{
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/pagame","","");
        }catch(SQLException e){
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(this,"Ocurrio un error");
        }
        return con;
        
    }
    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnEntrarActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    private void setImageLabel(JLabel labelName, String root){
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
        labelName.setIcon(icon);
        this.repaint();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel lblContra;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtContra;
    private javax.swing.JTextField txtTipo;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
