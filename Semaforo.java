
public class Semaforo {

    String color = "Rojo";

    void cambiarRojo() {

        color = "Rojo";

    }

    void cambiarAmarillo() {

        color = "Amarillo";

    }

    void cambiarVerde() {

        color = "Verde";

    }

    void mostrarColor() {

        System.out.println("El semaforo esta en: " + color);

    }

    public static void main(String[] args) {

        Semaforo semaforo = new Semaforo();

        semaforo.mostrarColor();

        semaforo.cambiarVerde();
        semaforo.mostrarColor();

        semaforo.cambiarAmarillo();
        semaforo.mostrarColor();

        semaforo.cambiarRojo();
        semaforo.mostrarColor();

    }
}
