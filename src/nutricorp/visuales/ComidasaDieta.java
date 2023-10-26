package nutricorp.visuales;

public class ComidasaDieta extends javax.swing.JInternalFrame {

    public ComidasaDieta() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        TXTND = new javax.swing.JLabel();
        CuadroDietas = new javax.swing.JScrollPane();
        TablaDieta = new javax.swing.JTable();
        CBNombreDieta = new javax.swing.JComboBox<>();
        TXTHorario = new javax.swing.JLabel();
        CBHorario = new javax.swing.JComboBox<>();
        RBComidasAgregadas = new javax.swing.JRadioButton();
        RBComidasNoAgregadas = new javax.swing.JRadioButton();
        ButtonAgregar = new javax.swing.JButton();
        ButtonEliminar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Agregar Comidas a Dietas");

        jDesktopPane1.setBackground(new java.awt.Color(5, 47, 46));
        jDesktopPane1.setForeground(new java.awt.Color(244, 243, 197));

        TXTND.setForeground(new java.awt.Color(244, 243, 197));
        TXTND.setText("Nombre de la Dieta:");

        TablaDieta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Comida", "Detalle", "Calorias", "Porciones"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        CuadroDietas.setViewportView(TablaDieta);

        TXTHorario.setForeground(new java.awt.Color(244, 243, 197));
        TXTHorario.setText("Horarios:");

        RBComidasAgregadas.setBackground(new java.awt.Color(204, 204, 204));
        RBComidasAgregadas.setForeground(new java.awt.Color(244, 243, 197));
        RBComidasAgregadas.setText("Comidas Agregadas");
        RBComidasAgregadas.setOpaque(false);
        RBComidasAgregadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBComidasAgregadasActionPerformed(evt);
            }
        });

        RBComidasNoAgregadas.setBackground(new java.awt.Color(204, 204, 204));
        RBComidasNoAgregadas.setForeground(new java.awt.Color(244, 243, 197));
        RBComidasNoAgregadas.setText("Comidas No Agreagadas");
        RBComidasNoAgregadas.setOpaque(false);

        ButtonAgregar.setForeground(new java.awt.Color(244, 243, 197));
        ButtonAgregar.setText("Agregar");
        ButtonAgregar.setOpaque(false);

        ButtonEliminar.setForeground(new java.awt.Color(244, 243, 197));
        ButtonEliminar.setText("Eliminar");
        ButtonEliminar.setOpaque(false);

        jDesktopPane1.setLayer(TXTND, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(CuadroDietas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(CBNombreDieta, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(TXTHorario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(CBHorario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(RBComidasAgregadas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(RBComidasNoAgregadas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(ButtonAgregar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(ButtonEliminar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(ButtonAgregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 225, Short.MAX_VALUE)
                .addComponent(ButtonEliminar)
                .addGap(93, 93, 93))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TXTHorario)
                            .addComponent(TXTND))
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CBNombreDieta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CBHorario, 0, 262, Short.MAX_VALUE)))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(RBComidasAgregadas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(RBComidasNoAgregadas))
                            .addComponent(CuadroDietas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXTND)
                    .addComponent(CBNombreDieta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXTHorario)
                    .addComponent(CBHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RBComidasAgregadas)
                    .addComponent(RBComidasNoAgregadas))
                .addGap(18, 18, 18)
                .addComponent(CuadroDietas, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonAgregar)
                    .addComponent(ButtonEliminar))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RBComidasAgregadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBComidasAgregadasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RBComidasAgregadasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAgregar;
    private javax.swing.JButton ButtonEliminar;
    private javax.swing.JComboBox<String> CBHorario;
    private javax.swing.JComboBox<String> CBNombreDieta;
    private javax.swing.JScrollPane CuadroDietas;
    private javax.swing.JRadioButton RBComidasAgregadas;
    private javax.swing.JRadioButton RBComidasNoAgregadas;
    private javax.swing.JLabel TXTHorario;
    private javax.swing.JLabel TXTND;
    private javax.swing.JTable TablaDieta;
    private javax.swing.JDesktopPane jDesktopPane1;
    // End of variables declaration//GEN-END:variables
}
