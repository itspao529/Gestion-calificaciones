package sv.edu.udb.gestion_calificaciones.service;

import org.springframework.stereotype.Service;
import sv.edu.udb.gestion_calificaciones.repository.MateriaRepository;
import sv.edu.udb.gestion_calificaciones.repository.domain.Materia;

import java.util.List;

@Service
public class MateriaService {

    private final MateriaRepository repository;

    public MateriaService(MateriaRepository repository) {
        this.repository = repository;
    }

    public List<Materia> obtenerMaterias() {
        return repository.findAll();
    }

    public double calcularPromedio() {
        List<Materia> materias = repository.findAll();

        return materias.stream()
                .mapToDouble(Materia::getNota)
                .average()
                .orElse(0.0);
    }
}