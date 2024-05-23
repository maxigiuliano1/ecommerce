package com.project.ecommerce.repositories;

import com.project.ecommerce.entities.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
    List<Producto> findByNombre(String nombre);
    List<Producto> findByMarca(String marca);
    List<Producto> findByCategoria(String categoria);
}
