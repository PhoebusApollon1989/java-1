package comparacionenteros;

import java.util.Scanner;

public class ComparacionEnteros {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Ingrese el primer numero entero: ");
            int num1 = input.nextInt();
            
            System.out.print("Ingrese el segundo numero entero: ");
            int num2 = input.nextInt();
            
            if (num1 == num2)
                System.out.println("Estos numeros son iguales");
            else
                System.out.println("El numero más grande es: " + Math.max(num1, num2));
        }
    }
}
