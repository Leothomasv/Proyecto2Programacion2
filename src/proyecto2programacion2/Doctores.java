/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2programacion2;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Leonel Thomas
 */
public class Doctores extends javax.swing.JFrame {

    
     
    public Doctores() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        ImageIcon doc = new ImageIcon(getClass().getResource("/Imagenes/doctor1.png"));
        Icon fondo = new ImageIcon(doc.getImage().getScaledInstance(Doctores.getWidth(), Doctores.getHeight(), Image.SCALE_DEFAULT));
        Doctores.setIcon(fondo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Doctores = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        AgregarDoctores = new javax.swing.JButton();
        ModHonorario = new javax.swing.JButton();
        ActivarDesactivardoc = new javax.swing.JButton();
        ListarDocs = new javax.swing.JButton();
        VolverAtras = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Doctores");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(Doctores, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addComponent(Doctores, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        AgregarDoctores.setBackground(new java.awt.Color(0, 0, 204));
        AgregarDoctores.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AgregarDoctores.setForeground(new java.awt.Color(255, 255, 255));
        AgregarDoctores.setText("Agregar Doctores");
        AgregarDoctores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarDoctoresActionPerformed(evt);
            }
        });

        ModHonorario.setBackground(new java.awt.Color(0, 0, 204));
        ModHonorario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ModHonorario.setForeground(new java.awt.Color(255, 255, 255));
        ModHonorario.setText("Modificar Honorario");
        ModHonorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModHonorarioActionPerformed(evt);
            }
        });

        ActivarDesactivardoc.setBackground(new java.awt.Color(0, 0, 204));
        ActivarDesactivardoc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ActivarDesactivardoc.setForeground(new java.awt.Color(255, 255, 255));
        ActivarDesactivardoc.setText("Desactivar/Activar Doctor");
        ActivarDesactivardoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActivarDesactivardocActionPerformed(evt);
            }
        });

        ListarDocs.setBackground(new java.awt.Color(0, 0, 204));
        ListarDocs.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ListarDocs.setForeground(new java.awt.Color(255, 255, 255));
        ListarDocs.setText("Listar doctores activos");
        ListarDocs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarDocsActionPerformed(evt);
            }
        });

        VolverAtras.setBackground(new java.awt.Color(0, 255, 0));
        VolverAtras.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        VolverAtras.setForeground(new java.awt.Color(255, 255, 255));
        VolverAtras.setText("Volver Atras");
        VolverAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ActivarDesactivardoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AgregarDoctores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ModHonorario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ListarDocs, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(VolverAtras)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(AgregarDoctores)
                .addGap(28, 28, 28)
                .addComponent(ModHonorario)
                .addGap(29, 29, 29)
                .addComponent(ActivarDesactivardoc)
                .addGap(31, 31, 31)
                .addComponent(ListarDocs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(VolverAtras)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VolverAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverAtrasActionPerformed
        Mantenimientos M = new Mantenimientos();
            M.setVisible(true);
            M.pack();
            M.setLocationRelativeTo(null);
            M.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           this.dispose();
    }//GEN-LAST:event_VolverAtrasActionPerformed

    private void AgregarDoctoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarDoctoresActionPerformed
        AgregarDoctores AD = new AgregarDoctores();
            AD.setVisible(true);
            AD.pack();
            AD.setLocationRelativeTo(null);
            AD.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           this.dispose();
    }//GEN-LAST:event_AgregarDoctoresActionPerformed

    private void ModHonorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModHonorarioActionPerformed
        ModificarHonorario MH = new ModificarHonorario();
            MH.setVisible(true);
            MH.pack();
            MH.setLocationRelativeTo(null);
            MH.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           this.dispose();
    }//GEN-LAST:event_ModHonorarioActionPerformed

    private void ActivarDesactivardocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActivarDesactivardocActionPerformed
       ActivarDesactivar AD = new ActivarDesactivar();
            AD.setVisible(true);
            AD.pack();
            AD.setLocationRelativeTo(null);
            AD.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           this.dispose();
       
    }//GEN-LAST:event_ActivarDesactivardocActionPerformed

    private void ListarDocsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarDocsActionPerformed
       ListarDoctores LD = new ListarDoctores();
            LD.setVisible(true);
            LD.pack();
            LD.setLocationRelativeTo(null);
            LD.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           this.dispose();
    }//GEN-LAST:event_ListarDocsActionPerformed

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
            java.util.logging.Logger.getLogger(Doctores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Doctores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Doctores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Doctores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Doctores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ActivarDesactivardoc;
    private javax.swing.JButton AgregarDoctores;
    private javax.swing.JLabel Doctores;
    private javax.swing.JButton ListarDocs;
    private javax.swing.JButton ModHonorario;
    private javax.swing.JButton VolverAtras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
