package classes;

import static org.junit.Assert.assertEquals; // Importa o verificador
import org.junit.Test;                        // Importa a anotação de teste

public class SimuladorTest {

    @Test
    public void testarMago() {
        Arcanista mago = new Arcanista("Mago Teste", 5);
        
        // Agora o assertEquals vem da biblioteca org.junit.Assert
        assertEquals(160, mago.getVida());
    }
}