
/**
 * Write a description of class Carta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Carta
{
    public static final int OROS=0;
    public static final int COPAS=1;
    public static final int ESPADAS=2;
    public static final int BASTOS=3;

    private int palo;
    private int valor;

    public Carta(int nuevoValor, int nuevoPalo){
        if(nuevoPalo>=OROS&&nuevoPalo<=BASTOS){
            this.palo=nuevoPalo;
        } else{
            this.palo=OROS;
        }
        if(nuevoValor>=1&&nuevoValor<=7||nuevoValor>=10||nuevoValor<=12){
            this.valor=nuevoValor;
        } else{
            this.palo=1;
        }
    }

    public int palo(){
        return this.palo;
    }

    public int valor(){
        return this.valor;
    }

    public String nombreValor(){
        if(this.valor==1){
            return "AS";
        } else if(this.valor==10){
            return "SOTA";
        } else if(this.valor==11){
            return "CABALLO";
        } else if(this.valor==12){
            return "REY";
        } else {
            return this.valor+"";
        }
    }

    public String nombrePalo(){
        if(this.palo==OROS){
            return "OROS";
        } else if(this.palo==COPAS){
            return "COPAS";
        } else if(this.palo==ESPADAS){
            return "ESPADAS";
        } else {
            return "BASTOS";
        }
    }

    public String toString(){
        return this.nombreValor()+" DE "+this.nombrePalo();
    }

    public void escribir(){
        System.out.println(this.toString());
    }

    public int puntuacion(){
        if(this.valor==1){
            return 11;
        } else if(this.valor==3){
            return 10;
        } else if(this.valor==12){
            return 4;
        } else if(this.valor==11){
            return 2;
        } else if(this.valor==10){
            return 3;
        } else {
            return 0;
        }
    }

    public Carta siguiente(){
        if(this.valor==12){
            if(this.palo<BASTOS){
                return new Carta(1,this.palo +1);
            } else {
                return null;
            }
        } else if (this.valor==7){
            return new Carta(10,this.palo);
        } else {
            return new Carta(this.valor+1,this.palo);
        }
    }

    public static Carta primera(){
        return new Carta(1,OROS);
    }

    public static Carta leer(String nombreCarta){
        int valor;
        int palo;
        do{
            valor = Teclado.leerEntero("Escribe el valor de "+nombreCarta+" :");
        }while(!(valor>=1&&valor<=7||valor>=10&&valor<=12));
        do{
            palo=leerPalo("Escribe el palo de "+nombreCarta+" :");
        } while(palo<OROS||palo>BASTOS);
        return new Carta(valor,palo);
    }

    public static int leerPalo(String mensaje){
        String nombrePalo= Teclado.leerCadena(mensaje).toUpperCase();
        if(nombrePalo.equals("OROS")){
            return OROS;
        } else if(nombrePalo.equals("COPAS")){
            return COPAS;
        } else if(nombrePalo.equals("ESPADAS")){
            return ESPADAS;
        } else if(nombrePalo.equals("BASTOS")){
            return BASTOS;
        } else {
            return -1;
        }
    }

    public static void main(String [] args){
        Carta c=Carta.primera();
        while(c!=null){
            c.escribir();
            System.out.println();
            c=c.siguiente();
        }
    }

}
