package com.davidrotabor.introduccionPoo;

import java.util.ArrayList;
import java.util.List;

public class Persona {
    
    public String nombre;
    public List<Producto> productos  = new ArrayList<Producto>();

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public void agregarProducto(String categoria, String nombre, double precio) {
        productos.add(new Producto(categoria, nombre, precio));
    }
}
