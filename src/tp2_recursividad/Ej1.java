package tp2_recursividad;

import java.util.ArrayList;

public class Ej1 {
    public static void main(String[] args) {
        ArrayList<Integer> nuevo = new ArrayList<>();
        // O(n)
        public static boolean estaOrdenado(ArrayList<Integer> nuevo){
            boolean salida=true;
            int i =0;
            while(i< nuevo.size()){
                int siguiente=nuevo.get(i+1);
                if (nuevo.get(i)< siguiente){
                    salida=false;
                }
                i++;
            }
            return ;
        }
        //SI fuera una lista indexada  O(N²) en tiempo, ya que cada comparación requiere recorrer la lista hasta cierto punto.
    }
}
