package com.jarry.proyecto.servicio;

import com.jarry.proyecto.modelo.Censo;
import java.util.List;

public interface CensoService {
    List<Censo> listarTodos();
    Censo guardar(Censo censo);
    Censo obtenerPorId(Long id);
    void eliminar(Long id);
}