package tp2_recursividad;

public class Ejercicio2 {
    public static int busquedaRecursividad(int[] arreglo,int objetivo,int inicio,int fin){
        if (inicio>fin){
            return -1;
        }
        int medio=(inicio+fin)/2;
        if(arreglo[medio]==objetivo){
            return medio;
        } else if (arreglo[medio]>objetivo) {
            return busquedaRecursividad(arreglo,objetivo,inicio,medio-1);
        }else {
            return busquedaRecursividad(arreglo, objetivo, medio+1, fin);
        }
    }

    public static void main(String[] args) {
        int[] arreglo = {1,3,5,6,8,10};
        int objetivo = 2;
        int resultado= busquedaRecursividad(arreglo,objetivo,0,arreglo.length-1);

        if (resultado != -1) {
            System.out.println("Elemento encontrado en el índice: " + resultado);
        } else {
            System.out.println("Elemento no encontrado.");
        }
    }
}
