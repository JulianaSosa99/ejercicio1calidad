package calculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraDescuentosTest {

    @Test
    void testDescuentoPorcentaje() {
        CalculadoraDescuentos calc = new CalculadoraDescuentos();
        double resultado = calc.aplicarDescuentoPorcentaje(100, 10);
        assertEquals(90, resultado);
    }
    
   @Test
    void testDescuentoCeroPorcentaje() {
        CalculadoraDescuentos calc = new CalculadoraDescuentos();
        assertEquals(100, calc.aplicarDescuentoPorcentaje(100, 0));
    }

}
