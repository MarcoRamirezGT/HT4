

import java.util.Vector;
public class Vector1<E> extends Pila<E> {
    Vector<E> num;
    /**
     * @param Vector1
     */
    public  Vector1(){
        num = new Vector<E>();
    }
    /**
     * @param pop
     */
    public E pop() {
        return num.remove(size()-1);
    }
    /**
     * @param push
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
     * @param isEmpty
     */
    public boolean isEmpty() {
        if (this.num.isEmpty()) { 
            return true;
          
        } else {
            return false;
            
        }
    }
}
