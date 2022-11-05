package figuras;


/**
 * Esta clase se utiliza para representar un Punto en el
 * plano de dos dimensiones mediante sus coordenas reales
 * cartesianas abscisa y ordenada. Desarrolla, a su vez, 
 * operaciones para trabajar con objetos Punto.
 * 
 * @author Alberto Ciriano
 * @version MAR/18
 */

public class Punto2D {
    
    private double x; //abscisa del punto
    private double y; //ordenada del punto 

    /**
     * genera un nuevo punto que representaría el origen
     * de coordenadas
     */ 
    public Punto2D () {
        this.x = 0;
        this.y = 0;
    }
    

    /**
     * genera un nuevo punto que tiene como coordenadas
     * dos valores reales concretos que se transfieren 
     * como parámetros
     */ 
    public Punto2D (double x, double y) {
        this.x = x;
        this.y = y;
    }
    

    /**
     * genera un nuevo punto clonando los valores de 
     * otro concreto que se transfiere como parámetro
     */
    public Punto2D (Punto2D p)
    {
        this.x = p.x;
        this.y = p.y;
    }

    /*
     * métodos observadores y modificadores para la clase 
     * Punto
     */

    /**
     * método observador del campo x
     *
     * @return valor del campo x
     */   
    public double getX () {
        return this.x;
    }
    

    /**
     * método observador del campo y
     *
     * @return valor del campo y
     */   
    public double getY () {
        return this.y;
    }
    

    /**
     * método modificador del campo x
     *
     * @param x nuevo valor para el campo x
     */
    public void setX (double x) {
        this.x = x;
    }

    
    /**
     * método modificador del campo y
     *
     * @param y nuevo valor para el campo y
     */
    public void setY (double y) {
        this.y = y;
    }
    
   
    /**
     * método para obtener una representación textual del
     * valor del punto; redefinimos el método toString que
     * se hereda de la superclase Object
     *
     * @return cadena de caracteres que contiene dicha 
     * representación
     */
    public String toString () {
        return "(" + this.x + "," + this.y + ")";
    }
    
    
    /**
     * método que muestra por pantalla las coordenadas
     * del punto precedido de un mensaje que se transmite
     * como parámetro
     *
     * @param mensaje cadena de caracteres que se escribirá
     * por pantalla antes del valor del punto
     */
    public void escribePunto(String mensaje) {
        System.out.println(mensaje + this.toString());
    }
    

    /**
     * método para comprobar si el punto objeto dueño es
     * el mismo que otro que se pasa como parámetro
     *
     * @param p punto con el que comparar
     * @return devuelve cierto o falso segun el caso
     */
    public boolean mismoPuntoQue (Punto2D p) {
        return this.x == p.x && this.y == p.y ;
    }
    

    /**
     * método para comprobar si el punto objeto dueño se
     * encuentra muy cercano a otro, es decir, si podríamos 
     * decir que se trata del mismo (o casi);
     * tomamos un valor arbitrario de distancia muy pequeño 
     *
     * @param p punto con el que comprobar 
     * @return devuelve cierto o falso segun el caso
     */
    public boolean muyProximoA (Punto2D p) {
        return this.distanciaA(p) < 0.000001 ;
        //el valor constante utilizado podría ser diferente
        //según el contexto en el que nos moviéramos
    }
    

    /**
     * método que calcula la distancia existente entre el 
     * punto objeto dueño y otro punto que se transmite 
     * como parámetro
     *
     * @param p punto hasta el que se calcula la distancia
     * @return valor real que indica dicha distancia
     */
    public double distanciaA (Punto2D p) {
        return Math.sqrt((this.x-p.x)*(this.x-p.x)+
                        (this.y-p.y)*(this.y-p.y));
    }
    

