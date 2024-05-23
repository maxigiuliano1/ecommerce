package com.project.ecommerce.services;

import com.project.ecommerce.entities.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductoService {
    Producto createProducto(Producto producto);
    Optional<Producto> getProducto(Long id);
    List<Producto> getProductos();
    Producto updateProducto(Long id, Producto producto) throws Exception;
    void deleteProducto(Long id);
    public List<Producto> buscarPorNombre(String nombre);
    public List<Producto> buscarPorMarca(String marca);
    public List<Producto> filtrarPorCategoria(String categoria);
}
