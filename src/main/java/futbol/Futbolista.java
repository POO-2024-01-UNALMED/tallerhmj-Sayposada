package futbol;

import java.util.Objects;

public abstract class Futbolista implements Comparable<Futbolista> {
    // Atributos
    private String nombre;
    private int edad;
    private final String posicion;

    // Constructores
    public Futbolista(String nombre, int edad, String posicion) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
    }

    public Futbolista() {
        this("Maradona", 30, "delantero");
    }

    // Métodos
    @Override
    public String toString() {
        return "El futbolista " + nombre + " tiene " + edad + ", y juega de " + posicion;
    }

    @Override
    public boolean equals(Object f) {
        if (this == f) {
            return true;
        }
        if (f == null || getClass() != f.getClass()) {
            return false;
        }
        Futbolista that = (Futbolista) f;
        return edad == that.edad &&
               nombre.equals(that.nombre) &&
               posicion.equals(that.posicion);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.nombre);
        hash = 79 * hash + this.edad;
        hash = 79 * hash + Objects.hashCode(this.posicion);
        return hash;
    }

    @Override
    public int compareTo(Futbolista otroFutbolista) {
        return Integer.compare(this.edad, otroFutbolista.getEdad());
    }

    public abstract boolean jugarConLasManos();

    public String getNombre() {
        return this.nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public String getPosicion() {
        return this.posicion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
