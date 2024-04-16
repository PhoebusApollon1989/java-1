package aritmetica;

import java.util.Scanner;

public class Aritmetica {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Ingrese el primer numero entero: ");
            int num1 = input.nextInt();
            
            System.out.print("Ingrese el segundo numero entero: ");
            int num2 = input.nextInt();
            
            System.out.println("Suma: " + (num1 + num2));
            System.out.println("Producto: " + (num1 * num2));
            System.out.println("Diferencia: " + (num1 - num2));
            System.out.println("Cociente: " + ((double) num1 / num2));
        }
    }
}
