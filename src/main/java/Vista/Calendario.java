package Vista;

import Clases.Lector;
import static Clases.Lector.actividadesClase;
import Clases.Maestro;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.*;

public class Calendario extends javax.swing.JFrame {
    
    private java.util.Date fechaSeleccionada;
    private ArrayList<ArrayList<String>> bloques = new ArrayList<>();
    private String fechaBloque;
    private Maestro maestroActual;
    
    private String nombreMateria;
    private String curso;
    private String cantAlumnos;
    
    private boolean notificacionMostrada = false;

    public Calendario(java.util.Date fechaSeleccionada) {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        this.fechaSeleccionada = fechaSeleccionada;
        jDateChooser1.setDate(fechaSeleccionada); 
       System.out.println("Tamaño de la lista bloques: " + bloques.size());
        actualizarFechaSeleccionada();
        
        SetImageLabel(fondotxt, "src/main/java/Recursos/fondo4.png");
    }

    public void setNombreMateria(String nombreMateria) {
    this.nombreMateria = nombreMateria;
    System.out.println("Nombre de materia en setNombreMateria: " + this.nombreMateria);
}

    public void setCantAlumnos(String cantAlumnos) {
        this.cantAlumnos = cantAlumnos;
        System.out.println("Cantidad de alumnos en setCantAlumnos: " + this.cantAlumnos);
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public String getCantAlumnos() {
        return cantAlumnos;
    }

    
    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setBloques(ArrayList<ArrayList<String>> bloques) {
        this.bloques = bloques;
    }
    
    
    public void setFechaSeleccionada(Date fecha) {
        fechaSeleccionada = fecha;
        jDateChooser1.setDate(fechaSeleccionada);
        actualizarFechaSeleccionada();
    }
    
    // Método para actualizar el texto del JLabel con la unidad correspondiente
    public void setUnidadText(String unidad) {
        unidadtxt.setText(unidad);
    }
    
    public void setMaestroActual(Maestro maestro) {
        this.maestroActual = maestro;
    }
    
    public Maestro getMaestroActual() {
        return maestroActual;
    }




    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        regresarbtn = new javax.swing.JButton();
        anteriorbtn = new javax.swing.JButton();
        siguientebtn = new javax.swing.JButton();
        diatxt = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        unidadtxt = new javax.swing.JLabel();
        contenidotxt = new javax.swing.JLabel();
        actividad1txt = new javax.swing.JLabel();
        actividad2txt = new javax.swing.JLabel();
        actividad3txt = new javax.swing.JLabel();
        tiempo1txt = new javax.swing.JLabel();
        tiempo2txt = new javax.swing.JLabel();
        tiempo3txt = new javax.swing.JLabel();
        evaluacion1txt = new javax.swing.JLabel();
        evaluacion2txt = new javax.swing.JLabel();
        evaluacion3txt = new javax.swing.JLabel();
        alarmCheckBox = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        editar2Btn = new javax.swing.JButton();
        editar3Btn = new javax.swing.JButton();
        editarBtn = new javax.swing.JButton();
        fondotxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDateChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser1PropertyChange(evt);
            }
        });
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 116, 23));

        regresarbtn.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        regresarbtn.setText("Regresar");
        regresarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarbtnActionPerformed(evt);
            }
        });
        getContentPane().add(regresarbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, -1, 22));

        anteriorbtn.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        anteriorbtn.setText("Anterior");
        anteriorbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anteriorbtnActionPerformed(evt);
            }
        });
        getContentPane().add(anteriorbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        siguientebtn.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        siguientebtn.setText("Siguiente");
        siguientebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguientebtnActionPerformed(evt);
            }
        });
        getContentPane().add(siguientebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        diatxt.setForeground(new java.awt.Color(255, 255, 255));
        diatxt.setText("Dias");
        getContentPane().add(diatxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 65, 261, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        unidadtxt.setText("Unidad: Descripcion");

        contenidotxt.setText("Contenido");

        actividad1txt.setText("Actividad1");

        actividad2txt.setText("Actividad2");

        actividad3txt.setText("Actividad3");

        tiempo1txt.setText("tiempo1");

        tiempo2txt.setText("tiempo2");

        tiempo3txt.setText("tiempo3");

        evaluacion1txt.setText("Evaluacion1");

        evaluacion2txt.setText("Evaluacion2");

        evaluacion3txt.setText("Evaluacion3");

        alarmCheckBox.setText("Alarma");

        jLabel1.setText("Aprendizaje en contacto con el docente");

        jLabel2.setText("Aprendizaje práctico experimental");

        jLabel3.setText("Aprendizaje autónomo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(alarmCheckBox)
                .addGap(26, 26, 26))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(evaluacion3txt)
                        .addComponent(tiempo3txt)
                        .addComponent(actividad3txt)
                        .addComponent(evaluacion2txt)
                        .addComponent(tiempo2txt)
                        .addComponent(evaluacion1txt)
                        .addComponent(contenidotxt)
                        .addComponent(tiempo1txt)
                        .addComponent(actividad1txt)
                        .addComponent(unidadtxt, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)
                        .addComponent(actividad2txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel2))
                .addContainerGap(405, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(alarmCheckBox)
                .addGap(1, 1, 1)
                .addComponent(unidadtxt)
                .addGap(18, 18, 18)
                .addComponent(contenidotxt)
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(actividad1txt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tiempo1txt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(evaluacion1txt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(actividad2txt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tiempo2txt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(evaluacion2txt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(actividad3txt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tiempo3txt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(evaluacion3txt)
                .addGap(21, 21, 21))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 119, 1030, -1));

        editar2Btn.setText("Actividad 2");
        editar2Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editar2BtnActionPerformed(evt);
            }
        });
        getContentPane().add(editar2Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 280, -1, -1));

        editar3Btn.setText("Actividad 3");
        editar3Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editar3BtnActionPerformed(evt);
            }
        });
        getContentPane().add(editar3Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 360, -1, -1));

        editarBtn.setText("Actividad 1");
        editarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarBtnActionPerformed(evt);
            }
        });
        getContentPane().add(editarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 200, -1, -1));
        getContentPane().add(fondotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 1200, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jDateChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser1PropertyChange
       
        if ("date".equals(evt.getPropertyName())) {
            actualizarFechaSeleccionada(); // Llamar al método para actualizar la fecha seleccionada
        }
            
    }//GEN-LAST:event_jDateChooser1PropertyChange

    private void regresarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarbtnActionPerformed
        dispose();
        Opciones opciones = new Opciones(maestroActual);
        opciones.setVisible(true);
    }//GEN-LAST:event_regresarbtnActionPerformed

    private void siguientebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguientebtnActionPerformed
        // Get the selected date from the JDateChooser
        java.util.Date selectedDate = jDateChooser1.getDate();

        // Check if the selectedDate is not null before proceeding
        if (selectedDate != null) {
            java.util.Calendar calendar = java.util.Calendar.getInstance();
            calendar.setTime(selectedDate);
            calendar.add(java.util.Calendar.DAY_OF_MONTH, 1); // Agregar un día
            fechaSeleccionada = calendar.getTime();
            jDateChooser1.setDate(fechaSeleccionada);
            actualizarFechaSeleccionada(); // Actualizar el texto del JLabel con la nueva fecha seleccionada
        }
    }//GEN-LAST:event_siguientebtnActionPerformed

    private void anteriorbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anteriorbtnActionPerformed
        // Get the selected date from the JDateChooser
        java.util.Date selectedDate = jDateChooser1.getDate();

        // Check if the selectedDate is not null before proceeding
        if (selectedDate != null) {
            java.util.Calendar calendar = java.util.Calendar.getInstance();
            calendar.setTime(selectedDate);
            calendar.add(java.util.Calendar.DAY_OF_MONTH, -1); // Restar un día
            fechaSeleccionada = calendar.getTime();
            jDateChooser1.setDate(fechaSeleccionada);
            actualizarFechaSeleccionada(); // Actualizar el texto del JLabel con la nueva fecha seleccionada
        }
    }//GEN-LAST:event_anteriorbtnActionPerformed
