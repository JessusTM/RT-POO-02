package NoPasarNullArgumento;

public class MainBuenaPractica {

    // ===== MAIN =====
    public static void main(String[] args) {
        String cadena 	= null;
        imprimirTamanio(cadena);
    }

    // ===== MÉTODO TAMAÑO CADENA =====
    public static void imprimirTamanio(String cadena) {
        try {
            if (cadena == null) {
                throw new IllegalArgumentException("La cadena no puede ser null");
            }
            System.out.println("Tamaño de la cadena: " + cadena.length());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
