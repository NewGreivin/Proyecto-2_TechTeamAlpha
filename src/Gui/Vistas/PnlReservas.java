/**
 * @author Greivin
 */
package Gui.Vistas;

import Contratos.Contrato;
import Contratos.GestionContrato;
import Excepciones.EliminacionNoPermitidaException;
import Excepciones.ReservaInvalidaException;
import Gui.Busquedas.dlgBuscarReserva;
import Gui.FrmPrincipal;
import Personas.Clientes.Cliente;
import Reservas.GestionReserva;
import Personas.Clientes.GestionCliente;
import Reservas.Reserva;
import Utilidades.UtilDate;
import Utilidades.UtilGui;
import Vehiculos.Vehiculo;
import java.time.LocalDate;
import Interfaces.IGui;
import Vehiculos.GestionVehiculo;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class PnlReservas extends javax.swing.JPanel implements IGui {
    private GestionReserva list;
    private Reserva reserva;
    private GestionCliente cliente;
    private GestionVehiculo vehiculo;
    private GestionContrato gContrato;
    
    public PnlReservas(GestionCliente gestionCliente, GestionVehiculo gestionVehiculo, GestionReserva gestionReserva, GestionContrato gestionContrato) {
        initComponents();
        this.cliente = gestionCliente;
        this.vehiculo = gestionVehiculo;
        this.list = gestionReserva;
        this.gContrato = gestionContrato;
        cargarCliente();
        cargarVehiculos();
    }
    
    private void cargarCliente() {
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel(); 
        for (Cliente c: cliente.getClientes()) {
            model.addElement(c.getCedula());
        }
        txtCedula.setModel(model);
    }
 
    private void cargarVehiculos() {
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel(); 
        for (Vehiculo p: vehiculo.getMap().values()) {
            model.addElement(p.getPlaca());
        }
        txtPlaca.setModel(model);
    }
    
    public void cargarCombos() {
    txtCedula.removeAllItems();
    txtPlaca.removeAllItems();
    cargarCliente();
    cargarVehiculos();
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        pnlContenedor = new javax.swing.JPanel();
        pnlDatos = new javax.swing.JPanel();
        lblCedula = new javax.swing.JLabel();
        lblPlaca = new javax.swing.JLabel();
        lblFechaInicio = new javax.swing.JLabel();
        lblInfoFecha = new javax.swing.JLabel();
        txtFechaInicio = new javax.swing.JFormattedTextField();
        lblFechaFinalizacion = new javax.swing.JLabel();
        txtFechaFin = new javax.swing.JFormattedTextField();
        txtCedula = new javax.swing.JComboBox<>();
        txtPlaca = new javax.swing.JComboBox<>();
        lblInfoFecha1 = new javax.swing.JLabel();
        btnConfirmarReserva = new javax.swing.JButton();
        lblEstado = new javax.swing.JLabel();
        pnlBotones = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(794, 526));
        setRequestFocusEnabled(false);
        setVerifyInputWhenFocusTarget(false);

        pnlContenedor.setBackground(new java.awt.Color(204, 204, 204));

        lblCedula.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblCedula.setText("Cedula Cliente:");

        lblPlaca.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblPlaca.setText("Placa Vehiculo:");

        lblFechaInicio.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblFechaInicio.setText("Fecha de Inicio:");

        lblInfoFecha.setForeground(new java.awt.Color(0, 0, 0));
        lblInfoFecha.setText("Requiere formato: dd/MM/yyyy");

        txtFechaInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));

        lblFechaFinalizacion.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblFechaFinalizacion.setText("Fecha de Finalizacion:");

        txtFechaFin.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        txtFechaFin.setText("");

        txtCedula.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtPlaca.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        lblInfoFecha1.setForeground(new java.awt.Color(0, 0, 0));
        lblInfoFecha1.setText("Requiere formato: dd/MM/yyyy");

        btnConfirmarReserva.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnConfirmarReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Aceptar.png"))); // NOI18N
        btnConfirmarReserva.setText("Confirmar reserva");
        btnConfirmarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarReservaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDatosLayout = new javax.swing.GroupLayout(pnlDatos);
        pnlDatos.setLayout(pnlDatosLayout);
        pnlDatosLayout.setHorizontalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addComponent(lblCedula)
                        .addGap(74, 74, 74)
                        .addComponent(txtCedula, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addComponent(lblPlaca)
                        .addGap(71, 71, 71)
                        .addComponent(txtPlaca, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addComponent(lblFechaFinalizacion)
                        .addGap(4, 4, 4)
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlDatosLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblInfoFecha1))
                            .addComponent(txtFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDatosLayout.createSequentialGroup()
                        .addComponent(lblFechaInicio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlDatosLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblInfoFecha))
                            .addComponent(txtFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnConfirmarReserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
        pnlDatosLayout.setVerticalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCedula)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPlaca)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaInicio)
                    .addComponent(txtFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(lblInfoFecha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaFinalizacion)
                    .addComponent(txtFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInfoFecha1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(btnConfirmarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout pnlContenedorLayout = new javax.swing.GroupLayout(pnlContenedor);
        pnlContenedor.setLayout(pnlContenedorLayout);
        pnlContenedorLayout.setHorizontalGroup(
            pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlContenedorLayout.setVerticalGroup(
            pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblEstado.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblEstado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnAgregar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Agregar_Usuario.png"))); // NOI18N
        btnAgregar.setText("Agregar  ");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnLimpiar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Limpiar_Usuario.png"))); // NOI18N
        btnLimpiar.setText("Limpiar   ");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Remover_Usuario.png"))); // NOI18N
        btnEliminar.setText("Eliminar  ");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnActualizar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Editar_Usuario.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnActualizar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar_Usuario.png"))); // NOI18N
        btnBuscar.setText("Buscar     ");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBotonesLayout = new javax.swing.GroupLayout(pnlBotones);
        pnlBotones.setLayout(pnlBotonesLayout);
        pnlBotonesLayout.setHorizontalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotonesLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlBotonesLayout.setVerticalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(274, 274, 274))
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addComponent(pnlContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblTitulo.setBackground(new java.awt.Color(51, 51, 51));
        lblTitulo.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Gestión de Reservas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 782, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        save();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        update();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        delete();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        search();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        clear();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnConfirmarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarReservaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConfirmarReservaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnConfirmarReserva;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblFechaFinalizacion;
    private javax.swing.JLabel lblFechaInicio;
    private javax.swing.JLabel lblInfoFecha;
    private javax.swing.JLabel lblInfoFecha1;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlBotones;
    private javax.swing.JPanel pnlContenedor;
    private javax.swing.JPanel pnlDatos;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JComboBox<String> txtCedula;
    private javax.swing.JFormattedTextField txtFechaFin;
    private javax.swing.JFormattedTextField txtFechaInicio;
    private javax.swing.JComboBox<String> txtPlaca;
    // End of variables declaration//GEN-END:variables

    @Override
    public void save() {
        if (!validateRequiere()) {
            UtilGui.showErrorMessage(this,"Faltan datos requeridos", "Error");
            return;
        }
        try {
        String cedulaSelect = (String) txtCedula.getSelectedItem();
        Cliente c = cliente.buscar(cedulaSelect);
        String placaSelect = (String) txtPlaca.getSelectedItem();
        Vehiculo v = vehiculo.buscar(placaSelect);
        LocalDate inicio = UtilDate.toLocalDate(txtFechaInicio.getText());
        LocalDate fin = UtilDate.toLocalDate(txtFechaFin.getText());

        Reserva r = new Reserva(c, v, inicio, fin);
        if (list.agregar(r)) {
            lblEstado.setText("Reserva agregada correctamente.");
        }
    } catch (ReservaInvalidaException ex) {
        UtilGui.showErrorMessage(this, ex.getMessage(), "Error");
        lblEstado.setText("Error: " + ex.getMessage());
    }
    }

    @Override
    public void clear() {
        txtCedula.setSelectedIndex(-1);
        txtPlaca.setSelectedIndex(-1);
        txtFechaInicio.setText("");
        txtFechaFin.setText("");
    }

    @Override
    public void delete() {
        if (!validateRequiere()) {
            UtilGui.showErrorMessage(this,"Faltan datos requeridos", "Error");
            return;
        }
    try {
        String cedulaSelect = (String) txtCedula.getSelectedItem();
        Cliente c = cliente.buscar(cedulaSelect);
        String placaSelect = (String) txtPlaca.getSelectedItem();
        Vehiculo v = vehiculo.buscar(placaSelect);
        LocalDate inicio = UtilDate.toLocalDate(txtFechaInicio.getText());
        LocalDate fin = UtilDate.toLocalDate(txtFechaFin.getText());

        Reserva r = new Reserva(c, v, inicio, fin);

        if (list.eliminar(r)) {
            lblEstado.setText("Reserva eliminada correctamente.");
            clear();
        }
    } catch (EliminacionNoPermitidaException ex) {
        UtilGui.showErrorMessage(this, ex.getMessage(), "Error al eliminar");
    }
    }

    @Override
    public void update() {
        if (!validateRequiere()) {
            UtilGui.showErrorMessage(this,"Faltan datos requeridos", "Error");
            return;
        }
        
    try {
        String cedulaSelect = (String) txtCedula.getSelectedItem();
        Cliente c = cliente.buscar(cedulaSelect);

        Reserva existe = list.buscar(c);
        if (existe == null) {
            lblEstado.setText("No se encontró ninguna reserva para este cliente.");
            return;
        }

        Vehiculo vehiculoId = (Vehiculo) txtPlaca.getSelectedItem();
        Vehiculo nuevoVehiculo = vehiculo.buscar(vehiculoId);
        existe.setVehiculo(nuevoVehiculo);

        if (list.actualizar(existe)) {
            lblEstado.setText("Vehículo de la reserva actualizado correctamente.");
        } else {
            lblEstado.setText("No se pudo actualizar la reserva.");
        }

    } catch (ReservaInvalidaException ex) {
        UtilGui.showErrorMessage(this, ex.getMessage(), "Error al actualizar");
        lblEstado.setText("Error: " + ex.getMessage());
    } 
    }

    @Override
    public void search() {
        JFrame parentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        dlgBuscarReserva frmBusqueda = new dlgBuscarReserva(parentFrame, true);
        frmBusqueda.setList(list);
        frmBusqueda.setVisible(true);

        reserva = frmBusqueda.getReserva();
        if (reserva != null) {
            showdata();
        }
    }

    @Override
    public boolean validateRequiere() {
        return UtilGui.validateRequiere(txtCedula, txtPlaca, txtFechaInicio, txtFechaFin);
    }

    @Override
    public void showdata() {
        txtCedula.setSelectedItem(reserva.getCliente().getCedula());
        txtPlaca.setSelectedItem(reserva.getVehiculo().getPlaca());
        txtFechaInicio.setText(UtilDate.toString(reserva.getFechaInicio()));
        txtFechaFin.setText(UtilDate.toString(reserva.getFechaFin()));
    }

    public void ConfirmarReserva() {
    if (!validateRequiere()) {
        UtilGui.showErrorMessage(this,"Faltan datos requeridos", "Error");
        return;
    }
        String cedulaSelect = (String) txtCedula.getSelectedItem();
        Cliente c = cliente.buscar(cedulaSelect);
        String placaSelect = (String) txtPlaca.getSelectedItem();
        Vehiculo v = vehiculo.buscar(placaSelect);
        LocalDate inicio = UtilDate.toLocalDate(txtFechaInicio.getText());
        LocalDate fin = UtilDate.toLocalDate(txtFechaFin.getText());

        Reserva r = new Reserva(c, v, inicio, fin);
            r.setConfirmada(true);
            UtilGui.showMessage(this, "Reserva Confirmada", "Informacion");

        // 🚩 Obtener referencia al frame principal
        FrmPrincipal frame = (FrmPrincipal) SwingUtilities.getWindowAncestor(this);
        frame.getPnlContratos().cargarReservaEnContrato(r);
    } 
}