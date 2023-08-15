package Vista;

import Clases.Lector;
import Clases.Maestro;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Archivo extends javax.swing.JFrame {
    
    private java.io.File archivoSeleccionado;
    private static Maestro maestroActual;

    public Archivo(Maestro maestroActual) {
        this.maestroActual = maestroActual;
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        Archivo = new javax.swing.JFileChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Archivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArchivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(Archivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addComponent(Archivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArchivoActionPerformed
   if (evt.getActionCommand().equals(javax.swing.JFileChooser.APPROVE_SELECTION)) {
        // El usuario ha seleccionado "Aceptar"
        java.io.File selectedFile = Archivo.getSelectedFile();
        String extension = getFileExtension(selectedFile.getName());

        if ("xls".equalsIgnoreCase(extension) || "xlsx".equalsIgnoreCase(extension)) {
            // El archivo seleccionado es un archivo Excel, asignarlo a la variable archivoSeleccionado
            archivoSeleccionado = selectedFile;

            Lector lector = new Lector();
            ArrayList<ArrayList<String>> bloques = Lector.leerExcel(archivoSeleccionado.getAbsolutePath());

            // Mostrar los bloques de datos en un cuadro de diálogo
            //mostrarDatosEnDialogo(bloques);
            JOptionPane.showMessageDialog(null, "Archivo Excel válido.", 
                    "Selección Correcta", JOptionPane.INFORMATION_MESSAGE);

            System.out.println("Archivo Excel seleccionado: " + archivoSeleccionado.getAbsolutePath());
            dispose();
            Opciones opciones = new Opciones(maestroActual);
            opciones.setVisible(true);
        } else {
            // El archivo seleccionado no es un archivo Excel, mostrar mensaje de error
            JOptionPane.showMessageDialog(this, "Error: Debes seleccionar un archivo Excel válido.", "Error de selección", JOptionPane.ERROR_MESSAGE);
        }
    } else if (evt.getActionCommand().equals(javax.swing.JFileChooser.CANCEL_SELECTION)) {
        // El usuario ha seleccionado "Cancelar", redirigir al usuario a la ventana Opciones
        System.out.println("Operación cancelada, redirigiendo a la ventana Opciones.");
        // Cerrar la ventana actual (Archivo)
        dispose();

        // Abrir una instancia de la ventana Opciones
        Opciones opcionesFrame = new Opciones(maestroActual);
        opcionesFrame.setVisible(true);
    }
    }//GEN-LAST:event_ArchivoActionPerformed


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
            java.util.logging.Logger.getLogger(Archivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Archivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Archivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Archivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Archivo(maestroActual).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser Archivo;
    private javax.swing.JFileChooser jFileChooser1;
    // End of variables declaration//GEN-END:variables
    private String getFileExtension(String fileName) {
        int dotIndex = fileName.lastIndexOf(".");
        return (dotIndex == -1) ? "" : fileName.substring(dotIndex + 1);
    }
    
    private void mostrarDatosEnDialogo(ArrayList<ArrayList<String>> bloques) {
    StringBuilder sb = new StringBuilder();
    for (ArrayList<String> bloque : bloques) {
        for (String dato : bloque) {
            sb.append(dato).append("\t");
        }
        sb.append("\n");
    }
    JOptionPane.showMessageDialog(this, "Datos leídos del archivo:\n" + sb.toString(), "Datos del archivo", JOptionPane.INFORMATION_MESSAGE);
}

}

