package com.gussoft.dao;

import com.gussoft.dto.ProductoDTO;
import java.util.List;

public interface ProductoDAO {
    
    public List listar();
    
    public int agregar(Object[] o);
    
    public int actualizar(Object[] o);
    
    public void eliminar(int id);
    
    public ProductoDTO listarId(int id);
    
    public int actualizarStock(int cant, int idp);
}
