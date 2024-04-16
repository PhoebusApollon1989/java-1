public class Empleado {
    private String nombre;
    private String apellido;
    private double salarioMensual;


    public Empleado(String nombre, String apellido, double salarioMensual) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salarioMensual = Math.max(0, salarioMensual); // Asegura que el salario mensual sea no negativo
    }


    public String getNombre() {
        return nombre;
    }


    public String getApellido() {
        return apellido;
    }


    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = Math.max(0, salarioMensual); // Asegura que el salario mensual sea no negativo
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }


    public double salarioAnual() {
        return salarioMensual * 12;
    }


    public void darAumento() {
        salarioMensual *= 1.1;
    }

    public static void main(String[] args) {

        Empleado empleado1 = new Empleado("Juan", "Perez", 5000);
        Empleado empleado2 = new Empleado("Maria", "Gomez", 6000);


        System.out.println("Salario anual de " + empleado1.getNombre() + " " + empleado1.getApellido() + ": $" + empleado1.salarioAnual());
        System.out.println("Salario anual de " + empleado2.getNombre() + " " + empleado2.getApellido() + ": $" + empleado2.salarioAnual());


        empleado1.darAumento();
        empleado2.darAumento();


        System.out.println("\nDespues del aumento del 10%:");
        System.out.println("Salario anual de " + empleado1.getNombre() + " " + empleado1.getApellido() + ": $" + empleado1.salarioAnual());
        System.out.println("Salario anual de " + empleado2.getNombre() + " " + empleado2.getApellido() + ": $" + empleado2.salarioAnual());
    }
}
