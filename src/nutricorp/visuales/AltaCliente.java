/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nutricorp.visuales;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import nutricorp.AccesoADatos.PacienteData;
import nutricorp.Entidades.Paciente;

public class AltaCliente extends javax.swing.JInternalFrame {


    Connection connection;
    PreparedStatement ps;
    ResultSet rs;
    String sql = "";
   
    public AltaCliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaBuscarPaciente = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        TXTnombre = new javax.swing.JLabel();
        TXTapellido = new javax.swing.JLabel();
        TXTDNI = new javax.swing.JLabel();
        TXTDomicilio = new javax.swing.JLabel();
        TXTtelefono = new javax.swing.JLabel();
        TFNombre = new javax.swing.JTextField();
        TFApellido = new javax.swing.JTextField();
        TFDNI = new javax.swing.JTextField();
        TFDomicilio = new javax.swing.JTextField();
        TFTelefono = new javax.swing.JTextField();
        ButtonAgregar = new javax.swing.JButton();
        ButtonBuscar = new javax.swing.JButton();
        ButtonModificar = new javax.swing.JButton();
        ButtonEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtpesoactual = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();

        jLabel2.setText("NOMBRE DEL PACIENTE");

        tablaBuscarPaciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaBuscarPaciente);

        jButton1.setText("jButton1");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jDialog1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1))))
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addComponent(jButton1)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton1)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        setClosable(true);
        setTitle("Alta Clientes ");

        jDesktopPane1.setBackground(new java.awt.Color(5, 47, 46));

        TXTnombre.setBackground(new java.awt.Color(108, 187, 80));
        TXTnombre.setForeground(new java.awt.Color(244, 243, 197));
        TXTnombre.setText("Nombre:");

        TXTapellido.setBackground(new java.awt.Color(108, 187, 80));
        TXTapellido.setForeground(new java.awt.Color(244, 243, 197));
        TXTapellido.setText("Apellido/s:");

        TXTDNI.setBackground(new java.awt.Color(108, 187, 80));
        TXTDNI.setForeground(new java.awt.Color(244, 243, 197));
        TXTDNI.setText("DNI:");

        TXTDomicilio.setBackground(new java.awt.Color(108, 187, 80));
        TXTDomicilio.setForeground(new java.awt.Color(244, 243, 197));
        TXTDomicilio.setText("Domicilio:");

        TXTtelefono.setBackground(new java.awt.Color(108, 187, 80));
        TXTtelefono.setForeground(new java.awt.Color(244, 243, 197));
        TXTtelefono.setText("Telefono:");

        TFNombre.setBackground(new java.awt.Color(244, 243, 197));

        TFApellido.setBackground(new java.awt.Color(244, 243, 197));

        TFDNI.setBackground(new java.awt.Color(244, 243, 197));

        TFDomicilio.setBackground(new java.awt.Color(244, 243, 197));

        TFTelefono.setBackground(new java.awt.Color(244, 243, 197));

        ButtonAgregar.setBackground(new java.awt.Color(106, 188, 80));
        ButtonAgregar.setForeground(new java.awt.Color(244, 243, 197));
        ButtonAgregar.setText("Agregar");
        ButtonAgregar.setOpaque(false);
        ButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAgregarActionPerformed(evt);
            }
        });

        ButtonBuscar.setBackground(new java.awt.Color(106, 188, 80));
        ButtonBuscar.setForeground(new java.awt.Color(244, 243, 197));
        ButtonBuscar.setText("Buscar");
        ButtonBuscar.setOpaque(false);
        ButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBuscarActionPerformed(evt);
            }
        });

        ButtonModificar.setBackground(new java.awt.Color(106, 188, 80));
        ButtonModificar.setForeground(new java.awt.Color(244, 243, 197));
        ButtonModificar.setText("Modificar");
        ButtonModificar.setOpaque(false);
        ButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonModificarActionPerformed(evt);
            }
        });

        ButtonEliminar.setBackground(new java.awt.Color(106, 188, 80));
        ButtonEliminar.setForeground(new java.awt.Color(244, 243, 197));
        ButtonEliminar.setText("Eliminar");
        ButtonEliminar.setOpaque(false);
        ButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEliminarActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(108, 187, 80));
        jLabel1.setForeground(new java.awt.Color(244, 243, 197));
        jLabel1.setText("Peso Inicial");

        txtpesoactual.setBackground(new java.awt.Color(244, 243, 197));

        jCheckBox1.setBackground(new java.awt.Color(153, 255, 153));
        jCheckBox1.setForeground(new java.awt.Color(244, 243, 197));
        jCheckBox1.setText("Estado");
        jCheckBox1.setOpaque(false);

        jDesktopPane1.setLayer(TXTnombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(TXTapellido, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(TXTDNI, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(TXTDomicilio, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(TXTtelefono, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(TFNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(TFApellido, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(TFDNI, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(TFDomicilio, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(TFTelefono, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(ButtonAgregar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(ButtonBuscar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(ButtonModificar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(ButtonEliminar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtpesoactual, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jCheckBox1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(ButtonAgregar)
                        .addGap(29, 29, 29)
                        .addComponent(ButtonModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButtonEliminar))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TXTtelefono)
                            .addComponent(TXTDomicilio)
                            .addComponent(TXTapellido)
                            .addComponent(jLabel1)
                            .addComponent(TXTnombre)
                            .addComponent(TXTDNI))
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TFNombre)
                            .addComponent(TFApellido)
                            .addComponent(TFDomicilio)
                            .addComponent(TFTelefono)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(TFDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ButtonBuscar))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(txtpesoactual)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox1)))))
                .addGap(35, 35, 35))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXTDNI)
                    .addComponent(TFDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonBuscar))
                .addGap(35, 35, 35)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXTnombre)
                    .addComponent(TFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXTapellido)
                    .addComponent(TFApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXTDomicilio)
                    .addComponent(TFDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXTtelefono)
                    .addComponent(TFTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtpesoactual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1))
                .addGap(30, 30, 30)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonModificar)
                    .addComponent(ButtonAgregar)
                    .addComponent(ButtonEliminar))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAgregarActionPerformed

    String nombre = TFNombre.getText();
    String apellido = TFApellido.getText();
    String dniText = TFDNI.getText();
    String domicilio = TFDomicilio.getText();
    String telefono = TFTelefono.getText(); // Declarar y definir la variable
    String peso = txtpesoactual.getText();
    boolean estado = jCheckBox1.isSelected();

    // Validaciónes
  if (nombre.isEmpty() || !nombre.matches("^[\\p{L} ]+$")) {
    JOptionPane.showMessageDialog(this, "Nombre no válido. Debe contener solo letras, espacios y acentos.");
    return;

    }

    if (apellido.isEmpty() || !apellido.matches("^[\\p{L} ]+$")) {
    JOptionPane.showMessageDialog(this, "Nombre no válido. Debe contener solo letras, espacios y acentos.");
    return;
    }

    if (telefono.isEmpty() || !telefono.matches("^[0-9]+$")) {
       JOptionPane.showMessageDialog(this, "Teléfono no válido. Debe contener solo números.");
        return; 
    }
   if (peso.isEmpty() || !peso.matches("^\\d+(,\\d+)?$")) {
    JOptionPane.showMessageDialog(this, "Peso no válido. Debe contener números o números con coma.");
    return;
}

   
    Paciente paciente = new Paciente();
    paciente.setApellido(apellido);
    paciente.setDni(Integer.parseInt(dniText));
    paciente.setDomicilio(domicilio);
    paciente.setNombre(nombre);
    paciente.setTelefono(telefono);
    paciente.setPesoActual(peso);
    paciente.setEstado(estado);

    PacienteData pacienteData = new PacienteData();
    pacienteData.insertarPaciente(paciente);
    limpiarCampos();


    }//GEN-LAST:event_ButtonAgregarActionPerformed

    private void ButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBuscarActionPerformed

        try {
        int dni = Integer.parseInt(TFDNI.getText());
        PacienteData pacienteData = new PacienteData();
        Paciente paciente = pacienteData.buscarPacientePorDni(dni);

        if (paciente != null) {
            TFApellido.setText(paciente.getApellido());
            TFDomicilio.setText(paciente.getDomicilio());
            TFNombre.setText(paciente.getNombre());
            TFTelefono.setText(paciente.getTelefono());
            txtpesoactual.setText(paciente.getPesoActual()); // Actualiza el campo de peso
            jCheckBox1.setSelected(paciente.isEstado());
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró ningún paciente con el DNI proporcionado.");
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "El DNI debe ser un número entero válido.");
    }
        
    }//GEN-LAST:event_ButtonBuscarActionPerformed

    private void ButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonModificarActionPerformed

        
    String nombre = TFNombre.getText();
    String apellido = TFApellido.getText();
    String dniText = TFDNI.getText();
    String domicilio = TFDomicilio.getText();
    String telefono = TFTelefono.getText();
    String peso = txtpesoactual.getText();
    boolean estado = jCheckBox1.isSelected();

    // Validacións
    if (nombre.isEmpty() || !nombre.matches("^[\\p{L} ]+$")) {
    JOptionPane.showMessageDialog(this, "Nombre no válido. Debe contener solo letras, espacios y acentos.");
    return;

    }

    if (apellido.isEmpty() || !apellido.matches("^[\\p{L} ]+$")) {
    JOptionPane.showMessageDialog(this, "Nombre no válido. Debe contener solo letras, espacios y acentos.");
    return;
    }

    if (telefono.isEmpty() || !telefono.matches("^[0-9]+$")) {
        JOptionPane.showMessageDialog(this, "Teléfono no válido. Debe contener solo números.");
        return; 
    }
    
    if (peso.isEmpty() || !peso.matches("^\\d+(,\\d+)?$")) {
    JOptionPane.showMessageDialog(this, "Peso no válido. Debe contener números o números con coma.");
    return;
}
  
    Paciente paciente = new Paciente();
    paciente.setApellido(apellido);
    paciente.setDni(Integer.parseInt(dniText));
    paciente.setDomicilio(domicilio);
    paciente.setNombre(nombre);
    paciente.setTelefono(telefono);
    paciente.setPesoActual(peso);
    paciente.setEstado(estado);

    PacienteData pacienteData = new PacienteData();
    pacienteData.modificadorPaciente(paciente);
    limpiarCampos();

    }//GEN-LAST:event_ButtonModificarActionPerformed

    private void ButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEliminarActionPerformed

        int dni = Integer.parseInt(TFDNI.getText());
        PacienteData pacidata = new PacienteData();        
        pacidata.eliminarPaciente(dni);
        limpiarCampos();


    }//GEN-LAST:event_ButtonEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton ButtonAgregar;
    public javax.swing.JButton ButtonBuscar;
    public javax.swing.JButton ButtonEliminar;
    public javax.swing.JButton ButtonModificar;
    public javax.swing.JTextField TFApellido;
    public javax.swing.JTextField TFDNI;
    public javax.swing.JTextField TFDomicilio;
    public javax.swing.JTextField TFNombre;
    public javax.swing.JTextField TFTelefono;
    private javax.swing.JLabel TXTDNI;
    private javax.swing.JLabel TXTDomicilio;
    private javax.swing.JLabel TXTapellido;
    private javax.swing.JLabel TXTnombre;
    private javax.swing.JLabel TXTtelefono;
    public javax.swing.JButton jButton1;
    public javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField jTextField1;
    public javax.swing.JTable tablaBuscarPaciente;
    public javax.swing.JTextField txtpesoactual;
    // End of variables declaration//GEN-END:variables

    private void limpiarCampos(){
    
    TFApellido.setText("");
    TFDNI.setText("");
    TFDomicilio.setText("");
    TFNombre.setText("");
    TFTelefono.setText("");
    txtpesoactual.setText("");
    
    }

}