private int obtenerFilaDeFechaSeleccionada() {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String fechaSeleccionada = sdf.format(jDateChooser1.getDate());

    for (int fila = 0; fila < actividadesClase.size(); fila++) {
        ArrayList<String> bloque = actividadesClase.get(fila);
        String fechaBloqueStr = bloque.get(0); // Fecha en formato "dd-MMM.-yyyy"

        try {
            SimpleDateFormat sdfBloque = new SimpleDateFormat("dd-MMM.-yyyy");
            Date fechaBloqueDate = sdfBloque.parse(fechaBloqueStr);
            String fechaBloqueFormatted = sdf.format(fechaBloqueDate);

            if (fechaSeleccionada.equals(fechaBloqueFormatted)) {
                return fila;
            }
        } catch (ParseException e) {
            System.out.println("Error al analizar la fecha del bloque: " + e.getMessage());
        }
    }

    return -1; // Si no se encuentra la fecha seleccionada en la lista
}
  private void editarActividad(int columna) {
    int fila = obtenerFilaDeFechaSeleccionada();

    if (fila != -1) {
        String nuevaActividad = JOptionPane.showInputDialog(this, "Editar Actividad:", obtenerTextoActividad(fila, columna));
        String nuevoTiempo = JOptionPane.showInputDialog(this, "Editar Tiempo:", obtenerTextoTiempo(fila, columna));
        String nuevaEvaluacion = JOptionPane.showInputDialog(this, "Editar Evaluación:", obtenerTextoEvaluacion(fila, columna));

        if (nuevaActividad != null && nuevoTiempo != null && nuevaEvaluacion != null) {
            actividadesClase.get(fila).set(columna, nuevaActividad);
            actividadesClase.get(fila).set(columna + 1, nuevoTiempo);
            actividadesClase.get(fila).set(columna + 2, nuevaEvaluacion);
            actualizarInterfazGrafica(fila);
        }
    } else {
        JOptionPane.showMessageDialog(this, "No se encontró la fecha seleccionada en la lista de bloques.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}

private String obtenerTextoTiempo(int fila, int columna) {
    return actividadesClase.get(fila).get(columna + 1);
}

private String obtenerTextoEvaluacion(int fila, int columna) {
    return actividadesClase.get(fila).get(columna + 2);
}
 private String obtenerTextoActividad(int fila, int columna) {
        return actividadesClase.get(fila).get(columna);
    }
 private void actualizarInterfazGrafica(int fila) {
        ArrayList<String> bloque = actividadesClase.get(fila);

        actividad1txt.setText("Actividad: " + bloque.get(3));
        tiempo1txt.setText("Tiempo de Actividad: " + bloque.get(4));
        evaluacion1txt.setText("Evaluacion: " + bloque.get(5));

        actividad2txt.setText("Actividad: " + bloque.get(6));
        tiempo2txt.setText("Tiempo de Actividad: " + bloque.get(7));
        evaluacion2txt.setText("Evaluacion: " + bloque.get(8));

        actividad3txt.setText("Actividad: " + bloque.get(9));
        tiempo3txt.setText("Tiempo de Actividad: " + bloque.get(10));
        evaluacion3txt.setText("Evaluacion: " + bloque.get(11));
    }
    private void editarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarBtnActionPerformed
       editarActividad(3);
    }//GEN-LAST:event_editarBtnActionPerformed

    private void editar2BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editar2BtnActionPerformed
        editarActividad(6);
    }//GEN-LAST:event_editar2BtnActionPerformed

    private void editar3BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editar3BtnActionPerformed
        editarActividad(9);
    }//GEN-LAST:event_editar3BtnActionPerformed

    private void mostrarNotificacionAlarmaSiguienteDia(boolean alarmaActivada) {
        if (alarmaActivada && !notificacionMostrada) {
            // Mostrar una notificación o pop-up aquí
            JOptionPane.showMessageDialog(null, "¡La alarma para el siguiente día está activada!");
            notificacionMostrada = true; // Marcar la notificación como mostrada
        }
    }
    
    
    private void actualizarFechaSeleccionada() {
            java.util.Date selectedDate = jDateChooser1.getDate();
            if (selectedDate != null) {
                // Restablecer la variable fechaBloque a null en caso de que no haya coincidencias
                fechaBloque = null;

                // Formatear la fecha seleccionada sin información de hora, minutos o segundos
                java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
                String fechaSeleccionada = sdf.format(selectedDate);

                System.out.println("Fecha seleccionada: " + fechaSeleccionada);

                // Recorrer la lista de bloques y comparar solo el día, mes y año
                int i = 0;
                for (ArrayList<String> bloque : Lector.actividadesClase) {
                    
                    

                    String fechaBloqueStr = bloque.get(0); // Obtener la fecha del bloque en formato "dd-MMM.-yyyy"
                    // Convertir la fecha del bloque al formato "yyyy-MM-dd"
                    java.text.SimpleDateFormat sdfBloque = new java.text.SimpleDateFormat("dd-MMM.-yyyy");
                    try {
                        java.util.Date fechaBloqueDate = sdfBloque.parse(fechaBloqueStr);
                        String fechaBloqueFormatted = sdf.format(fechaBloqueDate);

                        System.out.println("Fecha Bloque: " + fechaBloqueFormatted);
                        
                        // Asignar los valores a los campos de texto materiatxt y cantAlumnostxt
                        //materiatxt.setText("Materia: " + getNombreMateria());
                        //cantAlumnostxt.setText("Cantidad de Alumnos: " + getCantAlumnos());

                        // Si la fecha del bloque coincide con la fecha seleccionada, mostrar los datos
                        if (fechaBloqueFormatted.equals(fechaSeleccionada)) {
                            
                            boolean alarmaActivada = Boolean.parseBoolean(bloque.get(12));
                   
                            alarmCheckBox.setSelected(alarmaActivada);

                            // Agregar un ActionListener al CheckBox para que actualice el valor en el bloque
                            alarmCheckBox.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    boolean isSelected = alarmCheckBox.isSelected();
                                    bloque.set(12, String.valueOf(isSelected));
                                }
                            });                            
                         
                            // Asignar la fecha del bloque correspondiente a la variable fechaBloque
                            this.fechaBloque = fechaBloqueFormatted;

                            // Mostrar el segundo elemento de la lista (columna A del Excel) en txtunidad
                            unidadtxt.setText("Unidad: " + bloque.get(1));

                            // Mostrar el tercer elemento de la lista (columna B del Excel) en txtcontenido
                            contenidotxt.setText("Contenido: " + bloque.get(2));
                            
                            if (bloque.get(3).trim().isEmpty())
                            {
                                actividad1txt.setText("No hay Actividad asignada ");
                                tiempo1txt.setText(" ");
                                evaluacion1txt.setText(" ");
                            }
                            else
                            {
                                actividad1txt.setText("Actividad: " + bloque.get(3) );
                                tiempo1txt.setText("Tiempo de Actividad: " + bloque.get(4));
                                evaluacion1txt.setText("Evaluacion: " + bloque.get(5));
                            }     
                            
                            if (bloque.get(6).trim().isEmpty())
                            {
                                actividad2txt.setText(" No hay Actividad asignada");
                                tiempo2txt.setText(" ");
                                evaluacion2txt.setText(" ");  
                            }
                            else 
                            {
                               actividad2txt.setText("Actividad: " + bloque.get(6) );
                               tiempo2txt.setText("Tiempo de Actividad: " + bloque.get(7));
                               evaluacion2txt.setText("Evaluacion: " + bloque.get(8));  
                            }
                            
                            if (bloque.get(9).trim().isEmpty())
                            {
                                actividad3txt.setText(" No hay Actividad asignada");
                                tiempo3txt.setText(" ");
                                evaluacion3txt.setText(" ");
                            }
                            else 
                            {
                                actividad3txt.setText("Actividad: " + bloque.get(9) );
                                tiempo3txt.setText("Tiempo de Actividad:  " + bloque.get(10));
                                evaluacion3txt.setText("Evaluacion: " + bloque.get(11));
                            }
                                                   
                            // Mostrar el día correspondiente en el diatxt
                            java.text.SimpleDateFormat sdfDia = new java.text.SimpleDateFormat("EEEE");
                            String diaSeleccionado = sdfDia.format(selectedDate);
                            diatxt.setText("Días: " + diaSeleccionado);
                            
                            // Agregar esta línea para imprimir los elementos de la lista bloque en la consola
                            System.out.println("Elementos en bloque: " + bloque);
                            
                            
                            //NOTIFICACIONES
                            if (i + 1 < Lector.actividadesClase.size() && !notificacionMostrada) {
                                ArrayList<String> siguienteBloque = Lector.actividadesClase.get(i + 1);
                                boolean alarmaSiguienteDia = Boolean.parseBoolean(siguienteBloque.get(12));

                                if (alarmaSiguienteDia) {
                                    mostrarNotificacionAlarmaSiguienteDia(alarmaSiguienteDia);
                                    notificacionMostrada = true; // Marcar la notificación como mostrada
                                }
                            }

                            i++;   
                            
                            return; // Salir del método una vez se encuentre el bloque correspondiente
                        }
                    } catch (java.text.ParseException e) {
                        // Manejar la excepción en caso de que ocurra un error al analizar la fecha del bloque
                        System.out.println("Error al analizar la fecha del bloque: " + e.getMessage());
                    }
                }
                
                
                // Si no se encontró un bloque para la fecha seleccionada, mostrar un mensaje
                unidadtxt.setText("Unidad: No hay datos para esta fecha");
                contenidotxt.setText("Contenido: No hay datos para esta fecha");
                actividad1txt.setText(""  );
                tiempo1txt.setText("");
                evaluacion1txt.setText("");
                actividad2txt.setText("");
                tiempo2txt.setText("");
                evaluacion2txt.setText("");          
                actividad3txt.setText("");
                tiempo3txt.setText("");
                evaluacion3txt.setText("");
                diatxt.setText("Días: " + sdf.format(selectedDate)); // Mostrar solo el día correspondiente en diatxt
                
                notificacionMostrada = false;

            }
        }





    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calendario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calendario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calendario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calendario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        String fechaInicialStr = "2023-05-02";
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaInicial = null;
        try {
            fechaInicial = dateFormat.parse(fechaInicialStr);
                // Crear una instancia de Maestro con el nombre y contraseña adecuados
            Maestro maestroActual = new Maestro("nombreDeUsuario", "contrasena123");

            // Crear una instancia de Calendario y pasarle el maestroActual al constructor
            Calendario calendario = new Calendario(fechaInicial);
            calendario.setVisible(true);

           

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel actividad1txt;
    private javax.swing.JLabel actividad2txt;
    private javax.swing.JLabel actividad3txt;
    private javax.swing.JCheckBox alarmCheckBox;
    private javax.swing.JButton anteriorbtn;
    private javax.swing.JLabel contenidotxt;
    private javax.swing.JLabel diatxt;
    private javax.swing.JButton editar2Btn;
    private javax.swing.JButton editar3Btn;
    private javax.swing.JButton editarBtn;
    private javax.swing.JLabel evaluacion1txt;
    private javax.swing.JLabel evaluacion2txt;
    private javax.swing.JLabel evaluacion3txt;
    private javax.swing.JLabel fondotxt;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton regresarbtn;
    private javax.swing.JButton siguientebtn;
    private javax.swing.JLabel tiempo1txt;
    private javax.swing.JLabel tiempo2txt;
    private javax.swing.JLabel tiempo3txt;
    private javax.swing.JLabel unidadtxt;
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
