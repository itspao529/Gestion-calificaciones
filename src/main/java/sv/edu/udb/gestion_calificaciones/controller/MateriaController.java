package sv.edu.udb.gestion_calificaciones.controller;

import org.springframework.web.bind.annotation.*;
import sv.edu.udb.gestion_calificaciones.service.MateriaService;
import sv.edu.udb.gestion_calificaciones.repository.domain.Materia;

import java.util.List;

@RestController
@RequestMapping("/materias")
public class MateriaController {

    private final MateriaService service;

    public MateriaController(MateriaService service) {
        this.service = service;
    }

    @GetMapping
    public List<Materia> listar() {
        return service.obtenerMaterias();
    }

    @GetMapping("/promedio")
    public double promedio() {
        return service.calcularPromedio();
    }
}