import java.util.*;
/**
 * Write a description of class Ejercicio7 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio7
{
    public static void main(String [] args){
        int sec=0;
        int sec2=0;
        int min=0;
        int max=0;
        double med=0;
        int contador=0;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce una secuencia de enteros positivos acabada en uno negativo: ");
        while(sec>=0){
            sec=teclado.nextInt();
            if(sec2>sec){
                min=sec;
            }
            else{
                if (sec2<sec)
                    max=sec;
            }
            med+=sec;
            contador+=1;
            
            
                
            
                
            
        }
        
        
    }
}
