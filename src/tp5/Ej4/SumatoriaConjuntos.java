package tp5.Ej4;

import java.util.*;

public class SumatoriaConjuntos {
    private Set<ArrayList<Integer>> soluciones;
    private ArrayList<Integer> numeros;

    public SumatoriaConjuntos() {
        soluciones=new HashSet<>();
    }
    public ArrayList<Integer> getNumeros() {
        return numeros;
    }

    public void setNumeros(ArrayList<Integer> numeros) {
        this.numeros = numeros;
    }

    public Set<ArrayList<Integer>> getBuscarTodasLasSoluciones(int total,ArrayList<Integer> numeros) {
        setNumeros(numeros);
        ArrayList<Integer> solucionActual= new ArrayList<>();
        getBuscarTodasLasSolucionesrec(total,solucionActual,0);
        return soluciones;
    }

    public void getBuscarTodasLasSolucionesrec(int total,ArrayList<Integer> solucionActual,int indice) {
        int suma = calcularSuma(solucionActual);
        if (suma == total) {
            // Guardamos una copia nueva para evitar referencias compartidas
            soluciones.add(new ArrayList<>(solucionActual));
            return;
        }

        if (suma > total) {
            return; // Poda
        }

        for (int i = indice; i < numeros.size(); i++) {
            int numero = numeros.get(i);
            solucionActual.add(numero);
            // NOTA: usamos el mismo índice para permitir repetir
            getBuscarTodasLasSolucionesrec(total, solucionActual,indice);
            solucionActual.remove(solucionActual.size() - 1); // backtrack
        }

    }
    private int calcularSuma(ArrayList<Integer> lista) {
        int suma = 0;
        for (int num : lista) suma += num;
        return suma;
    }

    public static void main(String[] args) {
        SumatoriaConjuntos sc = new SumatoriaConjuntos();

        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(2, 3, 5));
        int total = 8;

        Set<ArrayList<Integer>> soluciones = sc.getBuscarTodasLasSoluciones(total, numeros);

        for (ArrayList<Integer> sol : soluciones) {
            System.out.println(sol);
        }
    }
}
