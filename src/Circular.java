
public class Circular<E> extends ListaAbstracta<E> {
    protected Nodo<E> tail
    ;
    protected int counter;

    public Circular()
    // pre: constructs a new circular list
    {
        tail = null;
        counter = 0;
    }

    public void addFirst(E value)
    // pre: value non-null
    // post: adds element to head of list
    {
        Nodo<E> temp = new Nodo<E>(value);
        if (tail == null) { // first value added
            tail = temp;
            tail.setNext(tail);
        } else { // element exists in list
            temp.setNext(tail.next());
            tail.setNext(temp);
        }
        counter++;
    }


    public void addLast(E value)
    // pre: value non-null
    // post: adds element to tail of list
    {
        // new entry:
        addFirst(value);
        tail = tail.next();
    }


    // lo dificil es quitar el elemento de la fila

    public E removeLast()
    // pre: !isEmpty()
    // post: returns and removes value from tail of list
    {
        Nodo<E> finger = tail;
        while (finger.next() != tail) {
            finger = finger.next();
        }
        // finger now points to second-to-last value
        Nodo<E> temp = tail;
        if (finger == tail)
        {
            tail = null;
        } else {
            finger.setNext(tail.next());
            tail = finger;
        }
        counter--;
        return temp.value();
    }


}
