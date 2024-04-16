package parimpar;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Ingrese un numero entero: ");
            int num = input.nextInt();
            
            if (num % 2 == 0)
                System.out.println("El numero es par");
            else
                System.out.println("El numero es impar");
        }
    }
}
