package tp1.Ejercicio4_01;

import tp1.MySimpleLinkedList;

import java.util.ArrayList;

public class main {
    private ArrayList<T> lista1;
    private ArrayList<T> lista2;
    public ArrayList<T> ordenarListaManual(ArrayList<T> nueva){
        for (int i = 0; i < nueva.size(); i++) {
            for (int j = 0; j < nueva.size()-1; j++) {
                if (nueva[j]> nueva[j+1]){
                    T temp=
                    nueva[j],nueva[j+1] = nueva[j],nueva[j+1];
                }

            }
        }
        return nueva;
    }
    // ordenar 2 listas desordenadas
    public ArrayList<T> ordenarDosListasDesordenadas() {

    }
}
