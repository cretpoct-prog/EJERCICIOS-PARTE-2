
public class Puerta {

    boolean abierta = false;

    void abrir() {

        abierta = true;

    }

    void cerrar() {

        abierta = false;

    }

    String estado() {

        if (abierta) {

            return "La puerta esta abierta";

        } else {

            return "La puerta esta cerrada";

        }
    }

    public static void main(String[] args) {

        Puerta puerta = new Puerta();

        System.out.println(puerta.estado());

        puerta.abrir();
        System.out.println(puerta.estado());

        puerta.cerrar();
        System.out.println(puerta.estado());

    }
}
