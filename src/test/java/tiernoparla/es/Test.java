package tiernoparla.es;

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
}//Test
