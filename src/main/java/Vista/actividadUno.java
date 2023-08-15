package Vista;

public class actividadUno extends javax.swing.JPanel {

    public actividadUno() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        actividad1Txt = new javax.swing.JLabel();
        tiempo1Txt = new javax.swing.JLabel();
        evaluacion1Txt = new javax.swing.JLabel();
        enviarBtn = new javax.swing.JButton();
        cancelarBtn = new javax.swing.JButton();
        jtxtActividad = new javax.swing.JTextField();
        jtxtTiempo = new javax.swing.JTextField();
        jtxtEvaluacion = new javax.swing.JTextField();

        jLabel1.setText("Edicion de Actividad 1");

        actividad1Txt.setText("Actividad");

        tiempo1Txt.setText("Tiempo");

        evaluacion1Txt.setText("Evaluacion");

        enviarBtn.setText("Enviar");

        cancelarBtn.setText("Cancelar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 190, Short.MAX_VALUE)
                        .addComponent(enviarBtn)
                        .addGap(49, 49, 49)
                        .addComponent(cancelarBtn)
                        .addGap(168, 168, 168))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(evaluacion1Txt)
                            .addComponent(tiempo1Txt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(actividad1Txt, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jtxtTiempo)
                            .addComponent(jtxtActividad)
                            .addComponent(jtxtEvaluacion, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
                        .addGap(48, 48, 48))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(223, 223, 223))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(actividad1Txt)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tiempo1Txt)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(evaluacion1Txt)
                                        .addGap(54, 54, 54)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(enviarBtn)
                                            .addComponent(cancelarBtn)))
                                    .addComponent(jtxtEvaluacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jtxtTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jtxtActividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel actividad1Txt;
    private javax.swing.JButton cancelarBtn;
    private javax.swing.JButton enviarBtn;
    private javax.swing.JLabel evaluacion1Txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jtxtActividad;
    private javax.swing.JTextField jtxtEvaluacion;
    private javax.swing.JTextField jtxtTiempo;
    private javax.swing.JLabel tiempo1Txt;
    // End of variables declaration//GEN-END:variables

    public String getActividad() {
        return jtxtActividad.getText();
    }

    public String getTiempo() {
        return jtxtTiempo.getText();
    }

    public String getEvaluacion() {
        return jtxtEvaluacion.getText();
    }


}
