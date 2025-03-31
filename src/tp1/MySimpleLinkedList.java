package tp1;
public class MySimpleLinkedList<T> {
	private Node<T> first;
	
	public MySimpleLinkedList() {
		this.first = null;
	}
	
	public void insertFront(T info) {
		Node<T> tmp = new Node<T>(info,null);
		tmp.setNext(this.first);
		this.first = tmp;
	}
	
	public T extractFront() {
		//declaro al primero como la referencia que tiene el actual primero
		T salida = null;
		if (!isEmpty()) {
			salida = first.getInfo();
			first = first.getNext();
		}
		return salida;
	}

	public boolean isEmpty() {
		if (first == null) {
			return true;
		}else{
			return false;
		}
	}
	
	public T get(int index) {
		T salida= null;
		if(!isEmpty()) {
			salida = first.get(index);
		}
		return salida;
	}
	
	public int size() {
		if (!isEmpty()) {
			return first.size(0);
		}
		return 0;
	}
	public int indexOf(T t) {
		int index = 0;
		if (!isEmpty()) {
			return first.indexOf(index,t);
		}
		return -1;
	}
	@Override
	public String toString() {
		if (!isEmpty()) {
			return first.toString();
		}
		return "";
	}
	
}
