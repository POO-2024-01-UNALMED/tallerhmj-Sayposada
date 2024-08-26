package futbol;



public class Jugador extends Futbolista{
    
    public short golesMarcados;
    public byte dorsal;

    
    //creamos un cronstructor con la herencia de los atributos y los propios
    public Jugador(short golesMarcados, byte dorsal, String nombre, int edad, String posicion) {
        super(nombre, edad, posicion);
        this.golesMarcados = 289;
        this.dorsal = 7;
    }
    
    public int compareTo(Futbolista otroFutbolista, int diferencia){
        diferencia= getEdad() - otroFutbolista.getEdad();
        return Math.abs(diferencia);
    }
    
    
    
       // Sobrescribimos el método toString()
    @Override
    public String toString() {
        return "El futbolista " + getNombre() + " tiene " + getEdad() + " años, y juega de " + getPosicion() + 
               " con el dorsal " + dorsal + ". Le han marcado " + golesMarcados + " goles.";
    }
    
    
    
    
    
    
    
    
    
    
    
}
