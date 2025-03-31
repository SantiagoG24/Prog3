package tp2_1;

public class ArbolBinario {
    private Nodo root = null;

    public ArbolBinario(Nodo raiz) {
        this.root = raiz;
    }

    public Nodo getRoot() {
        return root;
    }
    public boolean hasElement(Integer element) {

        return root.hasElement((java.lang.Integer) element);
    }
    public void insertElement(Integer element) {

        root.insertElement(element);
    }
    public boolean delete(int element) {
        if (root.getValor()==element) {
            root.acomodarNMI();
            return true;
        }else {
            return root.delete(element);
        }
    }
}
