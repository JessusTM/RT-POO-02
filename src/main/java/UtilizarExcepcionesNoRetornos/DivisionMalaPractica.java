package UtilizarExcepcionesNoRetornos;

public class DivisionMalaPractica {

    // ===== MÉTODO MAIN =====
    public static void main(String[] args) {
        realizarDivision(10, 0);
    }

    // ===== MÉTODO REALIZAR DIVISIÓN =====
    public static void realizarDivision(int dividendo, int divisor) {
        int resultado;
        if (divisor == 0) {
            System.out.println(" Error, divisor igual a 0");
            resultado = -1;
        } else {
            resultado = dividendo / divisor;
        }

        if (resultado != -1) {
            System.out.println(" La división es: " + resultado);
        }
    }
}
