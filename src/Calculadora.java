

public class Calculadora implements iCalculadora{

    private static Calculadora calculadora;

    private Calculadora(){

    }
/**
 * 
 * @return
 */

//Singleton
    public static Calculadora getCalculatorInstance(){
        if (calculadora==null){
            calculadora =new Calculadora();
        }
        return calculadora;
    }

    /**
     * 
     */
    public Calculadora clone() {
        try {
            throw new CloneNotSupportedException();
        }  catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
//Metodos a utilizar
    /**
     * @param sumar
     */
    public double sumar(double a, double b){
        return a+b; 
    }
/**
 * @param restar
 */
    public double restar(double a, double b){
        return a-b;
    }
/**
 * @param multiplicar
 */
    public double multiplicar(double a, double b){
        return a*b; 
    }
/**
 * @param dividir
 */
    public double dividir(double a, double b){
        return a/b; 
    }
}
