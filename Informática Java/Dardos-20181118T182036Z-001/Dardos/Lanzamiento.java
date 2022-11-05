/**
 * Representa el lanzamiento de un dardo
 */
public class Lanzamiento
{
    // Atributos: el numero y el multiplicador del lanzamiento
    private byte valor;
    private byte multiplicador;

    /**
     * Constructor 
     */
    public Lanzamiento()
    {
        this.valor = Utiles.valorAleatorio(); 
        if(1<=this.valor && this.valor<=20)  // Un multiplicador != 1 solo tiene sentido si el 
            this.multiplicador = Utiles.multiplicadorAleatorio(); // dardo se ha clavado en número
        else
            this.multiplicador=1;
    }

    /**
     * Calcula la puntuacion del lanzamiento a partir del numero y el multiplicador 
     */
    public int Puntuacion()
    {
        return this.valor*this.multiplicador;
    }

    /**
     * Muestra al usuario el resultado del lanzamiento
     */
    public void Muestra()
    {
        System.out.print(" * ");
        switch(this.valor){
            case 50: System.out.print("CENTRO DOBLE"); break;
            case 25: System.out.print("CENTRO SIMPLE"); break;
            case  0: System.out.print("FUERA"); break;
            default: System.out.print(this.valor);
        }
        switch(this.multiplicador){
            case 3: System.out.print(" TRIPLE"); break;
            case 2: System.out.print(" DOBLE"); break;
        }
        System.out.println(" ("+this.Puntuacion()+" puntos)");
    }
}