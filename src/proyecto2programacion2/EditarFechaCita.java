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
public class EditarFechaCita extends javax.swing.JFrame {

    /**
     * Creates new form EditarFechaCita
     */
    public EditarFechaCita() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        ImageIcon fecha = new ImageIcon(getClass().getResource("/Imagenes/calendar.png"));
        Icon fondo = new ImageIcon(fecha.getImage().getScaledInstance(EditFecha.getWidth(), EditFecha.getHeight(), Image.SCALE_DEFAULT));
        EditFecha.setIcon(fondo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        CodigoCita = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        VolverAtras = new javax.swing.JButton();
        ConfirmarCita = new javax.swing.JToggleButton();
        EditFecha = new javax.swing.JLabel();

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("Codigo de la Cita:");

        jTextField1.setBackground(new java.awt.Color(0, 0, 0));
        jTextField1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Editar Fecha");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(258, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(22, 22, 22))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("Codigo de la Cita:");

        CodigoCita.setBackground(new java.awt.Color(0, 0, 0));
        CodigoCita.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        CodigoCita.setForeground(new java.awt.Color(255, 255, 255));

        jComboBox3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jComboBox3.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Año:", "1980", "1981", "1982", "1983", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", " " }));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 204));
        jLabel11.setText("Nueva Fecha:");

        jComboBox1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dia:", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " ", " " }));

        jComboBox2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mes:", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        VolverAtras.setBackground(new java.awt.Color(204, 0, 0));
        VolverAtras.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        VolverAtras.setForeground(new java.awt.Color(255, 255, 255));
        VolverAtras.setText("Volver Atras");
        VolverAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverAtrasActionPerformed(evt);
            }
        });

        ConfirmarCita.setBackground(new java.awt.Color(0, 255, 0));
        ConfirmarCita.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ConfirmarCita.setForeground(new java.awt.Color(255, 255, 255));
        ConfirmarCita.setText("Confirmar Fecha");
        ConfirmarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmarCitaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(VolverAtras)
                .addGap(44, 44, 44))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(197, 197, 197)
                                .addComponent(CodigoCita, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ConfirmarCita)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(36, 36, 36)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(EditFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(CodigoCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(EditFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VolverAtras)
                    .addComponent(ConfirmarCita))
                .addGap(13, 13, 13))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VolverAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverAtrasActionPerformed
        Pacientes P = new Pacientes();
        P.setVisible(true);
        P.pack();
        P.setLocationRelativeTo(null);
        P.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_VolverAtrasActionPerformed

    private void ConfirmarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarCitaActionPerformed
        Citas C = new Citas();
        C.setVisible(true);
        C.pack();
        C.setLocationRelativeTo(null);
        C.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_ConfirmarCitaActionPerformed

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
            java.util.logging.Logger.getLogger(EditarFechaCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarFechaCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarFechaCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarFechaCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarFechaCita().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CodigoCita;
    private javax.swing.JToggleButton ConfirmarCita;
    private javax.swing.JLabel EditFecha;
    private javax.swing.JButton VolverAtras;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}