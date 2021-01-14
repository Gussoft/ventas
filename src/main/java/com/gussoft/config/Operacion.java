package com.gussoft.config;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Operacion {

    public static String exeOperacion(String sql)//Metodo insertar, actualizar y eliminar
    {
        String msg = null;
        try {
            Connection cn = ConectaDB.getInstance().getConexion();
            if (cn == null) {
                msg = "No hay Conexion con la Base de Datos";
            } else {
                Statement st = cn.createStatement();
                st.executeUpdate(sql);
                cn.close();
            }
        } catch (SQLException e) {
            msg = e.getMessage();
            System.out.println("Error Joder" + e.getMessage());
            e.printStackTrace();
        }
        return msg;
    }

    public static List getTabla(String sql) {//Metodo para mostrar la tabla completa
        List lista = new ArrayList();
        try {
            Connection cn = ConectaDB.getInstance().getConexion();
            if (cn == null) {//Comprobamos la conexion
                lista = null;
            } else {//Hay conexion
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql);
                ResultSetMetaData rm = rs.getMetaData();
                int numCol = rm.getColumnCount();
                String[] titCol = new String[numCol];
                for (int i = 0; i < numCol; i++) {
                    titCol[i] = rm.getColumnName(i + 1);
                }
                lista.add(titCol);
                while (rs.next()) {
                    Object[] fila = new Object[numCol];
                    for (int i = 0; i < numCol; i++) {
                        fila[i] = rs.getObject(i + 1);
                    }
                    lista.add(fila);
                }
                cn.close();
            }
        } catch (SQLException e) {
            lista = null;
            e.printStackTrace();
        }
        return lista;
    }

    public static Object[] getFila(String sql) {//Metodo que solo retorna una fila
        Object[] fila = null;
        List lista = getTabla(sql);//Llamamos al metodo getTabla
        if (lista != null) {
            if (lista.size() > 1) {
                fila = (Object[]) lista.get(1);
            }
        }
        return fila;
    }
}