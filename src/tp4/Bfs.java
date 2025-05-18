package tp4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Queue;

public class Bfs {
    private Queue<Integer> cola;
    private Grafo grafo;
    private HashSet<Integer> visitados;

    public void Bfs(Grafo grafo) {
        cola.clear();
        this.grafo = grafo;
        Iterator<Integer> iterador=grafo.obtenerVertices();
        visitados= new HashSet<>();
        while (iterador.hasNext()) {
            if (!visitados.contains(iterador.next())){
                Visit_Bfs( iterador.next());
            }
        }
    }
    public void Visit_Bfs(Integer v) {
        visitados.add(v);
        cola.add(v);
        while (!cola.isEmpty()) {
            Iterator<Integer> adyacentes = grafo.obtenerAdyacentes(v);
            while (adyacentes.hasNext()) {
                if (!visitados.contains(adyacentes.next())){
                    visitados.add(adyacentes.next());
                    cola.add(adyacentes.next());
                }
            }
        }

    }

}
