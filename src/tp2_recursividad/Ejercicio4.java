package tp2_recursividad;

public class Ejercicio4 {
    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Función recursiva para imprimir los primeros N términos
    public static void imprimirFibonacci(int n, int actual) {
        if (actual >= n) return;
        System.out.print(fibonacci(actual) + " ");
        imprimirFibonacci(n, actual + 1);
    }

    public static void main(String[] args) {
        int n =6;
        imprimirFibonacci(n,0);
    }

}
