import java.util.Scanner;

public class BinarioADecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un numero binario: ");
        String binario = scanner.nextLine();

        int decimal = convertirBinarioADecimal(binario);

        System.out.println("El equivalente decimal de " + binario + " es: " + decimal);
    }

    public static int convertirBinarioADecimal(String binario) {
        int decimal = 0;
        int longitud = binario.length();

        for (int i = 0; i < longitud; i++) {
            int digito = Character.getNumericValue(binario.charAt(i));
            decimal += digito * Math.pow(2, longitud - 1 - i);
        }

        return decimal;
    }
}
