package com.example.ecogardenapp2.modelos;

import java.util.Date;

public class Energia {
    private float Kilovatios;
    private float precio;
    private Date fecha;

    public Energia (float kilovatios, float precio, String mes) {
        Kilovatios = kilovatios;
        this.precio = precio;
        this.fecha = fecha;
    }

    public float getKilovatios() {
        return Kilovatios;
    }

    public void setKilovatios(float kilovatios) {
        Kilovatios = kilovatios;
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