package com.jarry.proyecto.modelo;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDate;

@Entity
@Table(name = "censos")
public class Censo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate fecha;

    private String pais;
    private String departamento;
    private String ciudad;
    private String casa;

    private Integer numHombres;
    private Integer numMujeres;
    private Integer numAncianosHombres;
    private Integer numAncianasMujeres;
    private Integer numNinos;
    private Integer numNinas;
    private Integer numHabitaciones;
    private Integer numCamas;

    private Boolean tieneAgua;
    private Boolean tieneLuz;
    private Boolean tieneAlcantarillado;
    private Boolean tieneGas;
    private Boolean tieneOtrosServicios;

    private String nombreSensador;

    public Censo() {}

    // Getters y Setters
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
    public Integer getNumHombres() { return numHombres; }
    public void setNumHombres(Integer numHombres) { this.numHombres = numHombres; }
    public Integer getNumMujeres() { return numMujeres; }
    public void setNumMujeres(Integer numMujeres) { this.numMujeres = numMujeres; }
    public Integer getNumAncianosHombres() { return numAncianosHombres; }
    public void setNumAncianosHombres(Integer numAncianosHombres) { this.numAncianosHombres = numAncianosHombres; }
    public Integer getNumAncianasMujeres() { return numAncianasMujeres; }
    public void setNumAncianasMujeres(Integer numAncianasMujeres) { this.numAncianasMujeres = numAncianasMujeres; }
    public Integer getNumNinos() { return numNinos; }
    public void setNumNinos(Integer numNinos) { this.numNinos = numNinos; }
    public Integer getNumNinas() { return numNinas; }
    public void setNumNinas(Integer numNinas) { this.numNinas = numNinas; }
    public Integer getNumHabitaciones() { return numHabitaciones; }
    public void setNumHabitaciones(Integer numHabitaciones) { this.numHabitaciones = numHabitaciones; }
    public Integer getNumCamas() { return numCamas; }
    public void setNumCamas(Integer numCamas) { this.numCamas = numCamas; }
    public Boolean getTieneAgua() { return tieneAgua; }
    public void setTieneAgua(Boolean tieneAgua) { this.tieneAgua = tieneAgua; }
    public Boolean getTieneLuz() { return tieneLuz; }
    public void setTieneLuz(Boolean tieneLuz) { this.tieneLuz = tieneLuz; }
    public Boolean getTieneAlcantarillado() { return tieneAlcantarillado; }
    public void setTieneAlcantarillado(Boolean tieneAlcantarillado) { this.tieneAlcantarillado = tieneAlcantarillado; }
    public Boolean getTieneGas() { return tieneGas; }
    public void setTieneGas(Boolean tieneGas) { this.tieneGas = tieneGas; }
    public Boolean getTieneOtrosServicios() { return tieneOtrosServicios; }
    public void setTieneOtrosServicios(Boolean tieneOtrosServicios) { this.tieneOtrosServicios = tieneOtrosServicios; }
    public String getNombreSensador() { return nombreSensador; }
    public void setNombreSensador(String nombreSensador) { this.nombreSensador = nombreSensador; }
}