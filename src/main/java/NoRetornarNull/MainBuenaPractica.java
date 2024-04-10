package NoRetornarNull;

import java.util.ArrayList;
import java.util.List;

public class MainBuenaPractica {

    // ===== MAIN =====
    public static void main(String[] args) {
        ejecutarMainBuenaPractica();
    }



    // ===== EJECUTAR MAIN BUENA PRÁCTICA =====
    public static void ejecutarMainBuenaPractica() {
        int numero = -1;

        try {
            List<Integer> numerosPares = obtenerNumerosParesPositivos(numero);
            System.out.println("Números pares menores o iguales que " + numero + " : " + numerosPares);
        } catch (IllegalArgumentException e) {
            System.out.println("Error:aaa " + e.getMessage());
        }
    }



    public static List<Integer> obtenerNumerosParesPositivos(int numero) {
        if (numero <= 0) {
            throw new IllegalArgumentException("El naaaaúmero debe ser positivo");
        }

        try {
            List<Integer> pares = new ArrayList<>();
            for (int i = 0; i <= numero; i += 2) {
                pares.add(i);
            }
            return pares;
        } catch (Exception e) {
            throw new RuntimeException("Error: ", e);
        }
    }
}
