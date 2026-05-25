package com.jarry.proyecto.modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto_increment en SQL
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String clave;

    @Column(nullable = false)
    private String rol;

    // CONSTRUCTORES, GETTERS Y SETTERS
    public Usuario() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getClave() { return clave; }
    public void setClave(String clave) { this.clave = clave; }
    public String getRol() { return rol; }
    public void setRol(String rol) { this.rol = rol; }
}