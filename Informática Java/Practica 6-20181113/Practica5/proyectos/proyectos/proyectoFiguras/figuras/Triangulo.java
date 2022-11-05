package figuras;

/**
 * Clase para representar objetos triángulo y operaciones
 * asociadas a los mismos, representando dichos triángulos
 * mediante sus vértices para lo cual se apoya en la clase
 * Punto2D
 * 
 * @author Alberto Ciriano
 * @version MAR/18
 */
public class Triangulo {
    /*
     * atributos del triángulo: tres vértices
     */
    private Punto2D vert1;
    private Punto2D vert2;
    private Punto2D vert3;

    /**
     * constructor que genera un objeto triángulo a partir 
     * de los valores de unos vértices;
     * no reutiliza los puntos si no que los clona
     */
    public Triangulo (Punto2D v1, Punto2D v2, Punto2D v3) {
        this.vert1 = new Punto2D (v1);
        this.vert2 = new Punto2D (v2);
        this.vert3 = new Punto2D (v3);
    }

    /**
     * constructor que genera un objeto triángulo a partir 
     * de otro triángulo clonandolo
     */
    public Triangulo (Triangulo t) {
        this.vert1 = new Punto2D (t.vert1);
        this.vert2 = new Punto2D (t.vert2);
        this.vert3 = new Punto2D (t.vert3);
    }

    /*
     * métodos observadores y modificadores para la 
     * clase triangulo
     */

    /**
     * método observador del vértice 1
     *
     * @return punto que lo representa
     */   
    public Punto2D getV1 () {
        return new Punto2D (this.vert1);
    }

    /**
     * método observador del vértice 2
     *
     * @return punto que lo representa
     */   
    public Punto2D getV2 () {
        return new Punto2D (this.vert2);
    }

    /**
     * método observador del vértice 3
     *
     * @return punto que lo representa
     */   
    public Punto2D getV3 () {
        return new Punto2D (this.vert3);
    }

    /**
     * método modificador del vértice 1
     *
     * @param p nuevo valor para dicho vértice
     */
    public void setV1 (Punto2D p) {
        this.vert1 = new Punto2D (p);
    }

    /**
     * método modificador del vértice 2
     *
     * @param p nuevo valor para dicho vértice
     */
    public void setV2 (Punto2D p) {
        this.vert2 = new Punto2D (p);
    }

    /**
     * método modificador del vértice 3
     *
     * @param p nuevo valor para dicho vértice
     */
    public void setV3 (Punto2D p) {
        this.vert3 = new Punto2D (p);
    }

    /**
     * método para obtener una representación textual de
     * los valores de los vértices del triángulo
     *
     * @return cadena de caracteres que contiene dicha 
     * representación
     */
    public String toString() {
        return "[V1"+vert1.toString()+";V2"+
        vert2.toString()+";V3"+vert3.toString()+"]";
    }

    /**
     * método que muestra por pantalla las coordenadas
     * de los vértices del triángulo precedido de un 
     * mensaje que se transmite como parámetro
     *
     * @param mensaje cadena de caracteres que se escribirá
     * por pantalla antes del valor del triángulo
     */
    public void escribir(String mensaje) { 
        System.out.println(mensaje + this.toString());
    }

    /*
     * métodos de operaciones sobre triángulos
     */

    /**
     * método que calcula el valor del perímetro
     * del triángulo objeto dueño
     *
     * @return el valor del perímetro
     */
    public double perimetro () {

        return this.vert1.distanciaA(this.vert2) +
        this.vert2.distanciaA(this.vert3) +
        this.vert3.distanciaA(this.vert1);

    }

    /**
     * Method perimetro de un triángulo distinto del
     * objeto dueño. Esta quizá sea la forma más adecuada 
     * resolverlo. 
     *
     * @param t triángulo del que calcular el perímetro
     * @return valor calculado
     */
    public static double perimetro (Triangulo t) {

        return Punto2D.distanciaEntre(t.getV1(),t.getV2()) 
        + Punto2D.distanciaEntre(t.getV2(),t.getV3()) 
        + Punto2D.distanciaEntre(t.getV3(),t.getV1());

    }

    /**
     * método que calcula el valor del área
     * del triángulo objeto dueño
     *
     * @return el valor del área
     */
    public double area () {
        boolean esTri=this.esTriangulo();
        if(esTri){
            return Math.sqrt(this.perimetro()/2*(this.perimetro()/2-this.vert1.distanciaA(vert2))*(this.perimetro()/2-this.vert2.distanciaA(vert3))*(this.perimetro()/2-this.vert3.distanciaA(vert1)));
        } else {
            return 0.0;
        }
    }

    /**
     * método que comprueba si los vértices pueden formar
     * un triángulo calculando las distancias de los lados
     * (proceso más simple que comprobar que son distintos
     * y no alineados aunque en algunos casos este otro
     * puede resultar necesario por exactitud)
     *
     * @return valor booleano que lo indica
     */
    public boolean esTriangulo () {
        double L1=this.vert1.distanciaA(vert2);
        double L2=this.vert2.distanciaA(vert3);
        double L3=this.vert3.distanciaA(vert1);
        if (L1>=(L2+L3)||L2>=(L1+L3)||L3>=(L2+L1)){
            return false;
        } else {
            return true;
        }
    }

    /**
     * método que comprueba si forma un triángulo
     * rectángulo
     *
     * @return valor booleano que lo indica
     */
    public boolean esRectangulo () {
        double L1=this.vert1.distanciaA(vert2);
        double L2=this.vert2.distanciaA(vert3);
        double L3=this.vert3.distanciaA(vert1);
        if(L1*L1==L2*L2+L3*L3||L2*L2==L1*L1+L3*L3||L3*L3==L1*L1+L2*L2){
            return true;
        } else {
            return false;
        }

    }

    /**
     * método que calcula el baricentro del triángulo
     * objeto dueño
     *
     * @return punto con las coordenadas del baricentro
     */
    public Punto2D baricentro () {
        boolean esTri=this.esTriangulo();
        double xbar=(this.vert1.getX()+this.vert2.getX()+this.vert3.getX())/3;
        double ybar=(this.vert1.getY()+this.vert2.getY()+this.vert3.getY())/3;
        if(esTri){
            return new Punto2D(xbar,ybar);
           
        } else {
            return null;
        }

    }    

    /**
     * método que lee de teclado valores para un 
     * triángulo y genera el objeto que lo
     * representa
     *
     * @return objeto Triángulo creado
     */
    public static Triangulo leerTriangulo() {
        Punto2D p1 = Punto2D.leerPunto2D();
        Punto2D p2 = Punto2D.leerPunto2D();
        Punto2D p3 = Punto2D.leerPunto2D();

        return new Triangulo( p1 , p2 , p3 );
    }

}
