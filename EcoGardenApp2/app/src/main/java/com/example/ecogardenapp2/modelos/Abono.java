package com.example.ecogardenapp2.modelos;

import java.util.Date;

public class Abono {
    private float cantidad;
    private float precio;
    private Date fecha;

    public Abono (float cantidad, float precio, Date fecha) {
        this.cantidad = cantidad;
        this.precio = precio;
        this.fecha = fecha;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}