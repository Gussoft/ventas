
package com.gussoft.dto;

public class VendedorDTO {
    private int id;
    private String dni;
    private String nombre;
    private String tele;
    private String estado;
    private String user;
    
    public VendedorDTO(){
        
    }

    public VendedorDTO(int id,String dni, String nombre, String tele, String estado, String user) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.tele = tele;
        this.estado = estado;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

     public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
    
}
