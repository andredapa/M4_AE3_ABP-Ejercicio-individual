package clases;


public class AdivinaNumero {

    public static String compararNumeros(int numeroUsuario, int numeroAleatorio) {
        if (numeroUsuario == numeroAleatorio) {
            return "Has conseguido adivinar el número";
        } else if (numeroUsuario < numeroAleatorio) {
            return "Intenta con un número más grande.";
        } else {
            return "Intenta con un número más pequeño.";
        }
    }
}
