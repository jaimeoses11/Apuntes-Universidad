package figuras;

 


/**
 * Write a description of class Principal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Principal
{
    public static void main (String [] args) {
        Figura fig;
        int opcion;
        
        do {
            opcion = Teclado.leerEntero("1 (triángulo) ó 2 (circunferencia)? ");
        } while (opcion != 1 && opcion != 2);
        
        if (opcion ==1){
            fig = Triangulo.leerTriangulo();
            fig.escribir("Soy un triángulo");
        } else {
            fig = Circunferencia.leerCircunferencia();
            fig.escribir("Soy una circunferencia");
        }
               
        System.out.println("Area: "+fig.area());
        System.out.println("Perímetro: "+fig.perimetro());
    }
}
