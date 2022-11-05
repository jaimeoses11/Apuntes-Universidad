
/**
 * Implementación de un tablero para el buscaminas. Serán matrices 
 * no redimensionables. Para evitar acceder a casillas no existentes
 * se deberá utilizar el método posicionValida()
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.*;

public class Tablero {

    private Casilla [][] datos;

    /**
     * Constructor for objects of class Matriz. Genera un nuevo 
     * tablero de juego, de forma aleatoria, si los valores 
     * transmitidos como parámetros son válidos, siendo “f” el 
     * número de filas del tablero, “c” el número de columnas y 
     * “minas” el número de casillas que contendrán mina. Se 
     * considerarán válidos si los números de filas y columnas 
     * son positivos y el número de minas es positivo y no supera 
     * la mitad de las casillas del tablero.
     */
    public Tablero(int f, int c, int minas) {
        
        //DESARROLLAR
        
    }
    
    
    /**
     * Method enteroAleatorio. Genera un número entero aleatorio
     * mayor o igual que cero y menor que un valor transmitido
     * como parámetro
     *
     * @param n valor límite 
     * @return valor booleano generado
     */
    private static int enteroAleatorio(int n) {
        Random rnd = new Random();
        return rnd.nextInt(n);
    }
    
    
    /**
     * Method posicionValida. Devuelve un valor booleano que indica 
     * si dos valores enteros transmitidos como parámetros son
     * válidos como posición de casilla del tablero en el que se
     * juega, es decir, si no sobrepasan los límites del mismo,
     * siendo “f” el valor de fila y “c” el de columna
     *
     * @param f valor de fila
     * @param c valor de columna
     * @return valor booleano generado
     */
    public boolean posicionValida(int f, int c) {
        
        //DESARROLLAR
        return false;
    }
    

    /**
     * Method getF
     *
     * @return número de filas del tablero
     */
    private int getF() {
        
        //DESARROLLAR
        return 0;
    }
    

    /**
     * Method getC
     *
     * @return número de columnas del tablero
     */
    private int getC() {
        
        //DESARROLLAR
        return 0;
    }
    
    
    /**
     * Method numeroMinas. Devuelve el número de minas que tiene
     * el tablero de juego.
     *
     * @return número de minas
     */
    private int numeroMinas() {
        
        //DESARROLLAR
        return 0;
    }
    
    
    /**
     * Method numeroTapadas
     *
     * @return número de casillas tapadas
     */
    private int numeroTapadas() {
        
        //DESARROLLAR
        return 0;
    }
    
    
    /**
     * Method minasMarcadas. Devuelve el número de minas que han 
     * sido marcadas en el tablero 
     *
     * @return valor calculado
     */
    public int minasMarcadas() {
        
        //DESARROLLAR
        return 0;
    }
    

    /**
     * Method estaTapada. Comprueba si una casilla del tablero,
     * dada por su posición mediante valores de fila y columna,
     * está tapada. En caso de que los valores de posición sean
     * anómalos devolverá el valor true;
     *
     * @param f valor de fila de la casilla
     * @param c valor de columna de la casilla
     * @return valor booleano que indica dicho estado
     */
    public boolean estaTapada(int f, int c) {
        
        //DESARROLLAR
        return true;
    }
    
    
    /**
     * Method estaMarcada. Comprueba si una casilla del tablero,
     * dada por su posición mediante valores de fila y columna,
     * está marcada. En caso de que los valores de posición sean
     * anómalos devolverá el valor false;
     *
     * @param f valor de fila de la casilla
     * @param c valor de columna de la casilla
     * @return valor booleano que indica dicho estado
     */
    public boolean estaMarcada(int f, int c) {
        
        //DESARROLLAR
        return false;
    }
    
    
    /**
     * Method tieneMina. Comprueba si una casilla del tablero,
     * dada por su posición mediante valores de fila y columna,
     * contiene una mina. En caso de que los valores de posición 
     * sean anómalos devolverá el valor false;
     *
     * @param f valor de fila de la casilla
     * @param c valor de columna de la casilla
     * @return valor booleano que indica dicho estado
     */
    public boolean tieneMina(int f, int c) {
        
        //DESARROLLAR
        return false;
    }
    
    
    /**
     * Method cambiaMarca. Cambia el estado de marca de una casilla
     * del tablero dada por sus valores de fila y columna, es decir,
     * si estaba marcada la desmarca y viceversa. En caso de que los 
     * valores de posición sean anómalos, el método no hará nada.
     *
     * @param f valor de fila de la casilla
     * @param c valor de columna de la casilla
     */
    public void cambiaMarca(int f, int c) {        
        
        //DESARROLLAR
        
    }
    
    
    /**
     * Method destapa. Descubre una casilla del tablero
     * dada por sus valores de fila y columna. En caso de que los 
     * valores de posición sean anómalos, el método no hará nada.
     *
     * @param f valor de fila de la casilla
     * @param c valor de columna de la casilla
     */
    public void destapa(int f, int c) {
        
        //DESARROLLAR
        
    }
    
    
    /**
     * Method completo. Indica si se ha completado el tablero de
     * juego utilizando la estrategia de comprobar si el número de
     * casillas tapadas es igual al número de minas (MAS SENCILLO)
     *
     * @return valor booleano que lo indica
     */
    public boolean completo() {
        
        //DESARROLLAR
        return false;
    }
    

    /**
     * Method destapaVecinasSinMina. Destapa todas las casilla 
     * vecinas a una que esté destapada y no tenga minas a su 
     * alrededor; si alguna de las casillas destapadas presenta
     * de nuevo 0 minas en sus vecinas debe repetirse el proceso
     * otra vez y así sucesivamente mientras siga dándose el caso.
     * Método de fuerza bruta, poco optimizado, recorre todo varias 
     * veces hasta que no haya más casillas detapadas.
     */
    public void destapaVecinasSinMina() {
        boolean cambio;
        do {
            cambio = false;
            for (int f = 0 ; f < this.getF() ; f++)
                for (int c = 0 ; c < this.getC() ; c++)
                    if (this.vecinasConMina(f,c) == 0 &&
                        !this.datos[f][c].estaTapada())
                        for (int i = f - 1; i <= f + 1; i++)
                            for (int j = c - 1; j <= c + 1; j++)
                                if (this.posicionValida(i,j) &&
                                    this.datos[i][j].estaTapada() &&
                                    !this.datos[i][j].estaMarcada()){
                                    this.datos[i][j].destapa();
                                    cambio = true;
                                }
        } while (cambio);
    }
    

    /**
     * Method dibujaTablero. Escribe por pantalla una representación
     * textual del estado del tablero, mostrando las casillas 
     * descubiertas, las marcadas y las tapadas
     */
    public void dibujaTablero() {
        System.out.print('\f');
        System.out.print("    "+'|');
        for (int c = 0; c < this.getC() ; c++)
            System.out.printf("%3d%c",c,'|');
        System.out.println();

        for (int f = 0; f < this.getF() ; f++){
            System.out.print("----"+'+');
            for (int c = 1; c <= this.getC() ; c++)
                System.out.printf("---"+'+');
            System.out.println();
            System.out.printf("%4d%c",f,'|');
            for (int c = 0; c < this.getC() ; c++){

                if(this.datos[f][c].estaTapada())
                    if(this.datos[f][c].estaMarcada())
                        System.out.printf("%2c%c%c",'M',' ','|');
                    else
                        System.out.printf("%3c%c",' ','|');
                    else
                    if(this.datos[f][c].tieneMina())
                        System.out.printf("%2c%c%c",'B',' ','|');
                    else
                        System.out.printf("%2d%c%c",vecinasConMina(f,c),' ','|');
            }
            System.out.println();
        }
        
        System.out.print("----"+'+');
        for (int c = 0; c < this.getC() ; c++)
            System.out.printf("---"+'+');
        System.out.println();

    }
    

    /**
     * Method vecinasConMina. Dada una casilla por sus valores 
     * de fila y columna, si los valores de los parámetros son 
     * válidos, devuelve el número de minas que existen en sus 
     * casillas vecinas.
     *
     * @param f valor de fila
     * @param c valor de columna
     * @return numero de minas calculado
     */
    public int vecinasConMina(int f, int c) {
        
        //DESARROLLAR
        return 0;
    }
}
