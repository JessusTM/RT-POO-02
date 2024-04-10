package UnConceptoPorPrueba;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatematicaTest {

    // ----- MALA PRÁCTICA -----
    @Test
    public void testSumaNumeros() {

        int resultado1 = Matematica.sumar(3 , 4 );
        assertEquals(7, resultado1);

        int resultado2 = Matematica.sumar(5 , -2);
        assertEquals(3, resultado2);

        int resultado3 = Matematica.sumar(-7,-3 );
        assertEquals(-10, resultado3);
    }



    // ----- BUENA PRÁCTICA -----
    @Test
    public void testSumaNumerosPositivos() {
        int resultado = Matematica.sumar(3, 4);
        assertEquals(7, resultado);
    }

    @Test
    public void testSumaNumerosPositivoNegativo() {
        int resultado2 = Matematica.sumar(5 , -2);
        assertEquals(3, resultado2);
    }

    @Test
    public void testSumaNumerosNegativos() {
        int resultado3 = Matematica.sumar(-7,-3 );
        assertEquals(-10, resultado3);
    }

}