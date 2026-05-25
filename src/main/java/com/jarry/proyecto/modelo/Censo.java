package com.jarry.proyecto.modelo;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "censos")
public class Censo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private LocalDate fecha; // Se mapea como DATE en SQL
    private String pais;
    private String departamento;
    private String ciudad;
    private String casa;

    private int numHombres;
    private int numMujeres;
    private int numAncianosHombres;
    private int numAncianasMujeres;
    private int numNinos;
    private int numNinas;
    private int numHabitaciones;
    private int numCamas;

    private boolean tieneAgua;
    private boolean tieneLuz;
    private boolean tieneAlcantarillado;
    private boolean tieneGas;
    private boolean tieneOtrosServicios;

    private String nombreSensador;

    // CONSTRUCTOR VACÍO OBLIGATORIO PARA JPA
    public Censo() {}

    // ... AGREGA AQUÍ TODOS LOS GETTERS Y SETTERS DE ESTOS ATRIBUTOS ...
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public LocalDate getFecha() { return fecha; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }
    public String getPais() { return pais; }
    public void setPais(String pais) { this.pais = pais; }
    public String getDepartamento() { return departamento; }
    public void setDepartamento(String departamento) { this.departamento = departamento; }
    public String getCiudad() { return ciudad; }
    public void setCiudad(String ciudad) { this.ciudad = ciudad; }
    public String getCasa() { return casa; }
    public void setCasa(String casa) { this.casa = casa; }
    public int getNumHombres() { return numHombres; }
    public void setNumHombres(int numHombres) { this.numHombres = numHombres; }
    public int getNumMujeres() { return numMujeres; }
    public void setNumMujeres(int numMujeres) { this.numMujeres = numMujeres; }
    public int getNumAncianosHombres() { return numAncianosHombres; }
    public void setNumAncianosHombres(int numAncianosHombres) { this.numAncianosHombres = numAncianosHombres; }
    public int getNumAncianasMujeres() { return numAncianasMujeres; }
    public void setNumAncianasMujeres(int numAncianasMujeres) { this.numAncianasMujeres = numAncianasMujeres; }
    public int getNumNinos() { return numNinos; }
    public void setNumNinos(int numNinos) { this.numNinos = numNinos; }
    public int getNumNinas() { return numNinas; }
    public void setNumNinas(int numNinas) { this.numNinas = numNinas; }
    public int getNumHabitaciones() { return numHabitaciones; }
    public void setNumHabitaciones(int numHabitaciones) { this.numHabitaciones = numHabitaciones; }
    public int getNumCamas() { return numCamas; }
    public void setNumCamas(int numCamas) { this.numCamas = numCamas; }
    public boolean isTieneAgua() { return tieneAgua; }
    public void setTieneAgua(boolean tieneAgua) { this.tieneAgua = tieneAgua; }
    public boolean isTieneLuz() { return tieneLuz; }
    public void setTieneLuz(boolean tieneLuz) { this.tieneLuz = tieneLuz; }
    public boolean isTieneAlcantarillado() { return tieneAlcantarillado; }
    public void setTieneAlcantarillado(boolean tieneAlcantarillado) { this.tieneAlcantarillado = tieneAlcantarillado; }
    public boolean isTieneGas() { return tieneGas; }
    public void setTieneGas(boolean tieneGas) { this.tieneGas = tieneGas; }
    public boolean isTieneOtrosServicios() { return tieneOtrosServicios; }
    public void setTieneOtrosServicios(boolean tieneOtrosServicios) { this.tieneOtrosServicios = tieneOtrosServicios; }
    public String getNombreSensador() { return nombreSensador; }
    public void setNombreSensador(String nombreSensador) { this.nombreSensador = nombreSensador; }
}