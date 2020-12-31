package com.gussoft.dto;

public class RegistroDTO {

    private int id;
    private String nombre;
    private String user;
    private String perfil;
    private String estado;
    private String registro;
    private String fecha;

    public RegistroDTO() {
    }

    public RegistroDTO(int id, String nombre, String user, String perfil,String estado, String registro, String fecha) {
        this.id = id;
        this.nombre = nombre;
        this.user = user;
         this.perfil = perfil;
        this.estado = estado;
        this.registro = registro;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

}
