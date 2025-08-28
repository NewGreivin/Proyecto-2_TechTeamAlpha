/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Gui.Busquedas;

import Personas.Empleados.Empleado;
import Personas.Empleados.GestionEmpleado;
import Utilidades.UtilDate;
import Utilidades.UtilGui;
import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
/**
 *
 * @author Genesis
 */
public class dlgBuscarEmpleado extends javax.swing.JDialog {
    
   private GestionEmpleado list;
    private Empleado empleado;
    
    private DefaultTableModel model;
    private TableRowSorter<DefaultTableModel> sorter;
    private RowFilter<DefaultTableModel, Object> rowFilter;
    
    public void setList(GestionEmpleado list) {
        this.list = list;
        loadTable();
    }
    
    public Empleado getEmpleado() {
        return empleado;
    }
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(dlgBuscarEmpleado.class.getName());

    
    
    public dlgBuscarEmpleado(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        model = (DefaultTableModel) TBLlist.getModel();
        sorter = new TableRowSorter<>(model);
        TBLlist.setRowSorter(sorter);
    }
    
    private void cargarTabla() {
        model.setRowCount(0);
       Iterable<Empleado> lista = null;
        for (Empleado e : lista) {
            Object[] row = {
                e.getCedula(),
                e.getNombre(),
                e.getPuesto(),
                e.getSalario()
            };
            model.addRow(row);
        }
    }
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtFiltrador = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBLlist = new javax.swing.JTable();
        btnAceptar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Buscar Empleados");
        jLabel1.setToolTipText("");

        txtFiltrador.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtFiltrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFiltradorActionPerformed(evt);
            }
        });

        TBLlist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Cedula", "Nombre", "F_Nacimiento", "Telefono", "Correo", "Licencia"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TBLlist);

        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Aceptar.png"))); // NOI18N
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salir.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
                    .addComponent(txtFiltrador, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtFiltrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAceptar)
                    .addComponent(jButton1))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFiltradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFiltradorActionPerformed
        rowFilter = RowFilter.regexFilter("(?i)" + txtFiltrador.getText());
        sorter.setRowFilter(rowFilter);
    }//GEN-LAST:event_txtFiltradorActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        int row = TBLlist.getSelectedRow();
        if (row == -1) {
            UtilGui.showErrorMessage(this, "Debe seleccionar un empleado", "Error");
            return;
        }
        String id = String.valueOf(TBLlist.getValueAt(row, 0));
        empleado = list.buscar(id);
        setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnAceptarActionPerformed

   
        
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void loadTable() {
        ArrayList<Empleado> lista = list.getEmpleados();
        model.setRowCount(0);

        for (Empleado e : lista) {
            Object[] data = {
                e.getCedula(),
                e.getNombre(),
                UtilDate.toString(e.getFechaNacimiento()),
                e.getTelefono(),
                e.getCorreo(),
                e.getPuesto()
            };
            model.addRow(data);
        }
        
    }     

        
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TBLlist;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtFiltrador;
    // End of variables declaration//GEN-END:variables

}