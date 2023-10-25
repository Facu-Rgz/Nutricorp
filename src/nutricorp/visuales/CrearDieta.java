/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nutricorp.visuales;

import java.sql.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import nutricorp.AccesoADatos.DietaData;
import nutricorp.Entidades.Dieta;
import nutricorp.Entidades.Paciente;

/**
 *
 * @author Matias
 */
public class CrearDieta extends javax.swing.JInternalFrame {

    DietaData dd=new DietaData();
    Dieta dt=new Dieta();
    Paciente pc=new Paciente();
    public CrearDieta() {
        initComponents();
        updateCombo();
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
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        PesoInicial = new javax.swing.JTextField();
        PesoFinal = new javax.swing.JTextField();
        FechaInicio = new com.toedter.calendar.JDateChooser();
        FechaFinal = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        NombreDieta = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setTitle("Buscar/Crear dietas");

        jLabel1.setText("Nombre Dieta:");

        jLabel2.setText("Paciente:");

        jComboBox1.setSelectedItem(null);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setSelectedItem(null);

        jLabel3.setText("Fecha de inicio:");

        jLabel4.setText("Peso inicial:");

        jLabel5.setText("Peso final:");

        jLabel6.setText("Fecha final:");

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel7.setText("Paciente:");

        jLabel8.setText("Nombre Dieta:");

        jComboBox3.setSelectedItem(null);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jButton4.setText("Nuevo");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Salir");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3)
                                .addGap(18, 18, 18)
                                .addComponent(jButton5))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(PesoFinal)
                                    .addComponent(PesoInicial)
                                    .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(NombreDieta)
                                    .addComponent(FechaInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                                    .addComponent(FechaFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4)))
                        .addContainerGap(49, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addGap(43, 43, 43))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(NombreDieta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(FechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(PesoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(PesoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(FechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton5))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        if(jButton1.isEnabled()==true){
            jComboBox2.removeAllItems();
        String name=jComboBox1.getSelectedItem().toString();
        int total=dd.listarPacienteConDietas(name).size();
        for (int i = 0; i < total; i++) {
            jComboBox2.addItem(dd.listarPacienteConDietas(name).get(i).toString());
        }}
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jComboBox3.removeAllItems();
        String name=jComboBox1.getSelectedItem().toString();
        dt=dd.buscarDieta(name,dd.listarPacienteConDietas(name).get(0).getIdPaciente());
        NombreDieta.setText(dt.getNombre());
        PesoFinal.setText(Double.toString(dt.getPesoFinal()));
        PesoInicial.setText(Double.toString(dt.getPesoInicial()));
        FechaFinal.setDate(Date.valueOf(dt.getFechaFinal()));
        FechaInicio.setDate(Date.valueOf(dt.getFechaInicial()));
        jComboBox3.addItem(dd.listarPacienteConDietas(name).get(0).toString());
        int total=dd.listarPacienteSinDietas().size();
        for (int i = 0; i < total; i++) {
            jComboBox3.addItem(dd.listarPacienteSinDietas().get(i).toString());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        LimpiarCampos();
        int total=dd.listarPacienteSinDietas().size();
        for (int i = 0; i < total; i++) {
            jComboBox3.addItem(dd.listarPacienteSinDietas().get(i).toString());
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(jComboBox3.getItemCount()==0){
            JOptionPane.showMessageDialog(this, "No hay pacientes sin dieta para agregar");
        }else{
        if (jButton1.isEnabled()==false){
            dt.setNombre(NombreDieta.getText());
            dt.setPesoInicial(Double.parseDouble(PesoInicial.getText()));
            dt.setPesoFinal(Double.parseDouble(PesoFinal.getText()));
             Instant instant1 = FechaInicio.getDate().toInstant(); // Convierte el objeto Date a un objeto Instant
             LocalDate localDate1 = instant1.atZone(ZoneId.systemDefault()).toLocalDate();  // Convierte el objeto Instant a un objeto LocalDate en una zona horaria específica
            dt.setFechaInicial(localDate1);
             Instant instant2 = FechaFinal.getDate().toInstant(); // Convierte el objeto Date a un objeto Instant
             LocalDate localDate2 = instant2.atZone(ZoneId.systemDefault()).toLocalDate();  // Convierte el objeto Instant a un objeto LocalDate en una zona horaria específica
            dt.setFechaFinal(localDate2);
            pc=dd.listarPacienteSinDietas().get(jComboBox3.getSelectedIndex());
            dt.setPaciente(pc);
            dd.guardarDieta(dt);
            LimpiarCampos();
            updateCombo();
            jComboBox1.setEnabled(true);
            jComboBox2.setEnabled(true);
            jButton1.setEnabled(true);
        }else{
            dt=dd.listarDieta().get(jComboBox1.getSelectedIndex());
            dt.setIdDieta(dt.getIdDieta());
            dt.setNombre(NombreDieta.getText());
            dt.setPesoInicial(Double.parseDouble(PesoInicial.getText()));
            dt.setPesoFinal(Double.parseDouble(PesoFinal.getText()));
            Instant instant1 = FechaInicio.getDate().toInstant(); // Convierte el objeto Date a un objeto Instant
            LocalDate localDate1 = instant1.atZone(ZoneId.systemDefault()).toLocalDate();  // Convierte el objeto Instant a un objeto LocalDate en una zona horaria específica
            dt.setFechaInicial(localDate1);
            Instant instant2 = FechaFinal.getDate().toInstant(); // Convierte el objeto Date a un objeto Instant
            LocalDate localDate2 = instant2.atZone(ZoneId.systemDefault()).toLocalDate();  // Convierte el objeto Instant a un objeto LocalDate en una zona horaria específica
            dt.setFechaFinal(localDate2);
            ArrayList<Paciente> pacientes=new ArrayList<>();
            pacientes.add(dd.listarPacienteConDietas(dt.getNombre()).get(0));
            pacientes.addAll(dd.listarPacienteSinDietas());
            pc=pacientes.get(jComboBox3.getSelectedIndex());
            dt.setPaciente(pc);
            dd.modificarDieta(dt);
            LimpiarCampos();
            updateCombo();
            jComboBox1.setEnabled(true);
            jComboBox2.setEnabled(true);
            jButton1.setEnabled(true);
        }}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        dt=dd.listarDieta().get(jComboBox1.getSelectedIndex());
        dd.eliminarDieta(dt.getIdDieta());
        LimpiarCampos();
        jComboBox1.setEnabled(true);
        jComboBox2.setEnabled(true);
        jButton1.setEnabled(true);
        updateCombo();
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser FechaFinal;
    private com.toedter.calendar.JDateChooser FechaInicio;
    private javax.swing.JTextField NombreDieta;
    private javax.swing.JTextField PesoFinal;
    private javax.swing.JTextField PesoInicial;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

private void updateCombo() {
        int total=dd.listarDieta().size();
        for (int i = 0; i < total; i++) {
            jComboBox1.addItem(dd.listarDieta().get(i).toString());
        }    
        
    }
private void LimpiarCampos(){
    jButton1.setEnabled(false);
        jComboBox1.setEnabled(false);
        jComboBox1.removeAllItems();
        jComboBox2.removeAllItems();
        jComboBox2.setEnabled(false);
        jComboBox3.removeAllItems();
        NombreDieta.setText("");
        PesoFinal.setText("");
        PesoInicial.setText("");
        FechaFinal.setDate(null);
        FechaInicio.setDate(null);
}
}