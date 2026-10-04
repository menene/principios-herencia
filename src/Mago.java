public class Mago extends Personaje {
    public Mago(String nombre) {
        super(nombre);
    }

    @Override
    public void atacar() {
        System.out.println(getNombre() + " lanza un hechizo.");
    }

    @Override
    public void moverse() {
        System.out.println(getNombre() + " camina con su bastón.");
    }
}
