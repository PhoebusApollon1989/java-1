/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

public class InvertirDigitos {

    public static int invertirDigitos(int numero) {
        int invertido = 0;
        while (numero > 0) {
            invertido = invertido * 10 + numero % 10;
            numero /= 10;
        }
        return invertido;
    }

    public static void main(String[] args) {
        int numero = 7631;
        int numeroInvertido = invertirDigitos(numero);
        System.out.println("Numero original: " + numero);
        System.out.println("Numero con digitos invertidos: " + numeroInvertido);
    }
}
