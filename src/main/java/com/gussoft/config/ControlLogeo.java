package com.gussoft.config;

import com.gussoft.dto.VendedorDTO;
import com.gussoft.ventas.LogeoForm;
import com.gussoft.ventas.mainForm;
import javax.swing.Timer;

public class ControlLogeo {

    static Timer timer;
    int cont;
    public static final int ONE_SECOND = 2;

    static VendedorDTO u;
    static String user;
    static String pass;

    public static String logear() {
        LogeoForm lf = new LogeoForm();
        user = lf.txtUsuario.getText().trim();
        pass = lf.psPasword.getText();//Encript.getStringMessageDigest(frmAcceso.psPasword.getText(), Encript.MD5);
        u = Logeo.logear(pass, user);
         if (u.getDni() != null && u.getUser() != null){
        
            String msg = Logeo.acceso(u);
            Mensajes.informacion("Logeo Exitoso");
            abrirPrincipal();
         }
        
        return String.valueOf(u.getNombre());
    }

    public static String perfil() {
        return String.valueOf(u.getNombre());
    }

    public static String desLogeo() {
        String msg = null;
        msg = Logeo.salida(u);
        if (msg == null) {
            System.out.println("Se inserto Salida" + msg);
        } else {
            System.out.println("No se inserto salida" + msg);
        }
        return msg;
    }

    public static void abrirPrincipal() {
        mainForm p = new mainForm();
        p.setExtendedState(LogeoForm.MAXIMIZED_BOTH);
        p.setVisible(true);
    }
}