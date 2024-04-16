import java.util.Scanner;

public class EliminacionDuplicados {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int[] numeros = new int[5];
            int contador = 0;
            
            System.out.println("Ingrese cinco numeros en el rango de 10 a 100:");
            
            while (contador < 5) {
                int numero = input.nextInt();
                
                if (numero >= 10 && numero <= 100) {
                    boolean esDuplicado = false;
                    
                    // Esto verificar si el número ya ha sido ingresado
                    for (int i = 0; i < contador; i++) {
                        if (numeros[i] == numero) {
                            esDuplicado = true;
                            break;
                        }
                    }

                    if (!esDuplicado) {
                        numeros[contador] = numero;
                        contador++;
                        
                        // Esto va a mostrar el conjunto completo de valores únicos
                        System.out.print("Valores unicos introducidos: ");
                        for (int i = 0; i < contador; i++) {
                            System.out.print(numeros[i] + " ");
                        }
                        System.out.println();
                    } else {
                        System.out.println("El nnmero ya ha sido ingresado. Intente de nuevo.");
                    }
                } else {
                    System.out.println("Número fuera de rango. Intente de nuevo.");
                }
            }
        }
    }
}
