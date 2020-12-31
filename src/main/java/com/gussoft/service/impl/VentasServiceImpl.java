package com.gussoft.service.impl;

import com.gussoft.dao.VentasDAO;
import com.gussoft.dao.impl.VentasDAOImpl;
import com.gussoft.dto.DetalleDTO;
import com.gussoft.dto.VentasDTO;
import com.gussoft.service.VentasService;
import java.util.List;

public class VentasServiceImpl implements VentasService{

    @Override
    public String IdVentas() {
        VentasDAO vdao = new VentasDAOImpl();
        return vdao.IdVentas();
    }

    @Override
    public int GuardarVenta(VentasDTO v) {
        VentasDAO vdao = new VentasDAOImpl();
        return vdao.GuardarVenta(v);
    }

    @Override
    public int GuardarDetalle(DetalleDTO d) {
        VentasDAO vdao = new VentasDAOImpl();
        return vdao.GuardarDetalle(d);
    }

    @Override
    public String NroSerie() {
        VentasDAO vdao = new VentasDAOImpl();
        return vdao.NroSerie();
    }

    @Override
    public VentasDTO ListarId(int cod) {
        VentasDAO vdao = new VentasDAOImpl();
        return vdao.ListarId(cod);
    }

    @Override
    public List Listar() {
        VentasDAO vdao = new VentasDAOImpl();
        return vdao.Listar();
    }
    
}
