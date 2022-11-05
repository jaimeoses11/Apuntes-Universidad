/**
 * Partida de dardos entre 2 jugadores
 */
public class Partida
{
    private Jugador J1;
    private Jugador J2;
    private int tipoPartida;
    
    public Partida(int tipoPartida){
        this.tipoPartida=tipoPartida;
        this.J1= new Jugador(tipoPartida);
        this.J2= new Jugador(tipoPartida);
    }
    public Partida modalidad(){
        this.tipoPartida= Teclado.leerEntero("Modalidad 301 o 501?");
        if(this.tipoPartida==301){
            return new Partida(301);
        } else if(this.tipoPartida==501){
            return new Partida(501);
        } else {
            return new Partida(-1);
        }
    }
    public String muestraPartida(){
        return "Puntuacion jugador 1: "+this.J1.muestraPunt()+
        "\n Puntuacion jugador 2: "+this.J2.muestraPunt();
    }
    public void juegaPartida(){
        
                
        
        
        
        
        
        
        
        
        
    }
        
 
        
}
