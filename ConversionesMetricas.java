import java.util.Scanner;

public class ConversionesMetricas {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Bienvenido a la aplicacion de conversiones metricas");
            
            while (true) {
                System.out.println("Por favor introduzca la pregunta de conversion, por ejemplo 'Cuantas pulgadas hay en 2 metros' o 'salir' para salir");
                String input = scanner.nextLine();
                
                if (input.equalsIgnoreCase("salir")) {
                    System.out.println("Hasta luego");
                    break;
                }
                
                String[] palabras = input.split("\\s+");
                double valor;
                String unidadOrigen = "", unidadDestino = "";
                
                for (String palabra : palabras) {
                    if (esUnidad(palabra)) {
                        if (unidadOrigen.isEmpty()) {
                            unidadOrigen = palabra;
                        } else {
                            unidadDestino = palabra;
                            break;
                        }
                    }
                }
                
                if (unidadOrigen.isEmpty() || unidadDestino.isEmpty()) {
                    System.out.println("La pregunta de conversión no es válida. Por favor inténtelo de nuevo");
                    continue;
                }
                
                try {
                    valor = Double.parseDouble(palabras[4]);
                } catch (NumberFormatException ex) {
                    System.out.println("La pregunta de conversión no es válida. Por favor inténtelo de nuevo");
                    continue;
                }
                
                if (unidadOrigen.equalsIgnoreCase("metros") && unidadDestino.equalsIgnoreCase("pulgadas")) {
                    double resultado = metrosAPulgadas(valor);
                    System.out.println(valor + " metros equivalen a " + resultado + " pulgadas");
                } else if (unidadOrigen.equalsIgnoreCase("litros") && unidadDestino.equalsIgnoreCase("cuartos")) {
                    double resultado = litrosACuartos(valor);
                    System.out.println(valor + " litros equivalen a " + resultado + " cuartos");
                } else if (unidadOrigen.equalsIgnoreCase("pulgadas") && unidadDestino.equalsIgnoreCase("metros")) {
                    double resultado = pulgadasAMetros(valor);
                    System.out.println(valor + " pulgadas equivalen a " + resultado + " metros");
                } else if (unidadOrigen.equalsIgnoreCase("cuartos") && unidadDestino.equalsIgnoreCase("litros")) {
                    double resultado = cuartosALitros(valor);
                    System.out.println(valor + " cuartos equivalen a " + resultado + " litros");
                } else {
                    System.out.println("La conversión de " + unidadOrigen + " a " + unidadDestino + " no es válida");
                }
            }
        }
    }

    public static boolean esUnidad(String palabra) {
        return palabra.equalsIgnoreCase("metros") || palabra.equalsIgnoreCase("litros")
                || palabra.equalsIgnoreCase("pulgadas") || palabra.equalsIgnoreCase("cuartos");
    }

    public static double metrosAPulgadas(double metros) {
        return metros * 39.3701; // 1 metro = 39.3701 pulgadas
    }

    public static double litrosACuartos(double litros) {
        return litros * 1.05669; // 1 litro = 1.05669 cuartos
    }

    public static double pulgadasAMetros(double pulgadas) {
        return pulgadas * 0.0254; // 1 pulgada = 0.0254 metros
    }

    public static double cuartosALitros(double cuartos) {
        return cuartos * 0.946353; // 1 cuarto = 0.946353 litros
    }
}
