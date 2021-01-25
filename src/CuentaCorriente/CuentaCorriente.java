package CuentaCorriente;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class CuentaCorriente {
    /*
    Métodos a crear: ingreso, egreso, reintegro y transferencia.
    Constructor por defecto, uno con parámetros y otro que recibirá una cuenta corriente (copiar todos los datos)
    Métodos get y set de cada atributo.
    Prototipos de métodos y constructores discutidos y diseñados por nosotros.
     */
    private double saldo;
    private String titular;
    private String cbu;

    public void ingreso(double dinero){
        this.saldo = this.saldo + dinero;
    }

    public void egreso(double dinero){
        this.saldo = this.saldo - dinero;
    }

    public void reintegro(double dinero){
        //this.saldo =
    }

    public void transferencia(double dinero, CuentaCorriente cuentaATransferir){
        this.egreso(dinero);
        cuentaATransferir.ingreso(dinero);
    }

    public CuentaCorriente(){
        this.setSaldo(0);
        this.setTitular("");
        this.setCbu("");
    }

    public CuentaCorriente(double saldo, String titular, String cbu){
        this.setSaldo(saldo);
        this.setTitular(titular);
        this.setCbu(cbu);
    }

    public CuentaCorriente(CuentaCorriente cuenta){
        this.setSaldo(cuenta.getSaldo());
        this.setTitular(cuenta.getTitular());
        this.setCbu(cuenta.getCbu());
    }

    public double getSaldo(){
        return saldo;
    }

    public String getTitular(){
        return titular;
    }

    public String getCbu(){
        return cbu;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public void setCbu(String cbu){
        this.cbu = cbu;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre para la cuenta corriente: ");
        String titular = scanner.next();
        System.out.println("Ingrese su saldo: ");
        double saldo = scanner.nextDouble();
        System.out.println("Ingrese su cbu: ");
        String cbu = scanner.next();

        CuentaCorriente cuenta = new CuentaCorriente(saldo, titular, cbu);

        System.out.println("Ingrese su nombre para la cuenta corriente: ");
        String titular2 = scanner.next();
        System.out.println("Ingrese su saldo: ");
        double saldo2 = scanner.nextDouble();
        System.out.println("Ingrese su cbu: ");
        String cbu2 = scanner.next();

        CuentaCorriente cuenta2 = new CuentaCorriente(saldo2, titular2, cbu2);

        System.out.println("el saldo de la cuenta2 es: "+cuenta2.saldo);

        cuenta.transferencia(3000, cuenta2);

        System.out.println("el saldo de la cuenta2 es: "+cuenta2.saldo);

        scanner.close();
    }
}