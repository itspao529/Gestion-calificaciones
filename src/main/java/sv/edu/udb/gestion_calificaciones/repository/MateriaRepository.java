package sv.edu.udb.gestion_calificaciones.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sv.edu.udb.gestion_calificaciones.repository.domain.Materia;

@Repository
public interface MateriaRepository extends JpaRepository<Materia, Long> {
}