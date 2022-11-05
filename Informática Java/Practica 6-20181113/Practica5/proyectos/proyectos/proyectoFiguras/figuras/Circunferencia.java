package figuras;


/**
 * Write a description of class Circunferencia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Circunferencia
{
    // instance variables - replace the example below with your own
    private double radio;
    private Punto2D centro;

    /**
     * Constructor for objects of class Circunferencia
     */
    public Circunferencia(Punto2D c1, double radio)
    {
        // initialise instance variables
        this.centro=new Punto2D(c1);
        this.radio=0.0;
        
        
    }
    public Circunferencia(Circunferencia c){
        this.centro=new Punto2D(c.centro);
        this.radio=new Teclado.leerReal(c.radio);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
