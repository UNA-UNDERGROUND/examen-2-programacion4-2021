package net.xravn.examen2.model;

public class CategoriaProducto {

    public CategoriaProducto() {
    }

    public CategoriaProducto(Integer id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    private Integer id;
    private String descripcion;
}
