public class CalcularFactoriales {
    public static void main(String[] args) {
        System.out.println("Factoriales del 1 al 20:");
        System.out.println("Numero\tFactorial");
        
        for (int i = 1; i <= 20; i++) {
            long factorial = calcularFactorial(i);
            System.out.println(i + "\t" + factorial);
        }
    }

    public static long calcularFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        
        long factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        
        return factorial;
    }
}
