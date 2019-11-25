package com.example.repartosahuayo.Adapter;

public class Datos {
    private String clave_producto;
    private double total;
    private String nombre_producto;
    public Datos(String clave_producto, String nombre_producto, double total){
        this.clave_producto = clave_producto;
        this.nombre_producto = nombre_producto;
        this.total = total;
    }

    public String getClave_producto() {
        return clave_producto;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public double getTotal() {
        return total;
    }
}
