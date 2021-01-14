package com.gussoft.config;

import com.gussoft.dto.RegistroDTO;
import com.gussoft.dto.VendedorDTO;
import com.gussoft.ventas.LogeoForm;
import java.sql.Connection;
import java.sql.Statement;

public class Logeo {

    public static VendedorDTO logear(String pass, String user) {
        VendedorDTO u = null;
        try {
            StringBuilder sql = new StringBuilder("select * from vendedor where dni='");
            sql.append(user);
            sql.append("' and user='");
            sql.append(pass);
            sql.append("'");
//        String sql = "SELECT * FROM usuario WHERE (usu_usuario = '" + user + "' AND usu_password = '" + pass + "')";
            Object[] filaObt = Operacion.getFila(sql.toString());
            if (filaObt != null) {
                u = new VendedorDTO();
                u.setId(Integer.parseInt(filaObt[0].toString()));
                u.setDni(filaObt[1].toString());
                u.setNombre(filaObt[2].toString());
                u.setTele(filaObt[3].toString());
                u.setEstado(filaObt[4].toString());
                u.setUser(filaObt[6].toString());
                System.out.println("Usuario Correcto");

            } else {
                LogeoForm.lblMensaje.setText("Usuario o Contraseña Incorrectos");
            }
        } catch (Exception e) {
            e.printStackTrace();
            Mensajes.informacion("Error aqui!");
        }
        return u;
    }

    public static String acceso(RegistroDTO u) {
        String msg;
        StringBuilder sql = new StringBuilder("INSERT INTO registro VALUES (");
        sql.append(u.getNombre()).append("','").append(u.getUser()).append("','");
        sql.append(u.getPerfil()).append("','").append(u.getUser());
        sql.append(" ingresó al sistema','Entrada',NOW())");
        msg = "prueba "+Operacion.exeOperacion(sql.toString());
        return msg;
    }

    public static String salida(RegistroDTO u) {
        String msg;
        StringBuilder sql = new StringBuilder("INSERT INTO registro VALUES (");
        sql.append(u.getNombre()).append("','").append(u.getUser()).append("','");
        sql.append(u.getPerfil()).append("','").append(u.getUser());
        sql.append(" salió del sistema','Salida',NOW())");
        msg = Operacion.exeOperacion(sql.toString());
        return msg;
    }

    static String salida(VendedorDTO u) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static String acceso(VendedorDTO u) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}