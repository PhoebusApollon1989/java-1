import java.util.HashMap;
import java.util.Scanner;

public class CodigoMorse {
    private static final HashMap<Character, String> morseMap = new HashMap<>();

    static {
        // Definición de la tabla de conversión de caracteres a código Morse
        morseMap.put('A', ".-");
        morseMap.put('B', "-...");
        morseMap.put('C', "-.-.");
        morseMap.put('D', "-..");
        morseMap.put('E', ".");
        morseMap.put('F', "..-.");
        morseMap.put('G', "--.");
        morseMap.put('H', "....");
        morseMap.put('I', "..");
        morseMap.put('J', ".---");
        morseMap.put('K', "-.-");
        morseMap.put('L', ".-..");
        morseMap.put('M', "--");
        morseMap.put('N', "-.");
        morseMap.put('O', "---");
        morseMap.put('P', ".--.");
        morseMap.put('Q', "--.-");
        morseMap.put('R', ".-.");
        morseMap.put('S', "...");
        morseMap.put('T', "-");
        morseMap.put('U', "..-");
        morseMap.put('V', "...-");
        morseMap.put('W', ".--");
        morseMap.put('X', "-..-");
        morseMap.put('Y', "-.--");
        morseMap.put('Z', "--..");
        morseMap.put('0', "-----");
        morseMap.put('1', ".----");
        morseMap.put('2', "..---");
        morseMap.put('3', "...--");
        morseMap.put('4', "....-");
        morseMap.put('5', ".....");
        morseMap.put('6', "-....");
        morseMap.put('7', "--...");
        morseMap.put('8', "---..");
        morseMap.put('9', "----.");
        morseMap.put(' ', " ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Por favor, seleccione una opcion:");
            System.out.println("1. Codificar una frase en ingles a codigo Morse");
            System.out.println("2. Decodificar una frase en codigo Morse a ingles");
            System.out.println("3. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea después de leer un entero

            switch (opcion) {
                case 1 -> {
                    System.out.println("Ingrese la frase en ingles a codificar:");
                    String fraseIngles = scanner.nextLine().toUpperCase();
                    String codigoMorse = codificarAMorse(fraseIngles);
                    System.out.println("Frase codificada en codigo Morse: " + codigoMorse);
                }
                case 2 -> {
                    System.out.println("Ingrese la frase en codigo Morse a decodificar:");
                    String morse = scanner.nextLine();
                    String fraseDecodificada = decodificarAMorse(morse);
                    System.out.println("Frase decodificada: " + fraseDecodificada);
                }
                case 3 -> {
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Opcion no válida. Por favor, seleccione una opción valida.");
            }
        }
    }

    public static String codificarAMorse(String fraseIngles) {
        StringBuilder codigoMorse = new StringBuilder();

        for (char caracter : fraseIngles.toCharArray()) {
            String codigo = morseMap.get(caracter);
            if (codigo != null) {
                codigoMorse.append(codigo).append(" ");
            }
        }

        return codigoMorse.toString();
    }

    public static String decodificarAMorse(String morse) {
        StringBuilder frase = new StringBuilder();
        String[] partes = morse.split(" ");

        for (String parte : partes) {
            String caracter = getKeyFromValue(morseMap, parte);
            if (caracter != null) {
                frase.append(caracter);
            } else {
                frase.append(" ");
            }
        }

        return frase.toString();
    }

    public static String getKeyFromValue(HashMap<Character, String> map, String value) {
        for (Character key : map.keySet()) {
            if (map.get(key).equals(value)) {
                return key.toString();
            }
        }
        return null;
    }
}
