package com.project.ecommerce.entities;

public class Rol {
    private Long id;
    private String nombre;

    Rol(){}

    Rol(String nombre, Long id){
        this.id = id;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
