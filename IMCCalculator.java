package imccalculator;

import java.util.Scanner;

public class IMCCalculator {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Ingrese su peso en kilogramos: ");
            double peso = input.nextDouble();
            
            System.out.print("Ingrese su altura en metros: ");
            double altura = input.nextDouble();
            
            double imc = peso / (altura * altura);
            
            System.out.println("Su IMC es: " + imc);
            System.out.println("Categorías de IMC:");
            System.out.println("Bajo peso: menos de 18.5");
            System.out.println("Normal: 18.5 – 24.9");
            System.out.println("Sobrepeso: 25 – 29.9");
            System.out.println("Obesidad: 30 o más");
        }
    }
}
