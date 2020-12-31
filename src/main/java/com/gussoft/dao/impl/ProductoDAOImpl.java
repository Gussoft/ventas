package com.gussoft.dao.impl;

import com.gussoft.config.ConectaDB;
import com.gussoft.dao.ProductoDAO;
import com.gussoft.dto.ProductoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAOImpl implements ProductoDAO {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    int s;
    @Override
    public List listar() {
        List<ProductoDTO> lista = new ArrayList<>();
        String sql = "select * from producto";
        try{
            con = ConectaDB.getInstance().getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                ProductoDTO p = new ProductoDTO();
                p.setId(rs.getInt(1));
                p.setNombre(rs.getString(2));
                p.setPrecio(rs.getDouble(3));
                p.setStock(rs.getInt(4));
                p.setEstado(rs.getString(5));
                lista.add(p);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            ConectaDB.getInstance().closeConexion(con);
        }
        return lista;
    }

    @Override
    public int agregar(Object[] o) {
        int r = 0;
        String sql = "insert into producto(nombre, precio, stock, estado) values(?,?,?,?)";
        try{
            con = ConectaDB.getInstance().getConexion();
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            r = ps.executeUpdate();   
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            ConectaDB.getInstance().closeConexion(con);
        }
        return r;
    }

    @Override
    public int actualizar(Object[] o) {
        String sql = "update producto set nombre=?, precio=?, stock=?, estado=? where (idProducto=?)";
        int r = 0;
        try{
            con = ConectaDB.getInstance().getConexion();
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            r = ps.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            ConectaDB.getInstance().closeConexion(con);
        }
        return r;
    }

    @Override
    public void eliminar(int id) {
        String sql = "delete from producto where idProducto=?";
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

    @Override
    public ProductoDTO listarId(int id) {
        ProductoDTO p = new ProductoDTO();
        String sql = "select * from producto where idProducto=?";
        try{
            con = ConectaDB.getInstance().getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while(rs.next()){
                p.setId(rs.getInt(1));
                p.setNombre(rs.getString(2));
                p.setPrecio(rs.getDouble(3));
                p.setStock(rs.getInt(4));
                p.setEstado(rs.getString(5));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            ConectaDB.getInstance().closeConexion(con);
        }
        return p;
    }

    @Override
    public int actualizarStock(int cant, int idp) {
        String sql = "update producto set stock=? where idProducto=?";
        try{
            con = ConectaDB.getInstance().getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, cant);
            ps.setInt(2, idp);
            s = ps.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            ConectaDB.getInstance().closeConexion(con);
        }
        return s;
    }
    
}
