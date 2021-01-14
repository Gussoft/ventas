package com.gussoft.config;

import com.gussoft.dto.Combo;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JList;

public class cargarDatos {

    static DefaultComboBoxModel modelCombo;

    // crear un dto combo
    public static void cargarCombo(JComboBox cb, String sql) {
        try {
            Connection con = ConectaDB.getInstance().getConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            modelCombo = new DefaultComboBoxModel();
            cb.setModel(modelCombo);
            while (rs.next()) {
                modelCombo.addElement(new Combo(Integer.parseInt(rs.getString(1)), (rs.getString(2))));
            }
            rs.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Algunos formularios no estan activos, para actualizarse, o no hay conexión");
        }
    }

    public static String getCodigo(JComboBox cb) {
        Combo c = (Combo) cb.getSelectedItem();
        int id = c.getCodigo();
        return String.valueOf(id);
    }

    public static void cargarList(JList cb, String sql) {
        try {
            Connection con = ConectaDB.getInstance().getConexion();//Nos conectamos
            Statement st = (Statement) con.createStatement();
            ResultSet rs = (ResultSet) st.executeQuery(sql);
            modelCombo = new DefaultComboBoxModel();
            cb.setModel(modelCombo);
            while (rs.next()) {//recorremos la tabla
                //Agregamos al combo los valores
                modelCombo.addElement(new Combo(Integer.parseInt(rs.getString(1)), rs.getString(2)));
            }
            rs.close();//Cerramos el recorrido
            con.close();//Cerramos la conexion
        } catch (Exception e) {
            //Excepcion en caso haya conexion
            System.out.println("Algunos formularios no estan activos, para actualizarse, o no hay conexión");
        }
    }
    public static String getCodigo(JList cb){
        Combo c = (Combo) cb.getSelectedValue();
        int id = c.getCodigo();
        return String.valueOf(id);
    }
}