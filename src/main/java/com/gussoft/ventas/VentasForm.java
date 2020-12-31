package com.gussoft.ventas;

import com.gussoft.config.ConectaDB;
import com.gussoft.config.GenerarReporte;
import com.gussoft.config.Mensajes;
import com.gussoft.dto.ClienteDTO;
import com.gussoft.dto.DetalleDTO;
import com.gussoft.dto.ProductoDTO;
import com.gussoft.dto.VentasDTO;
import com.gussoft.service.impl.ClienteServiceImpl;
import com.gussoft.service.impl.ProductoServiceImpl;
import com.gussoft.service.impl.VentasServiceImpl;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class VentasForm extends javax.swing.JInternalFrame {

    DefaultTableModel model = new DefaultTableModel();
    ClienteServiceImpl cdao = new ClienteServiceImpl();
    ProductoServiceImpl pdao = new ProductoServiceImpl();
    ProductoDTO p = new ProductoDTO();
    VentasDTO v = new VentasDTO();
    VentasServiceImpl vdao = new VentasServiceImpl();
    DetalleDTO d = new DetalleDTO();
    ClienteDTO c = new ClienteDTO();
    int idp;
    int cant;
    double totalpagar;
    double pre;

    public VentasForm() {
        initComponents();
        Calendar cald = new GregorianCalendar();
        txtcalen.setText("" + cald.get(Calendar.YEAR) + "-" + cald.get(Calendar.MONTH) + "-" + cald.get(Calendar.DAY_OF_MONTH));
        generarSerie();
        txtcan.setValue(1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtnroserie = new javax.swing.JTextField();
        txtcalen = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtidcli = new javax.swing.JTextField();
        txtcli = new javax.swing.JTextField();
        btnbuscli = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtcp = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtnom = new javax.swing.JTextField();
        btnbuspro = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtpre = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtstock = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnadd = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtcan = new javax.swing.JSpinner();
        txtvende = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabladetalle = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        btngventa = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
        lblcod = new javax.swing.JLabel();

        setClosable(true);
        setTitle("GENERAR VENTA");

        jLabel1.setFont(new java.awt.Font("DokChampa", 1, 18)); // NOI18N
        jLabel1.setText("PUNTO DE VENTA \"PAPI FRANS\"");

        jLabel2.setText("Venta de Productos Tecnologicos");

        jLabel3.setText("Telefono : 9xxxxxxx");

        jLabel4.setText("NRO. SERIE :");

        txtnroserie.setEditable(false);

        txtcalen.setEditable(false);

        jLabel14.setText("FECHA :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(293, 293, 293)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtcalen, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(155, 155, 155)
                                .addComponent(jLabel3)))
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtnroserie, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtnroserie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcalen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel5.setText("CLIENTE :");

        jLabel6.setText("ID CLIENTE :");

        txtidcli.setEditable(false);

        txtcli.setEditable(false);

        btnbuscli.setText("BUSCAR");
        btnbuscli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscliActionPerformed(evt);
            }
        });

        jLabel7.setText("COD. PRO. :");

        txtcp.setEditable(false);

        jLabel8.setText("DESCRIPCION :");

        txtnom.setEditable(false);
        txtnom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomActionPerformed(evt);
            }
        });

        btnbuspro.setText("BUSCAR");
        btnbuspro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbusproActionPerformed(evt);
            }
        });

        jLabel9.setText("PRECIO :");

        txtpre.setEditable(false);

        jLabel10.setText("STOCK :");

        txtstock.setEditable(false);

        jLabel11.setText("CANTIDAD :");

        btnadd.setText("AGREGAR");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        jLabel12.setText("VENDE :");

        txtvende.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtidcli))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtcp)
                                    .addComponent(txtpre, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(txtstock, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtcli, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtnom, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addGap(18, 18, 18)
                            .addComponent(txtvende))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addComponent(jLabel11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtcan, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnbuscli)
                        .addComponent(btnbuspro))
                    .addComponent(btnadd))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(txtidcli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuscli))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtcp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuspro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtpre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(btnadd)
                    .addComponent(txtcan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel10)
                    .addComponent(txtstock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtvende, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        tabladetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NRO", "COD", "PRODUCTO", "CANT", "PRE UNI", "TOTAL"
            }
        ));
        jScrollPane1.setViewportView(tabladetalle);
        if (tabladetalle.getColumnModel().getColumnCount() > 0) {
            tabladetalle.getColumnModel().getColumn(0).setPreferredWidth(10);
            tabladetalle.getColumnModel().getColumn(1).setPreferredWidth(10);
            tabladetalle.getColumnModel().getColumn(2).setPreferredWidth(200);
            tabladetalle.getColumnModel().getColumn(3).setPreferredWidth(10);
            tabladetalle.getColumnModel().getColumn(4).setPreferredWidth(10);
            tabladetalle.getColumnModel().getColumn(5).setPreferredWidth(10);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel13.setText("TOTAL A PAGAR :");

        txttotal.setEditable(false);

        btngventa.setText("GENERAR VENTA");
        btngventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngventaActionPerformed(evt);
            }
        });

        btncancel.setText("CANCELAR");
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });

        lblcod.setText(".");
        lblcod.setEnabled(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lblcod, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btncancel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btngventa, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btngventa)
                        .addComponent(btncancel)
                        .addComponent(lblcod))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomActionPerformed

    private void btnbuscliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscliActionPerformed
        //buscarCliente();
        busCliForm bc = new busCliForm();
        mainForm.principal.add(bc);
        bc.setVisible(true);
    }//GEN-LAST:event_btnbuscliActionPerformed

    private void btnbusproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbusproActionPerformed
        busProForm bp = new busProForm();
        mainForm.principal.add(bp);
        bp.setVisible(true);
    }//GEN-LAST:event_btnbusproActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        Agregarpro();

    }//GEN-LAST:event_btnaddActionPerformed

    private void btngventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngventaActionPerformed
        if (txttotal.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Debe Ingresar Productos");
        } else {
            saveVenta();
            saveDetalle();
            actualizarStock();
            
            JOptionPane.showMessageDialog(this, "Venta registrada!");
            limpiarTabla();
            Nuevo();
            generarSerie();
            imprimir();
            //reporte();
        }
    }//GEN-LAST:event_btngventaActionPerformed

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        Nuevo();
        limpiarTabla();
        Mensajes.informacion("Se cancelo la Operacion!");
    }//GEN-LAST:event_btncancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnbuscli;
    private javax.swing.JButton btnbuspro;
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btngventa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblcod;
    private javax.swing.JTable tabladetalle;
    private javax.swing.JTextField txtcalen;
    public static javax.swing.JSpinner txtcan;
    public static javax.swing.JTextField txtcli;
    public static javax.swing.JTextField txtcp;
    public static javax.swing.JTextField txtidcli;
    public static javax.swing.JTextField txtnom;
    private javax.swing.JTextField txtnroserie;
    public static javax.swing.JTextField txtpre;
    public static javax.swing.JTextField txtstock;
    private javax.swing.JTextField txttotal;
    public static javax.swing.JTextField txtvende;
    // End of variables declaration//GEN-END:variables

    private void buscarCliente() {
        String nom = txtcli.getText();
        int r;
        if (txtcli.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Debe Ingresar Nombre para Busqueda!");
            txtcli.requestFocus();
        } else {
            ClienteDTO cli = cdao.listarId(nom);
            if (cli.getNombre() != null) {

            } else {
                r = JOptionPane.showConfirmDialog(this, "Cliente no encontrado, desea registrar?");
                if (r == 0) {
                    ClienteForm cf = new ClienteForm();
                    mainForm.principal.add(cf);
                    cf.setVisible(true);
                }
            }
        }
    }
    int item = 0;

    private void Agregarpro() {

        double total;
        model = (DefaultTableModel) tabladetalle.getModel();
        item = item + 1;
        idp = Integer.parseInt(txtcp.getText());//p.getId();
        String nomp = txtnom.getText();
        pre = Double.parseDouble(txtpre.getText());
        int stock = Integer.parseInt(txtstock.getText());
        cant = Integer.parseInt(txtcan.getValue().toString());
        total = cant * pre;
        ArrayList lista = new ArrayList();
        if (stock > 0) {
            lista.add(item);
            lista.add(idp);
            lista.add(nomp);
            lista.add(cant);
            lista.add(pre);
            lista.add(total);
            Object[] ob = new Object[6];
            ob[0] = lista.get(0);
            ob[1] = lista.get(1);
            ob[2] = lista.get(2);
            ob[3] = lista.get(3);
            ob[4] = lista.get(4);
            ob[5] = lista.get(5);
            model.addRow(ob);
            tabladetalle.setModel(model);
            calTotal();
        } else {
            JOptionPane.showMessageDialog(this, "Stock Insuficiente!");
        }
    }

    private void calTotal() {
        totalpagar = 0;
        for (int i = 0; i < tabladetalle.getRowCount(); i++) {
            cant = Integer.parseInt(tabladetalle.getValueAt(i, 3).toString());
            pre = Double.parseDouble(tabladetalle.getValueAt(i, 4).toString());
            totalpagar = totalpagar + (cant * pre);
        }
        txttotal.setText("" + totalpagar);
    }

    private void saveVenta() {
        int idv = 2;
        int idc = Integer.parseInt(txtidcli.getText());
        String serie = txtnroserie.getText();
        String fecha = txtcalen.getText();
        double monto = totalpagar;
        String estado = "1";

        v.setIdcli(idc);
        v.setIdven(idv);
        v.setSerie(serie);
        v.setFecha(fecha);
        v.setMonto(monto);
        v.setEstado(estado);
        vdao.GuardarVenta(v);
    }

    private void saveDetalle() {
        String idv = vdao.IdVentas();
        int idve = Integer.parseInt(idv);
        for (int i = 0; i < tabladetalle.getRowCount(); i++) {
            int idpro = Integer.parseInt(tabladetalle.getValueAt(i, 1).toString());
            int can = Integer.parseInt(tabladetalle.getValueAt(i, 3).toString());
            double pre = Double.parseDouble(tabladetalle.getValueAt(i, 4).toString());
            d.setIdvta(idve);
            d.setIdpro(idpro);
            d.setCan(can);
            d.setPreV(pre);
            vdao.GuardarDetalle(d);
        }
    }

    private void generarSerie() {
        String serie = vdao.NroSerie();
        if (serie == null) {
            txtnroserie.setText("0000001");
        } else {
            int incre = Integer.parseInt(serie);
            incre = incre + 1;
            txtnroserie.setText("00000" + incre);  
            System.out.println(" van gs"+ incre);
        }
        
    }

    private void actualizarStock() {
        for (int i = 0; i < tabladetalle.getRowCount(); i++) {
            ProductoDTO pr = new ProductoDTO();
            idp = Integer.parseInt(tabladetalle.getValueAt(i, 1).toString());
            cant = Integer.parseInt(tabladetalle.getValueAt(i, 3).toString());
            pr = pdao.listarId(idp);
            int sa = pr.getStock() - cant;
            pdao.actualizarStock(sa, idp);
        }
    }

    private void limpiarTabla() {
        for (int i = 0; i < model.getRowCount(); i++) {
            model.removeRow(i);
            i = i - 1;
        }
    }

    private void Nuevo() {
        txtcan.setValue(1);
        txtcli.setText("");
        txtcp.setText("");
        txtidcli.setText("");
        txtnom.setText("");
        txtpre.setText("");
        txtstock.setText("");
        txttotal.setText("");
        txtvende.setText("");
    }

    private void imprimir() {
        GenerarReporte g = new GenerarReporte();
        List<VentasDTO> lista = vdao.Listar();
        String title = "Boleta de Venta";
        int x = lista.size();
        g.MostrarReporteConParametro("src\\main\\java\\com\\gussoft\\reports\\Factura.jasper", title, x, "reporteFactura.pdf");
        g.cerrar();
    }
    public void contar(){
        //int fila = tabla
    }

    private void reporte() {
         List<VentasDTO> lista = vdao.Listar();
        int x = lista.size();
        try{
            String url = "src\\main\\java\\com\\gussoft\\reports\\Factura.jasper";
            Map parametro = new HashMap();
            parametro.put("code", x);
            JasperPrint info = JasperFillManager.fillReport(url, parametro, ConectaDB.getInstance().getConexion());
            JasperViewer view = new JasperViewer(info, false);
            view.setTitle("Boleta");
            view.setVisible(true);
            System.out.println("Exito?");
        }catch(Exception e){
            e.printStackTrace();
            
        }
    }
}
