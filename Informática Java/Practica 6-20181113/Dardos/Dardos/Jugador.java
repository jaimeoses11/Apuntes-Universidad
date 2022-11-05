
/**
 * Representa a un jugador del juego de dardos.
 */
public class Jugador
{
    // Atributo: la puntuación del jugador
    private int puntuacion;

    /**
     * Constructor: Asigna al atributo del jugador la puntuación objetivo de la partida
     */

    public Jugador (int punt){
        this.puntuacion=punt;
    }

    /**
     * Averigua si el jugador ha alcanzado la puntuacion que permite ganar la partida 
     */
    public boolean ganarPartida(){
        if(this.puntuacion==0){
            return true;
        } else {
            return false;
        }
    }

    /**
     * Calcula el numero de puntos que ha obtenido el jugador en una tirada.
     * En una tirada se hacen 3 lanzamientos, salvo si ya se ha ganado con el 1º o 2º
     * lanzamientos.
     * Si en la tirada el jugador obtiene un numero de puntos mayor que su puntuacion, la
     * tirada se anula (obtiene 0 puntos)
     */
    public int tirada(){
        Lanzamiento L1= new Lanzamiento();
        Lanzamiento L2= new Lanzamiento();
        Lanzamiento L3= new Lanzamiento();
        int suma=0;

        if(suma<this.puntuacion){
            suma+=L1.Puntuacion();
        }if(suma<this.puntuacion){
            suma+=L2.Puntuacion();
        }if(suma<this.puntuacion){
            suma+=L3.Puntuacion();
        } 
        if(suma>=this.puntuacion){
            return 0;
        }
        else{
            return suma;
        }

        
        
        //if(L1.Puntuacion()==this.puntuacion){
        //    return L1.Puntuacion();
        //} else if(L1.Puntuacion()+L2.Puntuacion()==this.puntuacion){
        //    return L1.Puntuacion()+L2.Puntuacion();
        //} else if(L1.Puntuacion()+L2.Puntuacion()+L3.Puntuacion()<=this.puntuacion){
        //    return L1.Puntuacion()+L2.Puntuacion()+L3.Puntuacion();
        //} else{
        //      return 0;
        //  }

    }


    /**
     * Actualiza la puntuacion del jugador tras haber realizado una tirada
     */
    public int puntuacionActual(){
        if(this.puntuacion>=0){
            return this.puntuacion-=this.tirada();
        } else {
            return this.puntuacion;
        }
    }

    /**
     * Muestra al usuario la puntuacion del jugador
     */
    public String muestraPunt(){
        return "Esta es la puntuacion actual: "+this.puntuacionActual();
    }
}