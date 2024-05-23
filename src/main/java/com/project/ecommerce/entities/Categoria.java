package com.project.ecommerce.entities;

import java.util.List;

public class Categoria {
    private Long id;
    private String nombreCategoria;
    private List<Producto> productos;

    public Categoria(){}

    public Categoria(String nombreCategoria, List<Producto> productos) {
        this.nombreCategoria = nombreCategoria;
        this.productos = productos;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
}
