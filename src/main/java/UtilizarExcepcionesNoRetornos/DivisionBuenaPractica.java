package UtilizarExcepcionesNoRetornos;

public class DivisionBuenaPractica {
    // ===== MAIN =====
    public static void main(String[] args) {
        realizarDivision(10, 0);
    }

    // ===== REALIZAR DIVISIÓN =====
    public static void realizarDivision(int dividendo, int divisor) {
        try {
            int resultado = dividendo / divisor;
            System.out.println("La división es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error, división por cero : " + "\"" + e.getMessage() + "\"");
        }
    }
}
