import java.util.*;
/**
 * Write a description of class Ejercicio10 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio10
{
    public static void main(String [] args){
     char c;
     int contador=0;
     boolean anterior=false;
     System.out.println("Introduce secuencia de mayusculas acabada en '.'");
     Scanner teclado=new Scanner(System.in);
     teclado.useDelimiter("");
     c=teclado.next().charAt(0);
     
     do{
        
         
        
        if(anterior&&(c=='L'))
             contador+=1;
             
         if(c=='E'){
             anterior=true;
         
        } else {
            anterior=false;
            
            }    
         c=teclado.next().charAt(0);
    } while(c!='.');
    
    System.out.println("Numero de veces que aparece 'EL' "+contador);
}  
}

                        
                     
  


