package tp1;

public class Node<T> {

	private T info;
	private Node<T> next;

	public Node() {
		this.info = null;
		this.next = null;
	}
	
	public Node(T info, Node<T> next) {
		this.setInfo(info);
		this.setNext(next);
	}

	public boolean hasNext() {
		return next!=null;
	}
	
	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	public T getInfo() {
		return info;
	}

	public void setInfo(T info) {
		this.info = info;
	}
	public T get(int index){
		if (index==0){
			return this.info;
		}
		if (hasNext()){
			return this.next.get(index-1);
		}
		return null;

	}
	public int size(int i){
		if (hasNext()){
			return i;
		}else {
			return next.size(i + 1);
		}

	}
	public int indexOf(int contador,T info){
		if (this.equals(info)){
			return contador;
		}else {
			if (hasNext()){
				return next.indexOf(contador+1,info);
			}else{
				return -1;
			}
		}
	}
	@Override
	public boolean equals(Object obj) {
		try{
			T nuevo=(T)obj;
			return this.info.equals(nuevo);
		}
		catch (Exception e){
			return false;
		}
	}

	public String toString(String salida) {
		salida+="["+info+"]";
		if (hasNext()){
			return salida;
		}else {
			return next.toString(salida);
		}
	}
}
