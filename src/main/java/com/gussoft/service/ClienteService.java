package com.gussoft.service;

import com.gussoft.dto.ClienteDTO;
import java.util.List;

public interface ClienteService {
 
    public List listar();
    
    public int agregar(Object[] o);
    
    public int actualizar(Object[] o);
    
    public void eliminar(int id);
    
    public ClienteDTO listarId(String nom);
}
