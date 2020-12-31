package com.gussoft.service.impl;

import com.gussoft.dao.ProductoDAO;
import com.gussoft.dao.impl.ProductoDAOImpl;
import com.gussoft.dto.ProductoDTO;
import com.gussoft.service.ProductoService;
import java.util.List;

public class ProductoServiceImpl implements ProductoService{

    @Override
    public List listar() {
        ProductoDAO pdao = new ProductoDAOImpl();
        return pdao.listar();
    }

    @Override
    public int agregar(Object[] o) {
        ProductoDAO pdao = new ProductoDAOImpl();
        return pdao.agregar(o);
    }

    @Override
    public int actualizar(Object[] o) {
        ProductoDAO pdao = new ProductoDAOImpl();
        return pdao.actualizar(o);
    }

    @Override
    public void eliminar(int id) {
        ProductoDAO pdao = new ProductoDAOImpl();
        pdao.eliminar(id);
    }

    @Override
    public int actualizarStock(int cant, int idp) {
        ProductoDAO pdao = new ProductoDAOImpl();
        return pdao.actualizarStock(cant, idp);
    }

    @Override
    public ProductoDTO listarId(int id) {
        ProductoDAO pdao = new ProductoDAOImpl();
        return pdao.listarId(id);
    }
    
}
