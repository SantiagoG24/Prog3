package tp2_recursividad;

public class Ejercicio5 {
    public static void main(String[] args) {
        int [] a = {-3,-1,0,2,4,6,10} ;
        System.out.println(verificarArreglo(a,0,a.length));
    }
    public static boolean verificarArreglo(int[] a,int inicio,int fin){
        if(inicio>fin){
            return false;
        }
        int medio = (inicio + fin) / 2;

        if (a[medio] == medio) {
            return true; // ¡Encontrado!
        } else if (a[medio] > medio) {
            // Buscar en la mitad izquierda
            return verificarArreglo(a, inicio, medio - 1);
        } else {
            // Buscar en la mitad derecha
            return verificarArreglo(a, medio + 1, fin);
        }
    }
}
