package com.gussoft.dao;

import com.gussoft.dto.DetalleDTO;
import com.gussoft.dto.VentasDTO;
import java.util.List;

public interface VentasDAO {
    
    public String IdVentas();
    
    public int GuardarVenta(VentasDTO v);
    
    public int GuardarDetalle(DetalleDTO d);
    
    public String NroSerie();
    
    public VentasDTO ListarId(int cod);
    
    public List Listar();
}