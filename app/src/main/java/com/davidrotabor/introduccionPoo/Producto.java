package com.davidrotabor.introduccionPoo;

import java.util.ArrayList;
import java.util.List;

public class Producto {
    
    public String categoria;
    public String nombre;
    public double precio;

    public Producto (String categoria, String nombre, double precio) {
        this.categoria = categoria;
        this.nombre = nombre;
        this.precio = precio;
    }
}
