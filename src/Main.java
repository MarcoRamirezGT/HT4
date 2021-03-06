/**
 * @author Marco Ramirez 19588
 * @author Estefania Barrio 
 * @version FINAL
 * 
 */
//Algoritmos y estructura de datos 
//Hoja de trabajo 4
import java.io.File;
import java.io.*;
import java.util.Scanner;
import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) {
    	/**
    	 * 
    	 */
        double x = 0;
        double y = 0;
        double res = 0;
        boolean reader = false;
        boolean op = false;
        String line = null;
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        Scanner teclado = new Scanner(System.in);
        Calculadora calculadora = Calculadora.getCalculatorInstance();
        Pila pila = null;
        Factory1<String> factory = new Factory1<String>();

        System.out.println("Ingrese direccion de su archivo:");
        String direccionDeArchivo = teclado.nextLine();


        try {
          

            archivo = new File(direccionDeArchivo);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
                reader = true;
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Archivo no encontrado");
        }

      
        if (reader == true) {
            System.out.println("Elija que desea utlizar");
            System.out.println("1. ArrayList");
            System.out.println("2. Vector");
            System.out.println("3. Lista.");
            System.out.println("");

            int opcion = teclado.nextInt();
            teclado.nextLine();

            if (opcion == 1) {
                pila = factory.CrearPila("A");
                op = true;
            }

            if (opcion == 2) {
                pila = factory.CrearPila("V");
                op = true;

            }
            if (opcion == 3) {
                System.out.println("Elija que tipo de lista desea utilizar");
                System.out.println("1. Simplemente encadenadas");
                System.out.println("2. Doblemente encadenadas");
                System.out.println("3. Lista circular.");
                System.out.println("");
                int eleccion = teclado.nextInt();
                teclado.nextLine();

                if (eleccion == 1) {
                    pila = new Lista1<String>("Simple");
                    op = true;
                }
                if (eleccion == 2) {
                    pila = new Lista1<String>("Doble");
                    op = true;

                }
                if (eleccion == 3) {
                    pila = new Lista1<String>("Circular");
                    op = true;

                }

            }


            if (op == true) {
                char[] data = line.toCharArray();

                for (int i = 0; i < data.length; i++) {
                    switch (data[i]) {
                        case '+':
                            if (pila.size() <= 1) {
                                System.out.println("No hay suficientes operandos para realizar la operacion. El siguiente resultado esta incorrecto debido a esto.");
                            } else {
                                x = (double) pila.pop();
                                y = (double) pila.pop();
                                res = calculadora.sumar(x, y);
                                pila.push(res);
                            }
                            break;
                        case '-':
                            if (pila.size() <= 1) {
                                System.out.println("No hay suficientes operandos para realizar la operacion. El siguiente resultado está incorrecto debido a esto.");
                            } else {
                                x = (double) pila.pop();
                                y = (double) pila.pop();
                                res = calculadora.restar(x, y);
                                pila.push(res);
                            }
                            break;
                        case '*':
                            if (pila.size() <= 1) {
                                System.out.println("No hay suficientes operandos para realizar la operación. El siguiente resultado está incorrecto debido a esto.");
                            } else {
                                x = (double) pila.pop();
                                y = (double) pila.pop();
                                res = calculadora.multiplicar(x, y);
                                pila.push(res);
                            }
                            break;
                        case '/':
                            if (pila.size() <= 1) {
                                System.out.println("No hay suficientes operandos para realizar la operación. El siguiente resultado está incorrecto debido a esto.");
                            } else {
                                x = (double) pila.pop();
                                y = (double) pila.pop();
                                if (y == 0) {
                                    System.out.println("Está tratando de dividir entro de cero.");
                                } else {
                                    res = calculadora.dividir(x, y);
                                    pila.push(res);
                                }
                                break;
                            }
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                        case '0':
                            double pusher = Character.getNumericValue(data[i]);
                            pila.push(pusher);
                            break;
                        default:
                            break;
                    }
                }
                res = (double) pila.pop();
                System.out.println(res);
            }


        }
    }
}





