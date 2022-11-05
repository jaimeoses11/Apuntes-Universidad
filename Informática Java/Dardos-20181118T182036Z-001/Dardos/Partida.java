  
/**
 * Partida de dardos entre 2 jugadores
 */
public class Partida
{
    private Jugador j1;
    private Jugador j2;
    private int puntuacion;
    
    public Partida(int x){
        this.puntuacion=x;
        this.j1= new Jugador(x);
        this.j2= new Jugador(x);
    }
    
    //Atributo de puntuacion objetivo
    public static int Modo(){
        int conf=0;
        int x=0;
        do{
            conf=Teclado.leerEntero("En que modo quieres jugar?\n[1] -> 301\n[2] -> 501\n");
            if(conf==1){
                x=301;
            }else
            if(conf==2){
                x=501;
            }
        }while(conf<1||conf>2);
        
        return x;
    }
    
    public void escribirMarcador(){
       System.out.println("\n    Marcador:");
       this.j1.escribirJugador("Player1:");
       this.j2.escribirJugador("Player2:");
    }
    
    public void start(){
        boolean turnoDelj1=true;
        boolean HayGanador=false;
        int valorTirada=0;
        int nturnos=1;
        do{
            Utiles.Pausa();
            if(turnoDelj1){
                turnoDelj1=false;
                System.out.println("    Turno n "+nturnos+" Jugador 1\nSus tiradas son:");
                valorTirada=this.j1.tirada();
                this.j1.actualizar(valorTirada);
                System.out.println("Puntos obtenidos:"+valorTirada);
                this.escribirMarcador();
                if(this.j1.haGanado()){
                    HayGanador=true;
                    System.out.println("El jugador 1 ha ganado");
                }
            }else{
                turnoDelj1=true;
                System.out.println("    Turno "+nturnos+" Jugador 2\nSus tiradas son:");
                valorTirada=this.j2.tirada();
                this.j2.actualizar(valorTirada);
                System.out.println("Puntos obtenidos:"+valorTirada);
                this.escribirMarcador();
                if(this.j2.haGanado()){
                    HayGanador=true;
                    System.out.println("El jugador 2 ha ganado");
                }
                nturnos++;
            }
            
        }while(nturnos<21 && !HayGanador);
        if(!HayGanador){
            System.out.println("Se han acabado los turnos. Ha habido un empate");
        }
        System.out.println("La partida se ha acabado");
        
    }
    
    public static void main(String []args){
        Partida juego=new Partida(Partida.Modo());
        juego.start();
    }
}
