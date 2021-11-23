package net.xravn.examen2.model;

import java.util.ArrayList;
import java.util.List;

public class Productos {

    public Productos() {

    }

    public Productos(int id, String nombre, String descripcion, String URLImagen, double precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.URLImagen = URLImagen;
        this.precio = precio;
        this.stock = stock;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getURLImagen() {
        return URLImagen;
    }

    public void setURLImagen(String URLImagen) {
        this.URLImagen = URLImagen;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public List<String> getCategorias() {
        return categorias;
    }
    
    private Integer id = -1;
    private String nombre = "";
    private String descripcion = "";
    private String URLImagen = null;
    private Double precio = 0.0;
    private Integer stock;
    private List<String> categorias = new ArrayList<>();
}
