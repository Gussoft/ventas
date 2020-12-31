package com.gussoft.dto;

public class DetalleDTO {
    private int id;
    private int idvta;
    private int idpro;
    private int can;
    private double preV;

    public DetalleDTO() {
    }

    public DetalleDTO(int id, int idvta, int idpro, int can, double preV) {
        this.id = id;
        this.idvta = idvta;
        this.idpro = idpro;
        this.can = can;
        this.preV = preV;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdvta() {
        return idvta;
    }

    public void setIdvta(int idvta) {
        this.idvta = idvta;
    }

    public int getIdpro() {
        return idpro;
    }

    public void setIdpro(int idpro) {
        this.idpro = idpro;
    }

    public int getCan() {
        return can;
    }

    public void setCan(int can) {
        this.can = can;
    }

    public double getPreV() {
        return preV;
    }

    public void setPreV(double preV) {
        this.preV = preV;
    }
    
}
