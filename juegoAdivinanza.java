
import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinanza {
    public static void main(String[] args) {
        int intentos = 0;
        int maxIntentos = 10;
        boolean adivinado = false;
        
        System.out.println("¡Bienvenido al juego de adivinanza!");
        System.out.println("Debes adivinar un número entre 1 y 100.");
        System.out.println("Tienes 10 intentos. ¡Buena suerte!");

        while(intentos < maxIntentos){
            if (numeroUsuario == numeroAleatorio) {
                    System.out.println("¡Felicidades! Has adivinado el número en " + intentos + " intentos.");
                    adivinado = true;
                    break;
                }

                else if (numeroUsuario < numeroAleatorio) 
                    System.out.println("El número es mayor. Intenta de nuevo.");
                
                else 
                    System.out.println("El número es menor. Intenta de nuevo.");
        }
        if (!adivinado) 
        System.out.println("Lo siento, has agotado tus intentos."");

        scanner.close();

    }
}
