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
}//Test
