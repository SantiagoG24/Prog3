package tp2_1;

import java.util.ArrayList;

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

            root.insertarElemento(element);
        }
        public boolean delete(int element) {
            if (root.getValor()==element) {
                root.acomodarNMI();
                return true;
            }else {
                return root.delete(element);
            }
        }
        public Integer getSumaArbolBinario() {
            return root.getSumaRama();
        }
        public ArrayList<Integer> getHojasMayorAValor(Integer k){
            if (root.getValor()== null){
                return new ArrayList<>();
            }
            return root.getHojasMayor(k);
        }
        //ej5 del practico lo hago con int para no cambiar en todos lados a String
        //public ArrayList<Integer> getCantidadOcurrencias(int i){
        //  if (root.getValor() == null) {
        //    ArrayList<Integer> ocurrencias = new ArrayList<>();
        //  ocurrencias.add(1);
        //ocurrencias.add(3);
        //ocurrencias.add(5);
        //ocurrencias.add(7);
        //ocurrencias.add(9);
        //ArrayList<Integer> salida = root.getCantidadOcurrenciasRama();
        //}
        //for ()
        //return 0;
        //}
}
