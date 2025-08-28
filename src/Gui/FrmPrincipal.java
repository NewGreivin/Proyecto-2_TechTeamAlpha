/**
 * @author Greivin
 */
package Gui;

import Contratos.GestionContrato;
import Gui.Vistas.PnlCliente;
import Gui.Vistas.PnlContratos;
import Gui.Vistas.PnlEmpleados;
import Gui.Vistas.PnlReservas;
import Gui.Vistas.PnlVehiculos;
import Personas.Clientes.GestionCliente;
import Personas.Empleados.GestionEmpleado;
import Reservas.GestionReserva;
import Vehiculos.GestionVehiculo;
import javax.swing.JPanel;

public class FrmPrincipal extends javax.swing.JFrame {
    private GestionCliente gestionCliente;
    private GestionVehiculo gestionVehiculo;
    private GestionReserva gestionReserva;
    private GestionEmpleado gestionEmpleado;
    private GestionContrato gestionContrato;

    private PnlReservas pnlReservas;
    private PnlCliente pnlClientes;
    private PnlVehiculos pnlVehiculos;
    private PnlEmpleados pnlEmpleados;
    private PnlContratos pnlContratos;
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FrmPrincipal.class.getName());

    public FrmPrincipal() {
        initComponents();
        gestionCliente = new GestionCliente();
        gestionVehiculo = new GestionVehiculo();
        gestionReserva = new GestionReserva();
        gestionEmpleado = new GestionEmpleado();
        gestionContrato = new GestionContrato();

        pnlClientes = new PnlCliente(gestionCliente);
        pnlVehiculos = new PnlVehiculos(gestionVehiculo);
        pnlReservas = new PnlReservas(gestionCliente, gestionVehiculo, gestionReserva, gestionContrato);
        pnlEmpleados = new PnlEmpleados(gestionEmpleado);
        pnlContratos = new PnlContratos(gestionCliente, gestionVehiculo, gestionContrato);
    }

    public PnlContratos getPnlContratos() {
        return pnlContratos;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContenedor = new javax.swing.JPanel();
        pnlCreditos = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lpbCreditos = new javax.swing.JLabel();
        lblDashboard = new javax.swing.JPanel();
        lblNombreEmpresa = new javax.swing.JLabel();
        bntClientes = new javax.swing.JButton();
        btnReservas = new javax.swing.JButton();
        btnVehiculos = new javax.swing.JButton();
        btnAlquileres = new javax.swing.JButton();
        btnEmpleados = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DriveUp - Gestion y Alquiler de vehiculos");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setResizable(false);

        pnlContenedor.setBackground(new java.awt.Color(255, 255, 255));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icon.png"))); // NOI18N

        lblTitulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Sistema de Gestion y Alquiler de vehiculos");

        lpbCreditos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lpbCreditos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lpbCreditos.setText("Software creado por TechTeamAlpha @ 2025");

        javax.swing.GroupLayout pnlCreditosLayout = new javax.swing.GroupLayout(pnlCreditos);
        pnlCreditos.setLayout(pnlCreditosLayout);
        pnlCreditosLayout.setHorizontalGroup(
            pnlCreditosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCreditosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCreditosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCreditosLayout.createSequentialGroup()
                        .addComponent(lblLogo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lpbCreditos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlCreditosLayout.setVerticalGroup(
            pnlCreditosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCreditosLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(45, 45, 45)
                .addComponent(lpbCreditos)
                .addGap(68, 68, 68))
        );

        javax.swing.GroupLayout pnlContenedorLayout = new javax.swing.GroupLayout(pnlContenedor);
        pnlContenedor.setLayout(pnlContenedorLayout);
        pnlContenedorLayout.setHorizontalGroup(
            pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContenedorLayout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(pnlCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(256, Short.MAX_VALUE))
        );
        pnlContenedorLayout.setVerticalGroup(
            pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContenedorLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(pnlCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        lblDashboard.setBackground(new java.awt.Color(0, 102, 102));

        lblNombreEmpresa.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lblNombreEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreEmpresa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo.png"))); // NOI18N
        lblNombreEmpresa.setText("DriveUp");

        bntClientes.setBackground(new java.awt.Color(0, 153, 153));
        bntClientes.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        bntClientes.setForeground(new java.awt.Color(0, 0, 0));
        bntClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Clientes.png"))); // NOI18N
        bntClientes.setText("Clientes");
        bntClientes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bntClientes.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        bntClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntClientesActionPerformed(evt);
            }
        });

        btnReservas.setBackground(new java.awt.Color(0, 153, 153));
        btnReservas.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnReservas.setForeground(new java.awt.Color(0, 0, 0));
        btnReservas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Reservas.png"))); // NOI18N
        btnReservas.setText("Reservas");
        btnReservas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnReservas.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservasActionPerformed(evt);
            }
        });

        btnVehiculos.setBackground(new java.awt.Color(0, 153, 153));
        btnVehiculos.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnVehiculos.setForeground(new java.awt.Color(0, 0, 0));
        btnVehiculos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Vehiculos.png"))); // NOI18N
        btnVehiculos.setText("Vehiculos");
        btnVehiculos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnVehiculos.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVehiculosActionPerformed(evt);
            }
        });

        btnAlquileres.setBackground(new java.awt.Color(0, 153, 153));
        btnAlquileres.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnAlquileres.setForeground(new java.awt.Color(0, 0, 0));
        btnAlquileres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Alquileres.png"))); // NOI18N
        btnAlquileres.setText("Alquileres");
        btnAlquileres.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAlquileres.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAlquileres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlquileresActionPerformed(evt);
            }
        });

        btnEmpleados.setBackground(new java.awt.Color(0, 153, 153));
        btnEmpleados.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnEmpleados.setForeground(new java.awt.Color(0, 0, 0));
        btnEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Empleados.png"))); // NOI18N
        btnEmpleados.setText("Empleados");
        btnEmpleados.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEmpleados.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpleadosActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(204, 0, 51));
        btnSalir.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salir.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setBorderPainted(false);
        btnSalir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout lblDashboardLayout = new javax.swing.GroupLayout(lblDashboard);
        lblDashboard.setLayout(lblDashboardLayout);
        lblDashboardLayout.setHorizontalGroup(
            lblDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblDashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lblDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAlquileres, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNombreEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                    .addComponent(btnReservas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVehiculos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bntClientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        lblDashboardLayout.setVerticalGroup(
            lblDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblDashboardLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblNombreEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(bntClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAlquileres, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(lblDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mostrarPanel(JPanel panel) { //Cargador de paneles
    pnlContenedor.removeAll();
    // Calcula el tamaño del contenedor
    int anchoCont = pnlContenedor.getWidth();
    int altoCont = pnlContenedor.getHeight();
    // Calcula el tamaño del panel
    int anchoPanel = panel.getWidth();
    int altoPanel = panel.getHeight();
    // Si el panel no tiene tamaño aún, lo ajustamos a su preferredSize
    if (anchoPanel == 0 || altoPanel == 0) {
        panel.setSize(panel.getPreferredSize());
        anchoPanel = panel.getWidth();
        altoPanel = panel.getHeight();
    }
    // Calcula la posición para centrarlo
    int x = (anchoCont - anchoPanel) / 2;
    int y = (altoCont - altoPanel) / 2;
    panel.setLocation(x, y);
    pnlContenedor.setLayout(null);
    pnlContenedor.removeAll();      // Limpia lo que haya en el contenedor
    pnlContenedor.add(panel);       // Agrega el nuevo panel
    pnlContenedor.revalidate();     // Reorganiza el layout
    pnlContenedor.repaint();        // Redibuja
}
    
    private void btnEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleadosActionPerformed
        mostrarPanel(pnlEmpleados);
    }//GEN-LAST:event_btnEmpleadosActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void bntClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntClientesActionPerformed
        mostrarPanel(pnlClientes);
    }//GEN-LAST:event_bntClientesActionPerformed

    private void btnReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservasActionPerformed
        pnlReservas.cargarCombos();
        mostrarPanel(pnlReservas);
        
    }//GEN-LAST:event_btnReservasActionPerformed

    private void btnVehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVehiculosActionPerformed
        mostrarPanel(pnlVehiculos);
    }//GEN-LAST:event_btnVehiculosActionPerformed

    private void btnAlquileresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlquileresActionPerformed
        pnlContratos.cargarCombos();
        mostrarPanel(pnlContratos);  
    }//GEN-LAST:event_btnAlquileresActionPerformed

    public static void main(String args[]) {
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(() -> new FrmPrincipal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntClientes;
    private javax.swing.JButton btnAlquileres;
    private javax.swing.JButton btnEmpleados;
    private javax.swing.JButton btnReservas;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVehiculos;
    private javax.swing.JPanel lblDashboard;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNombreEmpresa;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lpbCreditos;
    private javax.swing.JPanel pnlContenedor;
    private javax.swing.JPanel pnlCreditos;
    // End of variables declaration//GEN-END:variables
}
