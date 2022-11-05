
/**
 * Implementación de una casilla de un tablero para el buscaminas. 
 * Por defecto estará tapada, no tendrá mina y no estará marcada.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Casilla {

    private boolean tapada; // si está tapada
    private boolean tieneMina; // si tiene mina
    private boolean marcada; // si está marcada

    /**
     * Constructor for objects of class Casilla. Genera una 
     * casilla del tablero que estará tapada, no tendrá mina
     * y no estará marcada.
     */
    public Casilla() {
        this.tapada = true;
        this.tieneMina = false;
        this.marcada = false;
    }

    /**
     * Method estaTapada. Observador del atributo tapada
     *
     * @return valor booleano que lo indica
     */
    public boolean estaTapada() { 
        return this.tapada;
    }

    /**
     * Method tieneMina. Observador del atributo tieneMina
     *
     * @return valor booleano que lo indica
     */
    public boolean tieneMina() {
        return this.tieneMina;
    }

    /**
     * Method estaMarcada. Observador del atributo marcada
     *
     * @return valor booleano que lo indica
     */
    public boolean estaMarcada() {
        return this.marcada;
    }

    /**
     * Method destapa. Descubre la casilla objeto dueño si
     * no está marcada. En caso de estar marcada no la debe
     * desatapar
     */
    public void destapa() {
        if(!this.marcada){
            this.tapada=false;
        }
    }

    /**
     * Method ponMina. Añade una mina a la casilla objeto
     * dueño
     */
    public void ponMina() {
        if(!this.tieneMina){
            this.tieneMina=true;
        } 
    }

    /**
     * Method cambiaMarca. Estando tapada, cambia el estado
     * de marca de la casilla objeto dueño, es decir, si está 
     * marcada la desmarca y lo contrario. En caso de estar
     * destapada, no hará nada
     */
    public void cambiaMarca() {
        if(this.tapada){
            if(this.marcada){
                this.marcada=false;
            }else {
                this.marcada=true;
            }
        }
    }
}
