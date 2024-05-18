package com.project.ecommerce.entities;

import jakarta.persistence.*;

import javax.management.relation.Role;

@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombreCompleto;
    private String username;
    private String email;
    private String direccion;
    private String telefono;
    private Role rol;
    private String password;

    public Usuario(Long id, String nombreCompleto, String username, String email, String direccion, String telefono, Role rol, String password) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.username = username;
        this.email = email;
        this.direccion = direccion;
        this.telefono = telefono;
        this.rol = rol;
        this.password = password;
    }

    public Usuario() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Role getRol() {
        return rol;
    }

    public void setRol(Role rol) {
        this.rol = rol;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
