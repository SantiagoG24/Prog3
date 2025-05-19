package Tp_especial;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Solucion {
    private Set<ArrayList<Maquina>> soluciones;
    private List<Maquina> maquinas;
    private int cantidadEstadosGenerados;
    private int menorMaquinasUsadas;
    private String metodo;

    public String getMetodo() {
        return metodo;
    }
    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public int getMenorMaquinasUsadas() {
        return menorMaquinasUsadas;
    }
    public boolean setMenorMaquinasUsadas(int menorMaquinasUsadas) {
        if (this.menorMaquinasUsadas > menorMaquinasUsadas) {
            this.menorMaquinasUsadas = menorMaquinasUsadas;
            return true;
        }
        return false;
    }
    public int getCantidadEstadosGenerados() {
        return cantidadEstadosGenerados;
    }

    public void setCantidadEstadosGenerados(int cantidadEstadosGenerados) {
        this.cantidadEstadosGenerados = cantidadEstadosGenerados;
    }

    public Solucion backtracking(int piezas,ArrayList<Maquina> maquinas) {
        this.maquinas= maquinas;
        ArrayList<Maquina> solucionParcial= new ArrayList<>();
        backtrackingRecursivo(piezas,solucionParcial,0);
        return this;
    }
    public void backtrackingRecursivo(int total,ArrayList<Maquina> solucionParcial,int indice) {
        int suma=CalcularSumaParcial(solucionParcial);
        if (suma==total) {
            soluciones.add(new ArrayList<>(solucionParcial));
            return;
        }
        if (suma>total) {
            return;
        }
        for (int i=indice; i<maquinas.size(); i++) {
            Maquina maquina = maquinas.get(i);
            solucionParcial.add(maquina);
            backtrackingRecursivo(total,solucionParcial,i);
            solucionParcial.removeLast();
        }
    }
    public int CalcularSumaParcial(ArrayList<Maquina> solucion) {
        int suma=0;
        for(int i=0;i<solucion.size();i++){
            suma+=solucion.get(i).getValor();
        }
        return suma;
    }
}
