package com.jarry.proyecto.controlador;

import com.jarry.proyecto.modelo.Censo;
import com.jarry.proyecto.servicio.CensoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/censos")
public class CensoController {

    @Autowired
    private CensoService servicio;

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("listaCensos", servicio.listarTodos());
        return "censos/lista";
    }

    @GetMapping("/nuevo")
    public String mostrarFormulario(Model model) {
        model.addAttribute("censoObjeto", new Censo());
        return "censos/formulario";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute("censoObjeto") Censo censo) {
        // Validación en caso de que los checkboxes vengan vacíos desde el HTML
        if(censo.getTieneAgua() == null) censo.setTieneAgua(false);
        if(censo.getTieneLuz() == null) censo.setTieneLuz(false);
        if(censo.getTieneAlcantarillado() == null) censo.setTieneAlcantarillado(false);
        if(censo.getTieneGas() == null) censo.setTieneGas(false);
        if(censo.getTieneOtrosServicios() == null) censo.setTieneOtrosServicios(false);

        servicio.guardar(censo);
        return "redirect:/censos";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        model.addAttribute("censoObjeto", servicio.obtenerPorId(id));
        return "censos/formulario";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {
        servicio.eliminar(id);
        return "redirect:/censos";
    }
}