package com.gussoft.service.impl;

import com.gussoft.dao.ClienteDAO;
import com.gussoft.dao.impl.ClienteDAOImpl;
import com.gussoft.dto.ClienteDTO;
import com.gussoft.service.ClienteService;

import java.util.List;

public class ClienteServiceImpl implements ClienteService{
    
    @Override
    public List listar() {
        ClienteDAO cdao = new ClienteDAOImpl();
        return cdao.listar();
    }

    @Override
    public int agregar(Object[] o) {
        ClienteDAO cdao = new ClienteDAOImpl();
        return cdao.agregar(o);
    }

    @Override
    public int actualizar(Object[] o) {
        ClienteDAO cdao = new ClienteDAOImpl();
        return cdao.actualizar(o);
    }

    @Override
    public void eliminar(int id) {
        ClienteDAO cdao = new ClienteDAOImpl();
        cdao.eliminar(id);
    }

    @Override
    public ClienteDTO listarId(String nom) {
        ClienteDAO cdao = new ClienteDAOImpl();
        return cdao.listarId(nom);
    }
    
}
