package sv.edu.udb.gestion_calificaciones.repository.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "materia")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Materia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombreMateria;

    @Column(nullable = false)
    private double nota;

    @Column(nullable = false)
    private String ciclo;
}