package com.jarry.proyecto.servicio;

import com.jarry.proyecto.modelo.Usuario;
import com.jarry.proyecto.repositorio.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository repositorio;

    @Override
    public List<Usuario> listarTodos() { return repositorio.findAll(); }

    @Override
    public Usuario guardar(Usuario usuario) { return repositorio.save(usuario); }

    @Override
    public Usuario obtenerPorId(Long id) { return repositorio.findById(id).orElse(null); }

    @Override
    public void eliminar(Long id) { repositorio.deleteById(id); }
}