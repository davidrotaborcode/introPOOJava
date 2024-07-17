package com.davidrotabor.introduccionPoo;

import java.util.ArrayList;
import java.util.List;

public class Persona {
    
    public String nombre;
    public List<String> nombresProducto = new ArrayList<>();
    public List<String> categoriasProducto = new ArrayList<>();
    public List<Double> preciosProducto = new ArrayList<>();

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public void agregarProducto(String nombre, String categoria, Double precio) {
        nombresProducto.add(nombre);
        categoriasProducto.add(categoria);
        preciosProducto.add(precio);
    }


}
