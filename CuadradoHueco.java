import java.util.Scanner;

public class CuadradoHueco {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario el tamaño del cuadrado
        System.out.print("Introduzca el tamañ44o del lado del cuadrado (entre 1 y 20): ");
        int lado = scanner.nextInt();

        // Validar la entrada
        if (lado < 1 || lado > 20) {
            System.out.println("El tamaño del lado debe estar entre 1 y 20.");
            return;
        }

        // Imprimir la parte superior del cuadrado
        for (int i = 0; i < lado; i++) {
            System.out.print("*");
        }
        System.out.println();

        // Imprimir las filas intermedias
        for (int i = 1; i < lado - 1; i++) {
            System.out.print("*");
            for (int j = 1; j < lado - 1; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }

        // Imprimir la parte inferior del cuadrado
        for (int i = 0; i < lado; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
