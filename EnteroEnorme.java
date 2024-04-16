import java.util.Arrays;

public class EnteroEnorme {
    private final int[] digitos;

   
    public EnteroEnorme() {
        this.digitos = new int[40];
    }

    
    public void parse(String numero) {
        Arrays.fill(digitos, 0); // Reinicia el arreglo a 0s
        int inicio = Math.max(0, 40 - numero.length());
        for (int i = inicio; i < 40; i++) {
            digitos[i] = numero.charAt(i - inicio) - '0';
        }
    }

 
    public void sumar(EnteroEnorme otro) {
        int acarreo = 0;
        for (int i = 39; i >= 0; i--) {
            int suma = digitos[i] + otro.digitos[i] + acarreo;
            digitos[i] = suma % 10;
            acarreo = suma / 10;
        }
    }

   
    public void restar(EnteroEnorme otro) {
        int deuda = 0;
        for (int i = 39; i >= 0; i--) {
            int resta = digitos[i] - otro.digitos[i] - deuda;
            if (resta < 0) {
                resta += 10;
                deuda = 1;
            } else {
                deuda = 0;
            }
            digitos[i] = resta;
        }
    }

    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        boolean leadingZero = true;
        for (int digito : digitos) {
            if (digito != 0) {
                leadingZero = false;
            }
            if (!leadingZero) {
                sb.append(digito);
            }
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }

  
    public boolean isZero() {
        for (int digito : digitos) {
            if (digito != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        EnteroEnorme num1 = new EnteroEnorme();
        num1.parse("1234567890123456789012345678901234567890");
        System.out.println("Numero 1: " + num1);

        EnteroEnorme num2 = new EnteroEnorme();
        num2.parse("9876543210987654321098765432109876543210");
        System.out.println("Numero 2: " + num2);

        num1.sumar(num2);
        System.out.println("Suma: " + num1);

        num1.restar(num2);
        System.out.println("Resta: " + num1);

        System.out.println("Es cero? " + num1.isZero());
    }
}