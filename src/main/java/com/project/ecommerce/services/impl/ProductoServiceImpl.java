package com.project.ecommerce.services.impl;

import com.project.ecommerce.entities.Producto;
import com.project.ecommerce.repositories.ProductoRepository;
import com.project.ecommerce.services.ProductoService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoServiceImpl implements ProductoService {
    @Autowired
    private ProductoRepository productoRepository;

    private static final Logger LOGGER = LogManager.getLogger(ProductoServiceImpl.class);

    @Override
    public Producto createProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public Optional<Producto> getProducto(Long id) {
        return productoRepository.findById(id);
    }

    @Override
    public List<Producto> getProductos() {
        return productoRepository.findAll();
    }

    @Override
    public Producto updateProducto(Long id, Producto productoActualizado) throws Exception {
        Producto producto = getProducto(id).orElseThrow();
        try{
            producto.setDetalleOrden(productoActualizado.getDetalleOrden());
            producto.setNombre(productoActualizado.getNombre());
            producto.setUsuario(productoActualizado.getUsuario());
            producto.setCantidad(productoActualizado.getCantidad());
            producto.setDescripcion(productoActualizado.getDescripcion());
            producto.setImagen(productoActualizado.getImagen());
            producto.setPrecio(productoActualizado.getPrecio());
            return productoRepository.save(producto);
        } catch(Exception e){
            throw new Exception("producto no encontrado. " + e.getMessage());
        }
    }

    @Override
    public void deleteProducto(Long id) {
        productoRepository.deleteById(id);
    }

    public List<Producto> buscarPorNombre(String nombre) {
        return productoRepository.findByNombre(nombre);
    }

    public List<Producto> buscarPorMarca(String marca) {
        return productoRepository.findByMarca(marca);
    }

    public List<Producto> filtrarPorCategoria(String categoria) {
        return productoRepository.findByCategoria(categoria);
    }
}
