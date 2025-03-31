package tp2_1;

import java.security.PublicKey;

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
    public void insertarElement(Integer elemento){
        if (valor==null){
            valor=elemento;
        }
        if (elemento< this.getIzquierda()) {
            izquierda.insertarElement(elemento);
        }else if(elemento> this.getDerecha()){
            derecha.insertarElement(elemento);
        }
    }
    public Integer acomodarPorNMI(){
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
            valor=acomodarPorNMI();
        }
        return false;
    }


}
