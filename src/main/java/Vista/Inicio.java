package Vista;

import Clases.Clase;
import Clases.Horario;
import static Clases.Lector.getHorasSemanales;
import Clases.Maestro;
import Clases.Materia;
import Clases.Paralelo;
import Clases.Tema;
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

public class Inicio extends javax.swing.JFrame {
    public static ArrayList<Maestro> listaMaestros = new ArrayList<>(); // Declaration of listaMaestros
    Maestro maestro1;
    int semHoras;
    

    public Inicio() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);

        semHoras = getHorasSemanales();
        
        maestro1 = new Maestro("admin", "1234");
        
        listaMaestros.add(maestro1);
        
            
        SetImageLabel(fondoLabel, "src/main/java/Recursos/fondo2.png");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        usuriotxt = new javax.swing.JTextField();
        passtxt = new javax.swing.JPasswordField();
        btningresar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        fondoLabel = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usuriotxt.setBackground(new java.awt.Color(26, 95, 115));
        usuriotxt.setForeground(new java.awt.Color(255, 255, 255));
        usuriotxt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        usuriotxt.setBorder(null);
        getContentPane().add(usuriotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 190, 25));

        passtxt.setBackground(new java.awt.Color(26, 95, 115));
        passtxt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        passtxt.setBorder(null);
        passtxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(passtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 190, 25));

        btningresar.setBackground(new java.awt.Color(26, 95, 115));
        btningresar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btningresar.setForeground(new java.awt.Color(255, 255, 255));
        btningresar.setText("Iniciar");
        btningresar.setBorder(null);
        btningresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btningresarActionPerformed(evt);
            }
        });
        getContentPane().add(btningresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 80, 20));

        btnRegistrar.setBackground(new java.awt.Color(26, 95, 115));
        btnRegistrar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Registrar");
        btnRegistrar.setBorder(null);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, 100, 20));
        getContentPane().add(fondoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btningresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btningresarActionPerformed
        String usuarioIngresado = usuriotxt.getText();
        String contrasenaIngresada = new String(passtxt.getPassword());

        // Verificar si los datos ingresados coinciden con el administrador
        if (maestro1.getNombre().equals(usuarioIngresado) && maestro1.verificarContrasena(contrasenaIngresada)) {
            // Los datos son correctos para el administrador
            System.out.println("Inicio de sesión exitoso para el administrador");
            // Cerrar la ventana actual (Inicio)
            dispose();
           
            JOptionPane.showMessageDialog(this, "¡Bienvenido Administrador!");
            Opciones opciones = new Opciones(maestro1);
                opciones.setVisible(true);
        } else {
            // Los datos no corresponden al administrador, buscar el maestro en la lista
            Maestro maestroEncontrado = buscarMaestro(usuarioIngresado, contrasenaIngresada);

            if (maestroEncontrado != null) {
                // El maestro fue encontrado
                System.out.println("Inicio de sesión exitoso para el maestro " + maestroEncontrado.getNombre());
                // Cerrar la ventana actual (Inicio)
                dispose();
                Opciones opciones = new Opciones(maestroEncontrado);
                opciones.setVisible(true);
                
                JOptionPane.showMessageDialog(this, "¡Bienvenido " + maestroEncontrado.getNombre() + "!");
                
                
            } else {
                // Los datos ingresados no corresponden ni al administrador ni a ningún maestro registrado
                System.out.println("Nombre de usuario o contraseña incorrectos");
                // Mostrar un mensaje emergente de error:
                JOptionPane.showMessageDialog(this, "Nombre de usuario o contraseña incorrectos. Por favor, inténtelo de nuevo.");
            }
        }
    }//GEN-LAST:event_btningresarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // Obtener los valores ingresados por el usuario en la ventana de registro
        String nombreUsuario = usuriotxt.getText();
        String contrasena = new String(passtxt.getPassword());

        // Verificar si las cajas de texto están vacías
        if (nombreUsuario.isEmpty() || contrasena.isEmpty()) {
            // Si alguna de las cajas de texto está vacía, mostrar un mensaje de error
            JOptionPane.showMessageDialog(this, "Por favor complete todos los campos antes de registrar.");
        } else {
            // Ambas cajas de texto tienen datos, continuar con el registro
            Maestro nuevoMaestro = new Maestro(nombreUsuario, contrasena);
            listaMaestros.add(nuevoMaestro);

            // Mostrar un mensaje de registro exitoso:
            JOptionPane.showMessageDialog(this, "¡Registro exitoso! Bienvenido " + nombreUsuario);

            // Limpiar las cajas de texto después de registrar
            usuriotxt.setText("");
            passtxt.setText("");
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }
          
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btningresar;
    private javax.swing.JLabel fondoLabel;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JPasswordField passtxt;
    private javax.swing.JTextField usuriotxt;
    // End of variables declaration//GEN-END:variables
     
    private void SetImageLabel(JLabel labelName, String root)
    {
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), 
                labelName.getHeight(), Image.SCALE_DEFAULT));
        labelName.setIcon(icon);
        this.repaint();
        
    }
    
    // Método para buscar el maestro en la lista de maestros registrados
    private Maestro buscarMaestro(String usuario, String contrasena) {
        for (Maestro m : listaMaestros) {
            if (m.getNombre().equals(usuario) && m.verificarContrasena(contrasena)) {
                return m; // Se encontró el maestro, retornar el objeto Maestro
            }
        }
        return null; // El maestro no fue encontrado en la lista
    }
    
    public void agregarMaestro(Maestro maestro) {
        listaMaestros.add(maestro);
    }
    
}