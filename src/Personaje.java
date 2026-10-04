public abstract class Personaje {
    private final String nombre;

    public Personaje(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract void atacar();

    public abstract void moverse();
}
