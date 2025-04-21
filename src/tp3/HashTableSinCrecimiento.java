package tp3;

public class HashTableSinCrecimiento {
    private  Integer [] tabla;
    private int m;
    private int rp; // ranuras primarias o estaticas
    private int rs; // estructura secundaria o lista de rebalse
    public HashTableSinCrecimiento(int m, int rp, int rs) {
        this.tabla = new Integer[m];
        this.m = m;
        this.rp = rp;
        this.rs = rs;
    }

    public HashTableSinCrecimiento() {
        this.tabla = new Integer[7];
        this.m = 7;
        this.rp = 1;
        this.rs = 1;
    }
    public int hash(int key) {
        return key % this.m;
    }
    public boolean insert(int key) {
        for (int i = 0; i < this.m; i++) {
            int pos =(hash(key) +rp *i +rs*i*i)%this.m;

            if (tabla[pos] == null) {
                tabla[pos] = key;
                return true;
            }
        }
        return false;
    }
    public boolean search(int key) {
        for (int i = 0; i < this.m; i++) {
            int pos =(hash(key) +rp *i +rs*i)%this.m;
            if (tabla[pos] == null)return false;
            if (tabla[pos].equals(key)) return true;
        }
        return false;
    }
    public void printTable() {
        for (int i = 0; i < this.m; i++) {
            System.out.println(i + ": " + tabla[i]);
        }
    }
    public static void main(String[] args) {
        int [] a = {68, 42, 47, 5, 76, 95, 23, 88, 90, 85, 31, 71, 60, 10, 46, 61, 50, 92, 74, 6, 97, 66, 1, 56, 27, 7, 14, 92} ;
        HashTableSinCrecimiento ht = new HashTableSinCrecimiento();
        for (int i = 0; i < a.length; i++) {
            ht.insert(a[i]);
        }
        ht.printTable();
    }
}
