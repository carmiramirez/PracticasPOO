package Password;

public class PasswordFuerte extends Password{
    public PasswordFuerte(){
        // La contraseña debe tener al entre 10 y 20 caracteres,
        // al menos un dígito, al menos una minúscula y al menos una mayúscula
        super("^(?=\\w*\\d)(?=\\w*[A-Z])(?=\\w*[a-z])\\S{10,20}$");
    }
}
