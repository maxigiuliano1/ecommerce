package com.project.ecommerce.services;

import com.project.ecommerce.entities.DetalleOrden;

import java.util.List;
import java.util.Optional;

public interface DetalleOrdenService {
    DetalleOrden createDetalleOrden(DetalleOrden detalleOrden);
    DetalleOrden updateDetalleOrden(Long id, DetalleOrden detalleOrdenActualizado);
    Optional<DetalleOrden> getDetalleOrdenById(Long id);
    List<DetalleOrden> getDetalleOrdenes();
    void deleteDetalleOrden(Long id);
}
