package Fraccion;

import java.util.Scanner;

public class Fraccion {
    /*
    Crea una clase Fraccion con métodos necesarios para sumar, restar, multiplicar y dividir
    fracciones. Todos los métodos deben estar sobrecargados de modo que también puedan
    usarse para operar entre fracciones y números enteros (por ejemplo: 3⁄5+2 o 5⁄8*4).
     */
    private int denominador;
    private int numerador;

    public Fraccion(){}

    public Fraccion(int den, int num){
        this.denominador = den;
        this.numerador = num;
    }

    private int denominadorComun(int a, int b){
        int denominadorMayor = 0;
        int denominadorComunMayor = 0;

        if (Math.abs(a) > Math.abs(b))
            denominadorMayor = a;
        else
            denominadorMayor = b;

        for (int i = 1; i <= denominadorMayor; i++){
            if (a%i == 0 && b%i == 0)
                denominadorComunMayor = i;
        }

        return denominadorComunMayor;
    }

    public static Fraccion sumar(int a, Fraccion b){
        int denominadorComun = b.denominador;

        int primerTermino = (denominadorComun/1)*a;
        int segundoTermino = (denominadorComun/b.denominador)*b.numerador;
        int resultadoNumerador = primerTermino + segundoTermino;

        Fraccion resultado = new Fraccion(denominadorComun, resultadoNumerador);

        return resultado;
    }

    public static Fraccion restar(int a, Fraccion b){
        int denominadorComun = b.denominador;

        int primerTermino = (denominadorComun/1)*a;
        int segundoTermino = (denominadorComun/b.denominador)*b.numerador;
        int resultadoNumerador = primerTermino - segundoTermino;

        Fraccion resultado = new Fraccion(denominadorComun, resultadoNumerador);

        return resultado;
    }

    public static Fraccion multiplicar(int a, Fraccion b){
        int resultadoDenominador = b.denominador;
        int resultadoNumerador = a*b.numerador;

        Fraccion resultado = new Fraccion(resultadoDenominador, resultadoNumerador);

        return resultado;
    }

    public static Fraccion dividir(int a, Fraccion b){
        int resultadoDenominador = b.numerador;
        int resultadoNumerador = a * b.denominador;

        Fraccion resultado = new Fraccion(resultadoDenominador, resultadoNumerador);

        return resultado;
    }

    public static Fraccion sumar(Fraccion a, Fraccion b){
        int denominadorComun = a.denominadorComun(a.denominador, b.denominador);

        int primerTermino = (denominadorComun/a.denominador)*a.numerador;
        int segundoTermino = (denominadorComun/b.denominador)*b.numerador;
        int resultadoNumerador = primerTermino + segundoTermino;

        Fraccion resultado = new Fraccion(denominadorComun, resultadoNumerador);

        return resultado;
    }

    public static Fraccion restar(Fraccion a, Fraccion b){
        int denominadorComun = a.denominadorComun(a.denominador, b.denominador);

        int primerTermino = (denominadorComun/a.denominador)*a.numerador;
        int segundoTermino = (denominadorComun/b.denominador)*b.numerador;
        int resultadoNumerador = primerTermino - segundoTermino;

        Fraccion resultado = new Fraccion(denominadorComun, resultadoNumerador);

        return resultado;
    }

    public static Fraccion multiplicar(Fraccion a, Fraccion b){
        int resultadoDenominador = a.denominador*b.denominador;
        int resultadoNumerador = a.numerador*b.numerador;

        Fraccion resultado = new Fraccion(resultadoDenominador, resultadoNumerador);

        return resultado;
    }

    public static Fraccion dividir(Fraccion a, Fraccion b){
        int resultadoDenominador = a.denominador*b.numerador;
        int resultadoNumerador = a.numerador*b.denominador;

        Fraccion resultado = new Fraccion(resultadoDenominador, resultadoNumerador);

        return resultado;
    }

    public static void main(String[] args) {
        Fraccion fraccion = new Fraccion(5, 3);
        int numero = 10;
        Fraccion resultado = new Fraccion();
        resultado = Fraccion.sumar(numero, fraccion);

        System.out.println(fraccion.numerador + "/" + fraccion.denominador + " + " + numero + " = " + resultado.numerador + "/" + resultado.denominador);
    }
}
