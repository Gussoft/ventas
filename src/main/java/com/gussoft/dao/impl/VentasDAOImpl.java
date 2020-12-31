package com.gussoft.dao.impl;

import com.gussoft.config.ConectaDB;
import com.gussoft.dao.VentasDAO;
import com.gussoft.dto.DetalleDTO;
import com.gussoft.dto.VentasDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VentasDAOImpl implements VentasDAO {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r = 0;

    @Override
    public String IdVentas() {
        String idv = "";
        String sql = "select max(idVentas) from ventas";
        try {
            con = ConectaDB.getInstance().getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                idv = rs.getString(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConectaDB.getInstance().closeConexion(con);
        }
        return idv;
    }

    @Override
    public int GuardarVenta(VentasDTO v) {
       
        String sql = "insert into ventas(numeroSerie, idCliente, idVendedor, fechaVenta, monto, estado) values (?,?,?,?,?,?)";
        try {
            con = ConectaDB.getInstance().getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, v.getSerie());
            ps.setInt(2, v.getIdcli());
            ps.setInt(3, v.getIdven());
            ps.setString(4, v.getFecha());
            ps.setDouble(5, v.getMonto());
            ps.setString(6, v.getEstado());
            r = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConectaDB.getInstance().closeConexion(con);
        }
        return r;
    }

    @Override
    public int GuardarDetalle(DetalleDTO d) {
        String sql = "insert into detalle_venta(idVentas, idProducto, cantidad, preciov) values(?,?,?,?)";
        try {
            con = ConectaDB.getInstance().getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, d.getIdvta());
            ps.setInt(2, d.getIdpro());
            ps.setInt(3, d.getCan());
            ps.setDouble(4, d.getPreV());
            r = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConectaDB.getInstance().closeConexion(con);
        }
        return r;
    }

    @Override
    public String NroSerie() {
        String serie = "";
        String sql = "select max(numeroSerie) from ventas";
        try{
            con = ConectaDB.getInstance().getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                serie = rs.getString(1);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            ConectaDB.getInstance().closeConexion(con);
        }
        
        return serie;
    }

    @Override
    public VentasDTO ListarId(int cod) {
       String sql = "select * from ventas where idventas = ?";
        VentasDTO c = new VentasDTO();
        try {
            con = ConectaDB.getInstance().getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, cod);
            rs = ps.executeQuery();
            while (rs.next()) {
                c.setId(rs.getInt(1));
                c.setIdcli(rs.getInt(2));
                c.setIdven(rs.getInt(3));
                c.setSerie(rs.getString(4));
                c.setFecha(rs.getString(5));
                c.setMonto(rs.getDouble(6));
                c.setEstado(rs.getString(7));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConectaDB.getInstance().closeConexion(con);
        }
        return c;
    }
    @Override
    public List Listar(){
        List<VentasDTO> lista = new ArrayList<>();
        String sql = "select * from ventas";
        try{
            con = ConectaDB.getInstance().getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                VentasDTO c = new VentasDTO();
                c.setId(rs.getInt(1));
                c.setIdcli(rs.getInt(2));
                c.setIdven(rs.getInt(3));
                c.setSerie(rs.getString(4));
                c.setFecha(rs.getString(5));
                c.setMonto(rs.getDouble(6));
                c.setEstado(rs.getString(7));
                lista.add(c);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            ConectaDB.getInstance().closeConexion(con);
        }
        return lista;
        
    }

}
