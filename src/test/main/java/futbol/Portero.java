package futbol;

public class Portero extends Futbolista implements Comparable<Portero> {

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

    // Getter para golesRecibidos
    public short getGolesRecibidos() {
        return golesRecibidos;
    }

    // Getter para dorsal
    public byte getDorsal() {
        return dorsal;
    }

    // Setter para golesRecibidos
    public void setGolesRecibidos(short golesRecibidos) {
        this.golesRecibidos = golesRecibidos;
    }

    // Setter para dorsal
    public void setDorsal(byte dorsal) {
        this.dorsal = dorsal;
    }

    // Método JugarConLasManos (parece que siempre retorna true, pero no usa el parámetro)
    public boolean JugarConLasManos(Futbolista Portero) {
        return true;
    }

    // Comparar goles recibidos con otro Portero
    public int compareTo(Portero otroPortero) {
        return Math.abs(this.golesRecibidos - otroPortero.getGolesRecibidos());
    }
}

    
    
    
    

 
}
