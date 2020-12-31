package com.gussoft.ventas;

import com.gussoft.dto.ClienteDTO;
import com.gussoft.service.ClienteService;
import com.gussoft.service.impl.ClienteServiceImpl;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.ButtonGroup;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class RClienteForm extends javax.swing.JInternalFrame {

    DefaultTableModel model = null;
    ClienteService csdao = new ClienteServiceImpl();
    TableRowSorter trs;
    ButtonGroup grupo = new ButtonGroup();

    public RClienteForm() {
        initComponents();
        //tipo();
        listar();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        busca = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        principal = new javax.swing.JPanel();
        rbnombre = new javax.swing.JRadioButton();
        rbdni = new javax.swing.JRadioButton();
        rball = new javax.swing.JRadioButton();
        txtfiltro = new javax.swing.JTextField();
        btnreporte = new javax.swing.JButton();

        setTitle("CONSULTA CLIENTES");

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Dni", "Nombre", "Direccion", "Estado"
            }
        ));
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setPreferredWidth(10);
            tabla.getColumnModel().getColumn(1).setPreferredWidth(15);
            tabla.getColumnModel().getColumn(2).setPreferredWidth(200);
            tabla.getColumnModel().getColumn(3).setPreferredWidth(30);
            tabla.getColumnModel().getColumn(4).setPreferredWidth(10);
        }

        rbnombre.setText("Buscar Por Nombre");
        rbnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnombreActionPerformed(evt);
            }
        });

        rbdni.setText("Buscar Por DNI");

        rball.setSelected(true);
        rball.setText("Todos Los Registros");
        rball.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rballActionPerformed(evt);
            }
        });

        txtfiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfiltroActionPerformed(evt);
            }
        });
        txtfiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtfiltroKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfiltroKeyTyped(evt);
            }
        });

        btnreporte.setText("Generar Reporte");
        btnreporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreporteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout principalLayout = new javax.swing.GroupLayout(principal);
        principal.setLayout(principalLayout);
        principalLayout.setHorizontalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, principalLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbnombre)
                    .addComponent(rbdni))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rball)
                    .addGroup(principalLayout.createSequentialGroup()
                        .addComponent(txtfiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnreporte)))
                .addContainerGap())
        );
        principalLayout.setVerticalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbnombre)
                    .addComponent(txtfiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnreporte))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbdni)
                    .addComponent(rball))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        principal.getAccessibleContext().setAccessibleName("Busqueda");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void tipo() {
        grupo.add(rbnombre);
        grupo.add(rbdni);
        grupo.add(rball);
        principal.add(rbnombre);
        principal.add(rbdni);
        principal.add(rball);
        // getContentPane().add(principal);
    }
    private void rballActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rballActionPerformed
        listar();
        txtfiltro.setText("");
    }//GEN-LAST:event_rballActionPerformed

    private void rbnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnombreActionPerformed
        if (rbnombre.isSelected() == true) {
            txtfiltro.setText("");
            txtfiltro.requestFocus();
        }
        // if(grupo.getSelection().equals()) {
        // code
        // }
    }//GEN-LAST:event_rbnombreActionPerformed

    private void btnreporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreporteActionPerformed
        buscarReporte();
       
    }//GEN-LAST:event_btnreporteActionPerformed

    private void txtfiltroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfiltroKeyPressed

    }//GEN-LAST:event_txtfiltroKeyPressed

    private void txtfiltroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfiltroKeyTyped
        if (rbnombre.isSelected() == true) {
            rbdni.getSelectedObjects();//Selected(false);
            buscar(2);
        }
        if (rbdni.isSelected() == true) {
            buscar(3);
        }
        if (rball.isSelected() == true) {
            tabla.removeAll();
            listar();
        }
    }//GEN-LAST:event_txtfiltroKeyTyped

    private void txtfiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfiltroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnreporte;
    private javax.swing.ButtonGroup busca;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel principal;
    private javax.swing.JRadioButton rball;
    private javax.swing.JRadioButton rbdni;
    private javax.swing.JRadioButton rbnombre;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtfiltro;
    // End of variables declaration//GEN-END:variables

    private void listar() {
        List<ClienteDTO> lista = csdao.listar();
        model = (DefaultTableModel) tabla.getModel();
        Object[] ob = new Object[5];
        for (int i = 0; i < lista.size(); i++) {
            ob[0] = lista.get(i).getId();
            ob[1] = lista.get(i).getDni();
            ob[2] = lista.get(i).getNombre();
            ob[3] = lista.get(i).getDire();
            ob[4] = lista.get(i).getEstado();
            model.addRow(ob);
        }
        tabla.setModel(model);
    }

    private void buscar(int x) {
        txtfiltro.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent ke) {
                trs.setRowFilter(RowFilter.regexFilter("(?i)" + txtfiltro.getText(), x));//insensiti
            }
        });
        trs = new TableRowSorter(model);
        tabla.setRowSorter(trs);
    }

    private void buscarReporte() {
         List lista = new ArrayList();
        for (int i = 0; i < tabla.getRowCount(); i++) {
            int cod = Integer.parseInt(tabla.getValueAt(i, 0).toString());
            String dni = tabla.getValueAt(i, 1).toString();
            String nom = tabla.getValueAt(i, 2).toString();
            String dir = tabla.getValueAt(i, 3).toString();
            String est = tabla.getValueAt(i, 4).toString();
            ClienteDTO c = new ClienteDTO(cod, dni, nom, dir, est);
            lista.add(c);
        }
        try {
            String no = txtfiltro.getText() + "%";
            String path = "src\\main\\java\\com\\gussoft\\reports\\RClienteP.jasper";
            JasperReport re = (JasperReport) JRLoader.loadObjectFromFile(path);
            Map parametro = new HashMap();
            System.out.println("parametro " + no);
            parametro.put("dato", no);
            JasperPrint print = JasperFillManager.fillReport(path, parametro, new JRBeanCollectionDataSource(lista));
            JasperViewer.viewReport(print);
        } catch (Exception e) {

        }
    }

}
