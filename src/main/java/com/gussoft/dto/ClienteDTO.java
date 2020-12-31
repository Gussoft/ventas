package com.gussoft.dto;

public class ClienteDTO {
    private int id;
    private String dni;
    private String nombre;
    private String dire;
    private String estado;

    public ClienteDTO() {
    }

    public ClienteDTO(int id, String dni, String nombre, String dire, String estado) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.dire = dire;
        this.estado = estado;
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

    public String getDire() {
        return dire;
    }

    public void setDire(String dire) {
        this.dire = dire;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
