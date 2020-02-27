

import java.util.ArrayList;
import java.util.*;



public class ArrayListAL<E> extends Pila<E> {
    ArrayList<E> num;
    /**
     * @param Crea la lista
     */
    public ArrayListAL(){
        num = new ArrayList<E>();
    }
    /**
     * @param elimina
     */
    //elimina 
    public E pop() {
        return num.remove(size() - 1);
    }
    /**
     * @param agregua
     */
    //agrega
    public void push(E item) {
        num.add(item);
    }
    /**
     * @param size
     */
    //retorna el tamano
    public int size() {
        return num.size();
    }
    /**
     * 
     */
    //indica si esta vacio
    public boolean isEmpty(){
        if(this.num.isEmpty()){
            return true;
       
        }
        else{
            return false;
           
        }
    }



}
