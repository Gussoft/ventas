package com.gussoft.service.impl;

import com.gussoft.dao.RegistroDAO;
import com.gussoft.dao.impl.RegistroDAOImpl;
import com.gussoft.service.RegistroService;

public class RegistroServiceImpl implements RegistroService{

    @Override
    public int agregar(Object[] o) {
        RegistroDAO rsdao = new RegistroDAOImpl();
        return rsdao.agregar(o);
    }
    
}
