package Password;

public class PasswordIntermedia extends Password{
    public PasswordIntermedia(){
        // La contraseña debe tener al entre 8 y 16 caracteres,
        // al menos una minúscula y al menos una mayúscula
        super("^(?=\\w*[A-Z])(?=\\w*[a-z])\\S{8,16}$");
    }
}
