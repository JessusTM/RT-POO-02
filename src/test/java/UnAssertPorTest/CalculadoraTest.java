package UnAssertPorTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

    // ----- MALA PRÁCTICA -----
    @Test
    public void testOperaciones() {
        Calculadora calc = new Calculadora();
        Assertions.assertEquals(5, calc.suma(2, 3));
        Assertions.assertEquals(3, calc.resta(5, 2));
    }


    // ----- BUENA PRÁCTICA -----
    @Test
    public void testSuma() {
        Calculadora calc = new Calculadora();
        Assertions.assertEquals(5, calc.suma(2, 3));
    }

    @Test
    public void testResta() {
        Calculadora calc = new Calculadora();
        Assertions.assertEquals(3, calc.resta(5, 2));
    }
}