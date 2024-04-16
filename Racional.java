public class Racional {
    private int numerador;
    private int denominador;

    public Racional() {
        this(0, 1);
    }

    public Racional(int numerador, int denominador) {
        int gcd = gcd(Math.abs(numerador), Math.abs(denominador));
        this.numerador = numerador / gcd;
        this.denominador = denominador / gcd;
    }

    public static Racional suma(Racional r1, Racional r2) {
        int nuevoNumerador = r1.numerador * r2.denominador + r2.numerador * r1.denominador;
        int nuevoDenominador = r1.denominador * r2.denominador;
        return new Racional(nuevoNumerador, nuevoDenominador);
    }

    public static Racional resta(Racional r1, Racional r2) {
        int nuevoNumerador = r1.numerador * r2.denominador - r2.numerador * r1.denominador;
        int nuevoDenominador = r1.denominador * r2.denominador;
        return new Racional(nuevoNumerador, nuevoDenominador);
    }

    public static Racional multiplicacion(Racional r1, Racional r2) {
        return new Racional(r1.numerador * r2.numerador, r1.denominador * r2.denominador);
    }

    public static Racional division(Racional r1, Racional r2) {
        return new Racional(r1.numerador * r2.denominador, r1.denominador * r2.numerador);
    }

    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }

    public String toFloatString(int precision) {
        double valor = (double) numerador / denominador;
        return String.format("%." + precision + "f", valor);
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static void main(String[] args) {
        Racional racional1 = new Racional(1, 2);
        Racional racional2 = new Racional(1, 4);

        System.out.println("Racional 1: " + racional1);
        System.out.println("Racional 2: " + racional2);

        System.out.println("Suma: " + Racional.suma(racional1, racional2));
        System.out.println("Resta: " + Racional.resta(racional1, racional2));
        System.out.println("Multiplicación: " + Racional.multiplicacion(racional1, racional2));
        System.out.println("División: " + Racional.division(racional1, racional2));

        System.out.println("Racional 1 en punto flotante: " + racional1.toFloatString(4));
        System.out.println("Racional 2 en punto flotante: " + racional2.toFloatString(4));
    }
}
