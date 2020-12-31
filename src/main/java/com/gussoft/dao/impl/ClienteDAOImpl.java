package com.gussoft.dao.impl;

import com.gussoft.config.ConectaDB;
import com.gussoft.dao.ClienteDAO;
import com.gussoft.dto.ClienteDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAOImpl implements ClienteDAO {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public List listar() {
        List<ClienteDTO> lista = new ArrayList<>();
        String sql = "select * from cliente";
        try {
            con = ConectaDB.getInstance().getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                ClienteDTO c = new ClienteDTO();
                c.setId(rs.getInt(1));
                c.setDni(rs.getString(2));
                c.setNombre(rs.getString(3));
                c.setDire(rs.getString(4));
                c.setEstado(rs.getString(5));
                lista.add(c);
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
        String sql = "insert into cliente(dni,nombre,direccion,estado) values (?,?,?,?)";
        try {
            con = ConectaDB.getInstance().getConexion();
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
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
        String sql = "update cliente set dni=?, nombre=?, direccion=?, estado=? where (idCliente=?)";
        int r = 0;
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
    public void eliminar(int id) {
        String sql = "delete from cliente where idCliente=?";
        try {
            con = ConectaDB.getInstance().getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConectaDB.getInstance().closeConexion(con);
        }
    }

    @Override
    public ClienteDTO listarId(String nom) {
        String sql = "select * from cliente where nombre = ?";
        ClienteDTO c = new ClienteDTO();
        try {
            con = ConectaDB.getInstance().getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, nom);
            rs = ps.executeQuery();
            while (rs.next()) {
                c.setId(rs.getInt(1));
                c.setDni(rs.getString(2));
                c.setNombre(rs.getString(3));
                c.setDire(rs.getString(4));
                c.setEstado(rs.getString(5));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConectaDB.getInstance().closeConexion(con);
        }
        return c;
    }

}
