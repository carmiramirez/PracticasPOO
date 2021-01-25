package Contador;

public class Ejercicio2Contador {
    /*
    Crea una clase Contador (sí, contador de programación) con métodos que permitan
    incrementar y decrementar su valor. La clase contendrá un constructor por defecto, un
    constructor con parámetros, un constructor copia y los setters y getters (métodos de acceso)
    que corresponda.
     */

    private int valor;

    public Ejercicio2Contador () {
        valor = 0;
    }

    public Ejercicio2Contador (int valor) {
        this.valor = valor;
    }

    public Ejercicio2Contador (Ejercicio2Contador contador) {
        this.valor = contador.getValor();
    }

    public void setValor (int valor) {
        this.valor = valor;
    }

    public int getValor () {
        return this.valor;
    }



    public static void main(String[] args) {
        Ejercicio2Contador miContador = new Ejercicio2Contador(4);
        Ejercicio2Contador miOtroContador = new Ejercicio2Contador(miContador);
        miContador.setValor(15);

        System.out.println("Valor de miContador: " + miContador.getValor());
        System.out.println("Valor de miOtroContador: " + miOtroContador.getValor());
    }

}
