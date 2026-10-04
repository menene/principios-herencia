public class Main {
    public static void main(String[] args) {
        Personaje[] personajes = {
            new Caballero("Arturo"),
            new Arquero("Robin"),
            new Mago("Merlin")
        };

        for (Personaje personaje : personajes) {
            System.out.println("--- " + personaje.getNombre() + " ---");
            personaje.moverse();
            personaje.atacar();
            System.out.println();
        }
    }
}
