package com.project.ecommerce.services;

import com.project.ecommerce.entities.Orden;

import java.util.List;
import java.util.Optional;

public interface OrdenService {
    Orden createOrden(Orden orden);
    Orden updateOrden(Long id, Orden ordenActualizado);
    Optional<Orden> getOrdenById(Long id);
    List<Orden> getOrdenes();
    void deleteOrden(Long id);
}
