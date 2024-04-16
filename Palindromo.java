import java.util.Scanner;

public class Palindromo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario el número
        System.out.print("Introduzca un numero entero de cinco digitos: ");
        int numero = scanner.nextInt();

        // Validar la entrada
        if (numero < 10000 || numero > 99999) {
            System.out.println("El numero debe tener cinco digitos.");
            return;
        }

        // Invertir el número
        int numeroInvertido = 0;
        while (numero > 0) {
            numeroInvertido = numeroInvertido * 10 + numero % 10;
            numero /= 10;
        }

        // Comparar el número original con el invertido
        if (numero == numeroInvertido) {
            System.out.println("El numero es un palíndromo.");
        } else {
            System.out.println("El numero no es un palíndromo.");
        }
    }
}
