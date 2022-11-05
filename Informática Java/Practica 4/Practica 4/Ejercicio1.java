
/**
 * Write a description of class Ejercicio1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio1
{
    public static void main(String [] args){
        int d;
        int D;
        int c=0;
        double r;
        do{
            d=Teclado.leerEntero("Dividendo: ");
        } while(d<0);
        do{
            D=Teclado.leerEntero("Divisor: ");
        } while(D<0);
        System.out.println("Cociente: "+cociente(d,D));
    }
    public static int cociente(int a,int b){
        int c=0;
        do{
            c+=1;
        } while(b*c!=a||b*c<a);
        return c;
    }
}
