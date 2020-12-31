package com.gussoft.dao.impl;

import com.gussoft.config.ConectaDB;
import com.gussoft.dao.VendedorDAO;
import com.gussoft.dto.VendedorDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VendedorDAOImpl implements VendedorDAO {

    PreparedStatement ps;
    ResultSet rs;
    Connection con;

    @Override
    public VendedorDTO ValidarVendedor(String dni, String user) {
        VendedorDTO ve = new VendedorDTO();
        String sql = "select * from vendedor where dni=? and user=?";
        try {
            con = ConectaDB.getInstance().getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, dni);
            ps.setString(2, user);
            rs = ps.executeQuery();
            while (rs.next()) {
                ve.setId(rs.getInt(1));
                ve.setDni(rs.getString(2));
                ve.setNombre(rs.getString(3));
                ve.setTele(rs.getString(4));
                ve.setEstado(rs.getString(5));
                ve.setUser(rs.getString(6));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConectaDB.getInstance().closeConexion(con);
        }
        return ve;
    }

    @Override
    public List listar() {
        List<VendedorDTO> lista = new ArrayList<>();
        String sql = "select * from vendedor";
        try {
            con = ConectaDB.getInstance().getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                VendedorDTO v = new VendedorDTO();
                v.setId(rs.getInt(1));
                v.setDni(rs.getString(2));
                v.setNombre(rs.getString(3));
                v.setTele(rs.getString(4));
                v.setEstado(rs.getString(5));
                v.setUser(rs.getString(6));
                lista.add(v);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConectaDB.getInstance().closeConexion(con);
        }
        return lista;
    }

    @Override
    public int agregar(Object[] o) {
        int r = 0;
        String sql = "insert into vendedor(dni, nombre, telefono, estado, user) values(?,?,?,?,?)";
        try {
            con = ConectaDB.getInstance().getConexion();
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            r = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConectaDB.getInstance().closeConexion(con);
        }
        return r;
    }

    @Override
    public int actualizar(Object[] o) {
        String sql = "update vendedor set dni=?, nombre=?, telefono=?, estado=?, user=? where (idVendedor=?)";
        int r = 0;
        try {
            con = ConectaDB.getInstance().getConexion();
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);
            r = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConectaDB.getInstance().closeConexion(con);
        }
        return r;
    }

    @Override
    public void eliminar(int id) {
        String sql = "delete from vendedor where idVendedor=?";
        try{
            con = ConectaDB.getInstance().getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            ConectaDB.getInstance().closeConexion(con);
        }
    }

}
