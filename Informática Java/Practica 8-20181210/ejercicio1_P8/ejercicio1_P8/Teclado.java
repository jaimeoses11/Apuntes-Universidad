
/**
 * Write a description of class Teclado here.
 * 
 * @author (Alberto Ciriano) 
 * @version (FEB-16)
 */

import java.util.*;
import java.io.*;

public class Teclado {
    
    public static int leerEntero ( String pregunta ) {
        
        Scanner entrada = new Scanner(System.in);
        int dato = 0 ;
        boolean malo ;
        String ss;
              
        do {
            malo = false;          
            try {
                System.out.print ( pregunta );
                dato = entrada.nextInt ();
            }
            catch (InputMismatchException e) {
                malo = true ;
                ss = entrada.nextLine();
                System.out.println("Dato introducido anómalo");
            }
        } while (malo);
        
        return dato ;
    }
    
   
    public static long leerEnteroLargo ( String pregunta ) {
        
        Scanner entrada = new Scanner(System.in );
        long dato = 0 ;
        boolean malo ;
        String ss;
              
        do {
            malo = false;
            try {
                System.out.print ( pregunta );
                dato = entrada.nextLong ();
            }
            catch (InputMismatchException e) {
                malo = true ;
                ss = entrada.nextLine();
                System.out.println("Dato introducido anómalo");
            }
        } while (malo);
        
        return dato ;
    }
    
    
    public static double leerReal ( String pregunta ) {
        
        Scanner entrada = new Scanner(System.in );
        double dato = 0.0 ;
        boolean malo ;
        String ss;
                
        do {
            malo = false;
            try {
                System.out.print ( pregunta );
                dato = entrada.nextDouble ();
            }
            catch (InputMismatchException e) {
                malo = true ;
                ss = entrada.nextLine();
                System.out.println("Dato introducido anómalo");
            }
        } while (malo);
        
        return dato ;
    }
    
    
    public static char leerCaracter(String pregunta){
        InputStreamReader entrada = new InputStreamReader(System.in);
        char dato = ' ';
        System.out.print ( pregunta );
        try{
            dato = (char)entrada.read();
        }
        catch(IOException ioe){
            System.out.println(ioe.getMessage());
        }
        return dato ;
    }
    
    
    public static char leerCaracter2(String pregunta){
        Scanner entrada = new Scanner(System.in );
        char dato ;
        String leido;
       
        System.out.print ( pregunta );
        leido = entrada.nextLine();
        if (leido.length() == 0)
            dato = '\n';
        else
            dato = leido.charAt(0);
            
        return dato ;
    }
    
}
