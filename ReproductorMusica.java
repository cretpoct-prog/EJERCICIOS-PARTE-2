
public class ReproductorMusica {

    String cancion = "";
    boolean reproduciendo = false;

    void reproducir(String nuevaCancion) {

        cancion = nuevaCancion;
        reproduciendo = true;

    }

    void pausar() {

        reproduciendo = false;

    }

    String estado() {

        if (reproduciendo) {

            return "Reproduciendo: " + cancion;

        } else {

            return "Musica pausada";

        }
    }

    public static void main(String[] args) {

        ReproductorMusica reproducir = new ReproductorMusica();

        reproducir.reproducir("Mi cancion favorita");
        System.out.println(reproducir.estado());

        reproducir.pausar();
        System.out.println(reproducir.estado());

    }//fin main
}//fin class
