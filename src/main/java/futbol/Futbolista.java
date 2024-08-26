package futbol;




public abstract class Futbolista implements Comparable <Futbolista> {
    

    //definimos los atributos 
    private String nombre;
    private int edad;
    private final String posicion;
    
    
    //contructor para darle valores a los atributos
    

    public Futbolista(String nombre, int edad, String posicion) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
    }

    //Los setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //Los getters

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getPosicion() {
        return posicion;
    }
    
    
    // Método toString() en Futbolista 
    @Override
    public String toString() {
        return "El futbolista " + nombre + " tiene " + edad + " años, y juega de " + posicion + " con el dorsal " + dorsal + ".";
    }
    
    //revisemos que dos jugadores no son los mismo 
    public boolean futbolistaf(Futbolista futbolista, Futbolista otroFutbolista) 
    {
        return futbolista.equals(otroFutbolista);
    }
    //EL método que solo puede usar el arquero
    
    public abstract boolean jugarConLasManos(Futbolista futbolista);
    
    
    
    
    
    
}
