

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
    public E pop() {
        return num.remove(size() - 1);
    }
    /**
     * @param agregua
     */
    public void push(E item) {
        num.add(item);
    }
    /**
     * @param size
     */
    public int size() {
        return num.size();
    }
    /**
     * 
     */
    public boolean isEmpty(){
        if(this.num.isEmpty()){
            return true;
       
        }
        else{
            return false;
           
        }
    }



}
