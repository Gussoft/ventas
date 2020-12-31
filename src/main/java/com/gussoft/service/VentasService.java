package com.gussoft.service;

import com.gussoft.dto.DetalleDTO;
import com.gussoft.dto.VentasDTO;
import java.util.List;

public interface VentasService {

    public String IdVentas();

    public int GuardarVenta(VentasDTO v);

    public int GuardarDetalle(DetalleDTO d);
    
    public String NroSerie();
    
    public VentasDTO ListarId(int cod);
    
    public List Listar();
}
