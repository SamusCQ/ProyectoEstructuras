package Vista;

import Clases.Maestro;
import java.awt.Image;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.*;


public class Opciones extends javax.swing.JFrame {
    private Date fechaInicial;
    private ArrayList<ArrayList<String>> bloques; // Agrega esta variable para almacenar los bloques de datos
    private Maestro maestroActual; // Agrega una variable para almacenar el maestro actual
    

    public Opciones(Maestro maestroActual) {
        initComponents();
        setLocationRelativeTo(null);
        // Aquí defines la fecha inicial del calendario (por ejemplo, "2023-05-02")
        String fechaInicialStr = "2023-05-02";
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            fechaInicial = dateFormat.parse(fechaInicialStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.maestroActual = maestroActual; // Guarda el maestro actual en la variable miembro
        nombreLabel.setText("Bienvenido Profesor@: "+maestroActual.getNombre());
        setResizable(false);
        
        SetImageLabel(fondolabel , "src/main/java/Recursos/fondo3.png");
    }
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        archivobtn = new javax.swing.JButton();
        cerrarBtn = new javax.swing.JButton();
        nombreLabel = new javax.swing.JLabel();
        fondolabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 141, 2));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Calendario");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

        archivobtn.setBackground(new java.awt.Color(33, 41, 114));
        archivobtn.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        archivobtn.setForeground(new java.awt.Color(255, 255, 255));
        archivobtn.setText("Archivo");
        archivobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                archivobtnActionPerformed(evt);
            }
        });
        getContentPane().add(archivobtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, -1, -1));

        cerrarBtn.setBackground(new java.awt.Color(255, 141, 2));
        cerrarBtn.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cerrarBtn.setForeground(new java.awt.Color(255, 255, 255));
        cerrarBtn.setText("Cerrar");
        cerrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarBtnActionPerformed(evt);
            }
        });
        getContentPane().add(cerrarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, -1, -1));

        nombreLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        nombreLabel.setForeground(new java.awt.Color(255, 255, 255));
        nombreLabel.setText("Nombre");
        getContentPane().add(nombreLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));
        getContentPane().add(fondolabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void archivobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_archivobtnActionPerformed
        dispose();
        Archivo archivo = new Archivo(maestroActual);
        archivo.setVisible(true);
    }//GEN-LAST:event_archivobtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        Calendario calendario = new Calendario(fechaInicial); 
        calendario.setMaestroActual(maestroActual);
        calendario.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cerrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarBtnActionPerformed
       Inicio inicio = new Inicio();
       inicio.setVisible(true);
       dispose();
    }//GEN-LAST:event_cerrarBtnActionPerformed


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
            java.util.logging.Logger.getLogger(Opciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Opciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Opciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Opciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // Aquí debes crear una instancia de Maestro con el nombre y contraseña adecuados
                Maestro maestroActual = new Maestro("nombreDeUsuario", "contrasena123");

                // Luego, crea una instancia de Opciones y pásale el maestroActual al constructor
                Opciones opciones = new Opciones(maestroActual);
                opciones.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton archivobtn;
    private javax.swing.JButton cerrarBtn;
    private javax.swing.JLabel fondolabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel nombreLabel;
    // End of variables declaration//GEN-END:variables

    private void SetImageLabel(JLabel labelName, String root)
    {
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), 
                labelName.getHeight(), Image.SCALE_DEFAULT));
        labelName.setIcon(icon);
        this.repaint();
        
    }


}
