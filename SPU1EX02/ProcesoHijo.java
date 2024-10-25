package SPU1EX02;

import java.util.Random;
import java.util.Scanner;

public class ProcesoHijo {
    public static void main(String[] args) {
        Random numRandom = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        
        while (!salir) {
            System.out.println("Pulsa enter para empezar || Escribe 'fi' para salir");
            String orden = scanner.nextLine();

            if (orden.equalsIgnoreCase("fi")) {
                salir = true;
            } else if (orden.equals("")){
                int randomInt = numRandom.nextInt(10);
                System.out.println("Numero: "+randomInt);
            } else {
                System.out.println("Comando desconocido.");
            }
        }   
    }
}
