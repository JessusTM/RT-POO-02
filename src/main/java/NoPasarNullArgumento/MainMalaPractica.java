package NoPasarNullArgumento;

public class MainMalaPractica {
    // ===== MAIN =====
    public static void main(String[] args) {
        String cadena = null;
        imprimirTamanio(cadena);
    }

    // ===== MÉTODO TAMAÑO CADENA =====
    public static void imprimirTamanio(String cadena) {
        System.out.println(" Tamaño de la cadena: " + cadena.length());
    }
}

