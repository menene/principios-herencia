public class Arquero extends Personaje {
    public Arquero(String nombre) {
        super(nombre);
    }

    @Override
    public void atacar() {
        System.out.println(getNombre() + " dispara una flecha con su arco.");
    }

    @Override
    public void moverse() {
        System.out.println(getNombre() + " corre.");
    }
}
