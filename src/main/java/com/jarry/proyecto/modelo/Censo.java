package com.jarry.proyecto.modelo;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Data                          // genera todos los getters y setters
@NoArgsConstructor             // genera el constructor vacío que JPA necesita
@Entity
@Table(name = "censos")
public class Censo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private LocalDate fecha;
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
}