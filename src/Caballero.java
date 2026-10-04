public class Caballero extends Personaje {
    public Caballero(String nombre) {
        super(nombre);
    }

    @Override
    public void atacar() {
        System.out.println(getNombre() + " ataca con espada.");
    }

    @Override
    public void moverse() {
        System.out.println(getNombre() + " camina con armadura.");
    }
}
