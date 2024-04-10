package NoRetornarNull;

import java.util.ArrayList;
import java.util.List;

public class MainMalaPractica {

    // ===== MAIN =====
    public static void main(String[] args) {
        ejecutarMainMalaPractica();
    }

    // ===== EJECUTAR MAIN BUENA PRÁCTICA =====
    public static void ejecutarMainMalaPractica() {
        Integer numero = -1;
        List<Integer> numerosPares = obtenerNumerosParesPositivos(numero);
        if (numerosPares != null) {
            System.out.println("Números pares menores o iguales que " + numero + " : " + numerosPares);
        }
    }

    // ===== LISTA NÚMEROS PARES POSITIVOS =====
    public static List<Integer> obtenerNumerosParesPositivos(Integer numero) {
        if (numero == null || numero < 0) {
            System.out.println("Error: El número debe ser positivo y no nulo");
            return null; // Retorna null si hazy un error
        }

        List<Integer> pares = new ArrayList<>();
        for (int i = 0; i <= numero; i += 2) {
            pares.add(i);
        }
        return pares;
    }
}
