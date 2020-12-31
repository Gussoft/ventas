package com.gussoft.dao.impl;

import com.gussoft.config.ConectaDB;
import com.gussoft.dao.RegistroDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RegistroDAOImpl implements RegistroDAO {
    
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
   
    @Override
    public int agregar(Object[] o) {
        int r = 0;
        String sql = "insert into registro(nombre, user, perfil, estado, registro, fecha) values(?,?,?,?,?,?)";
        try{
            con = ConectaDB.getInstance().getConexion();
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);
            r = ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("error al agregar");
        }finally{
            ConectaDB.getInstance().closeConexion(con);
        }
        return r;
    }
    
}
