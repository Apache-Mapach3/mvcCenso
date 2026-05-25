package com.jarry.proyecto.controlador;

import com.jarry.proyecto.modelo.Usuario;
import com.jarry.proyecto.servicio.UsuarioService; // Asegúrate de importar tu interfaz de servicio
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    // Ruta inicial
    @GetMapping("/")
    public String index() {
        return "index";
    }

    // Listar
    @GetMapping("/usuarios")
    public String listarUsuarios(Model model) {
        model.addAttribute("usuarios", usuarioService.listarTodos()); // Asegúrate que este método exista en tu servicio
        return "usuarios/listar"; // apunta al HTML
    }

    // Mostrar formulario para nuevo
    @GetMapping("/usuarios/nuevo")
    public String mostrarFormulario(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "usuarios/formulario";
    }

    // Guardar o Actualizar
    @PostMapping("/usuarios/guardar")
    public String guardarUsuario(@ModelAttribute("usuario") Usuario usuario) {
        usuarioService.guardar(usuario);
        return "redirect:/usuarios";
    }

    // Editar
    @GetMapping("/usuarios/editar/{id}")
    public String editarUsuario(@PathVariable Long id, Model model) {
        Usuario usuario = usuarioService.obtenerPorId(id);
        model.addAttribute("usuario", usuario);
        return "usuarios/formulario";
    }

    // Eliminar
    @GetMapping("/usuarios/eliminar/{id}")
    public String eliminarUsuario(@PathVariable Long id) {
        usuarioService.eliminar(id);
        return "redirect:/usuarios";
    }
}