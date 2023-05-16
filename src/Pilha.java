
import java.util.ArrayList;
public class Pilha<T> {
	int size;
	boolean isempty;
	ArrayList<T> lista = new ArrayList<>();
	public T pop(){
		return lista.remove(size()-1);
		}
	public int size() {
		size++;
		return size;
		}
	public void push(T add){
		lista.add(add);
		}
	public boolean isEmpty() {
		if(size()-1 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	public T top() {
		return lista.get(size()-1);
	}
}

