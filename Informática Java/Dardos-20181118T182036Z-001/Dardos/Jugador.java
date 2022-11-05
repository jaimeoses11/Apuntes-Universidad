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
    public Jugador(int x){
        this.puntuacion=x;
    }

    /**
     * Averigua si el jugador ha alcanzado la puntuacion que permite ganar la partida 
     */
    public boolean haGanado(){
        return this.puntuacion==0;
    }

    /**
     * Calcula el numero de puntos que ha obtenido el jugador en una tirada.
     * En una tirada se hacen 3 lanzamientos, salvo si ya se ha ganado con el 1º o 2º
     * lanzamientos.
     * Si en la tirada el jugador obtiene un numero de puntos mayor que su puntuacion, la
     * tirada se anula (obtiene 0 puntos)
     */
    public int tirada(){
        int puntosAc;//puntos actuales
        Lanzamiento l1= new Lanzamiento();
        
        puntosAc=l1.Puntuacion();
        l1.Muestra();
        if(this.puntuacion>puntosAc){
            Lanzamiento l2= new Lanzamiento();
            puntosAc+=l2.Puntuacion();
            l2.Muestra();
            if(this.puntuacion>puntosAc){
                Lanzamiento l3= new Lanzamiento();
                puntosAc+=l3.Puntuacion();
                l3.Muestra();
            }
        }
        
        //NO usar System en la medida de lo pos. 
        
        
        return puntosAc;
    }

    /**
     * Actualiza la puntuacion del jugador tras haber realizado una tirada
     */
    public void actualizar(int puntosAc){
        this.puntuacion-=puntosAc;
    }

    /**
     * Muestra al usuario la puntuacion del jugador
     */
    public void escribirJugador(String mensaje){
        System.out.println(mensaje+" "+this.puntuacion);
    }

}