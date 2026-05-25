package com.jarry.proyecto.controlador;

import com.jarry.proyecto.modelo.Censo;
import com.jarry.proyecto.servicio.CensoService; // Asegúrate de que este paquete coincida con el tuyo
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CensoController {

    @Autowired
    private CensoService censoService;

    // 1. Listar todos los registros del censo
    @GetMapping("/censos")
    public String listarCensos(Model model) {
        // Llama al servicio para obtener la lista y la envía a la vista HTML con el nombre "censos"
        model.addAttribute("censos", censoService.listarTodos());
        return "censos/listar";
    }

    // 2. Mostrar el formulario vacío para crear un nuevo registro
    @GetMapping("/censos/nuevo")
    public String mostrarFormulario(Model model) {
        // Envía un objeto Censo vacío para que el formulario HTML lo llene
        model.addAttribute("censo", new Censo());
        return "censos/formulario";
    }

    // 3. Guardar el registro (sirve tanto para crear como para actualizar)
    @PostMapping("/censos/guardar")
    public String guardarCenso(@ModelAttribute("censo") Censo censo) {
        censoService.guardar(censo);
        // Después de guardar, redirecciona a la lista principal
        return "redirect:/censos";
    }

    // 4. Mostrar el formulario con los datos precargados para editar
    @GetMapping("/censos/editar/{id}")
    public String editarCenso(@PathVariable Long id, Model model) {
        // Busca el censo por su ID y lo envía al formulario
        Censo censo = censoService.obtenerPorId(id);
        model.addAttribute("censo", censo);
        return "censos/formulario";
    }

    // 5. Eliminar un registro específico
    @GetMapping("/censos/eliminar/{id}")
    public String eliminarCenso(@PathVariable Long id) {
        censoService.eliminar(id);
        // Después de eliminar, redirecciona a la lista principal
        return "redirect:/censos";
    }
}