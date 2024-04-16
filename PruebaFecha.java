// Clase Fecha
class Fecha {
    private int mes;
    private int dia;
    private int año;

  
    public Fecha(int mes, int dia, int año) {
        this.mes = mes;
        this.dia = dia;
        this.año = año;
    }

   
    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getMes() {
        return mes;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getDia() {
        return dia;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getAño() {
        return año;
    }


    public void mostrarFecha() {
        System.out.println(mes + "/" + dia + "/" + año);
    }
}

// Aplicación de prueba PruebaFecha
public class PruebaFecha {
    public static void main(String[] args) {
        
        Fecha fecha = new Fecha(3, 20, 2024);

        
        System.out.print("La fecha es: ");
        fecha.mostrarFecha();

        
        fecha.setDia(21);

        
        System.out.print("La fecha actualizada es: ");
        fecha.mostrarFecha();
    }
}
