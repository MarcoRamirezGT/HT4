/**
 * 
 * @author MAQUITO
 *
 * @param <E>
 */
public class Lista1<E> extends Pila<E>{

    private String tipo;
    private ListaAbstracta<E> NuevaLista;
    private Factory1<E> factory = new Factory1<>();

    /**
     * 
     * @param tipo
     */
    public Lista1(String tipo) {
        this.tipo = tipo;
        NuevaLista = factory.Crear(tipo);
    }

    /**
     * @param push
     */
    public void push(E item) {
        NuevaLista.addFirst(item);
    }
    /**
     * @param pop
     */
    public E pop() {
        return NuevaLista.removeFirst();
    }

    /**
     * @param sizw
     */
    public int size() {
        return NuevaLista.size();
    }

    /**
     * @param empty
     */
    public boolean isEmpty(){
        if(this.NuevaLista.isEmpty()){ //Se instancea
            return true;
            //Si el vector esta vacio se devolverá true
        }
        else{
            return false;
            //Si el vector no esta vacio se devolverá false
        }
    }




}
