package Password;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Ingrese una contraseña: ");
        //Scanner scanner = new Scanner(System.in);
        //String contraseñaIngresada = scanner.next();

        //System.out.println("Tu nueva contraseña es: "+contraseña);

        //regex = [a-zA-Z0-9]{6}, contra = arun32

        Password contraseña = new Password("[a-zA-Z0-9]{6}");
        contraseña.setValue("arun32"); // contraseña valida

        Password simple = new PasswordSimple();
        simple.setValue("holaaa");

        Password intermedia = new PasswordIntermedia();
        intermedia.setValue("HOLAcomoestas12");

        Password fuerte = new PasswordFuerte();
        fuerte.setValue("HOLAtodobien2020*@");
    }
}
