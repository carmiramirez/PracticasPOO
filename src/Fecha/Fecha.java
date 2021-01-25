package Fecha;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Fecha {
    /*
    Crea una clase Fecha. La clase contendrá además de los constructores que consideres
    adecuados, métodos de acceso y el método toString, tal como lo explicamos en el ejercicio
    anterior, un método para comprobar si la fecha es correcta y otro para sumarle un día al valor
    actual de la fecha. Se debe investigar y utilizar la clase GregorianCalendar para implementar
    los métodos y constructores de Fecha.
     */
    private Calendar fecha;

    public Fecha(){}

    public Fecha(String fecha){
        setFecha(fecha);
    }

    public void setFecha(String fecha){
        Calendar fechaNueva = new GregorianCalendar();

        Date fechaDate = Fecha.fechaValida(fecha);
        fechaNueva.setTime(fechaDate);

        this.fecha = fechaNueva;
    }

    public String getFecha(){
        return toString();
    }

    public String toString() {
        return (this.fecha.get(Calendar.DATE) + "/" + this.fecha.get(Calendar.MONTH) + "/" + this.fecha.get(Calendar.YEAR));
    }

    public static Date fechaValida(String fecha){
        Date fechaDate = new Date();
        try{
            String diaString = fecha.substring(0, 2);
            String mesString = fecha.substring(3, 5);
            String anioString = fecha.substring(6, fecha.length());

            int diaNumero = Integer.valueOf(diaString);
            int mesNumero = Integer.valueOf(mesString);
            int anioNumero = Integer.valueOf(anioString);

            Calendar calendario = new GregorianCalendar();
            calendario.set(anioNumero, mesNumero-1, diaNumero);

            fechaDate = calendario.getTime();

        }
        catch (Exception ex){
            ex.printStackTrace();
            System.out.println("Fecha no válida");
        }

        return fechaDate;
    }

    public void sumarUnDia(){
        this.fecha.add(Calendar.DATE, 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa una fecha (DD-MM-AAAA): ");
        String fecha = scanner.next();

        Fecha fechaCalendar = new Fecha(fecha);

        System.out.println("La fecha que ingresaste es: ");
        System.out.println(fechaCalendar.getFecha());

        fechaCalendar.sumarUnDia();
        System.out.println("Ahora se le sumo un día a la fecha: ");
        System.out.println(fechaCalendar.getFecha());
    }
}
