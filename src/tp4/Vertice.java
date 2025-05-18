package tp4;

import java.util.ArrayList;
import java.util.Objects;

public class Vertice<T> {
    private int id;
    private ArrayList<Arco<T>> adyacentes;

    public Vertice(int id) {
        this.id = id;
        this.adyacentes = new ArrayList<>();
    }
    public void addAdyacente(Arco arco) {
        adyacentes.add(arco);
    }
    public boolean esAdyacente(int vertice) {
        for (Arco<T> adyacente:this.getAdyacentes()) {
            if(adyacente.getVerticeDestino() == vertice) {
                return true;
            }
        }
        return false;
    }
    public ArrayList<Arco<T>> getAdyacentes() {
        return new ArrayList<Arco<T>>(adyacentes);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vertice<T> vertice = (Vertice<T>) o;
        return id == vertice.id && Objects.equals(adyacentes, vertice.adyacentes);
    }
}
