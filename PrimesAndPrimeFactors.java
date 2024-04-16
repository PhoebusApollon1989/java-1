import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PrimesAndPrimeFactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un numero entero positivo: ");
        int number = scanner.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " es un número primo.");
        } else {
            Set<Integer> primeFactors = primeFactors(number);
            System.out.println("Los factores primos unicos de " + number + " son: " + primeFactors);
        }
    }

    // Esto es para verificar si un número es primo
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // esto es para encontrar los factores primos únicos de un número
    public static Set<Integer> primeFactors(int n) {
        Set<Integer> factors = new HashSet<>();
        for (int i = 2; i <= n / i; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        if (n > 1) {
            factors.add(n);
        }
        return factors;
    }
}
