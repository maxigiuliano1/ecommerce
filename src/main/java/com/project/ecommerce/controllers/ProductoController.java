package com.project.ecommerce.controllers;

import com.project.ecommerce.entities.Producto;
import com.project.ecommerce.services.ProductoService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/productos")

//queda pulir tema de excepciones para los servicios al crear productos, manejar mensajes personalizados y agregar logs
public class ProductoController {
    @Autowired
    private ProductoService productoService;

    private static final Logger LOGGER = LogManager.getLogger(ProductoController.class);

    @GetMapping("/listadoProductos")
    public ResponseEntity<List<Producto>> getAllProductos(){
        return ResponseEntity.ok(productoService.getProductos());
    }

    @GetMapping("/obtenerProducto/{id}")
    public ResponseEntity<Optional<Producto>> getProductoById(@RequestParam Long id){
        return ResponseEntity.status(HttpStatus.OK).body(productoService.getProducto(id));
    }

    @PostMapping("/crearProducto")
    public ResponseEntity<?> createProducto(@RequestBody Producto producto){
        if(producto != null){
            productoService.createProducto(producto);
            return ResponseEntity.status(HttpStatus.OK).body(producto);
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(producto);
    }

    @PutMapping("/editarProducto/{id}")
    public ResponseEntity<?> updateProducto(@RequestParam Long id, @RequestBody Producto productoActualizado) throws Exception {
        return ResponseEntity.status(HttpStatus.OK).body(productoService.updateProducto(id,productoActualizado));
    }

    @DeleteMapping("/deleteProducto/{id}")
    public ResponseEntity<String> deleteProducto(@RequestParam Long id){
        productoService.deleteProducto(id);
        return ResponseEntity.status(HttpStatus.OK).body("Producto borrado con exito.");
    }

    @GetMapping("/buscar")
    public List<Producto> buscarProductos(@RequestParam(required = false) String nombre,
                                          @RequestParam(required = false) String marca) {
        if (nombre != null) {
            return productoService.buscarPorNombre(nombre);
        } else if (marca != null) {
            return productoService.buscarPorMarca(marca);
        }
        return new ArrayList<>();
    }

    @GetMapping("/filtrar")
    public List<Producto> filtrarPorCategoria(@RequestParam String categoria) {
        return productoService.filtrarPorCategoria(categoria);
    }
}
