package tiernoparla.es;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Test {
    
    @BeforeEach
    static void crearArray() {

        ObrasDeArte.crearArray();
    }// crear array

    @Test
    void comprobarArray() {

        assertFalse(ObrasDeArte.getObras() == null);

    }// comprobar array Test

    // Probar que se añade una obra sin problemas y al final del array
    @Test
    void añadirObra() {

        int posicionPintura = 5;
        int idPintura = 6;
        ObrasDeArte pintura = new Pintura(idPintura, "pintura", "cesar", "escultura", "oleo", 50, 80, 100, 5, "desc1");

        ObrasDeArte.añadirObra(pintura);

        assertFalse(ObrasDeArte.getObras()[posicionPintura] == null);

        assertEquals(idPintura, ObrasDeArte.getObras()[posicionPintura].getId());

    }// añadir obras Test

    @Test
    void idRepetido() {

        int idRepetido = 1;

        assertEquals(true, ObrasDeArte.existeID(idRepetido));

        ObrasDeArte escultura = new Escultura(idRepetido, "pintura", "cesar", "escultura", "oleo", 50, 80, 100, 5,
                "desc1");
        assertThrows(IllegalArgumentException.class, () -> {
            ObrasDeArte.añadirObra(escultura);
        });
    }// id no se repita Test

    // Probar que el precio sea el esperado:
    @Test
    void comprobarPrecio() {

        int pos1 = 0, pos2 = 1, pos3 = 2;

        double precioObra1 = 1332.0;
        double precioObra2 = 261.0;
        double precioObra3 = 373.5;

        assertEquals(precioObra1, ObrasDeArte.getObras()[pos1].calcularPrecioFinal());
        assertEquals(precioObra2, ObrasDeArte.getObras()[pos2].calcularPrecioFinal());
        assertEquals(precioObra3, ObrasDeArte.getObras()[pos3].calcularPrecioFinal());
    }// probarprecio
}//Test
