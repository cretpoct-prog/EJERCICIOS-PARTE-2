
public class Lampara {

    boolean encender = false;

    void encender() {

        encender = true;

    }

    void apagar() {

        encender = false;

    }

    String estado() {

        if (encender) {

            return "La lampara esta encendida";

        } else {

            return "La lampara esta apagada";

        }
    }

    public static void main(String[] args) {

        Lampara lampara = new Lampara();

        lampara.encender();
        System.out.println(lampara.estado());

        lampara.apagar();
        System.out.println(lampara.estado());

    }
}