    /**
     * método que comprueba en cuál de los cuatro cuadrantes
     * se encuentra el punto objeto dueño teniendo en cuenta
     * que se numeran del 1 al 4 y si el punto se encuentra
     * en los ejes se considerará el valor 0 (cero) para
     * representar dicha situación
     *
     * @return un valor entero que indica el número de 
     * cuadrante ó 0 (cero) si el punto está en los ejes
     */
    public int cuadrante () {  

        int resultado = 0;

        if (this.x > 0.0 && this.y > 0.0) resultado = 1;
        if (this.x < 0.0 && this.y > 0.0) resultado = 2;
        if (this.x < 0.0 && this.y < 0.0) resultado = 3;
        if (this.x > 0.0 && this.y < 0.0) resultado = 4;

        return resultado;

        /*
         * se podían haber hecho distintas versiones en lo 
         * referente a los condicionales que podrían haberse
         * puesto anidados y, también, en acceso a los 
         * valores de las coordenadas a través de los 
         * observadores
         */
    }
    

    /**
     * método que comprueba en cuál de los cuatro cuadrantes
     * se encuentra el punto objeto dueño teniendo en cuenta
     * que se numeran del 1 al 4 y si el punto se encuentra
     * en los ejes se considerará el valor 0 (cero) para
     * representar dicha situación
     *
     * @return un valor entero que indica el número de 
     * cuadrante ó 0 (cero) si el punto está en los ejes
     */
    public int cuadranteBis () {   

        int resultado;

        if (this.getX() == 0.0 || this.getY() == 0.0) {
            resultado = 0;
        } else {
            if (this.getX() > 0) {
                if (this.getY() > 0) {
                    resultado = 1;
                } else {
                    resultado = 4;
                }
            } else {
                if (this.getY() > 0) {
                    resultado = 2;
                } else {
                    resultado = 3;
                }
            }
        }

        return resultado;

    }
    
    
    /**
     * método que mueve un punto desplazandolo unas 
     * cantidades fijas tanto en el eje X como el eje Y
     *
     * @param incX incremento en el eje X
     * @param incY incremento en el eje Y
     */
    public void desplazamientoRelativo (double incX, 
                                        double incY) {
        this.x += incX;
        this.y += incY;
    }
    

    /*
     * versiones static (de clase) de algunos
     * de los métodos anteriores
     */

    /**
     * método que calcula la distancia entre dos puntos
     * del plano que son transmitidos como parámetros
     *
     * @param p1 primer punto
     * @param p2 segundo punto
     * @return distancia entre ambos puntos
     */
    public static boolean mismosPuntos (Punto2D p1, 
                                        Punto2D p2) {
        
        return p1.x == p2.x && p1.y == p2.y ;
        
    }
    

    /**
     * método que comprueba si dos puntos que se transmiten
     * como parámetros están tremendamente próximos
     *
     * @param p1 primer punto
     * @param p2 segundo punto
     * @return valor cierto o falso resultante de la 
     * comprobación
     */
    public static boolean muyProximos (Punto2D p1, 
                                        Punto2D p2) {
        
        return distanciaEntre(p1, p2) < 0.000001 ;
        //el valor constante utilizado podría ser diferente
        //según el contexto en el que nos moviéramos
        
    }
    

    /**
     * método que calcula la distancia entre dos puntos que
     * se transmiten como parámetros
     *
     * @param p1 primer punto
     * @param p2 segundo punto
     * @return distancia entre los dos puntos 
     */
    public static double distanciaEntre (Punto2D p1, 
                                        Punto2D p2) {
        
        return Math.sqrt((p1.x-p2.x)*(p1.x-p2.x)+
                            (p1.y-p2.y)*(p1.y-p2.y));
            
    }
    

    /**
     * Method leerPunto2D. Este método permite solicitar al
     * usuario los valores de las coordenadas de un punto y, 
     * con ellas, construye un objeto Punto2D y lo devuelve
     *
     * @return objeto de clase Punto2D leido del teclado
     */
    public static Punto2D leerPunto2D (){

        double x = Teclado.leerReal("Coordenada x: ");
        double y = Teclado.leerReal("Coordenada y: ");
        
        return new Punto2D( x , y );
    }
    
  
}
