package futbol;


public class Portero extends Futbolista{
    
    public short golesRecibidos;
    public byte dorsal;

    public Portero(short golesRecibidos, byte dorsal, String nombre, int edad, String posicion) {
        super(nombre, edad, posicion = "Portero");
        this.golesRecibidos = golesRecibidos;
        this.dorsal = dorsal;
    }
    
         // Sobrescribimos el método toString()
    @Override
    public String toString() {
        return "El futbolista " + getNombre() + " tiene " + getEdad() + " años, y juega de " + getPosicion() + 
               " con el dorsal " + dorsal + ". Le han marcado " + golesRecibidos + " goles.";
        
        
    } 

    public short getGolesRecibidos() {
        return golesRecibidos;
    }

    public byte getDorsal() {
        return dorsal;
    }

    public void setGolesRecibidos(short golesRecibidos) {
        this.golesRecibidos = golesRecibidos;
    }

    public void setDorsal(byte dorsal) {
        this.dorsal = dorsal;
    }
    
    
    
    //compartamos los goles recibidos
    @Override
    public int compareTo(Futbolista otroPortero){
        return Math.abs(this.golesRecibidos - otroPortero.getGolesRecibidos());
    }
    
    
    
    
    
    
    

 
}
