package tp4;

import java.util.Formattable;
import java.util.HashMap;
import java.util.Iterator;

public class Dfs {
    private Grafo grafo;
    private HashMap<Integer,String> visitados=new HashMap<Integer,String>();
    public Dfs(Grafo grafo) {
        this.grafo = grafo;
    }

    public Grafo getGrafo() {
        return grafo;
    }

    public void setGrafo(Grafo grafo) {
        this.grafo = grafo;
    }

    public boolean dfs(){
        Iterator<Integer> vertices= grafo.obtenerVertices();
        while (vertices.hasNext()){
            visitados.put(vertices.next(),"Blanco");
        }
        // recorro los vetices
        Iterator<Integer> vertices2= grafo.obtenerVertices();
        while (vertices2.hasNext()){
            int v=vertices2.next();
            if (visitados.get(v).equals("Blanco")){
                if(Visit_dfs(v)){
                    return true;
                }

            }
        }
        System.out.println("No tiene ciclo");
        return false;
    }
    private boolean Visit_dfs(int vertice){
        visitados.put(vertice,"Amarillo");

        Iterator<Integer> adyacentes = grafo.obtenerAdyacentes(vertice);
        while (adyacentes.hasNext()){
            int adyacenteId=adyacentes.next();
            String color=visitados.get(adyacenteId);
            if (color.equals("Blanco")){
                if (Visit_dfs(adyacenteId)){
                    return true;
                }
            } else if (color.equals("Amarillo")) {
                System.out.println("Encontre un ciclo");
                return true;
            }
        }
        visitados.put(vertice,"Negro");
        return false;
    }
}
