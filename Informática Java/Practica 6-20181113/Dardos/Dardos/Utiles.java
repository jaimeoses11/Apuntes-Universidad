import java.util.Random;
import java.util.Scanner;
/**
 * Write a description of class alea here.
 * 
 * @author El profe
 * @version de regalo
 */
public class Utiles
{
    /* Probabilidades preasignadas a cada zona de la diana */
    private static final double PROB_FUERA=10.0;
    private static final double PROB_CENTRO_DOBLE=0.15;
    private static final double PROB_CENTRO_SIMPLE=0.85;
    private static final double PROB_NUMERO=4.45;  
    /* 10.0 + 0.15 + 0.85 + (4.45*20) = 100.0 (pues hay 20 números) */

    /* Probabilidades preasignadas a cada valor multiplicador */
    private static final double PROB_TRIPLE=9.25;
    private static final double PROB_DOBLE=15.0;
    //private static final double PROB_SIMPLE=75.75
    /* 9.25 + 15.0 + 75.75 = 100.0 */

    /**
     * Calcula aleatoriamente segun las probabilidades definidas el valor de la zona
     * de la diana en que se ha clavado el dardo
     */
    public static byte valorAleatorio()
    {
        double x=new Random().nextInt(10000)/100.0;
        byte resultado;

        if(x<PROB_FUERA)  // El dardo se ha clavado fuera de la diana
            resultado=0;
        else {    
            x-=PROB_FUERA;
            if(x<PROB_CENTRO_DOBLE)  // El dardo se ha clavado en el centro doble
                resultado=50;  
            else {
                x-=PROB_CENTRO_DOBLE;
                if(x<PROB_CENTRO_SIMPLE)  // El dardo se ha clavado en el centro simple
                    resultado=25; 
                else {      // El dardo se ha clavado en un numero
                    x-=PROB_CENTRO_SIMPLE;
                    resultado=(byte)(x/PROB_NUMERO+1);
                }
            }
        }
        return resultado;
    }

    /**
     * Calcula aleatoriamente segun las probabilidades definidas el valor del multiplicador
     * en que se ha clavado el dardo
     */
    public static byte multiplicadorAleatorio()
    {
        double x=new Random().nextInt(10000)/100.0;
        byte resultado;

        if(x<PROB_TRIPLE)  // El dardo se ha clavado en un triple
            resultado=3;
        else {
            x-=PROB_TRIPLE;
            if(x<PROB_DOBLE)   // El dardo se ha clavado en un doble
                resultado=2;
            else       // El dardo se ha clavado en un simple
                resultado=1;
        }
        return resultado;
    }

    /**
     * Hace una pausa en el programa hasta que el usuario pulse la tecla <Enter>
     */
    public static void Pausa()
    {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Pulse <Enter> para continuar");
        teclado.nextLine();
    }
}
