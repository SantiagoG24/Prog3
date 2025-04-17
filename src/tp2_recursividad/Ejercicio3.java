package tp2_recursividad;

public class Ejercicio3 {
    public static String covertirABinario(int numero) {
        if (numero  == 0) {
            return "0";
        }
        return covertirABinarioRecursivo(numero);
    }
    public static String covertirABinarioRecursivo(int numero) {
        if (numero == 0) {
            return "";
        }
        return covertirABinarioRecursivo(numero /2) + (numero % 2);
    }

    public static void main(String[] args) {
        int numero = 13;
        String binario = covertirABinario(numero);
        System.out.println(binario);

    }
}
