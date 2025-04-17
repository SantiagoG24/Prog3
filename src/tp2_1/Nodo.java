package tp2_1;

import java.util.ArrayList;

public class Nodo {
    private Integer valor;
    private Nodo izquierda;
    private Nodo derecha;

    public Nodo(Integer valor, Nodo izquierda, Nodo derecha) {
        this.valor = valor;
        this.izquierda = izquierda;
        this.derecha = derecha;
    }

    public Nodo(Integer valor) {
        this.valor = valor;
    }

    public Integer getValor() {
        return valor;
    }

    public Integer getIzquierda() {
        return izquierda.getValor();
    }

    public Integer getDerecha() {
        return derecha.getValor();
    }


    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }

    public boolean hasElement(Integer elemento  ) {
        elemento=(int) elemento;
        if (valor==elemento){
            return true;
        }
        if (izquierda.hasElement(elemento)==true){
            return true;
        }
        return derecha.hasElement(elemento) == true;
    }
    public boolean isTerminalNodo(){
        if (this.isEmpty()){
            return true;
        }else {
            return false;
        }
    }
    public boolean isEmpty(){
        return (izquierda==null&&derecha==null);
    }
    public void insertarElemento(Integer elemento){
        if (valor==null){
            valor=elemento;
        }
        if (elemento< this.getIzquierda()) {
            izquierda.insertarElemento(elemento);
        }else if(elemento> this.getDerecha()){
            derecha.insertarElemento(elemento);
        }
    }
    //nmi= nodo mas a la izquierda
    public Integer acomodarNMI(){
        return derecha.getNMI();
    }
    public Integer getNMI(){
        if (izquierda.isTerminalNodo()){
            return izquierda.getValor();
        }else {
            return izquierda.getNMI();
        }
    }
    public boolean delete(int elemento){
        if (valor==elemento){
            if (isTerminalNodo()){
                valor=null;
            }
            valor=acomodarNMI();
        }
        return false;
    }
    public Integer getSumaRama(){
        Integer sumaRama=valor;
        if (izquierda!=null){
            sumaRama=izquierda.getSumaRama();
        }
        if (derecha!=null){
            sumaRama+=derecha.getSumaRama();
        }
        return sumaRama;
    }
    public ArrayList<Integer> getHojasMayor(Integer k){
        if (valor<k){
            return derecha.getHojasMayor(k);
        }else if(this.isTerminalNodo()&& valor>k){
            return  new ArrayList<>(valor);
        }
        else {
            ArrayList<Integer> salida = new ArrayList<>();
            if (izquierda.valor>=k){
                if (izquierda.isTerminalNodo()){
                    salida.add(izquierda.getValor());
                }else {
                    salida.addAll(izquierda.getHojasMayor(k));
                }
            }
            if (derecha.isTerminalNodo()){
                salida.add(derecha.getValor());
            }else {
                salida.addAll(derecha.getHojasMayor(k));
            }
            return salida;
        }
    }
    public void setValorInterno(){
        if (izquierda==null && derecha!=null){
            valor=derecha.getValor();
        }else if (izquierda!=null && derecha==null){
            valor=izquierda.getValor();
        }else {
            valor = derecha.getValor() - izquierda.getValor();
        }
    }
}
