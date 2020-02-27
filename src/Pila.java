
import java.util.*;

public abstract class Pila<E>implements iPila<E> {

    Vector<E> vector = new Vector<E>(); 
    /**
     * @param push
     */
    public void push(E item){
        this.vector.add(item); 
    }
    /**
     * @param pop
     */
    public E pop(){
        int algo = vector.size(); 
        return this.vector.remove(algo-1); 
    }
    /**
     * @param peek
     */
    public E peek(){
        int x = vector.size();
        return this.vector.get(x-1);
       
    }
    /**
     * @param isEmpty
     */
    public boolean isEmpty(){
        if(this.vector.isEmpty()){
            return true;
            
        }
        else{
            return false;
           
        }
    }
    /**
     * @param size
     */
    public int size(){
        return this.vector.size(); 
    }
}
