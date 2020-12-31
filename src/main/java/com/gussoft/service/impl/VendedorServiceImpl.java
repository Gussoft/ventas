package com.gussoft.service.impl;

import com.gussoft.dao.VendedorDAO;
import com.gussoft.dao.impl.VendedorDAOImpl;
import com.gussoft.dto.VendedorDTO;
import com.gussoft.service.VendedorService;
import java.util.List;

public class VendedorServiceImpl implements VendedorService{

    @Override
    public VendedorDTO ValidarVendedor(String dni, String user) {
        VendedorDAO vdao = new VendedorDAOImpl();
        return vdao.ValidarVendedor(dni, user);
    }

    @Override
    public List listar() {
        VendedorDAO vdao = new VendedorDAOImpl();
        return vdao.listar();
    }

    @Override
    public int agregar(Object[] o) {
        VendedorDAO vdao = new VendedorDAOImpl();
        return vdao.agregar(o);
    }

    @Override
    public int actualizar(Object[] o) {
        VendedorDAO vdao = new VendedorDAOImpl();
        return vdao.actualizar(o);
    }

    @Override
    public void eliminar(int id) {
        VendedorDAO vdao = new VendedorDAOImpl();
        vdao.eliminar(id);
    }
    
}
