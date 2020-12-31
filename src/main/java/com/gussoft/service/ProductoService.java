package com.gussoft.service;

import com.gussoft.dto.ProductoDTO;
import java.util.List;

public interface ProductoService {
    
    public List listar();
    
    public int agregar(Object[] o);
    
    public int actualizar(Object[] o);
    
    public void eliminar(int id);
    
    public int actualizarStock(int cant, int idp);
    
    public ProductoDTO listarId(int id);
}
