/**
 * 
 * @author MAQUITO
 *
 * @param <E>
 */
public abstract class ListaAbstracta<E> implements iLista<E> {

	/**
	 * 
	 * @return
	 */
    public E addFirst(){
        return null;
    }
    /**
     * @param removeFirst
     */
    public E removeFirst(){
        return null;

    }
    /**
     * @param addFirst
     */
    public void addFirst(E e){

    }
    /**
     * @param size
     */
    public int size(){
        return 0;
    }
    /**
     * @param isEmpty
     */
    public boolean isEmpty() {
        return size() == 0;
    }
}
