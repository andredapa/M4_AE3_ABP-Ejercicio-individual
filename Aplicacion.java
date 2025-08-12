package clases;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Aplicacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroAleatorio = random.nextInt(100) + 1; 
        int numeroUsuario;
        String resultado;

        int intentos = 0;
        ArrayList<Integer> historial = new ArrayList<>();

        System.out.print("Por favor ingresa un número entre 1 y 100: ");

        do {
            numeroUsuario = scanner.nextInt();
            intentos++;
            historial.add(numeroUsuario);

            resultado = AdivinaNumero.compararNumeros(numeroUsuario, numeroAleatorio);
            System.out.println(resultado);

        } while (!resultado.equals("Has conseguido adivinar el número"));

   
        System.out.println("Te tomó " + intentos + " veces adivinar el número.");
        
      
        for (int num : historial) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
