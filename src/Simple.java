
public class Simple<E> extends ListaAbstracta<E> {
    protected int counter;
    protected Nodo<E> first;
    /**
     * @param Simple
     */
    public Simple()

    {
        first = null;
        counter = 0;
    }
    /**
     * @param size
     */
    public int size()

    {
        return counter;
    }
    /**
     * @param addFirst
     */
    public void addFirst(E value)

    {

        first = new Nodo<E>(value, first);
        counter++;
    }
    /**
     * @param removeFirst
     */
    public E removeFirst()

    {
        Nodo<E> temp = first;
        first = first.next();
        counter--;
        return temp.value();
    }
    /**
     * 
     * @return
     */
    public E getFirst()

    {
        return first.value();
    }
    /**
     * 
     * @param value
     */
    public void addLast(E value)

    {

        Nodo<E> temp = new Nodo<E>(value,null);
        if (first != null)
        {
            // pointer to possible tail
            Nodo<E> finger = first;
            while (finger.next() != null)
            {
                finger = finger.next();
            }

            finger.setNext(temp);
        } else first = temp;

        counter++;

    }
    /**
     * 
     * @param value
     * @return
     */
    public boolean contains(E value)

    {
        Nodo<E> finger = first;

        while (finger != null &&
                !finger.value().equals(value))
        {
            finger = finger.next();
        }
        return finger != null;
    }

}
