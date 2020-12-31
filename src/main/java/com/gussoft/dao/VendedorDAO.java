
package com.gussoft.dao;

import com.gussoft.dto.VendedorDTO;
import java.util.List;


public interface VendedorDAO {
       
    public VendedorDTO ValidarVendedor(String dni, String user);
    
    public List listar();
    
    public int agregar(Object[] o);
    
    public int actualizar(Object[] o);
    
    public void eliminar(int id);
    
}
