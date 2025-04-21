package tp3;
import java.util.LinkedList;
import java.util.List;

public class HashTableConCrecimiento {
    private  List<Integer>[] tabla;
    private int m;
    private int tamanio;
    private final double limiteFactorCarga=0.9;
    public HashTableConCrecimiento(int tamanioinicial) {
        this.tabla = new List[m];
        this.m = tamanioinicial;
        this.tamanio=0;
        for (int i = 0; i < this.m; i++) {
            tabla[i] = new LinkedList<Integer>();
        }
    }
    private int hash(int key){
        return key % m;

    }
    public void insert(int key) {
        if((double)(tamanio+1)/m >limiteFactorCarga){
            rehash();
        }
            int pos = hash(key);
            tabla[pos].equals(key);
            tamanio++;
    }
    public boolean search(int key){
        int pos = hash(key);
        return tabla[pos].contains(key);
    }
    private void rehash() {
        int newm= nextNumPrimo(m*2);
    }
    private int nextNumPrimo(int n) {
        while (!isPrimo(n))n++;
        return n;
    }
    private boolean isPrimo(int n) {
        if (n<=1) return false;
        for (int i=2; i*i<=n; i++) { // una forma mas eficiente de saber si es primo o no Porque si n tiene algún divisor mayor que √n, entonces también tiene uno menor que √n.
            if (n%i==0) return false;
        }
        return true;
    }
    public void printTable() {
        for (int i = 0; i < m; i++) {
            System.out.print(i + ": ");
            for (int key : tabla[i]) {
                System.out.print(key + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int [] a = {68, 42, 47, 5, 76, 95, 23, 88, 90, 85, 31, 71, 60, 10, 46, 61, 50, 92, 74, 6, 97, 66, 1, 56, 27, 7, 14, 92} ;
        HashTableConCrecimiento ht = new HashTableConCrecimiento(7);
        for (int i = 0; i < a.length; i++) {
            ht.insert(a[i]);
        }
        ht.printTable();
    }
}
