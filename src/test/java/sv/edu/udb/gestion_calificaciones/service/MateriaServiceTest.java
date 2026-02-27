package sv.edu.udb.gestion_calificaciones.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MateriaServiceTest {

    @Autowired
    private MateriaService service;

    @Test
    void listaNoDebeSerNula() {
        assertNotNull(service.obtenerMaterias());
    }

    @Test
    void promedioDebeSerCorrecto() {
        double promedio = service.calcularPromedio();
        assertEquals(8.9, promedio, 0.1);
    }
}