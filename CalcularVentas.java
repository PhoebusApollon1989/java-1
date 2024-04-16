import java.util.Scanner;

public class CalcularVentas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalVentas = 0.0;

        // Precios de los productos
        double[] precios = {2.98, 4.50, 9.98, 4.49, 6.87};

        for (int i = 0; i < precios.length; i++) {
            System.out.print("Ingrese la cantidad vendida del producto " + (i+1) + ": ");
            int cantidadVendida = scanner.nextInt();
            totalVentas += precios[i] * cantidadVendida;
        }

        System.out.println("El total de ventas es: $" + totalVentas);
    }
}
