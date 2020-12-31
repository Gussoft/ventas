package com.gussoft.ventas;

import com.gussoft.config.Mensajes;
import com.gussoft.config.Reloj;
import com.gussoft.service.impl.RegistroServiceImpl;
import java.awt.Dimension;
import javax.swing.JInternalFrame;

public class mainForm extends javax.swing.JFrame {

   RegistroServiceImpl rsdao = new RegistroServiceImpl();
    public mainForm() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        //menuname.setText(lblusuario.getText());
        Reloj hilo = new Reloj(lblhora, lblfecha);
        hilo.start();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        principal = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        lblusuario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblfecha = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblhora = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbluser = new javax.swing.JLabel();
        lblperfil = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuSalir = new javax.swing.JMenu();
        menuname = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        menuGventa = new javax.swing.JMenuItem();
        menuVen = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        menuCli = new javax.swing.JMenuItem();
        menuPro = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        menuGRCliente = new javax.swing.JMenuItem();
        menuGRProducto = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout principalLayout = new javax.swing.GroupLayout(principal);
        principal.setLayout(principalLayout);
        principalLayout.setHorizontalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        principalLayout.setVerticalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 444, Short.MAX_VALUE)
        );

        jLabel1.setText("USUARIO :");

        lblusuario.setText(".");

        jLabel2.setText("FECHA :");

        lblfecha.setText(".");

        jLabel3.setText("HORA :");

        lblhora.setText(".");

        lbluser.setText(".");

        lblperfil.setText(".");

        menuSalir.setText("Archivo");

        menuname.setText("Cerrar Session :");
        menuname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menunameActionPerformed(evt);
            }
        });
        menuSalir.add(menuname);

        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuSalir.add(jMenuItem1);

        jMenuBar1.add(menuSalir);

        jMenu6.setText("Ventas");

        menuGventa.setText("Generar Ventas");
        menuGventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGventaActionPerformed(evt);
            }
        });
        jMenu6.add(menuGventa);

        jMenuBar1.add(jMenu6);

        menuVen.setText("Mantenimientos");
        menuVen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVenActionPerformed(evt);
            }
        });

        jMenuItem2.setText("Vendedores");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menuVen.add(jMenuItem2);

        menuCli.setText("Clientes");
        menuCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCliActionPerformed(evt);
            }
        });
        menuVen.add(menuCli);

        menuPro.setText("Productos");
        menuPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuProActionPerformed(evt);
            }
        });
        menuVen.add(menuPro);

        jMenuBar1.add(menuVen);

        jMenu5.setText("Reportes");

        menuGRCliente.setText("Generar Reporte Clientes");
        menuGRCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGRClienteActionPerformed(evt);
            }
        });
        jMenu5.add(menuGRCliente);

        menuGRProducto.setText("Generar Reporte Productos");
        jMenu5.add(menuGRProducto);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(lblperfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbluser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblhora, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addComponent(principal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblusuario)
                    .addComponent(jLabel2)
                    .addComponent(lblfecha)
                    .addComponent(jLabel3)
                    .addComponent(lblhora)
                    .addComponent(jLabel4)
                    .addComponent(lbluser)
                    .addComponent(lblperfil))
                .addGap(18, 18, 18)
                .addComponent(principal)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        int i = Mensajes.confirmar("Desea Salir del Sistema?");
        if (i == 0){
            Logout("Salida");
            System.exit(0);
        }
       
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void menuCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCliActionPerformed
        ClienteForm cf = new ClienteForm();
        centrarVentana(cf);
    }//GEN-LAST:event_menuCliActionPerformed

    private void menuGventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGventaActionPerformed
        VentasForm vf = new VentasForm();
        vf.txtvende.setText(lblusuario.getText());
        centrarVentana(vf);
    }//GEN-LAST:event_menuGventaActionPerformed

    private void menuVenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVenActionPerformed

    }//GEN-LAST:event_menuVenActionPerformed

    private void menuProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuProActionPerformed
        ProductoForm pf = new ProductoForm();
        centrarVentana(pf);
    }//GEN-LAST:event_menuProActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        VendedorForm vef = new VendedorForm();
        centrarVentana(vef);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void menuGRClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGRClienteActionPerformed
        RClienteForm grf = new RClienteForm();
        centrarVentana(grf);
    }//GEN-LAST:event_menuGRClienteActionPerformed

    private void menunameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menunameActionPerformed
        Logout("Cerrar Session");
        loginForm lf = new loginForm();
        lf.setVisible(true);
        dispose();
    }//GEN-LAST:event_menunameActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    public static javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JLabel lblfecha;
    private javax.swing.JLabel lblhora;
    public static javax.swing.JLabel lblperfil;
    public static javax.swing.JLabel lbluser;
    public static javax.swing.JLabel lblusuario;
    private javax.swing.JMenuItem menuCli;
    private javax.swing.JMenuItem menuGRCliente;
    private javax.swing.JMenuItem menuGRProducto;
    private javax.swing.JMenuItem menuGventa;
    private javax.swing.JMenuItem menuPro;
    private javax.swing.JMenu menuSalir;
    private javax.swing.JMenu menuVen;
    public static javax.swing.JMenuItem menuname;
    public static javax.swing.JDesktopPane principal;
    // End of variables declaration//GEN-END:variables

    private void centrarVentana(JInternalFrame frame) {
        principal.add(frame);
        Dimension dim = principal.getSize();
        Dimension dFrame = frame.getSize();
        frame.setLocation((dim.width - dFrame.height) / 2, (dim.height - dFrame.width) / 2);
        frame.show();
    }

    private void Logout(String re) {
        
        String nom = lblusuario.getText();
        String user = lbluser.getText();
        String perfil = lblperfil.getText();
        String estado = nom + " Salió del sistema";
        String registro = re;
        String fecha = Reloj.darHora() + " " + lblfecha.getText();
        //Mensajes.informacion(nom+user+perfil+estado+registro+fecha);
        Object[] ob = new Object[6];
        ob[0] = nom;
        ob[1] = user;
        ob[2] = perfil;
        ob[3] = estado;
        ob[4] = registro;
        ob[5] = fecha;
        rsdao.agregar(ob);
        System.out.println("se registro la Salida !!");
    }
}
