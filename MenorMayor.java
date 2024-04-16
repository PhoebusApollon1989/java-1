package menormayor;

import java.util.Scanner;

public class MenorMayor {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int menor = Integer.MAX_VALUE;
            int mayor = Integer.MIN_VALUE;
            
            for (int i = 0; i < 5; i++) {
                System.out.print("Ingrese un entero: ");
                int num = input.nextInt();
                
                menor = Math.min(menor, num);
                mayor = Math.max(mayor, num);
            }
            
            System.out.println("El menor numero es: " + menor);
            System.out.println("El mayor numero es: " + mayor);
        }
    }
}
