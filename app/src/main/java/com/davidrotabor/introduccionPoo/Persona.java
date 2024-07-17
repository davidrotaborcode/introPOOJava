package com.davidrotabor.introduccionPoo;

import java.util.ArrayList;
import java.util.List;

public class Persona {
    
    public String nombre;
    public List<String> categoriasProductos  = new ArrayList<String>();
    public List<String> nombresProductos  = new ArrayList<String>();
    public List<Double> preciosProductos  = new ArrayList<Double>();

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public void agregarProducto(String categoria, String nombre, double precio) {
        categoriasProductos.add(categoria);
        nombresProductos.add(nombre);
        preciosProductos.add(precio);
    }
}
