package com.jarry.proyecto.servicio;

import com.jarry.proyecto.modelo.Censo;
import com.jarry.proyecto.repositorio.CensoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CensoServiceImpl implements CensoService {

    @Autowired
    private CensoRepository repositorio;

    @Override
    public List<Censo> listarTodos() { return repositorio.findAll(); }

    @Override
    public Censo guardar(Censo censo) { return repositorio.save(censo); }

    @Override
    public Censo obtenerPorId(Long id) { return repositorio.findById(id).orElse(null); }

    @Override
    public void eliminar(Long id) { repositorio.deleteById(id); }
}