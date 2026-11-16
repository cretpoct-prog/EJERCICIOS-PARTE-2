
public class Termometro {

    double temperatura = 25.0;

    void subirGrados(double grados) {

        temperatura += grados;

    }

    void bajarGrados(double grados) {

        temperatura -= grados;

    }

    void mostrarTemperatura() {

        System.out.println("Temperatura actual: " + temperatura + " grados");

    }

    public static void main(String[] args) {

        Termometro termometro = new Termometro();

        termometro.mostrarTemperatura();

        termometro.subirGrados(5);
        termometro.mostrarTemperatura();

        termometro.bajarGrados(10);
        termometro.mostrarTemperatura();

    }
}
