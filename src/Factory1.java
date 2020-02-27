

public class Factory1<E> {


	/**
	 * 
	 * @param tipo
	 * @return
	 */
    public Pila CrearPila(String tipo) {
        Vector1 vector = new Vector1();
        Pila pila = null;


        if (tipo.equals("V")) {

            return new Vector1<E>();

        } if (tipo.equals("A")) {

            return new ArrayListAL<E>();
        }
        else {
            return null;
        }
    }
    /**
     * 
     * @param tipo
     * @return
     */
    public ListaAbstracta<E> Crear(String tipo){


        if (tipo =="Simple") {
            return new Simple<>();
        }


        else if(tipo =="Circular"){
            return new Circular<>();
        }

        else if(tipo =="Doble"){
            return new Doble<>();
        }

        return null;
    }
}
