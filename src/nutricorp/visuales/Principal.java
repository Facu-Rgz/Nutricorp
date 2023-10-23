/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nutricorp.visuales;

/**
 *
 * @author gg
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        escritorio = new javax.swing.JDesktopPane();
        BarraMenu = new javax.swing.JMenuBar();
        MenuPacientes = new javax.swing.JMenu();
        MenuIPacientes = new javax.swing.JMenuItem();
        HistorialPeso = new javax.swing.JMenuItem();
        DietaVigente = new javax.swing.JMenuItem();
        MenuFiltro = new javax.swing.JMenu();
        FiltrarClientesporPeso = new javax.swing.JMenuItem();
        MenuDietas = new javax.swing.JMenu();
        CrearDietas = new javax.swing.JMenuItem();
        InsertarComidasaDietas = new javax.swing.JMenuItem();
        AgregarComidas = new javax.swing.JMenuItem();
        Filtros2 = new javax.swing.JMenu();
        FiltrarComidasporCalorias = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        escritorio.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1016, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 678, Short.MAX_VALUE)
        );

        MenuPacientes.setText("Pacientes");

        MenuIPacientes.setText("Alta Pacientes");
        MenuIPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuIPacientesActionPerformed(evt);
            }
        });
        MenuPacientes.add(MenuIPacientes);

        HistorialPeso.setText("Historial Peso");
        HistorialPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistorialPesoActionPerformed(evt);
            }
        });
        MenuPacientes.add(HistorialPeso);

        DietaVigente.setText("Dietas Vigentes");
        DietaVigente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DietaVigenteActionPerformed(evt);
            }
        });
        MenuPacientes.add(DietaVigente);

        MenuFiltro.setText("Filtros");

        FiltrarClientesporPeso.setText("Filtrar Clientes por Peso");
        FiltrarClientesporPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FiltrarClientesporPesoActionPerformed(evt);
            }
        });
        MenuFiltro.add(FiltrarClientesporPeso);

        MenuPacientes.add(MenuFiltro);

        BarraMenu.add(MenuPacientes);

        MenuDietas.setText("Dietas");

        CrearDietas.setText("Crear Dieta");
        CrearDietas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearDietasActionPerformed(evt);
            }
        });
        MenuDietas.add(CrearDietas);

        InsertarComidasaDietas.setText("Insertar Comidas a Dietas");
        InsertarComidasaDietas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertarComidasaDietasActionPerformed(evt);
            }
        });
        MenuDietas.add(InsertarComidasaDietas);

        AgregarComidas.setText("Agregar Comidas");
        AgregarComidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarComidasActionPerformed(evt);
            }
        });
        MenuDietas.add(AgregarComidas);

        Filtros2.setText("Filtros");

        FiltrarComidasporCalorias.setText("Filtrar Comidas por Calorias");
        FiltrarComidasporCalorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FiltrarComidasporCaloriasActionPerformed(evt);
            }
        });
        Filtros2.add(FiltrarComidasporCalorias);

        MenuDietas.add(Filtros2);

        BarraMenu.add(MenuDietas);

        setJMenuBar(BarraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuIPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuIPacientesActionPerformed
        // TODO add your handling code here:
    AltaCliente AC = new AltaCliente(/*datos a ingresar*/);
    AC.setVisible(true);
    escritorio.add(AC);
    escritorio.moveToFront(AC);
    }//GEN-LAST:event_MenuIPacientesActionPerformed

    private void HistorialPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistorialPesoActionPerformed
        // TODO add your handling code here:
        HistorialCliente HC = new HistorialCliente();
        HC.setVisible(true);
        escritorio.add(HC);
        escritorio.moveToFront(HC);
    }//GEN-LAST:event_HistorialPesoActionPerformed

    private void DietaVigenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DietaVigenteActionPerformed
        // TODO add your handling code here:
        DietaVigente DV = new DietaVigente();
        DV.setVisible(true);
        escritorio.add(DV);
        escritorio.moveToFront(DV);
    }//GEN-LAST:event_DietaVigenteActionPerformed

    private void FiltrarClientesporPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FiltrarClientesporPesoActionPerformed
        // TODO add your handling code here:
        FiltrarporPeso FP = new FiltrarporPeso();
        FP.setVisible(true);
        escritorio.add(FP);
        escritorio.moveToFront(FP);
    }//GEN-LAST:event_FiltrarClientesporPesoActionPerformed

    private void CrearDietasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearDietasActionPerformed
        // TODO add your handling code here:
        CrearDieta CD = new CrearDieta();
        CD.setVisible(true);
        escritorio.add(CD);
        escritorio.moveToFront(CD);
    }//GEN-LAST:event_CrearDietasActionPerformed

    private void InsertarComidasaDietasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertarComidasaDietasActionPerformed
        // TODO add your handling code here:
        ComidasaDieta CaD = new ComidasaDieta();
        CaD.setVisible(true);
        escritorio.add(CaD);
        escritorio.moveToFront(CaD);
    }//GEN-LAST:event_InsertarComidasaDietasActionPerformed

    private void AgregarComidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarComidasActionPerformed
        // TODO add your handling code here:
        Comidas C = new Comidas();
        C.setVisible(true);
        escritorio.add(C);
        escritorio.moveToFront(C);
    }//GEN-LAST:event_AgregarComidasActionPerformed

    private void FiltrarComidasporCaloriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FiltrarComidasporCaloriasActionPerformed
        // TODO add your handling code here:
        FiltrarporCalorias FC = new FiltrarporCalorias();
        FC.setVisible(true);
        escritorio.add(FC);
        escritorio.moveToFront(FC);
    }//GEN-LAST:event_FiltrarComidasporCaloriasActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AgregarComidas;
    private javax.swing.JMenuBar BarraMenu;
    private javax.swing.JMenuItem CrearDietas;
    private javax.swing.JMenuItem DietaVigente;
    private javax.swing.JMenuItem FiltrarClientesporPeso;
    private javax.swing.JMenuItem FiltrarComidasporCalorias;
    private javax.swing.JMenu Filtros2;
    private javax.swing.JMenuItem HistorialPeso;
    private javax.swing.JMenuItem InsertarComidasaDietas;
    private javax.swing.JMenu MenuDietas;
    private javax.swing.JMenu MenuFiltro;
    private javax.swing.JMenuItem MenuIPacientes;
    private javax.swing.JMenu MenuPacientes;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
