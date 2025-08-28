/**
 * @author Genesis
 */
package Gui.Vistas;

import Interfaces.IGui;
import Personas.Empleados.Empleado;
import Personas.Empleados.GestionEmpleado;
import Utilidades.UtilGui;
import java.awt.HeadlessException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class PnlEmpleados extends javax.swing.JPanel implements IGui {

 
    private final GestionEmpleado gestionEmpleado = new GestionEmpleado();
    private final List<Empleado> listaLocal = new ArrayList<>();

    
    private Empleado empleado;
    private GestionEmpleado list;

    
    public PnlEmpleados() {
        initComponents();
       
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        pnlContenedor = new javax.swing.JPanel();
        pnlDatos = new javax.swing.JPanel();
        lblCedula = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblFechaNacimiento = new javax.swing.JLabel();
        lblInfoNacimiento = new javax.swing.JLabel();
        txtFechaNacimiento = new javax.swing.JFormattedTextField();
        lblTelefono = new javax.swing.JLabel();
        lblInfoTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JFormattedTextField();
        lblCorreo = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        lblPuesto = new javax.swing.JLabel();
        txtPuesto = new javax.swing.JComboBox<>();
        lblSalario = new javax.swing.JLabel();
        txtSalario = new javax.swing.JFormattedTextField();
        lblEstado = new javax.swing.JLabel();
        pnlBotones = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        pnlContenedor.setBackground(new java.awt.Color(204, 204, 204));

        lblCedula.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblCedula.setText("Cedula:");

        txtCedula.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        lblNombre.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblNombre.setText("Nombre:");

        txtNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        lblFechaNacimiento.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblFechaNacimiento.setText("Fecha de Nacimiento:");

        lblInfoNacimiento.setText("Requiere formato: dd/MM/yyyy");

        txtFechaNacimiento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));

        lblTelefono.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblTelefono.setText("Telefono:");

        lblInfoTelefono.setText("Requiere formato: 8 numeros");

        try {
            txtTelefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblCorreo.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblCorreo.setText("Correo: ");

        txtCorreo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        lblPuesto.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblPuesto.setText("Puesto:");

        txtPuesto.setEditable(true);
        txtPuesto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        lblSalario.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblSalario.setText("Salario:");

        txtSalario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        javax.swing.GroupLayout pnlDatosLayout = new javax.swing.GroupLayout(pnlDatos);
        pnlDatos.setLayout(pnlDatosLayout);
        pnlDatosLayout.setHorizontalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCedula)
                            .addComponent(lblNombre))
                        .addGap(136, 136, 136)
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCedula)
                            .addComponent(txtNombre)))
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addComponent(lblFechaNacimiento)
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlDatosLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(lblInfoNacimiento)
                                .addGap(0, 130, Short.MAX_VALUE))
                            .addGroup(pnlDatosLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(txtFechaNacimiento))))
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCorreo)
                            .addComponent(lblTelefono)
                            .addComponent(lblPuesto)
                            .addComponent(lblSalario))
                        .addGap(127, 127, 127)
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSalario)
                            .addComponent(txtPuesto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnlDatosLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblInfoTelefono)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtCorreo)
                            .addComponent(txtTelefono))))
                .addContainerGap())
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
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaNacimiento)
                    .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(lblInfoNacimiento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefono)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(lblInfoTelefono)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreo)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPuesto)
                    .addComponent(txtPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSalario)
                    .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlContenedorLayout = new javax.swing.GroupLayout(pnlContenedor);
        pnlContenedor.setLayout(pnlContenedorLayout);
        pnlContenedorLayout.setHorizontalGroup(
            pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlContenedorLayout.setVerticalGroup(
            pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        lblTitulo.setText("Gestión de Empleados");

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
                .addContainerGap(9, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        
        save();
        if (empleado != null) {
            listaLocal.add(empleado);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        clear();  
        
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
         if (empleado != null) {
            listaLocal.remove(empleado);
        }
        delete();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        update();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (!validateRequiere()) {
            UtilGui.showErrorMessage(this, "Faltan datos requeridos", "Error");
            lblEstado.setText("Complete todos los campos obligatorios.");
            return;
        }

        try {
            String cedula = txtCedula.getText().trim();
            Empleado existente = gestionEmpleado.buscar(cedula);

            if (existente == null) {
                UtilGui.showErrorMessage(this.pnlContenedor, "Empleado no encontrado", "Error");
                lblEstado.setText("Empleado no encontrado para actualizar.");
                return;
            }

            String telefono = txtTelefono.getText().trim();
            String correo = txtCorreo.getText().trim();
            String puesto = (String) txtPuesto.getSelectedItem();
            Double salario = ((Number) txtSalario.getValue()).doubleValue();

            if (telefono.isEmpty() || puesto == null || puesto.isEmpty()) {
                lblEstado.setText("Complete todos los campos obligatorios.");
                return;
            }

            if (!telefono.matches("\\d{8}")) {
                lblEstado.setText("Teléfono debe tener 8 dígitos.");
                return;
            }

            existente.setTelefono(telefono);
            existente.setCorreo(correo);
            existente.setPuesto(puesto);
            existente.setSalario(salario);

            lblEstado.setText("Empleado actualizado correctamente.");

        } catch (Exception ex) {
            lblEstado.setText("Error al actualizar: " + ex.getMessage());
        }
        search();
    }//GEN-LAST:event_btnBuscarActionPerformed

    
    @Override
    public void save() {
        if (!validateRequiere()) return;

        try {
            String cedula = txtCedula.getText().trim();
            String nombre = txtNombre.getText().trim();
            String fechaStr = txtFechaNacimiento.getText().trim();
            String telefono = txtTelefono.getText().trim();
            String correo = txtCorreo.getText().trim();
            String puesto = (String) txtPuesto.getSelectedItem();
            double salario = Double.parseDouble(txtSalario.getText().trim());

            LocalDate fechaNacimiento = LocalDate.parse(fechaStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

            if (gestionEmpleado.buscar(cedula) != null) {
                JOptionPane.showMessageDialog(this, "Ya existe un empleado con esa cédula.");
                return;
            }

            empleado = new Empleado(cedula, nombre, fechaNacimiento, telefono, correo, puesto, salario);
            gestionEmpleado.agregar(empleado);

            JOptionPane.showMessageDialog(this, "Empleado agregado correctamente.");
            clear();
            showdata();

        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error al guardar empleado: " + e.getMessage());
        }
    }

    @Override
    public void clear() {
        txtCedula.setText("");
        txtNombre.setText("");
        txtFechaNacimiento.setText("");
        txtTelefono.setText("");
        txtCorreo.setText("");
        txtSalario.setText("");
        txtPuesto.setSelectedIndex(-1);
        empleado = null;
    }

    @Override
    public void delete() {
        if (empleado == null) {
            JOptionPane.showMessageDialog(this, "Debe buscar o seleccionar un empleado primero.");
            return;
        }
        gestionEmpleado.eliminar(empleado);
        JOptionPane.showMessageDialog(this, "Empleado eliminado correctamente.");
        clear();
        showdata();
    }

    @Override
    public void update() {
        if (empleado == null) {
            JOptionPane.showMessageDialog(this, "Debe buscar un empleado primero.");
            return;
        }
        if (!validateRequiere()) return;

        try {
            empleado.setTelefono(txtTelefono.getText().trim());
            empleado.setCorreo(txtCorreo.getText().trim());
            empleado.setPuesto((String) txtPuesto.getSelectedItem());
            empleado.setSalario(Double.parseDouble(txtSalario.getText().trim()));

            JOptionPane.showMessageDialog(this, "Empleado actualizado correctamente.");
            clear();
            showdata();

        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error al actualizar: " + e.getMessage());
        }
    }

    @Override
    public void search() {
        String cedula = JOptionPane.showInputDialog(this, "Ingrese la cédula del empleado:");
        if (cedula == null || cedula.trim().isEmpty()) return;

        Empleado encontrado = gestionEmpleado.buscar(cedula.trim());
        if (encontrado == null) {
            JOptionPane.showMessageDialog(this, "Empleado no encontrado.");
            return;
        }
        empleado = encontrado;

        txtCedula.setText(encontrado.getCedula());
        txtNombre.setText(encontrado.getNombre());
        txtFechaNacimiento.setText(encontrado.getFechaNacimiento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        txtTelefono.setText(encontrado.getTelefono());
        txtCorreo.setText(encontrado.getCorreo());
        txtPuesto.setSelectedItem(encontrado.getPuesto());
        txtSalario.setText(String.valueOf(encontrado.getSalario()));
    }

    @Override
    public boolean validateRequiere() {
        return UtilGui.validateRequiere(txtCedula, txtNombre, txtFechaNacimiento, txtTelefono, txtCorreo, txtSalario);
    }

    @Override
    public void showdata() {
    System.out.println("Lista de empleados locales:");
    for (Empleado e : listaLocal) {
        System.out.println(e);
    }
    }
    
    
     
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblFechaNacimiento;
    private javax.swing.JLabel lblInfoNacimiento;
    private javax.swing.JLabel lblInfoTelefono;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPuesto;
    private javax.swing.JLabel lblSalario;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlBotones;
    private javax.swing.JPanel pnlContenedor;
    private javax.swing.JPanel pnlDatos;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JFormattedTextField txtFechaNacimiento;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JComboBox<String> txtPuesto;
    private javax.swing.JFormattedTextField txtSalario;
    private javax.swing.JFormattedTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
